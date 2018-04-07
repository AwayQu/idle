package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;

public enum State {


    PATH_STATE("$PATH", PathImpl.class),

    FILE_STATE("$FILE", FileImpl.class),

    CLASS_STATE("$CLASS", ClassImpl.class),

    VARIABLE_STATE("$VARIABLE", VariableImpl.class),

    INTERFACE_STATE("$INTERFACE", InterfaceImpl.class),

    FUNCTION_STATE("$FUNCTION", FunctionImpl.class),

    ENUM_STATE("$ENUM", EnumeratorImpl.class),

    PLACEHOLD_STATE("$PLACEHOLD", SymbolImpl.class);


    private Class<? extends Symbol> clazz;
    private String description;

    State(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Class<? extends Symbol> getClazz() {
        return clazz;
    }

    State(String description, Class<? extends Symbol> clazz) {
        this.clazz = clazz;
        this.description = description;
    }
}
