package tsp.feature.plantuml.classes.element.item.impl;

import tsp.feature.plantuml.classes.element.item.AbstractClassesDiagramItem;
import tsp.feature.plantuml.classes.element.item.CDItemTag;

import java.util.Set;

public class CDMethodImpl extends AbstractClassesDiagramItem {


    public CDMethodImpl(String name, Set<CDItemTag> tags) {
        super(name, tags);
    }

    @Override
    public String getPUTextDescription() {
        return "{method}" + super.getPUTextDescription();
    }
}
