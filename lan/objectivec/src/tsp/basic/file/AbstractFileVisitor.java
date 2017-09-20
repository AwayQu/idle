package tsp.basic.file;


import tsp.basic.BaseNodeVisitor;

public abstract class AbstractFileVisitor<T > extends BaseNodeVisitor<T> implements FileVisitor<T> {

    @Override
    public T visitFileNode(FileNode node) {
        return this.visitChildren(node);
    }

    @Override
    public T visitDirectoryNode(DirectoryNode node) {
        return this.visitChildren(node);
    }
}
