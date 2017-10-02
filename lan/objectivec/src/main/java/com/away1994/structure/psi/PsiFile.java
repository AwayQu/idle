package com.away1994.structure.psi;

import com.away1994.structure.lang.FileASTNode;

public interface PsiFile {

    String getContainingDirectory();

    FileASTNode getNode();
}
