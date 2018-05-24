package com.away1994.dist.program.method;

import com.away1994.dist.program.ProgramElement;
import com.away1994.dist.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface MethodElement extends ProgramElement, ToClassesDiagramItem {

    public Set<MethodTag> getTags();



}
