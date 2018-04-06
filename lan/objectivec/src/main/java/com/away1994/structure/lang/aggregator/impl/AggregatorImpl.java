package com.away1994.structure.lang.aggregator.impl;

import com.away1994.structure.lang.aggregator.AggregateInfo;
import com.away1994.structure.lang.aggregator.Aggregator;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.io.read.ReaderImpl;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.impl.ClassImpl;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AggregatorImpl implements Aggregator {

    private static final transient Logger LOGGER = Logger.getLogger(AggregatorImpl.class.getName());
    private Session session = null;
    private Reader reader = null;

    public AggregatorImpl(Session session) {
        this.session = session;
        this.reader = new ReaderImpl(session);
    }

    @Override
    public AggregateInfo getClassDependencyInfo(String className, int depth) {

        Collection<ClassImpl> symbols = reader.getSymbols(className, State.CLASS_STATE.getDescription());
        LOGGER.log(Level.INFO, "find symbol" + symbols);
        return null;
    }
}
