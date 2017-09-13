package tsp.feature.callgraph;

import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

public class TestIntanceCallVisitor extends ObjectiveCParserBaseVisitor {

    @Override
    public Object visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {

        System.out.print(ctx.getText());
        return super.visitMethodSelector(ctx);
    }
}
