package com.away1994.structure.lang.aggregator;

import com.away1994.structure.lang.aggregator.impl.ClassDiagram;
import com.away1994.structure.lang.aggregator.impl.FileTree;

import java.util.ArrayList;

public interface Aggregator {

    public String getClassDependencyInfo(String className, int depth);

    public ClassDiagram getClassDiagram(int depth);

    public ClassDiagram getClassDiagram(ArrayList<String> identifyList, int depth);

    public FileTree getFileTree();
}
