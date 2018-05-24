package com.away1994.dist.program.type;

import com.away1994.dist.program.method.MethodElement;

import java.util.Set;

public interface ClassElement extends TypeElement {

    public Set<ClassElement> getSuperClasses();

    public Set<InterfaceElement> getImplementInterface();

    public Set<MethodElement> getImplementMethods();

}
