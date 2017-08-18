package structure.lang;

import com.sun.istack.internal.Nullable;
import structure.tree.IElementType;

public interface ASTNode {

    IElementType getElementType();

    String getText();

    int getStartOffset();

    int getTextLength();


    ASTNode getTreeParent();

    ASTNode getFirstChildNode();

    ASTNode getLastChildNode();

    ASTNode getTreeNext();

    ASTNode getTreePrev();

    void addChild(ASTNode child);

    void addChild(ASTNode child, ASTNode anchorBefore);

    void addLeaf(IElementType leafType, CharSequence leafText, ASTNode anchorBefore);

    void removeChild(ASTNode child);

    void removeRange(ASTNode firstNodeToRemove, ASTNode firstNodeToKeep);

    void replaceChild(ASTNode oldChild, ASTNode newChild);

}
