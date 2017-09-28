package tsp.program.variable;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.feature.plantuml.classes.element.item.CDItemTag;
import tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;
import tsp.feature.plantuml.classes.element.item.impl.CDItemImpl;
import tsp.program.type.TypeElement;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractVariableElement implements VariableElement {

    ParseTree tree;

    Set<VariableTag> tags;
    TypeElement type;
    String name;

    public AbstractVariableElement(Set<VariableTag> tags, TypeElement type, String name) {
        this.tags = tags;
        this.type = type;
        this.name = name;
    }

    public AbstractVariableElement() {

    }

    public AbstractVariableElement(TypeElement type, String name) {
        this.type = type;
        this.name = name;
    }

    public AbstractVariableElement(String name) {
        this.name = name;
    }

    @Override
    public Set<VariableTag> getTags() {
        return this.tags;
    }

    @Override
    public TypeElement getType() {
        return this.type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ClassesDiagramItem getClassesDiagramItem() {
        Set<CDItemTag> tags = new HashSet<>();
        tags.add(CDItemTag.FIELD_TAG);
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" : ");
        sb.append(this.getType().getName());
        String name = sb.toString();
        return new CDItemImpl(name, tags);
    }
}
