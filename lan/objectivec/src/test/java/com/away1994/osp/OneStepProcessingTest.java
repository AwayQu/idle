package com.away1994.osp;

import com.away1994.gen.objectivec.ObjectiveCLexer;
import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCPreprocessorParser;
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


    @Test
    public void testOSPTranslateUnit() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "#import \"FooObject.h\"\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream inputStream = new ANTLRInputStream(emptyClassString);

        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

//        ObjectiveCPreprocessorParser preparser = new ObjectiveCPreprocessorParser(tokens);
////
//        ParseTree pretree = preparser.directive();
//
//        System.out.println(pretree.toStringTree(preparser));

        ObjectiveCParser parser = new ObjectiveCParser(tokens);


        ParseTree tree = parser.translationUnit();

        System.out.println(tree.toStringTree(parser));


    }


    @Test
    public void testOSPDirect() {
        String emptyClassString = "#import \"TestObject.h\"\n" +
                "#import \"FooObject.h\"\n" +
                "\n" +
                "@implementation TestObject {\n" +
                "\n" +
                "}\n" +
                "@end";

        ANTLRInputStream inputStream = new ANTLRInputStream(emptyClassString);

        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ObjectiveCPreprocessorParser preparser = new ObjectiveCPreprocessorParser(tokens);
//
        ParseTree pretree = preparser.directive();

        System.out.println(pretree.toStringTree(preparser));

//        ObjectiveCParser parser = new ObjectiveCParser(preparser.getTokenStream());


//        ParseTree tree = parser.translationUnit();

//        System.out.println(tree.toStringTree(parser));


    }

}
