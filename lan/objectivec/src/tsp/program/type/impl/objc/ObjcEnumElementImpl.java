package tsp.program.type.impl.objc;

import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.element.impl.CDEEnumImpl;
import tsp.feature.plantuml.classes.element.item.CDItemTag;
import tsp.feature.plantuml.classes.element.item.ClassesDiagramItem;
import tsp.feature.plantuml.classes.element.item.impl.CDItemImpl;
import tsp.gen.ObjectiveCParser;
import tsp.program.type.AbstractTypeElement;
import tsp.program.type.EnumElement;

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
