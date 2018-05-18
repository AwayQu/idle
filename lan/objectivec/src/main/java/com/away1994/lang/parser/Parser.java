package com.away1994.lang.parser;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.FineConstants;
import com.away1994.common.utils.hash.Hash;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.lang.constants.LangConstants;
import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.*;
import com.away1994.lang.symbols.impl.variable.VariableImpl;
import com.away1994.utils.IdentifyUtils;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static com.away1994.common.constants.CharacterConstants.SLASH_CHAR;
import static java.util.logging.Level.FINE;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class Parser {
    private static final transient Logger LOGGER = Logger.getLogger(Parser.class.getName());

    private ArrayList<Symbol> nextSymbols = new ArrayList<>();

    private String outputPath;

    private SymbolTable symbolTable = new SymbolTable();

    private LanguageParser languageParser = null;

    public String getOutputPath() {
        return outputPath;
    }

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

    //region summary
    public Integer numberOfPath = 0;
    public Integer numberOfFile = 0;
    public Integer numberOfClass = 0;
    public Integer numberOfFunction = 0;
    public Integer numberOfVariable = 0;
    public Integer numberOfInterface = 0;
    public Integer numberOfEnum = 0;
    //endregion


    public Parser(Symbol symbol, LanguageParser languageParser) {
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
            Symbol currentSymbol = nextSymbols.get(0);
            nextSymbols.remove(0);
            Type currentState = currentSymbol.state();
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
                    if (currentSymbol instanceof PathImpl)
                        symbols = languageParser.parsePath((PathImpl) currentSymbol);

                    if (languageParser.options() != null && languageParser.options().getVerbose()) {
                        this.numberOfPath++;
                    }

                    break;
                case FILE_STATE:
                    /**
                     * situations:
                     * interface variable classes functions enum
                     */
                    // read files get classes and interface and variables and functions enum
                    if (currentSymbol instanceof FileImpl)
                        symbols = languageParser.parseFile((FileImpl) currentSymbol);

                    if (languageParser.options() != null && languageParser.options().getVerbose()) {
                        this.numberOfFile++;
                    }

                    break;
                case CLASS_STATE:
                    /**
                     * situations:
                     * variables functions
                     */
                    if (currentSymbol instanceof ClassImpl)
                        symbols = languageParser.parseClass((ClassImpl) currentSymbol);

                    if (languageParser.options() != null && languageParser.options().getVerbose()) {
                        this.numberOfClass++;
                    }
                    break;
                case FUNCTION_STATE:
                    /**
                     * etc..
                     */
                    if (currentSymbol instanceof FunctionImpl)
                        symbols = languageParser.parseFunction((FunctionImpl) currentSymbol);

                    if (languageParser.options() != null && languageParser.options().getVerbose())  {
                        this.numberOfFunction++;
                    }
                    break;
                case VARIABLE_STATE:
                    /**
                     * etc..
                     */
                    if (currentSymbol instanceof VariableImpl)
                        symbols = languageParser.parseVariable((VariableImpl) currentSymbol);
                    if (languageParser.options() != null && languageParser.options().getVerbose())  {
                        this.numberOfVariable++;
                    }
                    break;
                case INTERFACE_STATE:
                    /**
                     * etc..
                     */
                    if (currentSymbol instanceof InterfaceImpl)
                        symbols = languageParser.parseInterface((InterfaceImpl) currentSymbol);
                    if (languageParser.options() != null && languageParser.options().getVerbose())  {
                        this.numberOfInterface++;
                    }
                    break;

                case ENUM_STATE:
                    if (currentSymbol instanceof EnumeratorImpl)
                        symbols = languageParser.parseEnumerator((EnumeratorImpl) currentSymbol);
                    if (languageParser.options() != null && languageParser.options().getVerbose())  {
                        this.numberOfEnum++;
                    }
                    break;

            }
            this.visitSymbol(currentSymbol);
            if (symbols != null) {
                this.nextSymbols.addAll(symbols);
            }

        }

        writeSymbolTable();

        if (languageParser.options() != null && languageParser.options().getVerbose())  {
            LOGGER.log(INFO, FineConstants.SUMMARY_FINE + ":\n" +
                    "numberOfPath:  " + numberOfPath + "\n" +
                    "numberOfFile:  " + numberOfFile + "\n" +
                    "numberOfClass:  " + numberOfClass + "\n" +
                    "numberOfFunction:  " + numberOfFunction + "\n" +
                    "numberOfVariable:  " + numberOfVariable + "\n" +
                    "numberOfInterface:  " + numberOfInterface + "\n" +
                    "numberOfEnum:  " + numberOfEnum + "\n");
        }
    }

    private void writeSymbolTable() {
        ObjectMapper objectMapper = new ObjectMapper();
        String fileName = this.outputPath + SLASH_CHAR + LangConstants.SYMBOL_TABLE_FILE;

        try {

            File file = new File(fileName);

            if (file.exists()) {
                LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.DUPLICATED_IDENTIFY_ERROR, fileName));
            }
            LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.CREATE_IDENTIFY_FILE_FINE, fileName));
            FileWriter fw = new FileWriter(fileName);
            objectMapper.writeValue(fw, symbolTable);
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.WRITE_TO_FILE_ERROR,
                    new Object[]{fileName, e}));
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
        ObjectMapper objectMapper = new ObjectMapper();

        String md5 = null;
        try {
            md5 = Hash.md5(symbol.identify());
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.HASH_ERROR,
                    new Object[]{symbol.identify(), e}));
            e.printStackTrace();
            return;
        }

        String value = IdentifyUtils.getType(symbol.identify()) + md5;

        this.symbolTable.getSymbolMaps().put(symbol.identify(), value);

        String fileName = this.outputPath + "/" + value + ".json";


        try {

            File file = new File(fileName);

            if (file.exists()) {
                LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.DUPLICATED_IDENTIFY_ERROR, fileName));
            }

            FileWriter fw = new FileWriter(fileName);
            objectMapper.writeValue(fw, symbol);
            LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.CREATE_IDENTIFY_FILE_FINE, fileName));
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.WRITE_TO_FILE_ERROR,
                    new Object[]{fileName, e}));
            e.printStackTrace();
        }


    }
}
