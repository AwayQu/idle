package tsp.feature.plantuml.classes.element.item;

import tsp.feature.plantuml.classes.PUDescription;

public interface ClassesDiagramItem extends PUDescription, Comparable<ClassesDiagramItem> {

    public CDItemTag getTag();

    public String getName();

}
