/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImportDependency {

    private String projectPath;

    public static class FileNode {
        @Override
        public String toString() {
            return "FileNode{" +
                    "fileName='" + fileName + '\'' +
                    ", dependencyFiles=" + dependencyFiles +
                    "}\r\n";
        }

        private String fileName;
        private ArrayList<String> dependencyFiles;

        public FileNode(ArrayList<String> dependencyFiles) {
            this.dependencyFiles = dependencyFiles;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
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


    public ImportDependency(String projectPath) {
        this.projectPath = projectPath;
    }

    /**
     * 获取类依赖关系
     */
    public ArrayList<FileNode> parseProject() {
        File currentDir = new File(this.projectPath);
        assert currentDir.isDirectory();
        ArrayList<File> files = new ArrayList<>();
        this.getFile(files, currentDir);

        ArrayList<FileNode> fileNodes = new ArrayList<>();

        for (File f: files) {
            try {
                FileNode fileNode = IDParser.parseFile(f);
                if (fileNode != null) {
                    fileNodes.add(fileNode);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return fileNodes;
    }

    private void getFile(ArrayList<File> files, File currentDir) {
        File[] fs = currentDir.listFiles();
        if (fs == null) return;
        for (File f: fs) {
            if (f.isDirectory()) {
                this.getFile(files, f);
            } else if (f.getAbsolutePath().endsWith(".m")) {
                files.add(f);
            }
        }
    }


}
