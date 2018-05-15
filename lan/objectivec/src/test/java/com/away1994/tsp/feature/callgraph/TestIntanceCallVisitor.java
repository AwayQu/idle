package com.away1994.tsp.feature.callgraph;

import com.away1994.tsp.gen.objectivec.ObjectiveCParser;
import com.away1994.tsp.gen.objectivec.ObjectiveCParserBaseVisitor;

public class TestIntanceCallVisitor extends ObjectiveCParserBaseVisitor {

    @Override
    public Object visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {

        System.out.print(ctx.getText());
        return super.visitMethodSelector(ctx);
    }
}
