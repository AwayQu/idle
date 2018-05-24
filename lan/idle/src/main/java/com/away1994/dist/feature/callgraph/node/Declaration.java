package com.away1994.dist.feature.callgraph.node;

public class Declaration {
    private String identify;

    public Declaration(String identify) {
        this.identify = identify;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Declaration declaration = (Declaration) o;

        return identify != null ? identify.equals(declaration.identify) : declaration.identify == null;
    }

    @Override
    public int hashCode() {
        return identify != null ? identify.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Declaration{" + '\'' + identify + '\'' +
                '}';
    }
}
