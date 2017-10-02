package com.away1994.tsp.feature.uml;

import com.away1994.tsp.basic.NodeVisitor;
import com.away1994.tsp.basic.file.FileDescriptionNode;
import com.away1994.tsp.basic.objcclass.ObjcClass;
import com.away1994.tsp.feature.structure.ps.graph.ProjectStructureGraph;
import com.away1994.tsp.feature.structure.ps.scan.FileScan;
import com.away1994.tsp.feature.uml.classdiagram.visitor.ClassDiagramFileVisitor;
import com.away1994.tsp.feature.uml.classdiagram.visitor.ClassVisitor;
import com.away1994.tsp.feature.uml.classdiagram.visitor.ObjcClassVisitor;
import com.away1994.tsp.g4.ObjcG4Util;
import com.away1994.tsp.g4.Output;
import com.away1994.tsp.language.Lan;
import com.away1994.tsp.visitor.TestObjcBaseVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.util.HashMap;

import static com.away1994.tsp.constants.TestConstants.IOS_HELLO_PROJECT_PATH;

public class ClassDiagramTest {
    @Test
    public void classDiagramTest1() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/uml/class/Hello.m");
        assert parseTree != null;

        TestObjcBaseVisitor visitor = new TestObjcBaseVisitor();

        visitor.visit(parseTree);
    }


    @Test
    public void classDiagramTest2() throws Exception {


        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/uml/class/Hello.h");
        assert parseTree != null;

        TestObjcBaseVisitor visitor = new TestObjcBaseVisitor();

        visitor.visit(parseTree);
    }


    @Test
    public void classDiagramTest3() throws Exception {
        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/uml/class/Hello.m");
        assert parseTree != null;

        ClassVisitor visitor = new ClassVisitor();

        visitor.visit(parseTree);
    }


    @Test
    public void classDiagramTest4() throws Exception {

        ParseTree parseTree = ObjcG4Util.getParseTree("./test/res/uml/class/Hello.h");
        assert parseTree != null;

        ClassVisitor visitor = new ClassVisitor();

        visitor.visit(parseTree);
    }


    @Test
    public void classDiagramTest5() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject(IOS_HELLO_PROJECT_PATH);
//        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/IOSProject/activityIOS");
        FileDescriptionNode rootNode = graph.root;

        // className -> count
        HashMap<String, ObjcClass> objcMap = new HashMap<>();

        AbstractParseTreeVisitor classVisitor = new ObjcClassVisitor(objcMap);

        NodeVisitor<String> nodeVisitor = new ClassDiagramFileVisitor(classVisitor, Lan.OBJECTIVE_C);


        nodeVisitor.visit(rootNode);

        StringBuilder sb = new StringBuilder();

        sb.append("@startuml\n");

        for (ObjcClass objc : objcMap.values()) {

            sb.append("class " + objc.name + " {\n");
            for (String method : objc.methods) {
                sb.append("{method}" + method + "\n");
            }
            sb.append("}\n");
            // extends
            if (!objc.superClass.equals("NSObject")) {
                sb.append(objc.superClass + "<|--" + objc.name + "\n");
            }
            for (String protocol : objc.protocols) {
                // implements
                sb.append(protocol + "<--" + objc.name + "\n");
            }
        }


        sb.append("@enduml\n");

        System.out.println("===============");
        System.out.println(sb.toString());

        Output.writeToFile("./test/res/out/uml/classDiagramTest5.puml", sb.toString());
    }
}
