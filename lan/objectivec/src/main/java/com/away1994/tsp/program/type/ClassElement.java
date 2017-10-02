package com.away1994.tsp.program.type;

import com.away1994.tsp.program.method.MethodElement;

import java.util.Set;

public interface ClassElement extends TypeElement {

    public Set<ClassElement> getSuperClasses();

    public Set<InterfaceElement> getImplementInterface();

    public Set<MethodElement> getImplementMethods();

}
