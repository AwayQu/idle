package com.away1994.dist.feature.callgraph;

import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCParserBaseVisitor;

public class TestCallVisitor extends ObjectiveCParserBaseVisitor {

    @Override
    public Object visitFunctionCallDeclaration(ObjectiveCParser.FunctionCallDeclarationContext ctx) {
        System.out.println("FunctionCallDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitFunctionCallDeclaration(ctx);
    }

    @Override
    public Object visitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx) {
        System.out.println("FunctionCallExpression");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public Object visitClassMethodDeclaration(ObjectiveCParser.ClassMethodDeclarationContext ctx) {
        System.out.println("ClassMethodDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitClassMethodDeclaration(ctx);
    }

    @Override
    public Object visitInstanceMethodDeclaration(ObjectiveCParser.InstanceMethodDeclarationContext ctx) {
        System.out.println("InstanceMethodDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitInstanceMethodDeclaration(ctx);
    }

    @Override
    public Object visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {
        System.out.println("MethodDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitMethodDeclaration(ctx);
    }


    @Override
    public Object visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
        System.out.println("MethodDefinition");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitMethodDefinition(ctx);
    }

    @Override
    public Object visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {
        return super.visitMethodSelector(ctx);
    }

    @Override
    public Object visitClassMethodDefinition(ObjectiveCParser.ClassMethodDefinitionContext ctx) {
        System.out.println("ClassMethodDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitClassMethodDefinition(ctx);
    }

    @Override
    public Object visitInstanceMethodDefinition(ObjectiveCParser.InstanceMethodDefinitionContext ctx) {

        System.out.println("InstanceDeclaration");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitInstanceMethodDefinition(ctx);
    }

    @Override
    public Object visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx) {
        System.out.println("MessageExpression");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitMessageExpression(ctx);
    }


    @Override
    public Object visitReceiver(ObjectiveCParser.ReceiverContext ctx) {
        System.out.println("Receiver");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitReceiver(ctx);
    }

    @Override
    public Object visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx) {
        System.out.println("MessageSelector");
        System.out.println(ctx.getText());
        System.out.println("");
        return super.visitMessageSelector(ctx);
    }
}
