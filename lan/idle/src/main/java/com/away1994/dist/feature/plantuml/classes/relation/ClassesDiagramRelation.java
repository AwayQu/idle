package com.away1994.dist.feature.plantuml.classes.relation;

import com.away1994.dist.feature.plantuml.classes.PUDescription;
import com.away1994.dist.feature.plantuml.classes.element.ClassesDiagramElement;

public interface ClassesDiagramRelation extends PUDescription, Comparable<ClassesDiagramRelation> {

    public ClassesDiagramElement getFirstElement();

    public ClassesDiagramElement getSecondElement();

    public CDRType getType();
}
