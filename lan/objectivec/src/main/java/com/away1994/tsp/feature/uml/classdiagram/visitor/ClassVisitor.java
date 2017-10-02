package com.away1994.tsp.feature.uml.classdiagram.visitor;

import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.gen.ObjectiveCParserBaseVisitor;

import java.util.List;

public class ClassVisitor extends ObjectiveCParserBaseVisitor<String> {

    @Override
    public String visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {
        System.out.println("className:" + ctx.classNameGeneric().className().getText());
        System.out.println("superClass:" + ctx.superclassName().getText());
        for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
            System.out.println("protocol:" + name.getText());
        }

        ObjectiveCParser.InterfaceDeclarationListContext declarationListContext = ctx.interfaceDeclarationList();
        List<ObjectiveCParser.ClassMethodDeclarationContext> methodList = declarationListContext.classMethodDeclaration();
        if (methodList != null) {
            for (ObjectiveCParser.ClassMethodDeclarationContext method : methodList) {
                System.out.println("classMethod:" + method.methodDeclaration().methodSelector().getText());
            }
        }

        List<ObjectiveCParser.InstanceMethodDeclarationContext> instanceMethodList = declarationListContext.instanceMethodDeclaration();
        if (instanceMethodList != null) {
            for (ObjectiveCParser.InstanceMethodDeclarationContext method : instanceMethodList) {
                System.out.println("instanceMethod:" + method.methodDeclaration().methodSelector().getText());
            }
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

        ObjectiveCParser.InterfaceDeclarationListContext declarationListContext = ctx.interfaceDeclarationList();
        if (declarationListContext != null) {


            List<ObjectiveCParser.ClassMethodDeclarationContext> methodList = declarationListContext.classMethodDeclaration();
            if (methodList != null) {
                for (ObjectiveCParser.ClassMethodDeclarationContext method : methodList) {
                    System.out.println("classMethod:" + method.methodDeclaration().methodSelector().getText());
                }
            }

            List<ObjectiveCParser.InstanceMethodDeclarationContext> instanceMethodList = declarationListContext.instanceMethodDeclaration();
            if (instanceMethodList != null) {
                for (ObjectiveCParser.InstanceMethodDeclarationContext method : instanceMethodList) {
                    System.out.println("instanceMethod:" + method.methodDeclaration().methodSelector().getText());
                }
            }
        }
        return super.visitCategoryInterface(ctx);

    }


}

