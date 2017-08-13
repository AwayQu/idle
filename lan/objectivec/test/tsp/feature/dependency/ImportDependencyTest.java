/**
 * Created by away on 13/08/2017.
 */
package tsp.feature.dependency;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;
import tsp.feature.dependency.visitor.DirectiveImportDependencyVisitor;
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
}
