package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Path;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.FileBase;
import com.away1994.structure.lang.symbols.impl.PathBase;

import java.io.File;
import java.util.ArrayList;

import static com.away1994.structure.lang.parser.State.FILE_STATE;
import static com.away1994.structure.lang.parser.State.PATH_STATE;

public class StateMachineParser {



    public State currentState;

    public Symbol currentSymbol;



    public ArrayList<Symbol> nextSymbols = new ArrayList<>();

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
            }
            switch (currentState) {
                case PATH_STATE:
                    /**
                     * situations:
                     * 1. root path
                     *    get files and paths
                     * 2. child path
                     *    get files and paths
                     */
                    /**
                     * TODO: use coroutine
                     */
                    if (currentSymbol instanceof PathBase) {
                        PathBase path = (PathBase) currentSymbol;
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

                            nextSymbols.addAll(files);
                            nextSymbols.addAll(paths);

                        } else {
                            System.out.print("dir is empty");
                        }


                    }

                    // read path get files and path


                    break;
                case FILE_STATE:
                    /**
                     * situations:
                     * interface variable classes functions
                     */
                    if (currentSymbol instanceof FileBase) {
                        FileBase file = (FileBase) currentSymbol;
                        System.out.println(file.getName());
                    }

                    // read files get classes and interface and variables and functions
                    break;
                case CLASS_STATE:
                    /**
                     * situations:
                     * variables functions
                     */
                    break;
                case FUNCTION_STATE:

                    /**
                     * etc..
                     */
                    break;
                case VARIABLE_STATE:
                    /**
                     * etc..
                     */
                    break;
                case INTERFACE_STATE:
                    /**
                     * etc..
                     */
                    break;

            }

        }
    }
}
