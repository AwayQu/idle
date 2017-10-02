package com.away1994.tsp.feature.structure.ps.scan;

import com.away1994.tsp.basic.file.DirectoryNode;
import com.away1994.tsp.basic.file.FileNode;
import com.away1994.tsp.feature.structure.ps.graph.ProjectStructureGraph;

import java.io.File;
import java.util.ArrayList;

public class FileScan {
    static public ProjectStructureGraph scanProject(String path) {
        // todo ignore file

        //region initialize
        File rootDir = new File(path);
        assert rootDir.isDirectory();

        ArrayList<File> directories = new ArrayList<>();
        directories.add(rootDir);

        ProjectStructureGraph graph = new ProjectStructureGraph();
        DirectoryNode root = new DirectoryNode();
        root.setPath(path);
        root.setName(rootDir.getName());
        graph.addRoot(root);
        //endregion


        while (!directories.isEmpty()) {
            ArrayList<File> enumDirectories = directories;
            directories = new ArrayList<>();
            for (File d: enumDirectories) {
                File[] files = d.listFiles();
                DirectoryNode parentDirNode = (DirectoryNode) graph.getFileSescription(d.getPath());
                for (File f: files) {
                    if (f.isDirectory()) {
                        DirectoryNode dn = new DirectoryNode();

                        dn.setPath(f.getPath());
                        dn.setName(f.getName());
                        dn.setParent(parentDirNode);

                        directories.add(f);
                        graph.addFileDescription(dn);
                        parentDirNode.addFileDescription(dn);

                    } else {

                        FileNode fn = new FileNode();
                        fn.setName(f.getName());
                        fn.setPath(f.getPath());
                        fn.setParent(parentDirNode);
                        graph.addFileDescription(fn);
                        parentDirNode.addFileDescription(fn);
                    }
                }
            }

        }
        return graph;
    }


}
