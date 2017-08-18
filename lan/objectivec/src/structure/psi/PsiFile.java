package structure.psi;

import structure.lang.FileASTNode;

public interface PsiFile {

    String getContainingDirectory();

    FileASTNode getNode();
}
