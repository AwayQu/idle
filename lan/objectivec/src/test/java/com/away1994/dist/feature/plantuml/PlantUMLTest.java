package com.away1994.dist.feature.plantuml;

import com.away1994.dist.basic.NodeVisitor;
import com.away1994.dist.basic.file.FileDescriptionNode;
import com.away1994.dist.basic.objcclass.ObjcClass;
import com.away1994.dist.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.dist.feature.plantuml.classes.element.impl.CDEClassImpl;
import com.away1994.dist.feature.plantuml.classes.element.item.impl.CDItemImpl;
import com.away1994.dist.feature.plantuml.classes.impl.ClassesDiagramImpl;
import com.away1994.dist.feature.plantuml.classes.relation.impl.CDRExtendImpl;
import com.away1994.dist.feature.plantuml.classes.relation.impl.CDRImplementImpl;
import com.away1994.dist.feature.structure.ps.graph.ProjectStructureGraph;
import com.away1994.dist.feature.structure.ps.scan.FileScan;
import com.away1994.dist.feature.uml.classdiagram.visitor.ClassDiagramFileVisitor;
import com.away1994.dist.feature.uml.classdiagram.visitor.ObjcClassVisitor;
import com.away1994.dist.g4.Output;
import com.away1994.dist.language.Lan;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeSet;

import static com.away1994.constants.TestConstants.IOS_HELLO_PROJECT_PATH;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class PlantUMLTest {

    @Test
    public void plantUMLTest1() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject(IOS_HELLO_PROJECT_PATH);
        FileDescriptionNode rootNode = graph.root;

        // className -> count
        HashMap<String, ObjcClass> objcMap = new HashMap<>();

        AbstractParseTreeVisitor classVisitor = new ObjcClassVisitor(objcMap);

        NodeVisitor<String> nodeVisitor = new ClassDiagramFileVisitor(classVisitor, Lan.OBJECTIVE_C);


        nodeVisitor.visit(rootNode);

        ClassesDiagramImpl classesDiagram = new ClassesDiagramImpl();

        for (ObjcClass objc : objcMap.values()) {
            ClassesDiagramElement e = new CDEClassImpl(objc.name);
            for (String method : objc.methods) {
                e.addItem(new CDItemImpl(method, new TreeSet<>()));
            }

            classesDiagram.addElements(e);


            // extends
            if (!objc.superClass.equals("NSObject")) {
                classesDiagram.addRelation(new CDRExtendImpl(new CDEClassImpl(objc.name), new CDEClassImpl(objc.superClass)));
            }
            for (String protocol : objc.protocols) {
                classesDiagram.addRelation(new CDRImplementImpl(new CDEClassImpl(objc.name), new CDEClassImpl(protocol)));
            }
        }


        System.out.println("===============");
        System.out.println(classesDiagram.getPUTextDescription());

        Output.writeToFile(TEST_RESOURCES_PATH + "out/plantuml/plantUMLTest1.puml", classesDiagram.getPUTextDescription());
    }
}
