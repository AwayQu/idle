package tsp.feature.plantuml.classes.element.item.impl;

import tsp.feature.plantuml.classes.element.item.AbstractClassesDiagramItem;
import tsp.feature.plantuml.classes.element.item.CDItemTag;

public class CDMethodImpl extends AbstractClassesDiagramItem {

    public CDMethodImpl(String name, CDItemTag tag) {
        super(name, tag);
    }

    @Override
    public String getPUTextDescription() {
        return "{method}" + super.getPUTextDescription();
    }
}
