package com.away1994.dist.feature.callgraph.node;


import javax.annotation.Nonnull;
import java.util.HashSet;

public class CallGraphNode {

    private Declaration declaration;

    private HashSet<CallGraphNode> callees;

    public CallGraphNode(@Nonnull Declaration declaration) {
        this.declaration = declaration;
        this.callees = new HashSet<>();
    }

    public void addCallee(CallGraphNode n) {
        this.callees.add(n);
    }

    @Nonnull
    public Declaration getDeclaration() {
        return declaration;
    }



    public void print() {
        System.out.print(this.declaration);
        System.out.print(this.callees);
    }

    @Override
    public String toString() {
        return "CallGraphNode{ \n" + declaration +
                ", \n callees=" + callees +
                "}";
    }


    public void dumpDot() {

    }

    public String dotString() {
        String id = this.declaration.getIdentify();
        String arrow = " -> ";
        StringBuilder sb = new StringBuilder("");
        for (CallGraphNode node: this.callees) {
            String calleeIdentify = node.getDeclaration().getIdentify();
            String dotString = node.dotString();

            sb.append(id).append(arrow).append(calleeIdentify).append("\n");
            sb.append(dotString);

        }
        return sb.toString();
    }
}
