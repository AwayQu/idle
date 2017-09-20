package tsp.feature.plantuml.classes.element.impl;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;

public class CDEInterfaceImpl implements ClassesDiagramElement {

    public String name;

    @Override
    public String getPUTextDescription() {
        return null;
    }

    @Override
    public String getName() {
       return this.name;
    }

}
