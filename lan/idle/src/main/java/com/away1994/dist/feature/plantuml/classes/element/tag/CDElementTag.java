package com.away1994.dist.feature.plantuml.classes.element.tag;
public enum CDElementTag {

    /**
     * The "abstract class" tag.
     */
    ABSTRACT_CLASS_TAG("abstract class "),

    /**
     * The "annotation" tag.
     */
    ANNOTATION_TAG("annotation "),

    /**
     * The "class" tag.
     */
    CLASS_TAG("class "),

    /**
     * The "enum" tag.
     */
    ENUM_TAG("enum "),

    /**
     * The "interface" tag.
     */
    INTERFACE_TAG("interface ");

    /**
     * The tag name representing the element in the plantUML classes diagram language.
     */
    private String tagName;

    private CDElementTag(final String name) {
        tagName = name;
    }

    public String getTagName() {
        return tagName;
    }

}