package tsp.feature.callgraph;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tsp.feature.callgraph.node.CallGraph;
import tsp.feature.callgraph.visitor.CallVisitor;
import tsp.g4.ObjcG4Util;

import java.io.FileWriter;
import java.io.IOException;

public class CallGraphTest {

    @Test
    public void testVisitor() throws IOException {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/Hello.m");


        TestCallVisitor visitor = new TestCallVisitor();
        visitor.visit(parseTree);

    }


    @Test
    public void instanceCallTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/InstanceCallTest.m");
        assert parseTree != null;


        TestIntanceCallVisitor visitor = new TestIntanceCallVisitor();
        visitor.visit(parseTree);
    }


    @Test
    public void graphCallTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/InstanceCallTest.m");
        assert parseTree != null;

        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);
        visitor.visit(parseTree);
        System.out.println(graph);
        System.out.println("finish");
    }


    @Test
    public void dotOutputTest() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/InstanceCallTest.m");
        assert parseTree != null;


        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);

        visitor.visit(parseTree);
        System.out.println(graph.dotString());
        System.out.println("finish");

        FileWriter fw = new FileWriter("./test/res/out/instanceCallTest.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }


    @Test
    public void dotOutputTest1() throws Exception {
        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/InstanceCallTest1.m");
        assert parseTree != null;


        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);

        visitor.visit(parseTree);

        System.out.println(graph.dotString());
        System.out.println("finish");

        FileWriter fw = new FileWriter("./test/res/out/instanceCallTest1.dot");
        fw.write(graph.dotString());
        fw.flush();
        fw.close();
    }
}
