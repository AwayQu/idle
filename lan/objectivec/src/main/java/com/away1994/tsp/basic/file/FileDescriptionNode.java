package com.away1994.tsp.basic.file;

import com.away1994.tsp.basic.BaseNode;
import com.away1994.tsp.basic.Node;

public class FileDescriptionNode extends BaseNode {

    private FileDescriptionNode parent;
    private String name;
    private String path;
    private String extension;


    public FileDescriptionNode() {
    }

    public FileDescriptionNode(String path) {
        this.path = path;
    }

    public void setParent(FileDescriptionNode parent) {
        this.parent = parent;
    }

    @Override
    public Node getParent() {
        return this.parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExtension() {
        int lastIndex = this.getName().lastIndexOf(".");
        return this.getName().substring(lastIndex + 1);
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return name;
    }

    public String dotString() {
        return "";
    }


}
