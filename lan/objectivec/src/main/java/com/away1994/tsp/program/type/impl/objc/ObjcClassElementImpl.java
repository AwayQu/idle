package com.away1994.tsp.program.type.impl.objc;

import com.away1994.tsp.feature.plantuml.classes.element.ClassesDiagramElement;
import com.away1994.tsp.feature.plantuml.classes.element.impl.CDEClassImpl;
import com.away1994.tsp.feature.plantuml.classes.element.impl.CDEInterfaceImpl;
import com.away1994.tsp.feature.plantuml.classes.relation.ClassesDiagramRelation;
import com.away1994.tsp.feature.plantuml.classes.relation.impl.CDRExtendImpl;
import com.away1994.tsp.feature.plantuml.classes.relation.impl.CDRImplementImpl;
import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.program.method.MethodElement;
import com.away1994.tsp.program.method.MethodTag;
import com.away1994.tsp.program.method.impl.objc.ObjcMethodElementImpl;
import com.away1994.tsp.program.type.*;
import com.away1994.tsp.program.variable.VariableElement;
import com.away1994.tsp.program.variable.impl.objc.ObjcPropertyVariable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ObjcClassElementImpl extends AbstractTypeElement implements ClassElement {


    ObjectiveCParser.ClassInterfaceContext classInterfaceContext;
    ObjectiveCParser.ClassImplementationContext classImplementationContext;

    ObjectiveCParser.CategoryInterfaceContext anonymousCategoryInterfaceContexts;
    Set<ObjectiveCParser.CategoryInterfaceContext> categoryInterfaceContexts;
    Set<ObjectiveCParser.CategoryImplementationContext> categoryImplementationContexts;


    Set<ParseTree> tree;

    public ObjcClassElementImpl(String name) {
        super(name);
        this.categoryImplementationContexts = new HashSet<>();
        this.categoryInterfaceContexts = new HashSet<>();
    }

    public ObjcClassElementImpl(String name, Set<TypeTag> tags, Set<ParseTree> tree) {
        super(name, tags);
        this.tree = tree;
    }


    @Override
    public Set<ClassElement> getSuperClasses() {
        Set<ClassElement> elements = new HashSet<>();
        if (classInterfaceContext != null) {

            elements.add(new ObjcClassElementImpl(classInterfaceContext.superclassName().getText()));
        }

        return elements;
    }

    @Override
    public Set<InterfaceElement> getImplementInterface() {
        Set<InterfaceElement> elements = new HashSet<>();

        if (classInterfaceContext != null &&
                classInterfaceContext.protocolReferenceList() != null) {
            for (ObjectiveCParser.ProtocolNameContext name : classInterfaceContext.protocolReferenceList().protocolList().protocolName()) {
                String protocol = name.getText();
                elements.add(new ObjcProtocolElementImpl(protocol));
            }
        }

        if (anonymousCategoryInterfaceContexts != null &&
                anonymousCategoryInterfaceContexts.protocolReferenceList() != null) {
            for (ObjectiveCParser.ProtocolNameContext name : anonymousCategoryInterfaceContexts.protocolReferenceList().protocolList().protocolName()) {
                String protocol = name.getText();
                elements.add(new ObjcProtocolElementImpl(protocol));
            }
        }

        return elements;
    }


    @Override
    public Set<MethodElement> getImplementMethods() {
        Set<MethodElement> elements = new HashSet<>();
        if (classInterfaceContext != null) {
            ObjectiveCParser.InterfaceDeclarationListContext declarationListContext = classInterfaceContext.interfaceDeclarationList();
            parseMethod(elements, declarationListContext);
        }

        if (classImplementationContext != null) {
            ObjectiveCParser.ImplementationDefinitionListContext definitionListContext = classImplementationContext.implementationDefinitionList();
            parseMethod(elements, definitionListContext);
        }

        for (ObjectiveCParser.CategoryInterfaceContext categoryInterfaceContext : categoryInterfaceContexts) {
            ObjectiveCParser.InterfaceDeclarationListContext declarationListContext = categoryInterfaceContext.interfaceDeclarationList();
            parseMethod(elements, declarationListContext);
        }

        for (ObjectiveCParser.CategoryImplementationContext implementationContext : categoryImplementationContexts) {
            ObjectiveCParser.ImplementationDefinitionListContext definitionListContext = implementationContext.implementationDefinitionList();
            parseMethod(elements, definitionListContext);
        }


        return elements;
    }

    private void parseMethod(Set<MethodElement> elements, ObjectiveCParser.ImplementationDefinitionListContext definitionListContext) {
        if (definitionListContext != null
                && definitionListContext.classMethodDefinition() != null) {
            for (ObjectiveCParser.ClassMethodDefinitionContext define : definitionListContext.classMethodDefinition()) {
                TreeSet<MethodTag> tags = new TreeSet<>();
                tags.add(MethodTag.PRIVATE);
                MethodElement method = new ObjcMethodElementImpl(define, tags);
                // reduce both in interface and implementation
                if (!elements.contains(method)) {
                    elements.add(method);
                }
            }
        }

        if (definitionListContext != null
                && definitionListContext.instanceMethodDefinition() != null) {
            for (ObjectiveCParser.InstanceMethodDefinitionContext define : definitionListContext.instanceMethodDefinition()) {
                TreeSet<MethodTag> tags = new TreeSet<>();
                tags.add(MethodTag.PRIVATE);
                MethodElement method = new ObjcMethodElementImpl(define, tags);
                // reduce both in interface and implementation
                if (!elements.contains(method)) {
                    elements.add(method);
                }
            }
        }
    }

    private void parseMethod(Set<MethodElement> elements, ObjectiveCParser.InterfaceDeclarationListContext declarationListContext) {
        if (declarationListContext != null) {

            List<ObjectiveCParser.ClassMethodDeclarationContext> methodList = declarationListContext.classMethodDeclaration();
            if (methodList != null) {
                for (ObjectiveCParser.ClassMethodDeclarationContext method : methodList) {
                    String methodName = method.methodDeclaration().methodSelector().getText();
//                        elements.add(new ObjcMethodElementImpl(methodName));
                    TreeSet<MethodTag> tags = new TreeSet<>();
                    tags.add(MethodTag.PUBLIC);
                    elements.add(new ObjcMethodElementImpl(method, tags));
                }
            }

            List<ObjectiveCParser.InstanceMethodDeclarationContext> instanceMethodList = declarationListContext.instanceMethodDeclaration();
            if (instanceMethodList != null) {
                for (ObjectiveCParser.InstanceMethodDeclarationContext method : instanceMethodList) {
//                        String methodName = method.methodDeclaration().methodSelector().getText();
                    TreeSet<MethodTag> tags = new TreeSet<>();
                    tags.add(MethodTag.PUBLIC);
                    elements.add(new ObjcMethodElementImpl(method, tags));
                }
            }
        }
    }

    public Set<VariableElement> getProperties() {
        Set<VariableElement> elements = new HashSet<>();
        ObjectiveCParser.ClassInterfaceContext interfaceContext = this.getClassInterfaceContext();
        if (interfaceContext != null) {
            ObjectiveCParser.InterfaceDeclarationListContext interfaceDeclarationListContext = interfaceContext.interfaceDeclarationList();
            parsePropeties(elements, interfaceDeclarationListContext);
        }
        if (anonymousCategoryInterfaceContexts != null) {
            ObjectiveCParser.InterfaceDeclarationListContext interfaceDeclarationListContext1 = anonymousCategoryInterfaceContexts.interfaceDeclarationList();
            parsePropeties(elements, interfaceDeclarationListContext1);
        }

        return elements;
    }

    private void parsePropeties(Set<VariableElement> elements, ObjectiveCParser.InterfaceDeclarationListContext interfaceDeclarationListContext) {
        if (interfaceDeclarationListContext != null) {
            List<ObjectiveCParser.PropertyDeclarationContext> propertyDeclarationContexts = interfaceDeclarationListContext.propertyDeclaration();
            for (ObjectiveCParser.PropertyDeclarationContext propertyDeclarationContext : propertyDeclarationContexts) {

                //type
                String type = propertyDeclarationContext.structDeclaration().specifierQualifierList().getText();
                TypeElement typeElement = new ObjcClassElementImpl(type);

                //identify
                String name = propertyDeclarationContext.structDeclaration().structDeclaratorList().getText();
                if (name.startsWith("*")) {
                    name = name.substring(1);
                }
                VariableElement e = new ObjcPropertyVariable(typeElement, name);
                elements.add(e);
            }
        }
    }

    public Set<VariableElement> getVariables() {
        return null;
    }


    @Override
    public Set<ClassesDiagramElement> getClassesDiagramElements() {

        Set<ClassesDiagramElement> elements = new HashSet<>();
        {
            ClassesDiagramElement e = new CDEClassImpl(this.getName());
            for (VariableElement variable : this.getProperties()) {
                e.addItem(variable.getClassesDiagramItem());
                ;
            }
            for (MethodElement method : this.getImplementMethods()) {
                e.addItem(method.getClassesDiagramItem());
            }
            elements.add(e);
        }


        // todo merge real implements
        // add relation Class or Interface

        for (ClassElement e : this.getSuperClasses()) {
            elements.add(new CDEClassImpl(e.getName()));
        }

        for (InterfaceElement i : this.getImplementInterface()) {
            elements.add(new CDEInterfaceImpl(i.getName()));
        }

        return elements;
    }

    @Override
    public Set<ClassesDiagramRelation> getClassesDiagramRelations() {
        Set<ClassesDiagramRelation> elements = new HashSet<>();
        for (ClassElement e : this.getSuperClasses()) {
            // TODO Remove
            if (e.getName().equals("NSObject")) {
                continue;
            }
            elements.add(new CDRExtendImpl(new CDEClassImpl(this.getName()), new CDEClassImpl(e.getName())));
        }

        for (InterfaceElement i : this.getImplementInterface()) {
            elements.add(new CDRImplementImpl(new CDEClassImpl(this.getName()), new CDEInterfaceImpl(i.getName())));
        }

        return elements;


    }


    public ObjectiveCParser.ClassInterfaceContext getClassInterfaceContext() {
        return classInterfaceContext;
    }

    public void setClassInterfaceContext(ObjectiveCParser.ClassInterfaceContext classInterfaceContext) {
        this.classInterfaceContext = classInterfaceContext;
    }

    public ObjectiveCParser.CategoryInterfaceContext getAnonymousCategoryInterfaceContexts() {
        return anonymousCategoryInterfaceContexts;
    }

    public void setAnonymousCategoryInterfaceContexts(ObjectiveCParser.CategoryInterfaceContext anonymousCategoryInterfaceContexts) {
        this.anonymousCategoryInterfaceContexts = anonymousCategoryInterfaceContexts;
    }

    public ObjectiveCParser.ClassImplementationContext getClassImplementationContext() {
        return classImplementationContext;
    }

    public void setClassImplementationContext(ObjectiveCParser.ClassImplementationContext classImplementationContext) {
        this.classImplementationContext = classImplementationContext;
    }

    public Set<ObjectiveCParser.CategoryInterfaceContext> getCategoryInterfaceContexts() {
        return categoryInterfaceContexts;
    }

    public void setCategoryInterfaceContexts(Set<ObjectiveCParser.CategoryInterfaceContext> categoryInterfaceContexts) {
        this.categoryInterfaceContexts = categoryInterfaceContexts;
    }

    public Set<ObjectiveCParser.CategoryImplementationContext> getCategoryImplementationContexts() {
        return categoryImplementationContexts;
    }

    public void setCategoryImplementationContexts(Set<ObjectiveCParser.CategoryImplementationContext> categoryImplementationContexts) {
        this.categoryImplementationContexts = categoryImplementationContexts;
    }


}
