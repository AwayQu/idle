package tsp.feature.plantuml.classes.element;
public enum PlantUMLClassesDiagramElementTag {

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

    private PlantUMLClassesDiagramElementTag(final String name) {
        tagName = name;
    }

    public String getTagName() {
        return tagName;
    }

}