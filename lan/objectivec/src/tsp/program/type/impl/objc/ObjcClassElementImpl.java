package tsp.program.type.impl.objc;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.program.type.AbstractTypeElement;
import tsp.program.type.ClassElement;
import tsp.program.type.InterfaceElement;
import tsp.program.type.TypeTag;

import java.util.Set;

public class ObjcClassElementImpl extends AbstractTypeElement implements ClassElement {

    Set<ParseTree> tree;


    public ObjcClassElementImpl(String name) {
        super(name);
    }

    public ObjcClassElementImpl(String name, Set<TypeTag> tags, Set<ParseTree> tree) {
        super(name, tags);
        this.tree = tree;
    }


    @Override
    public Set<ClassElement> getSuperClasses() {
        return null;
    }

    @Override
    public Set<InterfaceElement> getImplementInterface() {
        return null;
    }
}
