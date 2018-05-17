package com.away1994.tsp.feature.dependency;

import com.away1994.tsp.feature.dependency.fd.IDParser;
import com.away1994.tsp.feature.dependency.fd.ImportDependency;
import com.away1994.tsp.feature.dependency.fd.node.FileDependencyGraph;
import com.away1994.tsp.feature.dependency.fd.node.FileNode;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import static com.away1994.constants.TestConstants.ACTIVITY_PROJECT_PATH;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class FileDependencyTest {
    @Test
    public void fileDependencyTest1() throws Exception {

        String projectPath = ACTIVITY_PROJECT_PATH;
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

        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/fileDependencyTest.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }


    @Test
    public void fileDependencyTest3() throws Exception {

        String projectPath = ACTIVITY_PROJECT_PATH;
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

        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/fileDependencyTest3.dot");
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

        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/fileDependencyTest4.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }
}
