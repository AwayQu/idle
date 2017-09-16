import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

/**
 * Created by away on 13/08/2017.
 */

public class CalcTest {
    @Test
    public void testCalc() {
        ANTLRInputStream inputStream = new ANTLRInputStream("a=5\n" +
                "b=6\n" +
                "a+b*2\n" +
                "(1+2)*3\n");
        LabeledExprLexer lexer = new LabeledExprLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LabeledExprParser parser = new LabeledExprParser(tokens);
        ParseTree tree = parser.prog(); // parse

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
