package com.away1994.lang.parser.impl.objectivec;

import com.away1994.common.utils.log.LogUtils;
import com.away1994.dist.language.Lan;
import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCParserBaseVisitor;
import com.away1994.lang.parser.LanguageParser;
import com.away1994.lang.parser.impl.LanguageParserImpl;
import com.away1994.lang.symbols.Function;
import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.*;
import com.away1994.lang.symbols.impl.objectivec.ObjcClassImpl;
import com.away1994.lang.symbols.impl.variable.VariableImpl;
import com.away1994.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.logging.Logger;

import static com.away1994.common.constants.log.FineConstants.PARSE_CLASS_FINE;
import static com.away1994.common.constants.log.FineConstants.PARSE_FILE_FINE;
import static java.util.logging.Level.FINE;

public class ObjectiveCLanguageParser extends LanguageParserImpl implements LanguageParser {

    private static final transient Logger LOGGER = Logger.getLogger(ObjectiveCLanguageParser.class.getName());

    public ArrayList<Symbol> parseInterface(InterfaceImpl anInterface) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {

            /**
             *  super class
             */
            @Override
            public Object visitProtocolName(ObjectiveCParser.ProtocolNameContext ctx) {
                String protocol = ctx.getText();
                InterfaceImpl i = new InterfaceImpl(protocol, anInterface);
                anInterface.getExtendInterfaces().add(i);
                return super.visitProtocolName(ctx);
            }

            /**
             * methods
             */
            @Override
            public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {
                String methodName = ctx.methodSelector().getText();
                FunctionImpl f = new FunctionImpl(methodName, anInterface);
                anInterface.getiFunctions().add(f);
                return super.visitMethodDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(anInterface.getRuleContext());

        return symbols;
    }

    public ArrayList<Symbol> parseVariable(VariableImpl variable) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx) {

                ClassImpl type = new ClassImpl(ctx.getText(), variable);
                variable.setType(type);
                return super.visitSpecifierQualifierList(ctx);
            }
        };

        parseTreeVisitor.visit(variable.getRuleContext());
        return symbols;


    }


    public ArrayList<Symbol> parseFunction(FunctionImpl function) {
        // TODO:
        ArrayList<Symbol> symbols = new ArrayList<>();
        return symbols;
    }

    /**
     * parse file
     * TODO: 1.test class 实现 和 接口在一个文件中
     *
     * @param file file
     * @return
     */
    public ArrayList<Symbol> parseFile(FileImpl file) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        LOGGER.log(FINE, LogUtils.buildLogString(PARSE_FILE_FINE, file.getName()));

        ArrayList<InterfaceImpl> interfaces = new ArrayList<>();
        // TODO variables
        ArrayList<ClassImpl> classes = new ArrayList<>();
        // TODO functions
        ArrayList<EnumeratorImpl> enumerators = new ArrayList<>();

        if (!Lan.OBJECTIVE_C.fileExtensions.contains(file.getExtension())) {
            return symbols;
        }

        ParseTree parseTree = ObjcG4Util.getParseTree(file.getFullPath());

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {

                String name = ctx.classNameGeneric().className().getText();

                ObjcClassImpl clazz = new ObjcClassImpl(name, file);
                clazz.setDeclarantType(ObjcClassImpl.DeclarationType.INTERFACE);
                clazz.setRuleContext(ctx);
                classes.add(clazz);


                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                return super.visitClassInterface(ctx);
            }

            @Override
            public Object visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ObjcClassImpl clazz = new ObjcClassImpl(name, file);
                clazz.setDeclarantType(ObjcClassImpl.DeclarationType.IMPLEMENTATION);
                clazz.setRuleContext(ctx);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                classes.add(clazz);
                return super.visitClassImplementation(ctx);
            }

            @Override
            public Object visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

                Boolean isAnonymous = ctx.categoryName() == null;

                String name = ctx.classNameGeneric().className().getText();

                ObjcClassImpl clazz = new ObjcClassImpl(name, file);

                if (isAnonymous) {
                    clazz.setDeclarantType(ObjcClassImpl.DeclarationType.ANONYMOUS_CATEGORY);
                } else {
                    clazz.setDeclarantType(ObjcClassImpl.DeclarationType.NAMED_CATEGORY);
                    clazz.setCategoryName(ctx.categoryName().getText());
                }

                clazz.setRuleContext(ctx);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                classes.add(clazz);
                return super.visitCategoryInterface(ctx);
            }

            @Override
            public Object visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx) {

                String name = ctx.classNameGeneric().className().getText();

                ObjcClassImpl clazz = new ObjcClassImpl(name, file);

                clazz.setDeclarantType(ObjcClassImpl.DeclarationType.CATEGORY_IMPLEMENTATION);

                clazz.setRuleContext(ctx);

                classes.add(clazz);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                return super.visitCategoryImplementation(ctx);
            }

            @Override
            public Object visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx) {
                String name = ctx.protocolName().getText();
                InterfaceImpl anInterface = new InterfaceImpl(name, file);
                anInterface.setRuleContext(ctx);
                interfaces.add(anInterface);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));
                return super.visitProtocolDeclaration(ctx);
            }

            @Override
            public Object visitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx) {
                String name = null;
                if (ctx.className() != null) {
                    name = ctx.className().getText();
                } else {
                    name = ctx.enumSpecifier().identifier().get(0).getText();
                }
                EnumeratorImpl enumerator = new EnumeratorImpl(name, file);
                enumerator.setRuleContext(ctx);
                enumerators.add(enumerator);

                return super.visitEnumDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(parseTree);


        file.getClasses().addAll(classes);
        file.getInterfaces().addAll(interfaces);
        // TODO: add variable
        // TODO: add Enumerator
        symbols.addAll(classes);
        symbols.addAll(interfaces);
        symbols.addAll(enumerators);

        return symbols;
    }


    public ArrayList<Symbol> parseClass(ClassImpl clazz) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        ArrayList<Function> functions = new ArrayList<>();
        ArrayList<Variable> variables = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            /**
             * super class
             */
            @Override
            public Object visitSuperclassName(ObjectiveCParser.SuperclassNameContext ctx) {
                String name = ctx.getText();
                ClassImpl claz = new ClassImpl(name, clazz);
                clazz.superCls.add(claz);
                return super.visitSuperclassName(ctx);
            }

            /**
             * extends interface
             */
            @Override
            public Object visitProtocolList(ObjectiveCParser.ProtocolListContext ctx) {
                /// implements protocols
                for (ObjectiveCParser.ProtocolNameContext protocolNameContext : ctx.protocolName()) {
                    String name = protocolNameContext.getText();
                    InterfaceImpl anInterface = new InterfaceImpl(name, clazz);

                    clazz.iInterfaces.add(anInterface);
                }
                return super.visitProtocolList(ctx);
            }

            /**
             * properties
             */
            @Override
            public Object visitPropertyDeclaration(ObjectiveCParser.PropertyDeclarationContext ctx) {
                String name = ctx.structDeclaration().structDeclaratorList().getText();
                if (name.startsWith("*")) {
                    name = name.substring(1);
                }

                VariableImpl variable = new VariableImpl(name, clazz);
                variable.setRuleContext(ctx);
                clazz.iVariables.add(variable);
                variables.add(variable);

                return super.visitPropertyDeclaration(ctx);
            }

            /**
             * methods
             */
            @Override
            public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {

                String name = ctx.methodSelector().getText();

                FunctionImpl function = new FunctionImpl(name, clazz);
                clazz.iFunctions.add(function);
                functions.add(function);
                return super.visitMethodDeclaration(ctx);
            }

            /**
             * methods
             */
            @Override
            public Object visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
                String name = ctx.methodSelector().getText();
                FunctionImpl function = new FunctionImpl(name, clazz);
                clazz.iFunctions.add(function);
                functions.add(function);
                return super.visitMethodDefinition(ctx);
            }
        };

        parseTreeVisitor.visit(clazz.getRuleContext());
        symbols.addAll(functions);
        symbols.addAll(variables);

        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseEnumerator(EnumeratorImpl enumerator) {
        ArrayList<Symbol> symbols = new ArrayList<>();


        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitEnumerator(ObjectiveCParser.EnumeratorContext ctx) {
                String itemName = ctx.enumeratorIdentifier().getText();
                VariableImpl variable = new VariableImpl(itemName, enumerator);
                enumerator.getValues().add(variable);
                return super.visitEnumerator(ctx);
            }
        };
        parseTreeVisitor.visit(enumerator.getRuleContext());
        return symbols;
    }

}
