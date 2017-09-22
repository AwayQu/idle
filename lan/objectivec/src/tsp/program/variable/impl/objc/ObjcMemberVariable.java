package tsp.program.variable.impl.objc;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.program.type.TypeElement;
import tsp.program.variable.AbstractVariableElement;
import tsp.program.variable.VariableTag;

import java.util.Set;

public class ObjcMemberVariable extends AbstractVariableElement {
    ParseTree tree;
    public ObjcMemberVariable(Set<VariableTag> tags, TypeElement type, String name) {
        super(tags, type, name);
    }
}
