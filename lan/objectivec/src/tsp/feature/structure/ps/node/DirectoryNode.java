package tsp.feature.structure.ps.node;

import java.util.HashMap;

public class DirectoryNode extends FileDescriptionNode {
    // path -> FileNode
    public HashMap<String, FileDescriptionNode> fdMap;


    public DirectoryNode() {
        this.fdMap = new HashMap<>();
    }

    public void addFileDescription(FileDescriptionNode fd) {
        this.fdMap.put(fd.getPath(), fd);
    }

    @Override
    public String toString() {
        return super.toString() + "DirectoryNode{" +
                "fdMap=" + fdMap +
                '}';
    }
}
