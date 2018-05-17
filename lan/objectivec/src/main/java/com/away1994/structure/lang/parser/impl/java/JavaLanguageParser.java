package com.away1994.structure.lang.parser.impl.java;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.FineConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.parser.LanguageParser;
import com.away1994.structure.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.away1994.tsp.gen.java8.Java8BaseVisitor;
import com.away1994.tsp.gen.java8.Java8Parser;
import com.away1994.tsp.language.Lan;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;

import static com.away1994.common.constants.log.FineConstants.PARSE_FILE_FINE;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;

public class JavaLanguageParser implements LanguageParser {

    private static final transient Logger LOGGER = Logger.getLogger(ObjectiveCLanguageParser.class.getName());

    @Override
    public ArrayList<Symbol> parseInterface(InterfaceImpl anInterface) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        AbstractParseTreeVisitor parseTreeVisitor = new Java8BaseVisitor() {
            // TODO: other member
//            @Override
//            public Object visitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx) {
//                return super.visitInterfaceMemberDeclaration(ctx);
//            }

            /**
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
                return super.visitNormalClassDeclaration(ctx);
            }

            /**
             * enum
             */
            @Override
            public Object visitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx) {
                return super.visitEnumDeclaration(ctx);
            }

            /**
             * interface
             */
            @Override
            public Object visitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx) {
                return super.visitInterfaceDeclaration(ctx);
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
                return super.visitSuperclass(ctx);
            }

            /**
             * implements interfaces
             */
            @Override
            public Object visitSuperinterfaces(Java8Parser.SuperinterfacesContext ctx) {
                return super.visitSuperinterfaces(ctx);
            }

            /**
             * variables
             */
            @Override
            public Object visitClassMemberDeclaration(Java8Parser.ClassMemberDeclarationContext ctx) {
                return super.visitClassMemberDeclaration(ctx);
            }
        };

        parseTreeVisitor.visit(clazz.getRuleContext());
        symbols.addAll(functions);
        symbols.addAll(variables);

        return symbols;
    }

    @Override
    public ArrayList<Symbol> parsePath(PathImpl path) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        File dir = new File(path.getPath());

        assert dir.isDirectory();

        File[] fds = dir.listFiles();
        if (fds != null) {
            ArrayList<FileImpl> files = new ArrayList<>();
            ArrayList<PathImpl> paths = new ArrayList<>();
            for (File f : fds) {
                if (f.isFile()) {
                    files.add(new FileImpl(f.getName(), path));
                } else if (f.isDirectory()) {
                    LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.PARSE_DIRECTORY_FINE, f));
                    paths.add(new PathImpl(f.getPath(), path));
                } else {
                    LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.UNKNOWN_FILE_TYPE_ERROR, f));
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
