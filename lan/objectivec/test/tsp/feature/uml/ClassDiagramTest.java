package tsp.feature.uml;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tsp.basic.NodeVisitor;
import tsp.basic.file.AbstractorFileVisitor;
import tsp.basic.file.DirectoryNode;
import tsp.basic.file.FileDescriptionNode;
import tsp.basic.file.FileNode;
import tsp.basic.objcclass.ObjcClass;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;
import tsp.feature.uml.classdiagram.visitor.ClassVisitor;
import tsp.g4.ObjcG4Util;
import tsp.g4.Output;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;
import tsp.visitor.TestObjcBaseVisitor;

import java.io.File;
import java.util.HashMap;

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
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/IOSProject/activityIOS");
        FileDescriptionNode rootNode = graph.root;

        // className -> count
        HashMap<String, ObjcClass> objcMap = new HashMap<>();

        ObjectiveCParserBaseVisitor fileVisitor = new ObjectiveCParserBaseVisitor<String>() {
            @Override
            public String visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {

                String className = ctx.classNameGeneric().className().getText();
                ObjcClass objc = null;
                if (objcMap.get(className) == null) {
                    objc = new ObjcClass();
                    objc.setName(className);
                } else {
                    objc = objcMap.get(className);
                }

                System.out.println("className:" + className);
                String superClass = ctx.superclassName().getText();
                System.out.println("superClass:" + superClass);
                objc.setSuperClass(superClass);
                if (ctx.protocolReferenceList() != null) {

                    for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
                        String protocol = name.getText();
                        objc.addProtocol(protocol);
                        System.out.println("protocol:" + protocol);
                    }
                }
                objcMap.put(className, objc);
                return super.visitClassInterface(ctx);
            }


            @Override
            public String visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

                if (ctx.categoryName() != null) {
                    return null;
                }
                System.out.println("categoryName:" + (ctx.categoryName() != null ? ctx.categoryName().getText() : null));

                String className = ctx.classNameGeneric().className().getText();
                System.out.println("className:" + className);
                ObjcClass objc = null;
                if (objcMap.get(className) == null) {
                    objc = new ObjcClass();
                    objc.setName(className);
                } else {
                    objc = objcMap.get(className);
                }
                if (ctx.protocolReferenceList() != null) {
                    for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()){
                        String protocol = name.getText();
                        objc.addProtocol(protocol);
                        System.out.println("protocol:" + protocol);
                    }
                }
                objcMap.put(className, objc);
                return super.visitCategoryInterface(ctx);
            }
        };
        NodeVisitor<String> nodeVisitor = new AbstractorFileVisitor<String>() {
            @Override
            public String visitFileNode(FileNode node) {

                String path = node.getPath();
                if (node.getExtension().equals("m") || node.getExtension().equals("h")) {
                    ParseTree parseTree = ObjcG4Util.getParseTree(path);
                    fileVisitor.visit(parseTree);
                }
                return super.visitFileNode(node);
            }

            @Override
            public String visitDirectoryNode(DirectoryNode node) {
                if (node.getName().contains("Pods")) {
                    return null;
                }
                return super.visitDirectoryNode(node);
            }
        };


        nodeVisitor.visit(rootNode);

        StringBuilder sb = new StringBuilder();

        sb.append("@startuml\n");

        for (ObjcClass objc : objcMap.values()) {
            // extends
            if (!objc.superClass.equals("NSObject")) {
                sb.append(objc.superClass + "<|--" + objc.name + "\n");
            }
            for (String protocol : objc.protocols) {
                // implements
                sb.append(protocol + "<--" +objc.name + "\n");
            }
        }


        sb.append("@enduml\n");

        System.out.println("===============");
        System.out.println(sb.toString());

        Output.writeToFile("./test/res/out/uml/classDiagramTest5.puml",sb.toString());
    }
}
