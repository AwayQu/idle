package tsp.feature.dependency.fd.node;

import java.util.HashMap;

public class FileDependencyGraph {

    // name -> FileNode
    public HashMap<String, FileNode> fdMap;

    public FileDependencyGraph() {
        this.fdMap = new HashMap<>();

    }

    public void addFileNode(FileNode n) {
        this.fdMap.put(n.getName(), n);
    }


    public FileNode getFileNode(String name) {
        return this.fdMap.get(name);
    }

    @Override
    public String toString() {
        return "FileDependencyGraph{" +
                "fdMap=" + fdMap +
                '}';
    }
}
