package com.away1994.tsp.program.variable;

import com.away1994.tsp.program.ProgramElement;
import com.away1994.tsp.program.type.TypeElement;
import com.away1994.tsp.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface VariableElement extends ProgramElement, ToClassesDiagramItem {


    public Set<VariableTag> getTags();

    public TypeElement getType();

}
