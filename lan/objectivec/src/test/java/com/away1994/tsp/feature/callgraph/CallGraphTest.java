package com.away1994.tsp.feature.callgraph;

import com.away1994.tsp.feature.callgraph.node.CallGraph;
import com.away1994.tsp.feature.callgraph.visitor.CallVisitor;
import com.away1994.tsp.g4.ObjcG4Util;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static com.away1994.tsp.constants.TestConstants.TEST_RESOURCES_PATH;

public class CallGraphTest {

    @Test
    public void testVisitor() throws IOException {

        ParseTree parseTree = ObjcG4Util.getParseTree(TEST_RESOURCES_PATH + "Hello.m");


        TestCallVisitor visitor = new TestCallVisitor();
        visitor.visit(parseTree);

    }


    @Test
    public void instanceCallTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree(TEST_RESOURCES_PATH + "InstanceCallTest.m");
        assert parseTree != null;


        TestIntanceCallVisitor visitor = new TestIntanceCallVisitor();
        visitor.visit(parseTree);
    }


    @Test
    public void graphCallTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree(TEST_RESOURCES_PATH + "InstanceCallTest.m");
        assert parseTree != null;

        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);
        visitor.visit(parseTree);
        System.out.println(graph);
        System.out.println("finish");
    }


    @Test
    public void dotOutputTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree(TEST_RESOURCES_PATH + "InstanceCallTest.m");
        assert parseTree != null;


        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);

        visitor.visit(parseTree);
        System.out.println(graph.dotString());
        System.out.println("finish");

        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/instanceCallTest.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }


    @Test
    public void dotOutputTest1() throws Exception {
        ParseTree parseTree = ObjcG4Util.getParseTree(TEST_RESOURCES_PATH + "InstanceCallTest1.m");
        assert parseTree != null;


        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);

        visitor.visit(parseTree);

        System.out.println(graph.dotString());
        System.out.println("finish");

        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/instanceCallTest1.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }
}
