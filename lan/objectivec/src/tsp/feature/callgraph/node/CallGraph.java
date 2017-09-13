package tsp.feature.callgraph.node;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.HashMap;
import java.util.Set;


public class CallGraph {

    // callee contains caller
//    public Set<CallGraphNode> callers;
//    public Set<CallGraphNode> callees;

    // Decl -> CGNode
    private HashMap<Decl, CallGraphNode> functionMap;

    private CallGraphNode root;

    public CallGraph() {
        this.root = new CallGraphNode(new Decl("root"));
        this.functionMap = new HashMap<>();
    }

    @Nullable
    public CallGraphNode getNode(@NotNull Decl d) {
        return this.functionMap.getOrDefault(d, null);
    }


    public void addCaller(CallGraphNode caller) {
        this.root.addCallee(caller);
        this.addFunction(caller);

    }

    public void addFunction(CallGraphNode n) {
        this.functionMap.put(n.getFunctionDecl(), n);
    }

    @Override
    public String toString() {
        return null;
    }
}
