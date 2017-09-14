package tsp.feature.dependency.fd;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tsp.feature.dependency.fd.visitor.DirectiveImportDependencyVisitor;
import tsp.feature.dependency.fd.visitor.PureCodeImportDependencyVisitor;
import tsp.gen.ObjectiveCLexer;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCPreprocessorLexer;
import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.visitor.ObjectiveCPreprocessor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 导入依赖parser
 */
public class IDParser {
    static ImportDependency.FileNode parseFile(File file) throws IOException {
        assert file.isFile();
        FileInputStream fis = new FileInputStream(file);

        ImportDependency.FileNode node = IDParser.parseOneFile(fis);
        if (node != null) {
            node.setFileName(file.getName());
        }
        return node;

    }

    private static ImportDependency.FileNode parseOneFile(FileInputStream fis) throws IOException {
        ANTLRInputStream preInputStream = new ANTLRInputStream(fis);
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(preInputStream);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();


        DirectiveImportDependencyVisitor visitor = new DirectiveImportDependencyVisitor();

        ImportDependency.FileNode node0 = visitor.visit(preParseTree);


        ObjectiveCPreprocessor preprocessor = new ObjectiveCPreprocessor(preToken);

        String removedSourceString = preprocessor.visit(preParseTree);
//        System.out.println(preParseTree.toStringTree(preParser));

        // =======================================

        ANTLRInputStream inputStream = new ANTLRInputStream(removedSourceString);
        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream token = new CommonTokenStream(lexer);

        ObjectiveCParser parser = new ObjectiveCParser(token);

        ParseTree parseTree = parser.translationUnit();

//        System.out.println(parseTree.toStringTree(parser));

        PureCodeImportDependencyVisitor visitor1 = new PureCodeImportDependencyVisitor();

        ImportDependency.FileNode node = visitor1.visit(parseTree);
        if (node != null) {
            node0.getDependencyFiles().addAll(node.getDependencyFiles());
        }
        return node0;
    }
}
