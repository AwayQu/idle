package tsp.program.method.impl.objc;

import org.antlr.v4.runtime.tree.ParseTree;
import tsp.gen.ObjectiveCParser;
import tsp.program.method.AbstractMethodElement;
import tsp.program.method.MethodTag;

import java.util.Set;
import java.util.TreeSet;

public class ObjcMethodElementImpl extends AbstractMethodElement {

    ParseTree tree;

    public ObjcMethodElementImpl(TreeSet<MethodTag> tags, String name) {
        super(tags, name);
    }

    public ObjcMethodElementImpl(ParseTree tree) {
        this.tree = tree;
    }

    @Override
    public String getName() {
        if (tree instanceof ObjectiveCParser.ClassMethodDeclarationContext) {
            return ((ObjectiveCParser.ClassMethodDeclarationContext) tree).methodDeclaration().methodSelector().getText();
        } else if (tree instanceof ObjectiveCParser.InstanceMethodDeclarationContext) {
            return ((ObjectiveCParser.InstanceMethodDeclarationContext) tree).methodDeclaration().methodSelector().getText();
        } else if (tree instanceof ObjectiveCParser.ClassMethodDefinitionContext) {
            return ((ObjectiveCParser.ClassMethodDefinitionContext) tree).methodDefinition().methodSelector().getText();
        } else if (tree instanceof ObjectiveCParser.InstanceMethodDefinitionContext) {
            return ((ObjectiveCParser.InstanceMethodDefinitionContext) tree).methodDefinition().methodSelector().getText();
        }

        return super.getName();
    }


    @Override
    public Set<MethodTag> getTags() {
        Set<MethodTag> tags = new TreeSet<>();

        if (tree instanceof ObjectiveCParser.ClassMethodDeclarationContext) {
            tags.add(MethodTag.STATIC);
        } else if (tree instanceof ObjectiveCParser.InstanceMethodDeclarationContext) {
            tags.add(MethodTag.INSTANCE);
        } else if (tree instanceof ObjectiveCParser.ClassMethodDefinitionContext) {
            tags.add(MethodTag.STATIC);
        } else if (tree instanceof ObjectiveCParser.InstanceMethodDefinitionContext) {
            tags.add(MethodTag.INSTANCE);
        }
        return tags;
    }
}
