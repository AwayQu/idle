package tsp.g4;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tsp.gen.ObjectiveCLexer;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCPreprocessorLexer;
import tsp.gen.ObjectiveCPreprocessorParser;
import tsp.visitor.ObjectiveCPreprocessor;

import java.io.IOException;

public class ObjcG4Util {

    @Nullable
    public static ParseTree getParseTree(@NotNull String filePath) {
        ANTLRFileStream fs = null;
        try {
            fs = new ANTLRFileStream(filePath);
        } catch (IOException e) {
            return null;
        }
        return getParseTree(fs);

    }

    /**
     *
     * @param codeString string of code
     * @return Parse Tree
     */
    public static ParseTree getCodeParseTree(@NotNull String codeString) {
        ANTLRInputStream preInputStream = new ANTLRInputStream(codeString);
        return getParseTree(preInputStream);
    }

    @Nullable
    public static ParseTree getParseTree(CharStream cs) {
        //region pre parser
        PreprocessorParser preprocessorParser = new PreprocessorParser(cs).invoke();
        ObjectiveCPreprocessor preprocessor = preprocessorParser.getPreprocessor();
        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preprocessorParser.getPreParseTree();

        String codeString = preprocessor.visit(preParseTree);
        //endregion


        //region parser
        return getPureParseTree(codeString);
        //endregion
    }

    public static ParseTree getPreParseTree(CharStream cs) {
        PreprocessorParser preprocessorParser = new PreprocessorParser(cs).invoke();
        return preprocessorParser.getPreParseTree();
    }

    public static ParseTree getPureParseTree(String codeString) {
        ANTLRInputStream inputStream = new ANTLRInputStream(codeString);
        ObjectiveCLexer lexer = new ObjectiveCLexer(inputStream);

        CommonTokenStream token = new CommonTokenStream(lexer);

        ObjectiveCParser parser = new ObjectiveCParser(token);

        return parser.translationUnit();
    }

    public static class PreprocessorParser {
        private CharStream cs;
        private ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree;
        private ObjectiveCPreprocessor preprocessor;

        public PreprocessorParser(CharStream cs) {
            this.cs = cs;
        }

        public ObjectiveCPreprocessorParser.ObjectiveCDocumentContext getPreParseTree() {
            return preParseTree;
        }

        public ObjectiveCPreprocessor getPreprocessor() {
            return preprocessor;
        }

        public PreprocessorParser invoke() {
            ObjectiveCPreprocessorLexer preLexer = new ObjectiveCPreprocessorLexer(cs);

            CommonTokenStream preToken = new CommonTokenStream(preLexer);

            ObjectiveCPreprocessorParser preParser = new ObjectiveCPreprocessorParser(preToken);

            preParseTree = preParser.objectiveCDocument();


            preprocessor = new ObjectiveCPreprocessor(preToken);
            return this;
        }
    }
}
