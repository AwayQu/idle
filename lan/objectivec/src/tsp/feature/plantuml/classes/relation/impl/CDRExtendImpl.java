package tsp.feature.plantuml.classes.relation.impl;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.relation.AbstractClassesDiagramRelation;

import static tsp.feature.plantuml.classes.relation.CDRType.EXTEND_RELATION_TYPE;

public class CDRExtendImpl extends AbstractClassesDiagramRelation {

    public CDRExtendImpl(ClassesDiagramElement firstElement, ClassesDiagramElement secondElement) {
        super(firstElement, secondElement, EXTEND_RELATION_TYPE);
    }


}
