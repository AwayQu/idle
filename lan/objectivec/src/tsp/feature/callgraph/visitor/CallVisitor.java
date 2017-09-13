package tsp.feature.callgraph.visitor;

import tsp.feature.callgraph.builder.CGBuilder;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

public class CallVisitor extends ObjectiveCParserBaseVisitor<CGBuilder> {


    public CallVisitor() {
    }



    @Override
    public CGBuilder visitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx) {
        System.out.print(ctx);
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
        return super.visitMethodSelector(ctx);
    }

    @Override
    public CGBuilder visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx) {
        System.out.print(ctx);
        return super.visitMessageExpression(ctx);
    }

    @Override
    public CGBuilder visitReceiver(ObjectiveCParser.ReceiverContext ctx) {
        // todo infer class
        return super.visitReceiver(ctx);
    }

    @Override
    public CGBuilder visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx) {
        return super.visitMessageSelector(ctx);
    }


    @Override
    protected CGBuilder aggregateResult(CGBuilder aggregate, CGBuilder nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }
}
