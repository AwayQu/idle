package tsp.feature.plantuml.classes.element.item;

import java.util.Set;

import static tsp.constants.CommonConstants.LINE_SEPARATOR;

public abstract class AbstractClassesDiagramItem implements ClassesDiagramItem {

    private final String name;
    private final Set<CDItemTag> tags;

    public AbstractClassesDiagramItem(String name, Set<CDItemTag> tags) {
        this.name = name;
        this.tags = tags;
    }

    @Override
    public Set<CDItemTag> getTags() {
        return this.tags;
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
        StringBuilder sb = new StringBuilder();
        for (CDItemTag tags : this.getTags()) {
            sb.append(tags.getTagName());
        }
        sb.append(this.getName());
        sb.append(LINE_SEPARATOR);
        return sb.toString();
    }
}
