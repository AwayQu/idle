package tsp.feature.plantuml.classes.relation;

import tsp.feature.plantuml.classes.PUDescription;
import tsp.feature.plantuml.classes.element.ClassesDiagramElement;

public interface ClassesDiagramRelation extends PUDescription, Comparable<ClassesDiagramRelation> {

    public ClassesDiagramElement getFirstElement();

    public ClassesDiagramElement getSecondElement();

    public CDRType getType();
}
