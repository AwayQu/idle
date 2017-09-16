package tsp.basic.file;

import tsp.basic.NodeVisitor;

public interface FileVisitor<T> extends NodeVisitor<T> {

    public T visitFileNode(FileNode node);

    public T visitDirectoryNode(DirectoryNode node);

}
