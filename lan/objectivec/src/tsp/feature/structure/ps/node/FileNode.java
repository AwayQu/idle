package tsp.feature.structure.ps.node;

public class FileNode extends FileDescriptionNode {

    @Override
    public String dotString() {

        String path = this.getPath().replace('/', '_');
        return "\"" + path + "\" [label = \"" + this.getName() + "\"];";
    }
}
