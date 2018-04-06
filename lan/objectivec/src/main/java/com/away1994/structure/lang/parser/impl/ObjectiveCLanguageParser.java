package com.away1994.structure.lang.parser.impl;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.FineConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.parser.LanguageParser;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableBase;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.away1994.tsp.g4.ObjcG4Util;
import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.gen.ObjectiveCParserBaseVisitor;
import com.away1994.tsp.language.Lan;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;

import static com.away1994.common.constants.log.FineConstants.PARSE_CLASS_FINE;
import static com.away1994.common.constants.log.FineConstants.PARSE_FILE_FINE;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;

public class ObjectiveCLanguageParser implements LanguageParser {

    private static final transient Logger LOGGER = Logger.getLogger(ObjectiveCLanguageParser.class.getName());

    public ArrayList<Symbol> parseInterface(InterfaceBase anInterface) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {

            @Override
            public Object visitProtocolName(ObjectiveCParser.ProtocolNameContext ctx) {
                String protocol = ctx.getText();
                InterfaceBase i = new InterfaceBase(protocol, anInterface);
                anInterface.getExtendInterfaces().add(i);
                return super.visitProtocolName(ctx);
            }

            @Override
            public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {
                String methodName = ctx.methodSelector().getText();
                FunctionBase f = new FunctionBase(anInterface, methodName);
                anInterface.getiFunctions().add(f);
                return super.visitMethodDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(anInterface.getRuleContext());

        return symbols;
    }

    public ArrayList<Symbol> parseVariable(VariableBase variable) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx) {

                ClassBase type = new ClassBase(ctx.getText(), variable);
                variable.setType(type);
                return super.visitSpecifierQualifierList(ctx);
            }
        };

        parseTreeVisitor.visit(variable.ruleContext);
        return symbols;


    }


    public ArrayList<Symbol> parseFunction(FunctionBase function) {
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
    public ArrayList<Symbol> parseFile(FileBase file) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        LOGGER.log(FINE, LogUtils.buildLogString(PARSE_FILE_FINE, file.getName()));

        ArrayList<InterfaceBase> interfaces = new ArrayList<>();
        // TODO variables
        ArrayList<ClassBase> classes = new ArrayList<>();
        // TODO functions
        ArrayList<EnumeratorBase> enumerators = new ArrayList<>();

        if (!Lan.OBJECTIVE_C.fileExtensions.contains(file.getExtension())) {
            return symbols;
        }

        ParseTree parseTree = ObjcG4Util.getParseTree(file.getFullPath());

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {

                String name = ctx.classNameGeneric().className().getText();

                ClassBase clazz = new ClassBase(name, file);
                clazz.setRuleContext(ctx);
                classes.add(clazz);


                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                return super.visitClassInterface(ctx);
            }

            @Override
            public Object visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ClassBase clazz = new ClassBase(name, file);
                clazz.setRuleContext(ctx);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                classes.add(clazz);
                return super.visitClassImplementation(ctx);
            }

            @Override
            public Object visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

                Boolean isAnonymous = ctx.categoryName() == null;

                String name = ctx.classNameGeneric().className().getText();
                name = isAnonymous ? name + "()" : name + ctx.categoryName().getText();
                ClassBase clazz = new ClassBase(name, file);
                clazz.setRuleContext(ctx);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                classes.add(clazz);
                return super.visitCategoryInterface(ctx);
            }

            @Override
            public Object visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ClassBase clazz = new ClassBase(name, file);
                clazz.setRuleContext(ctx);
                classes.add(clazz);

                LOGGER.log(FINE, LogUtils.buildLogString(PARSE_CLASS_FINE, name));

                return super.visitCategoryImplementation(ctx);
            }

            @Override
            public Object visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx) {
                String name = ctx.protocolName().getText();
                InterfaceBase anInterface = new InterfaceBase(name, file);
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
                EnumeratorBase enumerator = new EnumeratorBase(name, file);
                enumerator.setRuleContext(ctx);
                enumerators.add(enumerator);

                return super.visitEnumDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(parseTree);

        symbols.addAll(classes);
        symbols.addAll(interfaces);
        symbols.addAll(enumerators);

        return symbols;
    }


    public ArrayList<Symbol> parseClass(ClassBase clazz) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        ArrayList<Function> functions = new ArrayList<>();
        ArrayList<Variable> variables = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitSuperclassName(ObjectiveCParser.SuperclassNameContext ctx) {
                String name = ctx.getText();
                ClassBase claz = new ClassBase(name, clazz);
                clazz.superCls.add(claz);
                return super.visitSuperclassName(ctx);
            }

            @Override
            public Object visitProtocolList(ObjectiveCParser.ProtocolListContext ctx) {
                /// implements protocols
                for (ObjectiveCParser.ProtocolNameContext protocolNameContext : ctx.protocolName()) {
                    String name = protocolNameContext.getText();
                    InterfaceBase anInterface = new InterfaceBase(name, clazz);

                    clazz.iInterfaces.add(anInterface);
                }
                return super.visitProtocolList(ctx);
            }

            @Override
            public Object visitPropertyDeclaration(ObjectiveCParser.PropertyDeclarationContext ctx) {
                String name = ctx.structDeclaration().structDeclaratorList().getText();
                if (name.startsWith("*")) {
                    name = name.substring(1);
                }

                VariableBase variable = new VariableBase(clazz, name);
                variable.setRuleContext(ctx);
                clazz.iVariables.add(variable);
                variables.add(variable);

                return super.visitPropertyDeclaration(ctx);
            }

            @Override
            public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {

                String name = ctx.methodSelector().getText();

                FunctionBase function = new FunctionBase(clazz, name);
                clazz.iFunctions.add(function);
                functions.add(function);
                return super.visitMethodDeclaration(ctx);
            }

            @Override
            public Object visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
                String name = ctx.methodSelector().getText();
                FunctionBase function = new FunctionBase(clazz, name);
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

    public ArrayList<Symbol> parsePath(PathBase path) {
        /**
         * TODO: use coroutine
         */
        ArrayList<Symbol> symbols = new ArrayList<>();
        File dir = new File(path.getPath());

        assert dir.isDirectory();

        File[] fds = dir.listFiles();
        if (fds != null) {
            ArrayList<FileBase> files = new ArrayList<>();
            ArrayList<PathBase> paths = new ArrayList<>();
            for (File f : fds) {
                if (f.isFile()) {
                    files.add(new FileBase(path, f.getName()));
                } else if (f.isDirectory()) {
                    LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.PARSE_DIRECTORY_FINE, f));
                    paths.add(new PathBase(path, f.getPath()));
                } else {
                    LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.UNKNOWN_FILE_TYPE, f));
                }
            }
            path.getFiles().addAll(files);
            path.getPaths().addAll(paths);

            symbols.addAll(files);
            symbols.addAll(paths);
        } else {
            LOGGER.log(FINE, FineConstants.EMPTY_DIRECTORY_FINE);
        }


        return symbols;
    }

    @Override
    public ArrayList<Symbol> parseEnumerator(EnumeratorBase enumerator) {
        ArrayList<Symbol> symbols = new ArrayList<>();


        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitEnumerator(ObjectiveCParser.EnumeratorContext ctx) {
                String itemName = ctx.enumeratorIdentifier().getText();
                VariableBase variable = new VariableBase(enumerator, itemName);
                enumerator.getValues().add(variable);
                return super.visitEnumerator(ctx);
            }
        };
        parseTreeVisitor.visit(enumerator.getRuleContext());
        return symbols;
    }

}
