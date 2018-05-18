package com.away1994.dist.program.variable;

import com.away1994.dist.program.ProgramElement;
import com.away1994.dist.program.type.TypeElement;
import com.away1994.dist.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface VariableElement extends ProgramElement, ToClassesDiagramItem {


    public Set<VariableTag> getTags();

    public TypeElement getType();

}
