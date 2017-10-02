package com.away1994.tsp.program.impl;

import com.away1994.tsp.basic.file.FileDescriptionNode;
import com.away1994.tsp.feature.plantuml.classes.ClassesDiagram;
import com.away1994.tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.tsp.feature.plantuml.classes.impl.ClassesDiagramImpl;
import com.away1994.tsp.feature.plantuml.classes.relation.ClassesDiagramRelation;
import com.away1994.tsp.feature.structure.ps.graph.ProjectStructureGraph;
import com.away1994.tsp.feature.structure.ps.scan.FileScan;
import com.away1994.tsp.feature.uml.classdiagram.visitor.ClassDiagramFileVisitor;
import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.gen.ObjectiveCParserBaseVisitor;
import com.away1994.tsp.language.Lan;
import com.away1994.tsp.program.AbstractProject;
import com.away1994.tsp.program.type.ClassElement;
import com.away1994.tsp.program.type.EnumElement;
import com.away1994.tsp.program.type.InterfaceElement;
import com.away1994.tsp.program.type.impl.objc.ObjcClassElementImpl;
import com.away1994.tsp.program.type.impl.objc.ObjcEnumElementImpl;
import com.away1994.tsp.program.type.impl.objc.ObjcProtocolElementImpl;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;

public class ObjcProject extends AbstractProject {

    private HashMap<String, ClassElement> elements = new HashMap<>();
    private HashMap<String, InterfaceElement> interfaceElements = new HashMap<>();
    private HashMap<String, EnumElement> enumElements = new HashMap<>();


    private ClassDiagramFileVisitor fileVisitor;

    public ObjcProject(String path) {
        super(path);


        AbstractParseTreeVisitor parseTreeVisitor = new ObjectiveCParserBaseVisitor() {
            /**
             * read @interface Foo: NSObject
             *      @end
             *
             * @param ctx
             * @return
             */
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
            public Object visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ObjcClassElementImpl e = null;

                if (elements.get(name) != null) {
                    e = (ObjcClassElementImpl) elements.get(name);
                } else {
                    e = new ObjcClassElementImpl(name);
                }

                e.setClassImplementationContext(ctx);

                elements.put(name, e);

                return super.visitClassImplementation(ctx);
            }

            /**
             * read @interface Foo ()
             *
             *      @end
             *
             *      @interface Foo (categoryName)
             *
             *      @end
             *
             * @param ctx
             * @return
             */
            @Override
            public Object visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {

                Boolean isAnonymous = ctx.categoryName() == null;

                String name = ctx.classNameGeneric().className().getText();
                ObjcClassElementImpl e = null;

                if (elements.get(name) != null) {
                    e = (ObjcClassElementImpl) elements.get(name);
                } else {
                    e = new ObjcClassElementImpl(name);
                }

                if (isAnonymous) {
                    e.setAnonymousCategoryInterfaceContexts(ctx);
                } else {
                    e.getCategoryInterfaceContexts().add(ctx);
                }
                elements.put(name, e);
                return super.visitCategoryInterface(ctx);
            }

            /**
             * read  @implement Foo (category)
             *       @end
             *
             * @param ctx
             * @return
             */
            @Override
            public Object visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx) {
                String name = ctx.classNameGeneric().className().getText();
                ObjcClassElementImpl e = null;
                if (elements.get(name) != null) {
                    e = (ObjcClassElementImpl) elements.get(name);
                } else {
                    e = new ObjcClassElementImpl(name);
                }

                e.getCategoryImplementationContexts().add(ctx);
                elements.put(name, e);
                return super.visitCategoryImplementation(ctx);
            }

            /**
             * read @protocol protocalName
             *      @end
             *
             * @param ctx
             * @return
             */
            @Override
            public Object visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx) {
                String name = ctx.protocolName().getText();
                ObjcProtocolElementImpl e = null;
                if (interfaceElements.get(name) != null) {
                    e = (ObjcProtocolElementImpl) interfaceElements.get(name);
                } else {
                    e = new ObjcProtocolElementImpl(name);
                }

                e.setProtocolDeclarationContext(ctx);
                interfaceElements.put(name, e);

                return super.visitProtocolDeclaration(ctx);
            }

            @Override
            public Object visitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx) {

                String name = null;
                if (ctx.className() != null) {
                    name = ctx.className().getText();
                } else {
                    name = ctx.enumSpecifier().identifier().get(0).getText();
                }

                ObjcEnumElementImpl e = null;
                if (enumElements.get(name) != null) {
                    e = (ObjcEnumElementImpl) enumElements.get(name);
                } else {
                    e = new ObjcEnumElementImpl(name);
                }
                e.setContext(ctx);
                enumElements.put(name, e);

                return super.visitEnumDeclaration(ctx);
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

        for (InterfaceElement e : this.interfaceElements.values()) {
            for (ClassesDiagramElement element : e.getClassesDiagramElements()) {
                diagram.addElements(element);
            }

            for (ClassesDiagramRelation item : e.getClassesDiagramRelations()) {
                diagram.addRelation(item);
            }
        }

        for (EnumElement e : this.enumElements.values()) {
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
