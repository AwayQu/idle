package com.away1994.tsp.feature.plantuml.classes.impl;

import com.away1994.tsp.feature.plantuml.classes.ClassesDiagram;
import com.away1994.tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.tsp.feature.plantuml.classes.relation.ClassesDiagramRelation;
import com.away1994.tsp.feature.plantuml.common.constants.PUConstants;

import java.util.Set;
import java.util.TreeSet;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class ClassesDiagramImpl implements ClassesDiagram {

    public Set<ClassesDiagramElement> elements;
    public Set<ClassesDiagramRelation> relations;

    public ClassesDiagramImpl() {
        this.elements = new TreeSet<>();
        this.relations = new TreeSet<>();
    }

    @Override
    public String getPUTextDescription() {

        final StringBuilder sb = new StringBuilder(PUConstants.START_PLANTUML);

        for (final ClassesDiagramElement e : getElements()) {
            sb.append(LINE_SEPARATOR);
            sb.append(e.getPUTextDescription());
        }

        for (final ClassesDiagramRelation r : getRelations()) {
            sb.append(LINE_SEPARATOR);
            sb.append(r.getPUTextDescription());
        }

        sb.append(LINE_SEPARATOR);
        sb.append(PUConstants.END_PLANTUML);

        return sb.toString();
    }

    @Override
    public void addElements(ClassesDiagramElement element) {
        elements.add(element);
    }

    @Override
    public void addRelation(ClassesDiagramRelation relation) {
        relations.add(relation);
    }

    @Override
    public Set<ClassesDiagramElement> getElements() {
        return new TreeSet<>(elements);
    }

    @Override
    public Set<ClassesDiagramRelation> getRelations() {
        return new TreeSet<>(relations);
    }
}
