package tsp.feature.plantuml.classes.relation;

public enum PlantUMLClassesDiagramRelationType {

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

    private PlantUMLClassesDiagramRelationType(final String rightSymbol) {
        rightRelationSymbol = rightSymbol;
    }

    public String getRightRelationSymbol() {
        return rightRelationSymbol;
    }

}
