package tsp.feature.plantuml.classes.element;

import tsp.feature.plantuml.classes.PUDescription;
import tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;
import tsp.feature.plantuml.classes.element.tag.CDElementTag;

public interface ClassesDiagramElement extends PUDescription, Comparable<ClassesDiagramElement> {

    public CDElementTag getElementTag();

    public String getName();

    public void addItem(ClassesDiagramItem item);

}
