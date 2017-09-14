package tsp.feature.callgraph.node;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;

public class CallGraphNode {

    private Declaration declaration;

    private HashSet<CallGraphNode> callees;

    public CallGraphNode(@NotNull Declaration declaration) {
        this.declaration = declaration;
        this.callees = new HashSet<>();
    }

    public void addCallee(CallGraphNode n) {
        this.callees.add(n);
    }

    @NotNull
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
