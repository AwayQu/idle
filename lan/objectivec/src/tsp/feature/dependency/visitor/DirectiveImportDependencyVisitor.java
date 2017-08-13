/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency.visitor;

import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.gen.ObjectiveCPreprocessorParserBaseVisitor;

public class DirectiveImportDependencyVisitor extends ObjectiveCPreprocessorParserBaseVisitor {
    @Override
    public Object visitPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx) {
        System.out.println(ctx.getChild(1).getText());
        return super.visitPreprocessorImport(ctx);
    }
}
