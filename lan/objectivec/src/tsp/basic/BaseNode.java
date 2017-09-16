package tsp.basic;

public class BaseNode implements Node {


    @Override
    public Node getParent() {
        return null;
    }

    @Override
    public Node getChild() {
        return null;
    }

    @Override
    public Node getChild(int idx) {
        return null;
    }

    @Override
    public Node[] getChildren() {
        return new Node[0];
    }

    @Override
    public <T> T accept(NodeVisitor<? extends T> visitor) {
        return null;
    }

}
