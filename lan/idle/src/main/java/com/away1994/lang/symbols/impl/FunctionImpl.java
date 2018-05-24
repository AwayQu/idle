package com.away1994.lang.symbols.impl;

import com.away1994.lang.parser.Type;
import com.away1994.lang.symbols.Function;
import com.away1994.lang.symbols.Symbol;

import java.util.ArrayList;
import java.util.Collection;

import static com.away1994.dist.constants.CommonConstants.LINE_SEPARATOR;

public class FunctionImpl extends SymbolImpl implements Function {

    public FunctionImpl(String name, Symbol owner) {
        super(name, owner);
    }

    public FunctionImpl() {
    }

    /**
     * TODO :
     * callees
     * contains variables
     * contains classes
     */



    public String description() {

        StringBuilder sb = new StringBuilder();


        sb.append("signature:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.name);
        sb.append(LINE_SEPARATOR);

        sb.append("owner:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.owner.identify());
        sb.append(LINE_SEPARATOR);

        return sb.toString();
    }

    @Override
    public Type state() {
        return Type.FUNCTION_STATE;
    }

    @Override
    public Collection<Symbol> allSymbols() {
        ArrayList<Symbol> symbols = new ArrayList<>();
        return symbols;
    }
}
