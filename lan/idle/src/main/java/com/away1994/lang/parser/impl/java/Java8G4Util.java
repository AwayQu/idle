package com.away1994.lang.parser.impl.java;

import com.away1994.gen.java8.Java8Lexer;
import com.away1994.gen.java8.Java8Parser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;

public class Java8G4Util {

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

    @Nullable
    public static ParseTree getParseTree(CharStream cs) {

        Java8Lexer lexer = new Java8Lexer(cs);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);


        Java8Parser java8Parser = new Java8Parser(tokenStream);
        /// error log handler remove
        java8Parser.removeErrorListeners();
        return java8Parser.compilationUnit();
    }
}
