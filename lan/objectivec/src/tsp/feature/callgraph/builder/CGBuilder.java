package tsp.feature.callgraph.builder;

import tsp.feature.callgraph.node.CallGraph;
import tsp.feature.callgraph.node.CallGraphNode;

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
