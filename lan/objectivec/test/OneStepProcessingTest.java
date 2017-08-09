import gen.onestepprocessing.ObjectiveCLexer;
import gen.onestepprocessing.ObjectiveCParser;
import gen.onestepprocessing.ObjectiveCPreprocessorParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

/**
 * Created by away on 10/08/2017.
 */

public class OneStepProcessingTest {


    @Test
    public void testOSPEmptyClassImpl() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream inputStream = new ANTLRInputStream(emptyClassString);

        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ObjectiveCParser parser = new ObjectiveCParser(tokens);

        ParseTree tree = parser.importDeclaration();

        System.out.println(tree.toStringTree(parser));

        System.out.println(tree.toStringTree());


    }
}
