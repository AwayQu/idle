package com.away1994.dist.program.type;

import com.away1994.dist.program.ProgramElement;
import com.away1994.dist.program.method.MethodElement;
import com.away1994.dist.program.method.MethodTag;
import com.away1994.dist.program.uml.ToClassesDiagramElement;
import com.away1994.dist.program.uml.ToClassesDiagramRelation;
import com.away1994.dist.program.variable.VariableElement;
import com.away1994.dist.program.variable.VariableTag;

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
