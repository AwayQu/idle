package com.away1994.tsp.program.type.impl.objc;

import com.away1994.tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.tsp.feature.plantuml.classes.element.impl.CDEEnumImpl;
import com.away1994.tsp.feature.plantuml.classes.element.item.CDItemTag;
import com.away1994.tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;
import com.away1994.tsp.feature.plantuml.classes.element.item.impl.CDItemImpl;
import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.program.type.AbstractTypeElement;
import com.away1994.tsp.program.type.EnumElement;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ObjcEnumElementImpl extends AbstractTypeElement implements EnumElement {

    ObjectiveCParser.EnumDeclarationContext context;

    public ObjcEnumElementImpl(String name) {
        super(name);
    }


    @Override
    public Set<ClassesDiagramElement> getClassesDiagramElements() {

        Set<ClassesDiagramElement> elements = new TreeSet<>();
        CDEEnumImpl e = new CDEEnumImpl(this.getName());
        ObjectiveCParser.EnumeratorListContext listContext = this.getContext().enumSpecifier().enumeratorList();
        if (listContext != null) {
            List<ObjectiveCParser.EnumeratorContext> enums = listContext.enumerator();
            for (ObjectiveCParser.EnumeratorContext e0 : enums) {
                Set<CDItemTag> tags = new TreeSet<>();
                String itemName = e0.enumeratorIdentifier().getText();
                ClassesDiagramItem item = new CDItemImpl(itemName, tags);
                e.addItem(item);
            }
        }
        elements.add(e);


        return elements;
    }


    public ObjectiveCParser.EnumDeclarationContext getContext() {
        return context;
    }

    public void setContext(ObjectiveCParser.EnumDeclarationContext context) {
        this.context = context;
    }
}
