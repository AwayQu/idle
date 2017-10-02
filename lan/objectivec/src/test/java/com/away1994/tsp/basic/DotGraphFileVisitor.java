package com.away1994.tsp.basic;

import com.away1994.tsp.basic.file.DirectoryNode;
import com.away1994.tsp.basic.file.FileDescriptionNode;
import com.away1994.tsp.basic.file.FileNode;
import com.away1994.tsp.basic.file.FileVisitor;

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

    @Override
    public boolean shouldVisitNextChild(Node n) {
        FileDescriptionNode parent = (FileDescriptionNode) n.getParent();
        FileDescriptionNode node = (FileDescriptionNode)n;
        if (node.getName().startsWith(".")
                || node.getName().endsWith(".xcodeproj")) {
            return false;
        }
        return super.shouldVisitNextChild(n);
    }

    @Override
    public boolean shouldVisitChild(Node c) {
        FileDescriptionNode node = (FileDescriptionNode)c;
        if (node.getName().startsWith(".")
                || node.getName().endsWith(".xcodeproj")) {
            return false;
        }
        return super.shouldVisitChild(c);
    }
}
