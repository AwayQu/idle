package tsp.feature.callgraph.node;

public class Decl {
    private String identify;

    public Decl(String identify) {
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

        Decl decl = (Decl) o;

        return identify != null ? identify.equals(decl.identify) : decl.identify == null;
    }

    @Override
    public int hashCode() {
        return identify != null ? identify.hashCode() : 0;
    }
}
