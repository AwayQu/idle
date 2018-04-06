package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Symbol;

public class SymbolImpl implements Symbol{

    private String identify;

    public SymbolImpl(String identify) {
        this.identify = identify;
    }

    @Override
    public String identify() {
        return this.identify;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public State state() {
        return State.PLACEHOLD_STATE;
    }
}
