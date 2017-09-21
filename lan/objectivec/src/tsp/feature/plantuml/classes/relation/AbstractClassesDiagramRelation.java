package tsp.feature.plantuml.classes.relation;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;

public abstract class AbstractClassesDiagramRelation implements ClassesDiagramRelation {
    private final ClassesDiagramElement firstElement;

    private final ClassesDiagramElement secondElement;

    private final CDRType type;

    public AbstractClassesDiagramRelation(ClassesDiagramElement firstElement, ClassesDiagramElement secondElement, CDRType type) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.type = type;
    }

    @Override
    public String getPUTextDescription() {
        return this.getFirstElement().getName() + this.getType().getRightRelationSymbol() + this.getSecondElement().getName();
    }

    @Override
    public ClassesDiagramElement getFirstElement() {
        return this.firstElement;
    }

    @Override
    public ClassesDiagramElement getSecondElement() {
        return this.secondElement;
    }

    @Override
    public CDRType getType() {
        return this.type;
    }

    @Override
    public int compareTo(ClassesDiagramRelation o) {
        return 1;
    }
}
