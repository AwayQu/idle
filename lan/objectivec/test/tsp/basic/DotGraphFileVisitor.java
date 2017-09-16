package tsp.basic;

import tsp.basic.file.DirectoryNode;
import tsp.basic.file.FileDescriptionNode;
import tsp.basic.file.FileNode;
import tsp.basic.file.FileVisitor;

public class DotGraphFileVisitor extends BaseNodeVisitor<String> implements FileVisitor<String> {

    public StringBuilder sb = new StringBuilder();

    public DotGraphFileVisitor() {
        sb.append("digraph {");
    }

    @Override
    public String visitFileNode(FileNode node) {
        FileDescriptionNode parent = (FileDescriptionNode) node.getParent();
        sb.append("\"" + parent.getName() + "\"" + "->" + "\"" + node.getName() + "\"" + ";\n");
        return this.visitChildren(node);
    }

    @Override
    public String visitDirectoryNode(DirectoryNode node) {
        FileDescriptionNode parent = (FileDescriptionNode) node.getParent();
        if (parent != null) {
            sb.append("\"" + parent.getName() + "\"" + "->" + "\"" + node.getName() + "\"" + ";\n");
        }
        return this.visitChildren(node);
    }
}
