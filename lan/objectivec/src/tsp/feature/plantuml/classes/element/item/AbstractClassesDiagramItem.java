package tsp.feature.plantuml.classes.element.item;

import com.sun.istack.internal.NotNull;

import java.util.Set;

import static tsp.constants.CommonConstants.LINE_SEPARATOR;
import static tsp.feature.plantuml.common.utils.ComparableResult.*;

public abstract class AbstractClassesDiagramItem implements ClassesDiagramItem {

    private final String name;
    private final Set<CDItemTag> tags;

    public AbstractClassesDiagramItem(@NotNull String name, Set<CDItemTag> tags) {
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
        int comparision = AFTER.getResult();
        if (this == o) {
            comparision = EQUAL.getResult();
        } else {
            comparision = CDItemTag.compare(this.getTags(), o.getTags());
            if (comparision == EQUAL.getResult()) {
                if (this.getName() == null) {
                    comparision = BEFORE.getResult();
                    throw new Error("AWAY Internal Error");
                } else  {
                    comparision = this.getName().compareTo(o.getName());
                }
            }
        }
        return comparision;
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
