package com.away1994.dist.feature.structure.ps.graph;

import com.away1994.dist.basic.file.FileDescriptionNode;

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

    public String dotString() {
        return "digraph G {\n" +
                "  size=\"10,10\"; ratio=fill; node[fontsize=24 shape=box];"
                        + this.root.dotString() + "}";
    }
}
