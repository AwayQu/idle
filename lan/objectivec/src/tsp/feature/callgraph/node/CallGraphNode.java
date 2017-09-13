package tsp.feature.callgraph.node;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;

public class CallGraphNode {

    private Declaration functionDeclaration;

    private HashSet<CallGraphNode> callees;

    public CallGraphNode(@NotNull Declaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
        this.callees = new HashSet<>();
    }

    public void addCallee(CallGraphNode n) {
        this.callees.add(n);
    }

    @NotNull
    public Declaration getFunctionDecl() {
        return functionDeclaration;
    }

    public void dump() {

    }

    public void print() {
        System.out.print(this.functionDeclaration);
        System.out.print(this.callees);
    }

    @Override
    public String toString() {
        return "CallGraphNode{ \n" + functionDeclaration +
                ", \n callees=" + callees +
                "}";
    }
}
