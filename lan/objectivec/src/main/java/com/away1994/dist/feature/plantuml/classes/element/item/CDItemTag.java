package com.away1994.dist.feature.plantuml.classes.element.item;

import java.util.Set;

import static com.away1994.dist.feature.plantuml.common.constants.PriorityConstants.*;
import static com.away1994.dist.feature.plantuml.common.utils.ComparableResult.*;

public enum CDItemTag {

    PUBLIC_TAG("+ ", HIGHER),

    PACKAGE_PRIVATE_TAG("~ ", MEDIUM),

    PROTECTED_TAG("# ", LOW),

    PRIVATE_TAG("- ", LOWER),


    ABSTRACT_TAG("{abstract} ", MEDIUM),
    STATIC_TAG("{static} ", LOW),

    FIELD_TAG("{field} ", HIGHER * 3),
    METHOD_TAG("{method} ", HIGHER);



    private String tagName;
    private int priorityValue;

    private CDItemTag(final String name, final int priority) {
        tagName = name;
        priorityValue = priority;
    }

    public String getTagName() {
        return tagName;
    }

    public int getPriorityValue() {
        return priorityValue;
    }

    public static int compare(Set<CDItemTag> firstSet, Set<CDItemTag> secondSet) {
        int firstAggregation = 0;
        int secondAggregation = 0;

        if (firstSet != null) {
            for (CDItemTag item : firstSet) {
                firstAggregation += item.getPriorityValue();
            }
        }

        if (secondSet != null) {
            for (CDItemTag item : secondSet) {
                secondAggregation += item.getPriorityValue();
            }
        }

        if (firstAggregation < secondAggregation) {
            return BEFORE.getResult();
        } else if (firstAggregation == secondAggregation) {
            return EQUAL.getResult();
        } else {
            return AFTER.getResult();
        }


    }


}
