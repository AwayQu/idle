package tsp.program.impl;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import tsp.basic.file.FileDescriptionNode;
import tsp.feature.plantuml.classes.ClassesDiagram;
import tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import tsp.feature.plantuml.classes.impl.ClassesDiagramImpl;
import tsp.feature.plantuml.classes.relation.ClassesDiagramRelation;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;
import tsp.feature.uml.classdiagram.visitor.ClassDiagramFileVisitor;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;
import tsp.language.Lan;
import tsp.program.AbstractProject;
import tsp.program.type.ClassElement;
import tsp.program.type.impl.objc.ObjcClassElementImpl;

import java.util.HashMap;

public class ObjcProject extends AbstractProject {

    private HashMap<String, ClassElement> elements = new HashMap<>();

    private ClassDiagramFileVisitor fileVisitor;

    public ObjcProject(String path) {
        super(path);


        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            @Override
            public Object visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ObjcClassElementImpl e = null;

                if (elements.get(name) != null) {
                    e = (ObjcClassElementImpl) elements.get(name);
                } else {
                    e = new ObjcClassElementImpl(name);
                }

                e.setClassInterfaceContext(ctx);
                elements.put(name, e);
                return super.visitClassInterface(ctx);
            }

            @Override
            public Object visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

                if (ctx.categoryName() != null) {
                    return null;
                }

                String name = ctx.classNameGeneric().className().getText();
                ObjcClassElementImpl e = null;

                if (elements.get(name) != null) {
                    e = (ObjcClassElementImpl) elements.get(name);
                } else {
                    e = new ObjcClassElementImpl(name);
                }

                e.setAnonymousCategoryInterfaceContexts(ctx);
                elements.put(name, e);
                return super.visitCategoryInterface(ctx);
            }
        };

        this.fileVisitor = new ClassDiagramFileVisitor(parseTreeVisitor, Lan.OBJECTIVE_C);
    }

    @Override
    public void readProject() {
        ProjectStructureGraph graph = FileScan.scanProject(this.getPath());
        FileDescriptionNode rootNode = graph.root;
        this.fileVisitor.visit(rootNode);
    }

    @Override
    public ClassesDiagram getClassesDiagram() {
        ClassesDiagram diagram = new ClassesDiagramImpl();
        for (ClassElement e : this.elements.values()) {
            for (ClassesDiagramElement element : e.getClassesDiagramElements()) {

                diagram.addElements(element);
            }

            for (ClassesDiagramRelation item : e.getClassesDiagramRelations()) {
                diagram.addRelation(item);
            }
        }
        return diagram;
    }
}
