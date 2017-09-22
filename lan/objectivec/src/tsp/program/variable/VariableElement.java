package tsp.program.variable;

import tsp.program.ProgramElement;
import tsp.program.type.TypeElement;
import tsp.program.uml.ToClassesDiagramItem;

import java.util.Set;

public interface VariableElement extends ProgramElement, ToClassesDiagramItem {


    public Set<VariableTag> getTags();

    public TypeElement getType();

}
