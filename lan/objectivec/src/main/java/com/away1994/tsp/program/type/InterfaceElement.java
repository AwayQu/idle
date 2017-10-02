package com.away1994.tsp.program.type;

import com.away1994.tsp.program.method.MethodElement;

import java.util.Set;

public interface InterfaceElement extends TypeElement {

    public Set<MethodElement> getDeclareMethods();

    public Set<InterfaceElement> getExtendInterfaces();
}
