package tsp.program.method;

import tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;

import java.util.Set;
import java.util.TreeSet;

public abstract class AbstractMethodElement implements MethodElement {

    TreeSet<MethodTag> tags;
    String name;

    public AbstractMethodElement() {
    }

    public AbstractMethodElement(TreeSet<MethodTag> tags, String name) {
        this.tags = tags;
        this.name = name;
    }

    @Override
    public Set<MethodTag> getTags() {
        return this.tags;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public ClassesDiagramItem getClassesDiagramItem() {
        return null;
    }
}
