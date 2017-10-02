package com.away1994.tsp.feature.callgraph.visitor;

import com.away1994.tsp.feature.callgraph.builder.CGBuilder;
import com.away1994.tsp.feature.callgraph.node.CallGraph;
import com.away1994.tsp.feature.callgraph.node.CallGraphNode;
import com.away1994.tsp.feature.callgraph.node.Declaration;
import com.away1994.tsp.gen.ObjectiveCParser;
import com.away1994.tsp.gen.ObjectiveCParserBaseVisitor;

public class CallVisitor extends ObjectiveCParserBaseVisitor<CGBuilder> {

    public CallGraph graph;
    public CGBuilder builder;
    public CallVisitor(CallGraph graph) {
        this.graph = graph;
    }



    @Override
    public CGBuilder visitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public CGBuilder visitBlockExpression(ObjectiveCParser.BlockExpressionContext ctx) {
        return super.visitBlockExpression(ctx);
    }


    @Override
    public CGBuilder visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
        return super.visitMethodDefinition(ctx);
    }


    @Override
    public CGBuilder visitClassMethodDefinition(ObjectiveCParser.ClassMethodDefinitionContext ctx) {
        return super.visitClassMethodDefinition(ctx);
    }

    @Override
    public CGBuilder visitInstanceMethodDefinition(ObjectiveCParser.InstanceMethodDefinitionContext ctx) {
        return super.visitInstanceMethodDefinition(ctx);
    }

    @Override
    public CGBuilder visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {
        String identify = ctx.getText();
        Declaration declaration = new Declaration(identify);
        CallGraphNode caller = new CallGraphNode(declaration);
        builder = new CGBuilder(this.graph, caller);
        builder.addCaller(caller);
        return super.visitMethodSelector(ctx);
    }

    @Override
    public CGBuilder visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx) {
        return super.visitMessageExpression(ctx);
    }

    @Override
    public CGBuilder visitReceiver(ObjectiveCParser.ReceiverContext ctx) {
        // todo infer class
        return super.visitReceiver(ctx);
    }

    @Override
    public CGBuilder visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx) {
        String identify = ctx.getText();
        Declaration declaration = new Declaration(identify);
        CallGraphNode callee = new CallGraphNode(declaration);
        this.builder.addCallee(callee);
        return super.visitMessageSelector(ctx);
    }


    @Override
    protected CGBuilder aggregateResult(CGBuilder aggregate, CGBuilder nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }
}
