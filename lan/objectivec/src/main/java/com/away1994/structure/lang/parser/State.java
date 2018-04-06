package com.away1994.structure.lang.parser;

public enum State {


    PATH_STATE("path"),

    FILE_STATE("file"),

    CLASS_STATE("class"),

    VARIABLE_STATE("variable"),

    INTERFACE_STATE("interface"),

    FUNCTION_STATE("function"),

    ENUM_STATE("enum");


    private String description;

    State(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
