/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency.fd.visitor;

import tsp.feature.dependency.fd.ImportDependency;
import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.gen.ObjectiveCPreprocessorParserBaseVisitor;

public class DirectiveImportDependencyVisitor extends ObjectiveCPreprocessorParserBaseVisitor<ImportDependency.FileNode> {
    @Override
    public ImportDependency.FileNode visitPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx) {
//        System.out.println(ctx.getChild(1).getText());
        String importName = ctx.getChild(1).getText();
        return new ImportDependency.FileNode(importName);
    }

    @Override
    protected ImportDependency.FileNode aggregateResult(ImportDependency.FileNode aggregate, ImportDependency.FileNode nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        aggregate.getDependencyFiles().addAll(nextResult.getDependencyFiles());
        return aggregate;
    }
}
