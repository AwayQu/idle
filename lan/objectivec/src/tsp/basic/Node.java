package tsp.basic;

public interface Node {

    public Node getParent();

    public Node getChild(int idx);

    public int getChildCount();

    public Node[] getChildren();

    public <T> T accept(NodeVisitor<? extends T> visitor);


}
