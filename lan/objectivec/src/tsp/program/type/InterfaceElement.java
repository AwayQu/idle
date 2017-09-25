package tsp.program.type;

import tsp.program.method.MethodElement;

import java.util.Set;

public interface InterfaceElement extends TypeElement {

    public Set<MethodElement> getDeclareMethods();

}
