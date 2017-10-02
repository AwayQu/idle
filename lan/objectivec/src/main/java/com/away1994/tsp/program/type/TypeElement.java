package com.away1994.tsp.program.type;

import com.away1994.tsp.program.ProgramElement;
import com.away1994.tsp.program.method.MethodElement;
import com.away1994.tsp.program.method.MethodTag;
import com.away1994.tsp.program.uml.ToClassesDiagramElement;
import com.away1994.tsp.program.uml.ToClassesDiagramRelation;
import com.away1994.tsp.program.variable.VariableElement;
import com.away1994.tsp.program.variable.VariableTag;

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
