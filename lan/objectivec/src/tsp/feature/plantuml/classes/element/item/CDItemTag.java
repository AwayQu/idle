package tsp.feature.plantuml.classes.element.item;

public enum CDItemTag {

    PRIVATE_TAG("- "),

    PROTECTED_TAG("# "),

    PACKAGE_PRIVATE_TAG("~ "),

    PUBLIC_TAG("+ "),

    STATIC_TAG("{static} "),
    ABSTRACT_TAG("{abstract} "),

    METHOD_TAG("{method} "),
    FIELD_TAG("{field} ");


    private String tagName;

    private CDItemTag(final String name) {
        tagName = name;
    }

    public String getTagName() {
        return tagName;
    }

}
