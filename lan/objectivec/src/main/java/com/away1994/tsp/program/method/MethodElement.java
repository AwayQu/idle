package com.away1994.tsp.program.method;

import com.away1994.tsp.program.ProgramElement;
import com.away1994.tsp.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface MethodElement extends ProgramElement, ToClassesDiagramItem {

    public Set<MethodTag> getTags();



}
