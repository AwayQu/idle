package com.away1994.dist.basic.file;


import com.away1994.dist.basic.BaseNodeVisitor;

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
