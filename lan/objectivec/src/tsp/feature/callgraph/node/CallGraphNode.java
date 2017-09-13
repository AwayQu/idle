package tsp.feature.callgraph.node;

import com.sun.istack.internal.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CallGraphNode {

    private Decl functionDecl;

    private HashSet<CallGraphNode> callees;

    public CallGraphNode(@NotNull Decl functionDecl) {
        this.functionDecl = functionDecl;
        this.callees = new HashSet<>();
    }

    public void addCallee(CallGraphNode n) {
        this.callees.add(n);
    }

    @NotNull
    public Decl getFunctionDecl() {
        return functionDecl;
    }

    public void dump() {

    }

    public void print() {
        System.out.print(this.functionDecl);
        System.out.print(this.callees);
    }
}
