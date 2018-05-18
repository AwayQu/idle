package com.away1994.dist.feature.plantuml.classes.relation.impl;

import com.away1994.dist.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.dist.feature.plantuml.classes.relation.AbstractClassesDiagramRelation;

import static com.away1994.dist.feature.plantuml.classes.relation.CDRType.EXTEND_RELATION_TYPE;

public class CDRExtendImpl extends AbstractClassesDiagramRelation {

    public CDRExtendImpl(ClassesDiagramElement firstElement, ClassesDiagramElement secondElement) {
        super(firstElement, secondElement, EXTEND_RELATION_TYPE);
    }


}
