package com.away1994.lang.parser.impl.objectivec;

import com.away1994.gen.objectivec.ObjectiveCLexer;
import com.away1994.gen.objectivec.ObjectiveCParser;
import com.away1994.gen.objectivec.ObjectiveCPreprocessorLexer;
import com.away1994.gen.objectivec.ObjectiveCPreprocessorParser;
import com.away1994.dist.visitor.ObjectiveCPreprocessor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;

public class ObjcG4Util {

    @Nullable
    public static ParseTree getParseTree(@Nonnull String filePath) {
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
    public static ParseTree getCodeParseTree(@Nonnull String codeString) {
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
        /// remove error log handler
        parser.removeErrorListeners();

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
            /// remove error log handler
            preParser.removeErrorListeners();
            preParseTree = preParser.objectiveCDocument();


            preprocessor = new ObjectiveCPreprocessor(preToken);
            return this;
        }
    }
}
