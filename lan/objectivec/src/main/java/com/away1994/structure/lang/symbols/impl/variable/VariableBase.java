package com.away1994.structure.lang.symbols.impl.variable;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;

public class VariableBase implements Variable {


    public Symbol owner;

    public String name;

    public VariableBase(Symbol owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    @Override
    public String identify() {
        return this.owner.identify() + name;
    }

    @Override
    public String description() {
        return null;
    }
}
