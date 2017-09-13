package tsp.feature.callgraph.visitor;

import tsp.feature.callgraph.builder.CGBuilder;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

public class CallVisitor extends ObjectiveCParserBaseVisitor<CGBuilder> {


    public CallVisitor() {
    }

    @Override
    public CGBuilder visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx) {
        System.out.print(ctx);
        return super.visitMessageExpression(ctx);
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
    public CGBuilder visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx) {
        return super.visitMessageSelector(ctx);
    }
}
