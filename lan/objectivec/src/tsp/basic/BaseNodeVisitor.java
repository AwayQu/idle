package tsp.basic;

public abstract class BaseNodeVisitor<T> implements NodeVisitor<T> {

    private int depth;

    public BaseNodeVisitor() {
        this.depth = 0;
    }

    @Override
    public T visit(Node n) {
        return n.accept(this);
    }

    @Override
    public T visitChildren(Node n) {
        depth++;
        T result = this.defaultResult();
        int count = n.getChildCount();
        for (int i = 0; i < count; i++) {
            Node c = n.getChild(i);
            T childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }
        depth--;
        return result;
    }

    @Override
    public T aggregateResult(T aggregate, T nextResult) {
        return nextResult;
    }

    @Override
    public T defaultResult() {
        return null;
    }

    public int getDepth() {
        return depth;
    }
}
