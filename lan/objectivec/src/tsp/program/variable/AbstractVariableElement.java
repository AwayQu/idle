package tsp.program.variable;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;
import tsp.program.type.TypeElement;

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

    @Override
    public Set<VariableTag> getTags() {
        return null;
    }

    @Override
    public TypeElement getType() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ClassesDiagramItem getClassesDiagramItem() {
        return null;
    }
}
