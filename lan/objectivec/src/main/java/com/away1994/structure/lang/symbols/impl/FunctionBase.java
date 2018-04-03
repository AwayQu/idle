package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Symbol;


public class FunctionBase implements Function {

    public Symbol owner;

    /**
     * signature of function
     */
    public String signature;


    public FunctionBase(Symbol owner, String signature) {
        this.owner = owner;
        this.signature = signature;
    }


    /**
     * TODO :
     * callees
     * contains variables
     * contains classes
     */


    @Override
    public String identify() {
        return owner.identify() + this.signature;
    }

    @Override
    public String description() {
        return owner.identify() + this.signature;
    }
}
