package com.away1994.structure.lang.aggregator.impl;

import com.away1994.structure.lang.aggregator.AggregateInfo;
import com.away1994.structure.lang.aggregator.Aggregator;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.io.read.ReaderImpl;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.ClassImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AggregatorImpl implements Aggregator {

    private static final transient Logger LOGGER = Logger.getLogger(AggregatorImpl.class.getName());
    private Session session = null;
    private Reader reader = null;

    public static Session currentSession;

    public AggregatorImpl(Session session) {
        this.session = session;
        this.reader = new ReaderImpl(session);
    }

    @Override
    public AggregateInfo getClassDependencyInfo(String className, int depth) {
        currentSession = session;
        Collection<ClassImpl> symbols = reader.getSymbols(className, State.CLASS_STATE);

        ArrayList<Symbol> toAwakeSymbols = new ArrayList<>();
        toAwakeSymbols.addAll(symbols);

            while (depth >= 0 && toAwakeSymbols.size() > 0) {
                ArrayList<Symbol> t = new ArrayList<>();
                for (Symbol s : toAwakeSymbols){
                    reader.getSymbol(s);
                    t.addAll(s.allSymbols());
                }
                depth--;
                toAwakeSymbols = t;
            }

        LOGGER.log(Level.INFO, "find symbol" + symbols);
        return null;
    }
}
