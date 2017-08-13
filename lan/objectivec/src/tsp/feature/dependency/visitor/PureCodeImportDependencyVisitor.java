/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency.visitor;

import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;
import tsp.gen.ObjectiveCParserVisitor;

public class PureCodeImportDependencyVisitor extends ObjectiveCParserBaseVisitor {

    @Override
    public Object visitImportDeclaration(ObjectiveCParser.ImportDeclarationContext ctx) {
        System.out.println(ctx.getChild(1).getText());
        return super.visitImportDeclaration(ctx);
    }
}
