package com.away1994.structure.lang.parser;

public enum State {


    PATH_STATE("$PATH"),

    FILE_STATE("$FILE"),

    CLASS_STATE("$CLASS"),

    VARIABLE_STATE("$VARIABLE"),

    INTERFACE_STATE("$INTERFACE"),

    FUNCTION_STATE("$FUNCTION"),

    ENUM_STATE("$ENUM"),

    PLACEHOLD_STATE("$PLACEHOLD");


    private String description;

    State(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
