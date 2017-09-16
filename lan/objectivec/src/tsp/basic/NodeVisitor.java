package tsp.basic;


public interface NodeVisitor<T> {

    T visit(Node n);

    T visitChildren(Node n);

}
