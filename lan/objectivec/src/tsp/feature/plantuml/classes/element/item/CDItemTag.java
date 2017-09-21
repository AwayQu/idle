package tsp.feature.plantuml.classes.element.item;

public enum CDItemTag {

    PRIVATE_TAG("-"),

    PROTECTED_TAG("#"),

    PACKAGE_PRIVATE_TAG("~"),

    PUBLIC("+");


    private String tagName;

    private CDItemTag(final String name) {
        tagName = name;
    }

    public String getTagName() {
        return tagName;
    }

}
