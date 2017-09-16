package tsp.basic;


public interface NodeVisitor<T> {

    T visit(Node n);

    T visitChildren(Node n);

    public T aggregateResult(T aggregate, T nextResult);

    public T defaultResult();

    public boolean shouldVisitNextChild(Node n);

    public boolean shouldVisitChild(Node c);
}
