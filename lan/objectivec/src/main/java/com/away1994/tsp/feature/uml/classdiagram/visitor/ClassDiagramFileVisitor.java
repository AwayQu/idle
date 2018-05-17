package com.away1994.tsp.feature.uml.classdiagram.visitor;

import com.away1994.tsp.basic.file.AbstractFileVisitor;
import com.away1994.tsp.basic.file.DirectoryNode;
import com.away1994.tsp.basic.file.FileNode;
import com.away1994.structure.lang.parser.impl.objectivec.ObjcG4Util;
import com.away1994.tsp.language.Language;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class ClassDiagramFileVisitor extends AbstractFileVisitor<String> {

    private AbstractParseTreeVisitor fileVisitor;
    private Language language;

    public ClassDiagramFileVisitor(AbstractParseTreeVisitor fileVisitor, Language language) {
        this.fileVisitor = fileVisitor;
        this.language = language;
    }

    @Override
    public String visitFileNode(FileNode node) {

        String path = node.getPath();
        if (language.fileExtensions.contains(node.getExtension())) {
            ParseTree parseTree = ObjcG4Util.getParseTree(path);
            assert parseTree != null;
            fileVisitor.visit(parseTree);
        }
        return super.visitFileNode(node);
    }

    @Override
    public String visitDirectoryNode(DirectoryNode node) {
        if (language.ignores.contains(node.getName())) {
            return null;
        }
        return super.visitDirectoryNode(node);
    }

}
