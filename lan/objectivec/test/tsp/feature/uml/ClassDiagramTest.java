package tsp.feature.uml;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tsp.basic.NodeVisitor;
import tsp.basic.file.AbstractorFileVisitor;
import tsp.basic.file.DirectoryNode;
import tsp.basic.file.FileDescriptionNode;
import tsp.basic.file.FileNode;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;
import tsp.feature.uml.classdiagram.visitor.ClassVisitor;
import tsp.g4.ObjcG4Util;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;
import tsp.visitor.TestObjcBaseVisitor;

import java.io.File;

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
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/Desktop/ios_hello");
        FileDescriptionNode fileNode = graph.root;

        ObjectiveCParserBaseVisitor fileVisitor = new ObjectiveCParserBaseVisitor<String>() {
            @Override
            public String visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {
                System.out.println("className:" + ctx.classNameGeneric().className().getText());
                System.out.println("superClass:" + ctx.superclassName().getText());
                for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
                    System.out.println("protocol:" + name.getText());
                }
                return super.visitClassInterface(ctx);
            }


            @Override
            public String visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {
                System.out.println("className:" + ctx.classNameGeneric().className().getText());
                System.out.println("categoryName:" + (ctx.categoryName() != null ? ctx.categoryName().getText() : null));
                for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
                    System.out.println("protocol:" + name.getText());
                }
                return super.visitCategoryInterface(ctx);
            }
        };
        NodeVisitor<String> nodeVisitor = new AbstractorFileVisitor<String>() {
            @Override
            public String visitFileNode(FileNode node) {
                File file = new File(node.getPath());
                return super.visitFileNode(node);
            }

            @Override
            public String visitDirectoryNode(DirectoryNode node) {
                return super.visitDirectoryNode(node);
            }
        };



    }
}
