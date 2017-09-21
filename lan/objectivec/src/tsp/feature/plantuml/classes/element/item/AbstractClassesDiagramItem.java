package tsp.feature.plantuml.classes.element.item;

import static tsp.constants.CommonConstants.LINE_SEPARATOR;

public abstract class AbstractClassesDiagramItem implements ClassesDiagramItem {

    private final String name;
    private final CDItemTag tag;

    public AbstractClassesDiagramItem(String name, CDItemTag tag) {
        this.name = name;
        this.tag = tag;
    }

    @Override
    public CDItemTag getTag() {
        return this.tag;
    }

    @Override
    public String getName() {
        return this.name;
    }


    // TODO
    @Override
    public int compareTo(ClassesDiagramItem o) {
        return 1;
    }

    @Override
    public String getPUTextDescription() {
        return this.getTag().getTagName() + this.getName() + LINE_SEPARATOR;
    }
}
