package tsp.feature.plantuml.classes.relation.impl;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.relation.AbstractClassesDiagramRelation;

import static tsp.feature.plantuml.classes.relation.CDRType.IMPLEMENT_RELATION_TYPE;

public class CDRImplementImpl extends AbstractClassesDiagramRelation {

    public CDRImplementImpl(ClassesDiagramElement firstElement, ClassesDiagramElement secondElement) {
        super(firstElement, secondElement, IMPLEMENT_RELATION_TYPE);
    }
}
