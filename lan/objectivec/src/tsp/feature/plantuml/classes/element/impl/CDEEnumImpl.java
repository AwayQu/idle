package tsp.feature.plantuml.classes.element.impl;

import tsp.feature.plantuml.classes.element.AbstractClassesDiagramElement;
import tsp.feature.plantuml.classes.element.tag.CDElementTag;

public class CDEEnumImpl extends AbstractClassesDiagramElement {

    public CDEEnumImpl(String name) {
        super(name, CDElementTag.ENUM_TAG);
    }

}
