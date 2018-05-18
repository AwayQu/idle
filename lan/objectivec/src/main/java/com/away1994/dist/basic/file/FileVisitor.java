package com.away1994.dist.basic.file;

import com.away1994.dist.basic.NodeVisitor;

public interface FileVisitor<T> extends NodeVisitor<T> {

    public T visitFileNode(FileNode node);

    public T visitDirectoryNode(DirectoryNode node);

}
