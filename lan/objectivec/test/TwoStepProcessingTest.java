/**
 * Created by away on 13/08/2017.
 */

import com.sun.corba.se.impl.orb.ParserTable;
import gen.twostepprocessing.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

/**
 1. Preprocessor lexer (ObjectiveCPreprocessorLexer.g4).
 2. Preprocessor parser (ObjectiveCPreprocessorLexer.g4).
 3. Visitor class for removing preprocessor directives from code (ObjectiveCPreprocessor.java).
 4. Lexer (ObjectiveCLexer.g4).
 5. Parser (ObjectiveCParser.g4).
 */
public class TwoStepProcessingTest {

    @Test
    public void testTwoStepProcessing() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "#import \"FooObject.h\"\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream inputStream = new ANTLRInputStream(emptyClassString);
        ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(inputStream);

        CommonTokenStream preToken = new CommonTokenStream(preLexer);

        ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preParser.objectiveCDocument();

        System.out.println(preParseTree.toStringTree(preParser));

        ObjectiveCPreprocessor preprocessor = new ObjectiveCPreprocessor(preToken);
//        Object ult = preprocessor.visitObjectiveCDocument(preParseTree);

        Object res = preprocessor.visit(preParseTree);
        System.out.println(preParseTree.toStringTree(preParser));

        // =======================================

        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream token = new CommonTokenStream(lexer);

        ObjectiveCParser parser = new ObjectiveCParser(token);

        ParseTree parseTree = parser.translationUnit();

        System.out.println(parseTree.toStringTree(parser));
    }
}
