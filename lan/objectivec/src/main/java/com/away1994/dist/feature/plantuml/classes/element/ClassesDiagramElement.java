package com.away1994.dist.feature.plantuml.classes.element;

import com.away1994.dist.feature.plantuml.classes.PUDescription;
import com.away1994.dist.feature.plantuml.classes.element.item.ClassesDiagramItem;
import com.away1994.dist.feature.plantuml.classes.element.tag.CDElementTag;

public interface ClassesDiagramElement extends PUDescription, Comparable<ClassesDiagramElement> {

    public CDElementTag getElementTag();

    public String getName();

    public void addItem(ClassesDiagramItem item);

}
