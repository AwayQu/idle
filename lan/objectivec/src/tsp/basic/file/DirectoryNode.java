package tsp.basic.file;

import tsp.basic.NodeVisitor;

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

    @Override
    public String dotString() {
        StringBuilder sb = new StringBuilder("");
        String path = this.getPath().replace('/','_');
        sb.append("subgraph \"cluster_" + path + "\" {\n" +
                "    shape=box\n" +
                "    label=\"" + this.getName() + "\";");
        for (FileDescriptionNode fdn: this.fdMap.values()) {
            sb.append(fdn.dotString());
        }

        sb.append("}");
        return sb.toString();
    }

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        if (visitor instanceof FileVisitor) {
            return ((FileVisitor<? extends T>) visitor).visitDirectoryNode(this);
        }
        return visitor.visitChildren(this);
    }


}
