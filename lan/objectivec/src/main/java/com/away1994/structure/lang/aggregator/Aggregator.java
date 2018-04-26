package com.away1994.structure.lang.aggregator;

import com.away1994.structure.lang.aggregator.impl.ClassDiagram;
import com.away1994.structure.lang.aggregator.impl.FileTree;

import java.util.ArrayList;

public interface Aggregator {

    /**
     * 获取节点, 根据节点连接 分为多个图
     * @param depth 查找深度
     * @return 类图列表
     */
    public ArrayList<ClassDiagram> getClassDiagrams(int depth);

    public ArrayList<ClassDiagram> getClassDiagrams(ArrayList<String> identifyList, int depth);

    public ClassDiagram getClassDiagram(int depth);

    public ClassDiagram getClassDiagram(ArrayList<String> identifyList, int depth);

    public FileTree getFileTree();
}
