package com.away1994.dist.feature.callgraph;

import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCParserBaseVisitor;

public class TestIntanceCallVisitor extends ObjectiveCParserBaseVisitor {

    @Override
    public Object visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {

        System.out.print(ctx.getText());
        return super.visitMethodSelector(ctx);
    }
}
