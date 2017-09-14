package tsp.feature.structure.ps.node;

public class FileNode extends FileDescriptionNode {

    @Override
    public String dotString() {

        String path = this.getPath().replace('/','_');
        return "subgraph \"cluster_" + path + "\" {\n" +
                "    shape=box\n" +
                "    bgcolor=lightblue\n" +
                "    label=\"" + this.getName() + "\";}";
    }
}
