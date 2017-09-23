package tsp.program.type;

import tsp.program.method.MethodElement;

import java.util.Set;

public interface ClassElement extends TypeElement {

    public Set<ClassElement> getSuperClasses();

    public Set<InterfaceElement> getImplementInterface();

    public Set<MethodElement> getImplementMethods();

}
