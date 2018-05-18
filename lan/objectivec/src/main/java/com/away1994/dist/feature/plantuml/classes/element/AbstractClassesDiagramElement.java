package com.away1994.dist.feature.plantuml.classes.element;

import com.away1994.dist.feature.plantuml.classes.element.item.ClassesDiagramItem;
import com.away1994.dist.feature.plantuml.classes.element.tag.CDElementTag;

import java.util.Set;
import java.util.TreeSet;

import static com.away1994.dist.constants.CommonConstants.*;

public abstract class AbstractClassesDiagramElement implements ClassesDiagramElement {

    private final String name;
    private final CDElementTag elementTag;
    private final Set<ClassesDiagramItem> items;

    public AbstractClassesDiagramElement(String name, CDElementTag elementTag) {
        this.name = name;
        this.elementTag = elementTag;
        this.items = new TreeSet<>();
    }

    @Override
    public CDElementTag getElementTag() {
        return this.elementTag;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPUTextDescription() {

        StringBuilder sb = new StringBuilder();
        sb.append(this.getElementTag().getTagName());
        sb.append(this.getName());
        if (!items.isEmpty()) {
            sb.append(BRACE_LEFT);
            sb.append(LINE_SEPARATOR);
            for (ClassesDiagramItem item : items) {
                sb.append(item.getPUTextDescription());
            }
            sb.append(BRACE_RIGHT);
            sb.append(LINE_SEPARATOR);
        }

        return sb.toString();
    }

    // todo
    @Override
    public int compareTo(ClassesDiagramElement o) {
        return 1;
    }

    @Override
    public void addItem(ClassesDiagramItem item) {
        this.items.add(item);
    }
}
