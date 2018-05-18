package com.away1994.dist.feature.plantuml.classes.relation.impl;

import com.away1994.dist.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.dist.feature.plantuml.classes.relation.AbstractClassesDiagramRelation;

import static com.away1994.dist.feature.plantuml.classes.relation.CDRType.IMPLEMENT_RELATION_TYPE;

public class CDRImplementImpl extends AbstractClassesDiagramRelation {

    public CDRImplementImpl(ClassesDiagramElement firstElement, ClassesDiagramElement secondElement) {
        super(firstElement, secondElement, IMPLEMENT_RELATION_TYPE);
    }
}
