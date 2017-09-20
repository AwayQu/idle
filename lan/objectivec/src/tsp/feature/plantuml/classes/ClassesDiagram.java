package tsp.feature.plantuml.classes;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.relation.ClassesDiagramRelationship;

public interface ClassesDiagram extends PUDescription {

    public void addElements(ClassesDiagramElement element);

    public void addRelationship(ClassesDiagramRelationship relationship);
}
