package tsp.basic;


import tsp.basic.file.DirectoryNode;
import tsp.basic.file.FileNode;
import tsp.basic.file.FileVisitor;

public class PrintFileVisitor extends BaseNodeVisitor<String> implements FileVisitor<String> {

    @Override
    public String visitFileNode(FileNode node) {
        System.out.println(node.getName());
        return this.visitChildren(node);
    }

    @Override
    public String visitDirectoryNode(DirectoryNode node) {
        System.out.println(node.getName());
        return this.visitChildren(node);
    }
}
