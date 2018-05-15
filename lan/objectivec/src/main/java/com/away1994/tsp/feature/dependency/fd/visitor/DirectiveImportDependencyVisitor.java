/**
 * Created by away on 13/08/2017.
 */
package com.away1994.tsp.feature.dependency.fd.visitor;

import com.away1994.tsp.feature.dependency.fd.ImportDependency;
import com.away1994.tsp.gen.objectivec.ObjectiveCPreprocessorParser;
import com.away1994.tsp.gen.objectivec.ObjectiveCPreprocessorParserBaseVisitor;

public class DirectiveImportDependencyVisitor extends ObjectiveCPreprocessorParserBaseVisitor<ImportDependency.FileNode> {
    @Override
    public ImportDependency.FileNode visitPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx) {
//        System.out.println(ctx.getChild(1).getText());
        String importName = ctx.getChild(1).getText().replace('\"', ' ');
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
