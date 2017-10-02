package com.away1994.tsp.feature.callgraph.builder;

import com.away1994.tsp.feature.callgraph.node.CallGraph;
import com.away1994.tsp.feature.callgraph.node.CallGraphNode;

public class CGBuilder {
    public CallGraph callGraph;
    public CallGraphNode caller;

    public CGBuilder(CallGraph callGraph, CallGraphNode caller) {
        this.callGraph = callGraph;
        this.caller = caller;
    }

    public void addCaller(CallGraphNode caller) {
//        if (this.callGraph.getNode(caller.getDeclaration()) == null)
        this.callGraph.addCaller(caller);
    }

    public void addCallee(CallGraphNode callee) {
        this.caller.addCallee(callee);
        if (this.callGraph.getNode(callee.getDeclaration()) == null)
            this.callGraph.addFunction(callee);
    }

}
