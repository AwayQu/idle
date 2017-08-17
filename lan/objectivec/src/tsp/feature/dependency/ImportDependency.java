/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency;

import java.util.ArrayList;

public class ImportDependency {
    public static class FileNode {

        private String fileName;
        private ArrayList<String> dependencyFiles;

        public FileNode(ArrayList<String> dependencyFiles) {
            this.dependencyFiles = dependencyFiles;
        }

        public FileNode(String dependencyFile) {
            ArrayList<String> dependencyFiles = new ArrayList<>();
            dependencyFiles.add(dependencyFile);
            this.dependencyFiles = dependencyFiles;
        }

        public ArrayList<String> getDependencyFiles() {
            return dependencyFiles;
        }
    }


}
