package tsp.feature.plantuml.classes;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.relation.ClassesDiagramRelation;

import java.util.Set;

public interface ClassesDiagram extends PUDescription {

    public void addElements(ClassesDiagramElement element);

    public void addRelation(ClassesDiagramRelation relationship);

    public Set<ClassesDiagramElement> getElements();

    public Set<ClassesDiagramRelation> getRelations();
}
