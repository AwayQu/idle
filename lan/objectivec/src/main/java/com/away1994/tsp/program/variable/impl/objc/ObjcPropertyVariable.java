package com.away1994.tsp.program.variable.impl.objc;

import com.away1994.tsp.program.type.TypeElement;
import com.away1994.tsp.program.variable.AbstractVariableElement;
import com.away1994.tsp.program.variable.VariableTag;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;

public class ObjcPropertyVariable extends AbstractVariableElement {
    ParseTree tree;
    public ObjcPropertyVariable(Set<VariableTag> tags, TypeElement type, String name) {
        super(tags, type, name);
    }

    public ObjcPropertyVariable(String name) {
        super(name);
    }

    public ObjcPropertyVariable(TypeElement type, String name) {
        super(type, name);
    }
}
