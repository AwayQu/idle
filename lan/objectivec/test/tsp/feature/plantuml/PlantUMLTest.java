package tsp.feature.plantuml;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.junit.Test;
import tsp.basic.NodeVisitor;
import tsp.basic.file.FileDescriptionNode;
import tsp.basic.objcclass.ObjcClass;
import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.element.impl.CDEClassImpl;
import tsp.feature.plantuml.classes.element.item.impl.CDMethodImpl;
import tsp.feature.plantuml.classes.impl.ClassesDiagramImpl;
import tsp.feature.plantuml.classes.relation.impl.CDRExtendImpl;
import tsp.feature.plantuml.classes.relation.impl.CDRImplementImpl;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;
import tsp.feature.uml.classdiagram.visitor.ClassDiagramFileVisitor;
import tsp.feature.uml.classdiagram.visitor.ObjcClassVisitor;
import tsp.g4.Output;
import tsp.language.Lan;

import java.util.HashMap;

import static tsp.feature.constants.TestConstants.IOS_HELLO_PROJECT_PATH;
import static tsp.feature.plantuml.classes.element.item.CDItemTag.PUBLIC;

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
                e.addItem(new CDMethodImpl(method, PUBLIC));
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

        Output.writeToFile("./test/res/out/plantuml/plantUMLTest1.puml", classesDiagram.getPUTextDescription());
    }
}
