package tsp.feature.structure.ps.graph;

import tsp.feature.structure.ps.node.FileDescriptionNode;

import java.util.HashMap;

public class ProjectStructureGraph {

    // path -> FileNode
    public HashMap<String, FileDescriptionNode> fdMap;

    public FileDescriptionNode root;

    public ProjectStructureGraph() {
        this.fdMap = new HashMap<>();
    }

    public void addFileDescription(FileDescriptionNode fd) {
        this.fdMap.put(fd.getPath(), fd);
    }

    public FileDescriptionNode getFileSescription(String path) {
        return this.fdMap.getOrDefault(path, null);
    }

    public void addRoot(FileDescriptionNode fd) {
        this.root = fd;
        this.addFileDescription(fd);
    }

    @Override
    public String toString() {
        return "ProjectStructureGraph{" +
                "root=" + root +
                '}';
    }
}
