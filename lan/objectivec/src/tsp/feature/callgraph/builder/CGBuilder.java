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


}
