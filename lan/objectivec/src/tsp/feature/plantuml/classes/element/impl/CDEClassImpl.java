package tsp.feature.plantuml.classes.element.impl;

import tsp.feature.plantuml.classes.element.AbstractClassesDiagramElement;

import static tsp.feature.plantuml.classes.element.tag.CDElementTag.CLASS_TAG;

public class CDEClassImpl extends AbstractClassesDiagramElement {

    public CDEClassImpl(String name) {
        super(name, CLASS_TAG);
    }
}
