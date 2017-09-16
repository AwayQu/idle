package tsp.basic;

public interface Node {
    public Node getParent();

    public Node getChild();

    public Node getChild(int idx);

    public Node[] getChildren();

    <T> T accept(NodeVisitor<? extends T> visitor);
}
