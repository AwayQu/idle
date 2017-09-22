package tsp.program.type.impl.objc;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.program.type.AbstractTypeElement;
import tsp.program.type.InterfaceElement;

public class ObjcProtocolElementImpl extends AbstractTypeElement implements InterfaceElement {

    ParseTree tree;
    public ObjcProtocolElementImpl(String name) {
        super(name);
    }

}
