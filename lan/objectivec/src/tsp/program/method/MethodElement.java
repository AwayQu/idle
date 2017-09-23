package tsp.program.method;

import tsp.program.ProgramElement;
import tsp.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface MethodElement extends ProgramElement, ToClassesDiagramItem {

    public Set<MethodTag> getTags();



}
