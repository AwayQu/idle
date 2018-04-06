package com.away1994.structure.lang.io.read;


import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.SymbolImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;

public class ReaderImpl implements Reader {

    private static final transient Logger LOGGER = Logger.getLogger(ReaderImpl.class.getName());

    private Session session = null;

    public ReaderImpl(Session session) {
        this.session = session;
    }

    @Override
    public <T extends Symbol> Collection<T> getSymbols(String name, String type) {

        ArrayList<T> symbols = new ArrayList<>();
        File file = new File(this.session.symbolsPath());


        File[] files = file.listFiles();
        if (null == files)
            return null;
        for (File f : files) {

            if (f.getName().startsWith(type + "(" + name + ")")) {
                LOGGER.log(INFO, "find class" + f.getName());
                Symbol symbol = new SymbolImpl(f.getName());
                symbols.add((T) symbol);
            }
        }


        return symbols;
    }

}
