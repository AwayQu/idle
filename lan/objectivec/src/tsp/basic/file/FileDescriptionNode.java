package tsp.basic.file;

import tsp.basic.BaseNode;
import tsp.basic.Node;

public class FileDescriptionNode extends BaseNode {

    private FileDescriptionNode parent;
    private String name;
    private String path;
    private String extension;

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
        return extension;
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
