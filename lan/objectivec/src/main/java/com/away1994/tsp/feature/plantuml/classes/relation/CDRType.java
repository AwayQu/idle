package com.away1994.tsp.feature.plantuml.classes.relation;

/**
 * Classes Diagram RelationType
 */
public enum CDRType {

    /**
     * The extend relation type.
     */
    EXTEND_RELATION_TYPE(" --|> "),

    /**
     * The implement relation type.
     */
    IMPLEMENT_RELATION_TYPE(" --> "),

    /**
     * The use relation type.
     */
    USE_RELATION_TYPE(" ..> ");

    private String rightRelationSymbol;

    private CDRType(final String rightSymbol) {
        rightRelationSymbol = rightSymbol;
    }

    public String getRightRelationSymbol() {
        return rightRelationSymbol;
    }

}
