package com.away1994.structure.lang.parser;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.FineConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.symbols.Symbol;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;

public class StateMachineParser {
    private static final transient Logger LOGGER = Logger.getLogger(StateMachineParser.class.getName());

    public State currentState;

    public Symbol currentSymbol;

    public ArrayList<Symbol> nextSymbols = new ArrayList<>();

    public String outputPath;


    private LanguageParser languageParser = null;

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    public StateMachineParser(Symbol symbol, LanguageParser languageParser) {
        nextSymbols.add(symbol);
        this.languageParser = languageParser;
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
            currentState = currentSymbol.state();
            ArrayList<Symbol> symbols = null;
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
                    symbols = languageParser.parsePath(currentSymbol);
                    break;
                case FILE_STATE:
                    /**
                     * situations:
                     * interface variable classes functions enum
                     */
                    // read files get classes and interface and variables and functions enum
                    symbols = languageParser.parseFile(currentSymbol);
                    break;
                case CLASS_STATE:
                    /**
                     * situations:
                     * variables functions
                     */
                    symbols = languageParser.parseClass(currentSymbol);
                    break;
                case FUNCTION_STATE:
                    /**
                     * etc..
                     */
                    symbols = languageParser.parseFunction(currentSymbol);
                    break;
                case VARIABLE_STATE:
                    /**
                     * etc..
                     */
                    symbols = languageParser.parseVariable(currentSymbol);
                    break;
                case INTERFACE_STATE:
                    /**
                     * etc..
                     */
                    symbols = languageParser.parseInterface(currentSymbol);
                    break;

                case ENUM_STATE:
                    symbols = languageParser.parseEnumerator(currentSymbol);
                    break;

            }
            this.visitSymbol(currentSymbol);
            if (symbols != null) {
                this.nextSymbols.addAll(symbols);
            }

        }
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
        String fileName = this.outputPath + "/" + symbol.identify();
        try {


            File file = new File(fileName);

            if (file.exists()) {
                LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.DUPLICATED_IDENTIFY_ERROR, fileName));
            }
            FileWriter fw = new FileWriter(fileName);
            fw.write(symbol.description());
            fw.flush();
            fw.close();
            LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.CREATE_IDENTIFY_FILE_FINE, fileName));
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.WRITE_TO_FILE_ERROR,
                    new Object[]{fileName, e}));
            e.printStackTrace();
        }


    }
}
