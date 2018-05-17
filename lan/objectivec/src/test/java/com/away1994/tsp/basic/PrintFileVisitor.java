package com.away1994.tsp.basic;


import com.away1994.tsp.basic.file.DirectoryNode;
import com.away1994.tsp.basic.file.FileNode;
import com.away1994.tsp.basic.file.FileVisitor;

public class PrintFileVisitor extends BaseNodeVisitor<String> implements FileVisitor<String> {
    Node root;

    public PrintFileVisitor() {
    }

    public String getIndent() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < this.getDepth(); i++) {
            sb.append("----");
        }

        return sb.toString();
    }

    @Override
    public String visitFileNode(FileNode node) {
        System.out.println(this.getIndent() + node.getName());
        return this.visitChildren(node);
    }

    @Override
    public String visitDirectoryNode(DirectoryNode node) {
        if (root == null) {
            root = node;
        }
        System.out.println(this.getIndent() + node.getName());
        return this.visitChildren(node);
    }
}
