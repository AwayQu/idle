/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tsp.feature.dependency.visitor.DirectiveImportDependencyVisitor;
import tsp.feature.dependency.visitor.PureCodeImportDependencyVisitor;
import tsp.gen.ObjectiveCLexer;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCPreprocessorLexer;
import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.visitor.ObjectiveCPreprocessor;

public class ImportDependencyTest {

    @Test
    public void testDirectiveImportDependency() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "#import \"FooObject.h\"\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream preInputStream = new ANTLRInputStream(emptyClassString);
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(preInputStream);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();


        DirectiveImportDependencyVisitor visitor = new DirectiveImportDependencyVisitor();

        visitor.visit(preParseTree);

    }


    @Test
    public void testPureImportDependency() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "#import \"FooObject.h\"\n" +
                "@import UIKit;\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream preInputStream = new ANTLRInputStream(emptyClassString);
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
    }
}
