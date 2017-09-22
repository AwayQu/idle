package tsp.program.type;

import tsp.program.ProgramElement;
import tsp.program.method.MethodElement;
import tsp.program.method.MethodTag;
import tsp.program.uml.ToClassesDiagramElement;
import tsp.program.uml.ToClassesDiagramRelation;
import tsp.program.variable.VariableElement;
import tsp.program.variable.VariableTag;

import java.util.Set;

public interface TypeElement extends ProgramElement, ToClassesDiagramElement, ToClassesDiagramRelation {

    public Set<TypeTag> getTags();

    public Set<ClassElement> getClasses();

    public Set<ClassElement> getClasses(Set<TypeRelationTag> tags);

    public Set<InterfaceElement> getInterfaces();

    public Set<InterfaceElement> getInterface(Set<TypeRelationTag> tags);

    public Set<VariableElement> getVariables();

    public Set<VariableElement> getVariables(Set<VariableTag> tags);

    public Set<MethodElement> getMethods();

    public Set<MethodElement> getMethods(Set<MethodTag> tags);

}
