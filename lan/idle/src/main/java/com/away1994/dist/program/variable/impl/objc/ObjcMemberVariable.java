package com.away1994.dist.program.variable.impl.objc;

import com.away1994.dist.program.type.TypeElement;
import com.away1994.dist.program.variable.AbstractVariableElement;
import com.away1994.dist.program.variable.VariableTag;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Set;

public class ObjcMemberVariable extends AbstractVariableElement {
    ParseTree tree;
    public ObjcMemberVariable(Set<VariableTag> tags, TypeElement type, String name) {
        super(tags, type, name);
    }
}
