package com.away1994.tsp.feature.callgraph.node;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.HashMap;


public class CallGraph {

    // callee contains caller
//    public Set<CallGraphNode> callers;
//    public Set<CallGraphNode> callees;

    // Declaration -> CGNode
    private HashMap<Declaration, CallGraphNode> functionMap;

    private CallGraphNode root;

    public CallGraph() {
        this.root = new CallGraphNode(new Declaration("root"));
        this.functionMap = new HashMap<>();
    }

    @Nullable
    public CallGraphNode getNode(@NotNull Declaration d) {
        return this.functionMap.getOrDefault(d, null);
    }


    public void addCaller(CallGraphNode caller) {
        this.root.addCallee(caller);
        this.addFunction(caller);

    }

    public void addFunction(CallGraphNode n) {
        this.functionMap.put(n.getDeclaration(), n);
    }

    @Override
    public String toString() {
        return this.root.toString();
    }

    public String dotString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("strict digraph {\n");
        sb.append(this.root.dotString());
        sb.append("}");
        return sb.toString();
    }

}
