package com.away1994.dist.program.method;

import com.away1994.dist.feature.plantuml.classes.element.item.CDItemTag;
import com.away1994.dist.feature.plantuml.classes.element.item.ClassesDiagramItem;
import com.away1994.dist.feature.plantuml.classes.element.item.impl.CDItemImpl;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public abstract class AbstractMethodElement implements MethodElement {

    Set<MethodTag> tags = new TreeSet<>();
    String name;

    public AbstractMethodElement(String name) {
        this.name = name;
    }

    public AbstractMethodElement() {
    }

    public AbstractMethodElement(Set<MethodTag> tags) {
        this.tags = tags;
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
        Set<CDItemTag> tags = new HashSet<>();
        tags.add(CDItemTag.METHOD_TAG);
        if (this.getTags().contains(MethodTag.STATIC)) {
            tags.add(CDItemTag.STATIC_TAG);
        }
        if (this.getTags().contains(MethodTag.PUBLIC)) {
            tags.add(CDItemTag.PUBLIC_TAG);
        } else {
            tags.add(CDItemTag.PRIVATE_TAG);
        }

        return new CDItemImpl(this.getName(), tags);

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractMethodElement that = (AbstractMethodElement) o;

        return getName() != null ? getName().equals(that.getName()) : that.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
