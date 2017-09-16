package tsp.basic;

public abstract class BaseNodeVisitor<T> implements NodeVisitor<T> {
    @Override
    public T visit(Node n) {
        return n.accept(this);
    }

    @Override
    public T visitChildren(Node n) {
        T result = this.defaultResult();
        int count = n.getChildCount();
        for (int i = 0; i < count; i++) {
            Node c = n.getChild(i);
            T childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }
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
}
