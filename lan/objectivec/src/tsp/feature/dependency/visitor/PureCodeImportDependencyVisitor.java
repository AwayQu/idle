/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency.visitor;

import tsp.feature.dependency.ImportDependency;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;
import tsp.gen.ObjectiveCParserVisitor;

import java.util.ArrayList;

public class PureCodeImportDependencyVisitor extends ObjectiveCParserBaseVisitor<ImportDependency.FileNode> {

    @Override
    public ImportDependency.FileNode visitImportDeclaration(ObjectiveCParser.ImportDeclarationContext ctx) {
        System.out.println(ctx.getChild(1).getText());
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
