package tsp.feature.uml.classdiagram.visitor;

import tsp.basic.objcclass.ObjcClass;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

import java.util.HashMap;
import java.util.List;

public class ObjcClassVisitor extends ObjectiveCParserBaseVisitor<String> {
    HashMap<String, ObjcClass> objcMap = new HashMap<>();

    public ObjcClassVisitor(HashMap<String, ObjcClass> objcMap) {
        this.objcMap = objcMap;
    }

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

        ObjectiveCParser.InterfaceDeclarationListContext declarationListContext = ctx.interfaceDeclarationList();
        if (declarationListContext != null) {

            List<ObjectiveCParser.ClassMethodDeclarationContext> methodList = declarationListContext.classMethodDeclaration();
            if (methodList != null) {
                for (ObjectiveCParser.ClassMethodDeclarationContext method : methodList) {
                    String methodName = method.methodDeclaration().methodSelector().getText();
                    objc.addMethods(methodName);
                    System.out.println("classMethod:" + methodName);
                }
            }

            List<ObjectiveCParser.InstanceMethodDeclarationContext> instanceMethodList = declarationListContext.instanceMethodDeclaration();
            if (instanceMethodList != null) {
                for (ObjectiveCParser.InstanceMethodDeclarationContext method : instanceMethodList) {
                    String methodName = method.methodDeclaration().methodSelector().getText();
                    objc.addMethods(methodName);
                    System.out.println("instanceMethod:" + methodName);
                }
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
            for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
                String protocol = name.getText();
                objc.addProtocol(protocol);
                System.out.println("protocol:" + protocol);
            }
        }
        objcMap.put(className, objc);
        return super.visitCategoryInterface(ctx);
    }
}
