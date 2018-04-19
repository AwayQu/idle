package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;

public enum Type {


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

    Type(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Class<? extends Symbol> getClazz() {
        return clazz;
    }

    Type(String description, Class<? extends Symbol> clazz) {
        this.clazz = clazz;
        this.description = description;
    }

    public static Type getState(String identify) {

        if (identify.startsWith(PATH_STATE.getDescription())) {
            return PATH_STATE;
        } else if (identify.startsWith(FILE_STATE.getDescription())) {
            return FILE_STATE;
        } else if (identify.startsWith(CLASS_STATE.getDescription())) {
            return CLASS_STATE;
        } else if (identify.startsWith(VARIABLE_STATE.getDescription())) {
            return VARIABLE_STATE;
        } else if (identify.startsWith(INTERFACE_STATE.getDescription())) {
            return INTERFACE_STATE;
        } else if (identify.startsWith(FUNCTION_STATE.getDescription())) {
            return FUNCTION_STATE;
        } else if (identify.startsWith(ENUM_STATE.getDescription())) {
            return ENUM_STATE;
        }else {
            return PLACEHOLD_STATE;
        }
    }
}
