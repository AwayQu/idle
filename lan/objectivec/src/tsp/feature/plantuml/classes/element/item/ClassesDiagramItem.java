package tsp.feature.plantuml.classes.element.item;

import tsp.feature.plantuml.classes.PUDescription;

import java.util.Set;

public interface ClassesDiagramItem extends PUDescription, Comparable<ClassesDiagramItem> {

    public Set<CDItemTag> getTags();

    public String getName();

}
