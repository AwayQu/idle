package tsp.feature.dependency;

import org.junit.Test;
import tsp.feature.dependency.fd.IDParser;
import tsp.feature.dependency.fd.ImportDependency;
import tsp.feature.dependency.fd.node.FileDependencyGraph;
import tsp.feature.dependency.fd.node.FileNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileDependencyTest {
    @Test
    public void fileDependencyTest1() throws Exception {

        String projectPath = "/Users/away/IOSProject/activityIOS/";
        ImportDependency id = new ImportDependency(projectPath);
        ArrayList<File> files = id.getProjectFiles();
        FileDependencyGraph graph = new FileDependencyGraph();
        //region parse node
        for (File f: files) {
            try {
                ImportDependency.FileNode fileNode = IDParser.parseFile(f);
                if (fileNode != null) {

                    FileNode n = graph.getFileNode(fileNode.getFileName());
                    if (n == null) {
                        n = new FileNode();
                        n.setName(fileNode.getFileName());
                        graph.addFileNode(n);
                    }

                    for (String fname : fileNode.getDependencyFiles()) {
                        FileNode n1 = graph.getFileNode(fname);
                        if (n1 == null) {
                            n1 = new FileNode();
                            n1.setName(fname);
                            graph.addFileNode(n1);
                        }
                        n.addDependcyFileNode(n1);
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //endregion

        System.out.println(graph.toString());
    }

    @Test
    public void fileDependencyTest2() throws Exception {

        String projectPath = "/Users/away/IOSProject/activityIOS/BoardGame/Feature/MeModule";
        ImportDependency id = new ImportDependency(projectPath);
        ArrayList<File> files = id.getProjectFiles();
        FileDependencyGraph graph = new FileDependencyGraph();
        //region parse node
        for (File f: files) {
            try {
                ImportDependency.FileNode fileNode = IDParser.parseFile(f);
                if (fileNode != null) {

                    FileNode n = graph.getFileNode(fileNode.getFileName());
                    if (n == null) {
                        n = new FileNode();
                        n.setName(fileNode.getFileName());
                        graph.addFileNode(n);
                    }

                    for (String fname : fileNode.getDependencyFiles()) {
                        FileNode n1 = graph.getFileNode(fname);
                        if (n1 == null) {
                            n1 = new FileNode();
                            n1.setName(fname);
                            graph.addFileNode(n1);
                        }
                        n.addDependcyFileNode(n1);
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //endregion

        System.out.println(graph.dotString());

        FileWriter fw = new FileWriter("./test/res/out/fileDependencyTest.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }


    @Test
    public void fileDependencyTest3() throws Exception {

        String projectPath = "/Users/away/IOSProject/activityIOS/";
        ImportDependency id = new ImportDependency(projectPath);
        ArrayList<File> files = id.getProjectFiles();
        FileDependencyGraph graph = new FileDependencyGraph();
        //region parse node
        for (File f: files) {
            try {
                ImportDependency.FileNode fileNode = IDParser.parseFile(f);
                if (fileNode != null) {

                    FileNode n = graph.getFileNode(fileNode.getFileName());
                    if (n == null) {
                        n = new FileNode();
                        n.setName(fileNode.getFileName());
                        graph.addFileNode(n);
                    }

                    for (String fname : fileNode.getDependencyFiles()) {
                        FileNode n1 = graph.getFileNode(fname);
                        if (n1 == null) {
                            n1 = new FileNode();
                            n1.setName(fname);
                            graph.addFileNode(n1);
                        }
                        n.addDependcyFileNode(n1);
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //endregion

        System.out.println(graph.dotString());

        FileWriter fw = new FileWriter("./test/res/out/fileDependencyTest3.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }


    @Test
    public void fileDependencyTest4() throws Exception {

        String projectPath = "/Users/away/IOSProject/activityIOS/BoardGame/Feature/MeModule/Cell";
        ImportDependency id = new ImportDependency(projectPath);
        ArrayList<File> files = id.getProjectFiles();
        FileDependencyGraph graph = new FileDependencyGraph();
        //region parse node
        for (File f: files) {
            try {
                ImportDependency.FileNode fileNode = IDParser.parseFile(f);
                if (fileNode != null) {

                    FileNode n = graph.getFileNode(fileNode.getFileName());
                    if (n == null) {
                        n = new FileNode();
                        n.setName(fileNode.getFileName());
                        graph.addFileNode(n);
                    }

                    for (String fname : fileNode.getDependencyFiles()) {
                        FileNode n1 = graph.getFileNode(fname);
                        if (n1 == null) {
                            n1 = new FileNode();
                            n1.setName(fname);
                            graph.addFileNode(n1);
                        }
                        n.addDependcyFileNode(n1);
                    }


                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //endregion

        System.out.println(graph.dotString());

        FileWriter fw = new FileWriter("./test/res/out/fileDependencyTest4.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }
}
