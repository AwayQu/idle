package tsp.feature.plantuml.classes.element.item.impl;

import tsp.feature.plantuml.classes.element.item.AbstractClassesDiagramItem;
import tsp.feature.plantuml.classes.element.item.CDItemTag;

public class CDFieldImpl extends AbstractClassesDiagramItem {


    public CDFieldImpl(String name, CDItemTag tag) {
        super(name, tag);
    }

    @Override
    public String getPUTextDescription() {
        return "{field} " + super.getPUTextDescription();
    }
}
