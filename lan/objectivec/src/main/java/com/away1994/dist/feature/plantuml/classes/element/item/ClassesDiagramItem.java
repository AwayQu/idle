package com.away1994.dist.feature.plantuml.classes.element.item;

import com.away1994.dist.feature.plantuml.classes.PUDescription;

import java.util.Set;

public interface ClassesDiagramItem extends PUDescription, Comparable<ClassesDiagramItem> {

    public Set<CDItemTag> getTags();

    public String getName();

}
