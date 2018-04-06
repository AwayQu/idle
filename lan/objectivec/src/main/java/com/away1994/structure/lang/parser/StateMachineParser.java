package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.*;
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
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import static com.away1994.structure.lang.parser.State.*;

public class StateMachineParser {


    public State currentState;

    public Symbol currentSymbol;

    public ArrayList<Symbol> nextSymbols = new ArrayList<>();

    public String outputPath;

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public StateMachineParser(Symbol symbol) {
        nextSymbols.add(symbol);
    }

    public void runParseStateMachine() {
        /**
         * 问题：
         * 1. depth prior or width prior policy
         * 2. 根据节点层级聚合信息
         * 3. hook存储symbols
         */
        ///

        while (nextSymbols.size() != 0) {
            currentSymbol = nextSymbols.get(0);
            nextSymbols.remove(0);
            if (currentSymbol instanceof Path) {
                currentState = PATH_STATE;
            } else if (currentSymbol instanceof com.away1994.structure.lang.symbols.File) {
                currentState = FILE_STATE;
            } else if (currentSymbol instanceof Class) {
                currentState = CLASS_STATE;
            } else if (currentSymbol instanceof Function) {
                currentState = FUNCTION_STATE;
            } else if (currentSymbol instanceof Variable) {
                currentState = VARIABLE_STATE;
            } else if (currentSymbol instanceof Interface) {
                currentState = INTERFACE_STATE;
            }
            ArrayList<Symbol> symbols;
            switch (currentState) {
                case PATH_STATE:
                    /**
                     * situations:
                     * 1. root path
                     *    get files and paths
                     * 2. child path
                     *    get files and paths
                     */

                    // read path get files and path
                    symbols = parsePath(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);

                    break;
                case FILE_STATE:
                    /**
                     * situations:
                     * interface variable classes functions enum
                     */
                    // read files get classes and interface and variables and functions enum
                    symbols = parseFile(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);

                    break;
                case CLASS_STATE:

                    /**
                     * situations:
                     * variables functions
                     */

                    symbols = parseClass(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);
                    break;
                case FUNCTION_STATE:

                    /**
                     * etc..
                     */
                    symbols = parseFunction(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);

                    break;
                case VARIABLE_STATE:
                    /**
                     * etc..
                     */

                    symbols = parseVariable(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);
                    break;
                case INTERFACE_STATE:
                    /**
                     * etc..
                     */

                    symbols = parseInterface(currentSymbol);

                    this.visitSymbol(currentSymbol);

                    this.nextSymbols.addAll(symbols);
                    break;

            }

        }
    }

    private ArrayList<Symbol> parseInterface(Symbol symbol) {
        ArrayList<Symbol> symbols = new ArrayList<>();

        if (symbol instanceof InterfaceBase) {


        }
        return symbols;
    }

    private ArrayList<Symbol> parseVariable(Symbol symbol) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        if (symbol instanceof VariableBase) {
            VariableBase variable = (VariableBase) symbol;

            AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {

            };
        }
        return symbols;


    }


    private ArrayList<Symbol> parseFunction(Symbol symbol) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        if (symbol instanceof FunctionBase) {

        }
        return symbols;
    }

    private ArrayList<Symbol> parseFile(Symbol symbol) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        if (symbol instanceof FileBase) {
            FileBase file = (FileBase) symbol;
            System.out.println(file.getName());

            ArrayList<InterfaceBase> interfaces = new ArrayList<>();
            // TODO variables
            ArrayList<ClassBase> classes = new ArrayList<>();
            // TODO functions
            // TODO enums

            if (!Lan.OBJECTIVE_C.fileExtensions.contains(file.getExtension())) {
                return symbols;
            }

            ParseTree parseTree = ObjcG4Util.getParseTree(file.getFullPath());

            AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
                /**
                 * read @interface Foo: NSObject
                 *      @end
                 *
                 * @param ctx
                 * @return
                 */
                @Override
                public Object visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {

                    String name = ctx.classNameGeneric().className().getText();

                    ClassBase clazz = new ClassBase(name, file);
                    clazz.setRuleContext(ctx);
                    classes.add(clazz);

                    System.out.println(name);

//                                if (elements.get(name) != null) {
//                                    e = (ObjcClassElementImpl) elements.get(name);
//                                } else {
//                                    e = new ObjcClassElementImpl(name);
//                                }
//
//                                e.setClassInterfaceContext(ctx);
//                                elements.put(name, e);
                    return super.visitClassInterface(ctx);
                }

                @Override
                public Object visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx) {
                    String name = ctx.classNameGeneric().className().getText();
//                                ObjcClassElementImpl e = null;
                    ClassBase clazz = new ClassBase(name, file);
                    clazz.setRuleContext(ctx);
                    System.out.println(name);
                    classes.add(clazz);
//                                if (elements.get(name) != null) {
//                                    e = (ObjcClassElementImpl) elements.get(name);
//                                } else {
//                                    e = new ObjcClassElementImpl(name);
//                                }
//
//                                e.setClassImplementationContext(ctx);
//
//                                elements.put(name, e);

                    return super.visitClassImplementation(ctx);
                }

                /**
                 * read @interface Foo ()
                 *
                 *      @end
                 *
                 *      @interface Foo (categoryName)
                 *
                 *      @end
                 *
                 * @param ctx
                 * @return
                 */
                @Override
                public Object visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

//                                Boolean isAnonymous = ctx.categoryName() == null;

                    String name = ctx.classNameGeneric().className().getText();
                    ClassBase clazz = new ClassBase(name, file);
                    clazz.setRuleContext(ctx);
                    System.out.println(name);
                    classes.add(clazz);

//                                ObjcClassElementImpl e = null;
//
//                                if (elements.get(name) != null) {
//                                    e = (ObjcClassElementImpl) elements.get(name);
//                                } else {
//                                    e = new ObjcClassElementImpl(name);
//                                }
//
//                                if (isAnonymous) {
//                                    e.setAnonymousCategoryInterfaceContexts(ctx);
//                                } else {
//                                    e.getCategoryInterfaceContexts().add(ctx);
//                                }
//                                elements.put(name, e);
                    return super.visitCategoryInterface(ctx);
                }

                /**
                 * read  @implement Foo (category)
                 *       @end
                 *
                 * @param ctx
                 * @return
                 */
                @Override
                public Object visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx) {
                    String name = ctx.classNameGeneric().className().getText();
                    ClassBase clazz = new ClassBase(name, file);
                    clazz.setRuleContext(ctx);
                    System.out.println(name);
                    classes.add(clazz);
//                                ObjcClassElementImpl e = null;
//                                if (elements.get(name) != null) {
//                                    e = (ObjcClassElementImpl) elements.get(name);
//                                } else {
//                                    e = new ObjcClassElementImpl(name);
//                                }
//
//                                e.getCategoryImplementationContexts().add(ctx);
//                                elements.put(name, e);
                    return super.visitCategoryImplementation(ctx);
                }

                /**
                 * read @protocol protocalName
                 *      @end
                 *
                 * @param ctx
                 * @return
                 */
                @Override
                public Object visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx) {
                    String name = ctx.protocolName().getText();
                    InterfaceBase anInterface = new InterfaceBase(name, file);
                    anInterface.setRuleContext(ctx);
                    System.out.println(name);
                    interfaces.add(anInterface);
//                                ObjcProtocolElementImpl e = null;
//                                if (interfaceElements.get(name) != null) {
//                                    e = (ObjcProtocolElementImpl) interfaceElements.get(name);
//                                } else {
//                                    e = new ObjcProtocolElementImpl(name);
//                                }
//
//                                e.setProtocolDeclarationContext(ctx);
//                                interfaceElements.put(name, e);

                    return super.visitProtocolDeclaration(ctx);
                }

                @Override
                public Object visitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx) {

//                                String name = null;
//                                if (ctx.className() != null) {
//                                    name = ctx.className().getText();
//                                } else {
//                                    name = ctx.enumSpecifier().identifier().get(0).getText();
//                                }
//
//                                ObjcEnumElementImpl e = null;
//                                if (enumElements.get(name) != null) {
//                                    e = (ObjcEnumElementImpl) enumElements.get(name);
//                                } else {
//                                    e = new ObjcEnumElementImpl(name);
//                                }
//                                e.setContext(ctx);
//                                enumElements.put(name, e);

                    return super.visitEnumDeclaration(ctx);
                }
            };

            parseTreeVisitor.visit(parseTree);

            symbols.addAll(classes);
            symbols.addAll(interfaces);

        }
        return symbols;
    }


    private ArrayList<Symbol> parseClass(Symbol symbol) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        if (symbol instanceof ClassBase) {
            ClassBase clazz = (ClassBase) symbol;
            ArrayList<Function> functions = new ArrayList<>();


            AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
                @Override
                public Object visitSuperclassName(ObjectiveCParser.SuperclassNameContext ctx) {
                    String name = ctx.getText();
                    ClassBase claz = new ClassBase(name, symbol);
                    clazz.superCls.add(claz);
                    return super.visitSuperclassName(ctx);
                }

                @Override
                public Object visitProtocolList(ObjectiveCParser.ProtocolListContext ctx) {
                    /// implements protocols
                    for (ObjectiveCParser.ProtocolNameContext protocolNameContext : ctx.protocolName()) {
                        String name = protocolNameContext.getText();
                        InterfaceBase anInterface = new InterfaceBase(name, symbol);

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

                    VariableBase variable = new VariableBase(symbol, name);
                    clazz.iVariables.add(variable);
                    return super.visitPropertyDeclaration(ctx);
                }

                @Override
                public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {

                    String name = ctx.methodSelector().getText();

                    FunctionBase function = new FunctionBase(symbol, name);
                    clazz.iFunctions.add(function);
                    functions.add(function);
                    return super.visitMethodDeclaration(ctx);
                }

                @Override
                public Object visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
                    String name = ctx.methodSelector().getText();
                    FunctionBase function = new FunctionBase(symbol, name);
                    clazz.iFunctions.add(function);
                    functions.add(function);
                    return super.visitMethodDefinition(ctx);
                }
            };

            parseTreeVisitor.visit(clazz.getRuleContext());
            symbols.addAll(functions);

        }
        return symbols;
    }

    private ArrayList<Symbol> parsePath(Symbol symbol) {
        /**
         * TODO: use coroutine
         */
        ArrayList<Symbol> symbols = new ArrayList<>();
        if (symbol instanceof PathBase) {
            PathBase path = (PathBase) symbol;
            File dir = new File(path.getPath());

            assert dir.isDirectory();

            File[] fds = dir.listFiles();
            if (fds != null) {
                ArrayList<FileBase> files = new ArrayList<>();
                ArrayList<PathBase> paths = new ArrayList<>();
                for (File f : fds) {
                    if (f.isFile()) {
//                                    System.out.println(f.getName());
                        files.add(new FileBase(path, f.getName()));
                    } else if (f.isDirectory()) {
                        System.out.println(f.getPath());
                        paths.add(new PathBase(path, f.getPath()));
                    } else {
                        System.out.print("unknown type");
                    }
                }
                path.getFiles().addAll(files);
                path.getPaths().addAll(paths);

                symbols.addAll(files);
                symbols.addAll(paths);
            } else {
                System.out.print("dir is empty");
            }


        }

        return symbols;
    }

    public void visitAllSymbols(Collection<Symbol> symbols) {
        for (Symbol symbol : symbols) {
            this.visitSymbol(symbol);
        }
    }

    public void visitSymbol(Symbol symbol) {

        this.write(symbol);

    }

    public void write(Symbol symbol) {
        try {
            String fileName = this.outputPath + "/" + symbol.identify();
            FileWriter fw = new FileWriter(fileName);
            fw.write(symbol.description());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
