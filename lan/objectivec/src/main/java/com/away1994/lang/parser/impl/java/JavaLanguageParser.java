package com.away1994.lang.parser.impl.java;

import com.away1994.common.utils.log.LogUtils;
import com.away1994.dist.language.Lan;
import com.away1994.gen.java8.Java8BaseVisitor;
import com.away1994.gen.java8.Java8Parser;
import com.away1994.lang.parser.LanguageParser;
import com.away1994.lang.parser.impl.LanguageParserImpl;
import com.away1994.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.lang.symbols.Function;
import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.*;
import com.away1994.lang.symbols.impl.variable.VariableImpl;
import com.away1994.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.logging.Logger;

import static com.away1994.common.constants.log.FineConstants.PARSE_CLASS_FINE;
import static com.away1994.common.constants.log.FineConstants.PARSE_FILE_FINE;
import static java.util.logging.Level.FINE;

public class JavaLanguageParser extends LanguageParserImpl implements LanguageParser {

    private static final transient Logger LOGGER = Logger.getLogger(ObjectiveCLanguageParser.class.getName());

    @Override
    public ArrayList<Symbol> parseInterface(InterfaceImpl anInterface) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {
            @Override
            public Object visitInterfaceType(Java8Parser.InterfaceTypeContext ctx) {
                String superInterface = ctx.getText();
                InterfaceImpl i = new InterfaceImpl(superInterface, anInterface);
                anInterface.getExtendInterfaces().add(i);
                return super.visitInterfaceType(ctx);
            }

            // TODO: other member
//            @Override
//            public Object visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
//                return super.visitInterfaceMemberDeclaration(ctx);
//            }

            /**
             * TODO:
             * variable
             */
            @Override
            public Object visitConstantDeclaration(Java8Parser.ConstantDeclarationContext ctx) {
                return super.visitConstantDeclaration(ctx);
            }

            /**
             * method
             */
            @Override
            public Object visitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx) {
                String methodName = ctx.methodHeader().methodDeclarator().getText();
                FunctionImpl f = new FunctionImpl(methodName, anInterface);
                anInterface.getiFunctions().add(f);
                return super.visitInterfaceMethodDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(anInterface.getRuleContext());

        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseVariable(VariableImpl variable) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {
            /**
             * variable name
             */
            @Override
            public Object visitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx) {

                return super.visitVariableDeclaratorId(ctx);
            }
        };

        parseTreeVisitor.visit(variable.getRuleContext());
        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseFunction(FunctionImpl function) {
        // TODO:
        ArrayList<Symbol> symbols = new ArrayList<>();
        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseFile(FileImpl file) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        LOGGER.log(FINE, LogUtils.buildLogString(PARSE_FILE_FINE, file.getName()));

        ArrayList<InterfaceImpl> interfaces = new ArrayList<>();
        // TODO variables
        ArrayList<ClassImpl> classes = new ArrayList<>();
        // TODO functions
        ArrayList<EnumeratorImpl> enumerators = new ArrayList<>();

        if (!Lan.JAVA8.fileExtensions.contains(file.getExtension())) {
            return symbols;
        }

        ParseTree parseTree = Java8G4Util.getParseTree(file.getFullPath());
        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {
            /**
             * class
             */
            @Override
            public Object visitNormalClassDeclaration(Java8Parser.NormalClassDeclarationContext ctx) {
                String name = ctx.className().getText();
                ClassImpl clazz = new ClassImpl(name, file);
                clazz.setRuleContext(ctx);
                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));
                classes.add(clazz);
                return super.visitNormalClassDeclaration(ctx);
            }

            /**
             * enum
             */
            @Override
            public Object visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
                String name = ctx.enumName().getText();
                EnumeratorImpl enumerator = new EnumeratorImpl(name, file);
                enumerator.setRuleContext(ctx);
                enumerators.add(enumerator);
                return super.visitEnumDeclaration(ctx);
            }

            /**
             * interface
             */
            @Override
            public Object visitNormalInterfaceDeclaration(Java8Parser.NormalInterfaceDeclarationContext ctx) {
                String name = ctx.normalInterfaceName().getText();
                InterfaceImpl anInterface = new InterfaceImpl(name, file);
                anInterface.setRuleContext(ctx);
                interfaces.add(anInterface);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));
                return super.visitNormalInterfaceDeclaration(ctx);
            }

            /**
             * annotation
             */
            @Override
            public Object visitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx) {
                return super.visitAnnotationTypeDeclaration(ctx);
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

    @Override
    public ArrayList<Symbol> parseClass(ClassImpl clazz) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        ArrayList<Function> functions = new ArrayList<>();
        ArrayList<Variable> variables = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {

            /**
             * super class
             */
            @Override
            public Object visitSuperclass(Java8Parser.SuperclassContext ctx) {
                String name = ctx.classType().getText();
                ClassImpl claz = new ClassImpl(name, clazz);
                clazz.superCls.add(claz);
                return super.visitSuperclass(ctx);
            }

            /**
             * implements interfaces
             */
            @Override
            public Object visitInterfaceTypeList(Java8Parser.InterfaceTypeListContext ctx) {
                /// implements protocols
                for (Java8Parser.InterfaceTypeContext interfaceTypeContext : ctx.interfaceType()) {
                    String name = interfaceTypeContext.getText();
                    InterfaceImpl anInterface = new InterfaceImpl(name, clazz);
                    clazz.iInterfaces.add(anInterface);
                }
                return super.visitInterfaceTypeList(ctx);
            }

            /**
             * variables
             */
            @Override
            public Object visitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx) {
                for (Java8Parser.VariableDeclaratorContext c : ctx.variableDeclaratorList().variableDeclarator()) {
                    String name = c.variableDeclaratorId().getText();
                    VariableImpl variable = new VariableImpl(name, clazz);
                    variable.setRuleContext(c);
                    clazz.iVariables.add(variable);
                    variables.add(variable);
                }
                return super.visitFieldDeclaration(ctx);
            }

            @Override
            public Object visitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
                String name = ctx.methodHeader().methodDeclarator().methodName().getText();
                FunctionImpl function = new FunctionImpl(name, clazz);
                clazz.iFunctions.add(function);
                functions.add(function);
                return super.visitMethodDeclaration(ctx);
            }

            // TODO: inner class & interface
        };

        parseTreeVisitor.visit(clazz.getRuleContext());
        symbols.addAll(functions);
        symbols.addAll(variables);

        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseEnumerator(EnumeratorImpl enumerator) {
        ArrayList<Symbol> symbols = new ArrayList<>();


        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {
            /**
             * enums
             */
            @Override
            public Object visitEnumConstant(Java8Parser.EnumConstantContext ctx) {
                return super.visitEnumConstant(ctx);
            }
        };
        parseTreeVisitor.visit(enumerator.getRuleContext());
        return symbols;
    }

}
