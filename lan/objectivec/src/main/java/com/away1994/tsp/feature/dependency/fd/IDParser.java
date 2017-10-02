package com.away1994.tsp.feature.dependency.fd;

import com.away1994.tsp.feature.dependency.fd.visitor.DirectiveImportDependencyVisitor;
import com.away1994.tsp.feature.dependency.fd.visitor.PureCodeImportDependencyVisitor;
import com.away1994.tsp.g4.ObjcG4Util;
import com.away1994.tsp.gen.ObjectiveCPreprocessorParser;
import com.away1994.tsp.visitor.ObjectiveCPreprocessor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 导入依赖parser
 */
public class IDParser {
    public static ImportDependency.FileNode parseFile(File file) throws IOException {
        assert file.isFile();
        FileInputStream fis = new FileInputStream(file);

        ImportDependency.FileNode node = IDParser.parseOneFile(fis);
        if (node != null) {
            node.setFileName(file.getName());
        }
        return node;

    }

    private static ImportDependency.FileNode parseOneFile(FileInputStream fis) throws IOException {
        ANTLRInputStream preInputStream = new ANTLRInputStream(fis);

        ObjcG4Util.PreprocessorParser preprocessorParser = new ObjcG4Util.PreprocessorParser(preInputStream).invoke();
        ObjectiveCPreprocessor preprocessor = preprocessorParser.getPreprocessor();
        ObjectiveCPreprocessorParser.ObjectiveCDocumentContext preParseTree = preprocessorParser.getPreParseTree();


        DirectiveImportDependencyVisitor visitor = new DirectiveImportDependencyVisitor();
        ImportDependency.FileNode node0 = visitor.visit(preParseTree);


        String removedSourceString = preprocessor.visit(preParseTree);
//        System.out.println(preParseTree.toStringTree(preParser));

        // =======================================


        ParseTree parseTree = ObjcG4Util.getPureParseTree(removedSourceString);

        PureCodeImportDependencyVisitor visitor1 = new PureCodeImportDependencyVisitor();

        ImportDependency.FileNode node = visitor1.visit(parseTree);
        if (node != null) {
            node0.getDependencyFiles().addAll(node.getDependencyFiles());
        }
        return node0;
    }
}
