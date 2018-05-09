package com.away1994.structure.lang.io.read;


import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Symbol;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static com.away1994.common.constants.log.ErrorConstants.NOT_FOUND_FILE_ERROR;
import static com.away1994.common.constants.log.ErrorConstants.READ_TO_FILE_ERROR;
import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

public class ReaderImpl implements Reader {

    private static final transient Logger LOGGER = Logger.getLogger(ReaderImpl.class.getName());

    private Session session = null;

    public ReaderImpl(Session session) {
        this.session = session;
    }


    @Override
    public <T extends Symbol> Collection<T> getSymbols(String name, Type type) {
        return this.getSymbols(type, type.getDescription() + "(" + name + ")");
    }

    public <T extends Symbol> File getSymbolFile( T s) {
        return new File(this.session.symbolsPath() + "/" + s.identify() + ".json");
    }

    public <T extends Symbol> Boolean isSymbolExist( T s) {
        return this.getSymbolFile(s).exists();
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
        return this.getSymbols(type, type.getDescription() + "(");
    }

    @Override
    public <T extends Symbol> T getSymbol(String identify) {
        File file = new File(this.session.symbolsPath() + "/" + identify + ".json");
        Symbol symbol = null;
        try {
            symbol = new ObjectMapper().reader(Type.getState(identify).getClazz()).readValue(file);
        } catch (IOException e) {
            LOGGER.log(SEVERE, LogUtils.buildLogString(READ_TO_FILE_ERROR, new Object[]{file.getName(), e}));
        }
        return (T) symbol;
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
