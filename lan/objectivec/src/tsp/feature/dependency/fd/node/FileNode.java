package tsp.feature.dependency.fd.node;



import java.util.HashMap;

public class FileNode {

    public String name;

    // name -> FileNode
    public HashMap<String, FileNode> fdMap;

    public FileNode() {
        this.fdMap = new HashMap<>();
    }

    public void addDependcyFileNode(FileNode n) {
        this.fdMap.put(n.getName(), n);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String dotString() {
        if (this.fdMap.isEmpty()) {
            return "\"" + this.getName() + "\";\n";
        } else {

            StringBuilder sb = new StringBuilder("");
            for (FileNode fdn : this.fdMap.values()) {
                sb.append("\"" + this.getName() + "\" -> " +
                        "\"" + fdn.getName() + "\""
                        + ";\n");
                sb.append(fdn.dotString());
            }

            return sb.toString();
        }
    }

    @Override
    public String toString() {
        return "FileNode{" +
                "name='" + name + '\'' +
                ", fdMap=" + fdMap +
                '}';
    }

}
