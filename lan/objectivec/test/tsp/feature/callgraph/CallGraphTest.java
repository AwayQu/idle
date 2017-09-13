package tsp.feature.callgraph;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import tsp.feature.callgraph.node.CallGraph;
import tsp.feature.callgraph.visitor.CallVisitor;
import tsp.feature.dependency.ImportDependency;
import tsp.feature.dependency.visitor.DirectiveImportDependencyVisitor;
import tsp.feature.dependency.visitor.PureCodeImportDependencyVisitor;
import tsp.gen.ObjectiveCLexer;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCPreprocessorLexer;
import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.visitor.ObjectiveCPreprocessor;

import java.io.IOException;

public class CallGraphTest {

    @Test
    public void testVisitor() throws IOException {
        ANTLRFileStream fs = new ANTLRFileStream("./test/res/Hello.m");
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(fs);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();


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

        TestCallVisitor visitor = new TestCallVisitor();
        visitor.visit(parseTree);

    }


    @Test
    public void instanceCallTest() throws Exception {
        ANTLRFileStream fs = new ANTLRFileStream("./test/res/InstanceCallTest.m");
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(fs);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();


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

//        TestCallVisitor visitor = new TestCallVisitor();
        TestIntanceCallVisitor visitor = new TestIntanceCallVisitor();
        visitor.visit(parseTree);
    }


    @Test
    public void graphCallTest() throws Exception {
        ANTLRFileStream fs = new ANTLRFileStream("./test/res/InstanceCallTest.m");
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(fs);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();


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

        CallGraph graph = new CallGraph();
        CallVisitor visitor = new CallVisitor(graph);
        visitor.visit(parseTree);
        System.out.println(graph);
        System.out.println("finish");
    }
}
