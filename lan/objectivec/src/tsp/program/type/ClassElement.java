package tsp.program.type;

import java.util.Set;

public interface ClassElement extends TypeElement {

    public Set<ClassElement> getSuperClasses();

    public Set<InterfaceElement> getImplementInterface();


}
