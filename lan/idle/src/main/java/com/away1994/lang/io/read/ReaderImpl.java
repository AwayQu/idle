package com.away1994.lang.io.read;


import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.lang.aggregator.Session;
import com.away1994.lang.io.Reader;
import com.away1994.lang.parser.Type;
import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.SymbolTable;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.nio.cs.FastCharsetProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static com.away1994.common.constants.CharacterConstants.SLASH_CHAR;
import static com.away1994.common.constants.log.ErrorConstants.*;
import static com.away1994.lang.constants.LangConstants.SYMBOL_TABLE_FILE;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class ReaderImpl implements Reader {

    private static final transient Logger LOGGER = Logger.getLogger(ReaderImpl.class.getName());

    private Session session = null;

    private SymbolTable symbolTable = null;

    public ReaderImpl(Session session) {
        this.session = session;

        String symbolTablePath = this.session.symbolsPath() + SLASH_CHAR + SYMBOL_TABLE_FILE;
        File f = new File(symbolTablePath);
        try {
            this.symbolTable = new ObjectMapper().reader(SymbolTable.class).readValue(f);
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.READ_TO_FILE_ERROR,
                    new Object[]{symbolTablePath, e}));
        }

    }


    @Override
    public <T extends Symbol> Collection<T> getSymbols(String name, Type type) {
        return this.getSymbols(type, type.getDescription() + "(" + name + ")");
    }

    public <T extends Symbol> File getSymbolFile(T s) {
        return getSymbolFile(s.identify());
    }

    public <T extends Symbol> Boolean isSymbolExist(T s) {
        if (s == null) {
            return false;
        }
        File finded = this.getSymbolFile(s);
        if (finded == null) {
            return false;
        }
        return finded.exists();
    }

    @Override
    public <T extends Symbol> T getSymbol(T s) {
        File f = getSymbolFile(s);
        if (!f.exists()) {
            return null;
        }
        Symbol symbol = null;
        try {
            symbol = new ObjectMapper().readerForUpdating(s).readValue(f);
        } catch (FileNotFoundException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(NOT_FOUND_FILE_ERROR, new Object[]{f.getName(), e}));
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(READ_TO_FILE_ERROR, new Object[]{f.getName(), e}));
        }
        return (T) symbol;
    }

    @Override
    public <T extends Symbol> Collection<T> getSymbols(Type type) {
        return this.getSymbols(type, type.getDescription());
    }

    @Override
    public <T extends Symbol> T getSymbol(String identify) {

        File file = getSymbolFile(identify);
        Symbol symbol = null;
        try {
            symbol = new ObjectMapper().reader(Type.getState(identify).getClazz()).readValue(file);
        } catch (IOException | NullPointerException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(READ_TO_FILE_ERROR, new Object[]{file == null ? "" :file.getName(), e}));
            return null;
        }
        return (T) symbol;
    }

    private File getSymbolFile(String identify) {
        if (this.symbolTable == null) {
            LOGGER.log(SEVERE, SYMBOL_TABLE_NOT_INITIALIZE_ERROR);
            return null;
        }
        String fileName = this.symbolTable.getSymbolMaps().get(identify);

        if (fileName == null) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(SYMBOL_TABLE_NOT_FOUND_VALUE_ERROR, new Object[]{identify}));
        }
        return new File(this.session.symbolsPath() + "/" + fileName + ".json");
    }

    private <T extends Symbol> Collection<T> getSymbols(Type type, String match) {
        ArrayList<T> symbols = new ArrayList<>();
        File file = new File(this.session.symbolsPath());

        File[] files = file.listFiles();
        if (null == files)
            return null;
        for (File f : files) {
            if (f.getName().startsWith(match)) {
                LOGGER.log(INFO, "find class" + f.getName());
                Symbol symbol = null;
                try {
                    symbol = new ObjectMapper().reader(type.getClazz()).readValue(f);
                    symbols.add((T) symbol);
                } catch (IOException e) {
                    LOGGER.log(SEVERE, LogUtils.buildLogString(READ_TO_FILE_ERROR, new Object[]{f.getName(), e}));
                }
            }
        }


        return symbols;


    }
}
