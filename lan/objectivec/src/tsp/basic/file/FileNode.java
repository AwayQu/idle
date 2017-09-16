package tsp.basic.file;

import tsp.basic.Node;
import tsp.basic.NodeVisitor;

public class FileNode extends FileDescriptionNode {

    @Override
    public String dotString() {

        String path = this.getPath().replace('/', '_');
        return "\"" + path + "\" [label = \"" + this.getName() + "\"];";
    }


    //region base node
    @Override
    public Node getParent() {
        return super.getParent();
    }

    @Override
    public Node getChild(int idx) {
        return this.getChildren()[idx];
    }

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        if (visitor instanceof FileVisitor) {
            return ((FileVisitor<? extends T>) visitor).visitFileNode(this);
        }
        return visitor.visitChildren(this);
    }

    //endregion
}
