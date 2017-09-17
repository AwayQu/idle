package tsp.visitor;

import org.antlr.v4.runtime.ParserRuleContext;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

public class TestObjcBaseVisitor extends ObjectiveCParserBaseVisitor<String> {

    private String getMethodName() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement e = stacktrace[2];
        String methodName = e.getMethodName();
        return methodName;
    }

    public void printCTXText(ParserRuleContext ctx, String methodName) {
        System.out.println("===================================");
        System.out.println("methodName:" + methodName);
        System.out.println("text:" + ctx.getText());
        System.out.println("===================================");
    }

    @Override
    public String visitTranslationUnit(ObjectiveCParser.TranslationUnitContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTranslationUnit(ctx);
    }

    @Override
    public String visitExternalDeclaration(ObjectiveCParser.ExternalDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitExternalDeclaration(ctx);
    }

    @Override
    public String visitImportDeclaration(ObjectiveCParser.ImportDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitImportDeclaration(ctx);
    }

    @Override
    public String visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassInterface(ctx);
    }

    @Override
    public String visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCategoryInterface(ctx);
    }

    @Override
    public String visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassImplementation(ctx);
    }

    @Override
    public String visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCategoryImplementation(ctx);
    }

    @Override
    public String visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolDeclaration(ctx);
    }

    @Override
    public String visitProtocolDeclarationList(ObjectiveCParser.ProtocolDeclarationListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolDeclarationList(ctx);
    }

    @Override
    public String visitClassDeclarationList(ObjectiveCParser.ClassDeclarationListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassDeclarationList(ctx);
    }

    @Override
    public String visitClassList(ObjectiveCParser.ClassListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassList(ctx);
    }

    @Override
    public String visitProtocolReferenceList(ObjectiveCParser.ProtocolReferenceListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolReferenceList(ctx);
    }

    @Override
    public String visitProtocolList(ObjectiveCParser.ProtocolListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolList(ctx);
    }

    @Override
    public String visitPropertyDeclaration(ObjectiveCParser.PropertyDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertyDeclaration(ctx);
    }

    @Override
    public String visitPropertyAttributesList(ObjectiveCParser.PropertyAttributesListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertyAttributesList(ctx);
    }

    @Override
    public String visitPropertyAttribute(ObjectiveCParser.PropertyAttributeContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertyAttribute(ctx);
    }

    @Override
    public String visitClassName(ObjectiveCParser.ClassNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassName(ctx);
    }

    @Override
    public String visitSuperclassName(ObjectiveCParser.SuperclassNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSuperclassName(ctx);
    }

    @Override
    public String visitCategoryName(ObjectiveCParser.CategoryNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCategoryName(ctx);
    }

    @Override
    public String visitProtocolName(ObjectiveCParser.ProtocolNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolName(ctx);
    }

    @Override
    public String visitInstanceVariables(ObjectiveCParser.InstanceVariablesContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInstanceVariables(ctx);
    }

    @Override
    public String visitVisibilitySpecification(ObjectiveCParser.VisibilitySpecificationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitVisibilitySpecification(ctx);
    }

    @Override
    public String visitInterfaceDeclarationList(ObjectiveCParser.InterfaceDeclarationListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInterfaceDeclarationList(ctx);
    }

    @Override
    public String visitClassMethodDeclaration(ObjectiveCParser.ClassMethodDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassMethodDeclaration(ctx);
    }

    @Override
    public String visitInstanceMethodDeclaration(ObjectiveCParser.InstanceMethodDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInstanceMethodDeclaration(ctx);
    }

    @Override
    public String visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMethodDeclaration(ctx);
    }

    @Override
    public String visitImplementationDefinitionList(ObjectiveCParser.ImplementationDefinitionListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitImplementationDefinitionList(ctx);
    }

    @Override
    public String visitClassMethodDefinition(ObjectiveCParser.ClassMethodDefinitionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassMethodDefinition(ctx);
    }

    @Override
    public String visitInstanceMethodDefinition(ObjectiveCParser.InstanceMethodDefinitionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInstanceMethodDefinition(ctx);
    }

    @Override
    public String visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMethodDefinition(ctx);
    }

    @Override
    public String visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMethodSelector(ctx);
    }

    @Override
    public String visitKeywordDeclarator(ObjectiveCParser.KeywordDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitKeywordDeclarator(ctx);
    }

    @Override
    public String visitSelector(ObjectiveCParser.SelectorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSelector(ctx);
    }

    @Override
    public String visitMethodType(ObjectiveCParser.MethodTypeContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMethodType(ctx);
    }

    @Override
    public String visitPropertyImplementation(ObjectiveCParser.PropertyImplementationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertyImplementation(ctx);
    }

    @Override
    public String visitPropertySynthesizeList(ObjectiveCParser.PropertySynthesizeListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertySynthesizeList(ctx);
    }

    @Override
    public String visitPropertySynthesizeItem(ObjectiveCParser.PropertySynthesizeItemContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertySynthesizeItem(ctx);
    }

    @Override
    public String visitBlockType(ObjectiveCParser.BlockTypeContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitBlockType(ctx);
    }

    @Override
    public String visitGenericsSpecifier(ObjectiveCParser.GenericsSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitGenericsSpecifier(ctx);
    }

    @Override
    public String visitProtocolQualifier(ObjectiveCParser.ProtocolQualifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolQualifier(ctx);
    }

    @Override
    public String visitDictionaryExpression(ObjectiveCParser.DictionaryExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDictionaryExpression(ctx);
    }

    @Override
    public String visitDictionaryPair(ObjectiveCParser.DictionaryPairContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDictionaryPair(ctx);
    }

    @Override
    public String visitArrayExpression(ObjectiveCParser.ArrayExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitArrayExpression(ctx);
    }

    @Override
    public String visitBoxExpression(ObjectiveCParser.BoxExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitBoxExpression(ctx);
    }

    @Override
    public String visitBlockParameters(ObjectiveCParser.BlockParametersContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitBlockParameters(ctx);
    }

    @Override
    public String visitBlockExpression(ObjectiveCParser.BlockExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitBlockExpression(ctx);
    }

    @Override
    public String visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMessageExpression(ctx);
    }

    @Override
    public String visitReceiver(ObjectiveCParser.ReceiverContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitReceiver(ctx);
    }

    @Override
    public String visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMessageSelector(ctx);
    }

    @Override
    public String visitKeywordArgument(ObjectiveCParser.KeywordArgumentContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitKeywordArgument(ctx);
    }

    @Override
    public String visitSelectorExpression(ObjectiveCParser.SelectorExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSelectorExpression(ctx);
    }

    @Override
    public String visitSelectorName(ObjectiveCParser.SelectorNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSelectorName(ctx);
    }

    @Override
    public String visitProtocolExpression(ObjectiveCParser.ProtocolExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitProtocolExpression(ctx);
    }

    @Override
    public String visitEncodeExpression(ObjectiveCParser.EncodeExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEncodeExpression(ctx);
    }

    @Override
    public String visitTypeVariableDeclarator(ObjectiveCParser.TypeVariableDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTypeVariableDeclarator(ctx);
    }

    @Override
    public String visitThrowStatement(ObjectiveCParser.ThrowStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitThrowStatement(ctx);
    }

    @Override
    public String visitTryBlock(ObjectiveCParser.TryBlockContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTryBlock(ctx);
    }

    @Override
    public String visitCatchStatement(ObjectiveCParser.CatchStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCatchStatement(ctx);
    }

    @Override
    public String visitSynchronizedStatement(ObjectiveCParser.SynchronizedStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSynchronizedStatement(ctx);
    }

    @Override
    public String visitAutoreleaseStatement(ObjectiveCParser.AutoreleaseStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAutoreleaseStatement(ctx);
    }

    @Override
    public String visitFunctionDefinition(ObjectiveCParser.FunctionDefinitionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitFunctionDefinition(ctx);
    }

    @Override
    public String visitAttributeSpecifier(ObjectiveCParser.AttributeSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeSpecifier(ctx);
    }

    @Override
    public String visitAttribute(ObjectiveCParser.AttributeContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttribute(ctx);
    }

    @Override
    public String visitAttributeName(ObjectiveCParser.AttributeNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeName(ctx);
    }

    @Override
    public String visitAttributeParameters(ObjectiveCParser.AttributeParametersContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeParameters(ctx);
    }

    @Override
    public String visitAttributeParameterList(ObjectiveCParser.AttributeParameterListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeParameterList(ctx);
    }

    @Override
    public String visitAttributeParameter(ObjectiveCParser.AttributeParameterContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeParameter(ctx);
    }

    @Override
    public String visitAttributeParameterAssignment(ObjectiveCParser.AttributeParameterAssignmentContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAttributeParameterAssignment(ctx);
    }

    @Override
    public String visitDeclaration(ObjectiveCParser.DeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDeclaration(ctx);
    }

    @Override
    public String visitFunctionCallDeclaration(ObjectiveCParser.FunctionCallDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitFunctionCallDeclaration(ctx);
    }

    @Override
    public String visitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEnumDeclaration(ctx);
    }

    @Override
    public String visitVarDeclaration(ObjectiveCParser.VarDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitVarDeclaration(ctx);
    }

    @Override
    public String visitDeclarationSpecifiers(ObjectiveCParser.DeclarationSpecifiersContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDeclarationSpecifiers(ctx);
    }

    @Override
    public String visitIbOutletSpecifier(ObjectiveCParser.IbOutletSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitIbOutletSpecifier(ctx);
    }

    @Override
    public String visitInitDeclaratorList(ObjectiveCParser.InitDeclaratorListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInitDeclaratorList(ctx);
    }

    @Override
    public String visitInitDeclarator(ObjectiveCParser.InitDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInitDeclarator(ctx);
    }

    @Override
    public String visitStructOrUnionSpecifier(ObjectiveCParser.StructOrUnionSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStructOrUnionSpecifier(ctx);
    }

    @Override
    public String visitStructDeclaration(ObjectiveCParser.StructDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStructDeclaration(ctx);
    }

    @Override
    public String visitSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSpecifierQualifierList(ctx);
    }

    @Override
    public String visitArcBehaviourSpecifier(ObjectiveCParser.ArcBehaviourSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitArcBehaviourSpecifier(ctx);
    }

    @Override
    public String visitNullabilitySpecifier(ObjectiveCParser.NullabilitySpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitNullabilitySpecifier(ctx);
    }

    @Override
    public String visitStorageClassSpecifier(ObjectiveCParser.StorageClassSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStorageClassSpecifier(ctx);
    }

    @Override
    public String visitTypeSpecifier(ObjectiveCParser.TypeSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTypeSpecifier(ctx);
    }

    @Override
    public String visitTypeQualifier(ObjectiveCParser.TypeQualifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTypeQualifier(ctx);
    }

    @Override
    public String visitTypeofExpression(ObjectiveCParser.TypeofExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTypeofExpression(ctx);
    }

    @Override
    public String visitClassNameGeneric(ObjectiveCParser.ClassNameGenericContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitClassNameGeneric(ctx);
    }

    @Override
    public String visitStructDeclaratorList(ObjectiveCParser.StructDeclaratorListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStructDeclaratorList(ctx);
    }

    @Override
    public String visitStructDeclarator(ObjectiveCParser.StructDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStructDeclarator(ctx);
    }

    @Override
    public String visitEnumSpecifier(ObjectiveCParser.EnumSpecifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEnumSpecifier(ctx);
    }

    @Override
    public String visitEnumeratorList(ObjectiveCParser.EnumeratorListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEnumeratorList(ctx);
    }

    @Override
    public String visitEnumerator(ObjectiveCParser.EnumeratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEnumerator(ctx);
    }

    @Override
    public String visitEnumeratorIdentifier(ObjectiveCParser.EnumeratorIdentifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitEnumeratorIdentifier(ctx);
    }

    @Override
    public String visitDirectDeclarator(ObjectiveCParser.DirectDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDirectDeclarator(ctx);
    }

    @Override
    public String visitDeclaratorSuffix(ObjectiveCParser.DeclaratorSuffixContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDeclaratorSuffix(ctx);
    }

    @Override
    public String visitParameterList(ObjectiveCParser.ParameterListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitParameterList(ctx);
    }

    @Override
    public String visitPointer(ObjectiveCParser.PointerContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPointer(ctx);
    }

    @Override
    public String visitMacros(ObjectiveCParser.MacrosContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitMacros(ctx);
    }

    @Override
    public String visitInitializer(ObjectiveCParser.InitializerContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInitializer(ctx);
    }

    @Override
    public String visitArrayInitializer(ObjectiveCParser.ArrayInitializerContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public String visitStructInitializer(ObjectiveCParser.StructInitializerContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStructInitializer(ctx);
    }

    @Override
    public String visitInitializerList(ObjectiveCParser.InitializerListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitInitializerList(ctx);
    }

    @Override
    public String visitTypeName(ObjectiveCParser.TypeNameContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitTypeName(ctx);
    }

    @Override
    public String visitAbstractDeclarator(ObjectiveCParser.AbstractDeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAbstractDeclarator(ctx);
    }

    @Override
    public String visitAbstractDeclaratorSuffix(ObjectiveCParser.AbstractDeclaratorSuffixContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAbstractDeclaratorSuffix(ctx);
    }

    @Override
    public String visitParameterDeclarationList(ObjectiveCParser.ParameterDeclarationListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitParameterDeclarationList(ctx);
    }

    @Override
    public String visitParameterDeclaration(ObjectiveCParser.ParameterDeclarationContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitParameterDeclaration(ctx);
    }

    @Override
    public String visitDeclarator(ObjectiveCParser.DeclaratorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDeclarator(ctx);
    }

    @Override
    public String visitStatement(ObjectiveCParser.StatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStatement(ctx);
    }

    @Override
    public String visitLabeledStatement(ObjectiveCParser.LabeledStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitLabeledStatement(ctx);
    }

    @Override
    public String visitRangeExpression(ObjectiveCParser.RangeExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitRangeExpression(ctx);
    }

    @Override
    public String visitCompoundStatement(ObjectiveCParser.CompoundStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCompoundStatement(ctx);
    }

    @Override
    public String visitSelectionStatement(ObjectiveCParser.SelectionStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSelectionStatement(ctx);
    }

    @Override
    public String visitSwitchStatement(ObjectiveCParser.SwitchStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSwitchStatement(ctx);
    }

    @Override
    public String visitSwitchBlock(ObjectiveCParser.SwitchBlockContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSwitchBlock(ctx);
    }

    @Override
    public String visitSwitchSection(ObjectiveCParser.SwitchSectionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSwitchSection(ctx);
    }

    @Override
    public String visitSwitchLabel(ObjectiveCParser.SwitchLabelContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public String visitForLoopInitializer(ObjectiveCParser.ForLoopInitializerContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitForLoopInitializer(ctx);
    }

    @Override
    public String visitIterationStatement(ObjectiveCParser.IterationStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitIterationStatement(ctx);
    }

    @Override
    public String visitWhileStatement(ObjectiveCParser.WhileStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitWhileStatement(ctx);
    }

    @Override
    public String visitDoStatement(ObjectiveCParser.DoStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitDoStatement(ctx);
    }

    @Override
    public String visitForStatement(ObjectiveCParser.ForStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitForStatement(ctx);
    }

    @Override
    public String visitForInStatement(ObjectiveCParser.ForInStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitForInStatement(ctx);
    }

    @Override
    public String visitJumpStatement(ObjectiveCParser.JumpStatementContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitJumpStatement(ctx);
    }

    @Override
    public String visitExpression(ObjectiveCParser.ExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitExpression(ctx);
    }

    @Override
    public String visitAssignmentExpression(ObjectiveCParser.AssignmentExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAssignmentExpression(ctx);
    }

    @Override
    public String visitConditionalExpression(ObjectiveCParser.ConditionalExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitConditionalExpression(ctx);
    }

    @Override
    public String visitBinaryExpression(ObjectiveCParser.BinaryExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitBinaryExpression(ctx);
    }

    @Override
    public String visitCastExpression(ObjectiveCParser.CastExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitCastExpression(ctx);
    }

    @Override
    public String visitAssignmentOperator(ObjectiveCParser.AssignmentOperatorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitAssignmentOperator(ctx);
    }

    @Override
    public String visitConstantExpression(ObjectiveCParser.ConstantExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitConstantExpression(ctx);
    }

    @Override
    public String visitUnaryExpression(ObjectiveCParser.UnaryExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public String visitUnaryOperator(ObjectiveCParser.UnaryOperatorContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitUnaryOperator(ctx);
    }

    @Override
    public String visitIndexerExpression(ObjectiveCParser.IndexerExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitIndexerExpression(ctx);
    }

    @Override
    public String visitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public String visitPrimaryInPostfixExpression(ObjectiveCParser.PrimaryInPostfixExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPrimaryInPostfixExpression(ctx);
    }

    @Override
    public String visitPropertyExpression(ObjectiveCParser.PropertyExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPropertyExpression(ctx);
    }

    @Override
    public String visitIncDecExpression(ObjectiveCParser.IncDecExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitIncDecExpression(ctx);
    }

    @Override
    public String visitArgumentExpressionList(ObjectiveCParser.ArgumentExpressionListContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitArgumentExpressionList(ctx);
    }

    @Override
    public String visitArgumentExpression(ObjectiveCParser.ArgumentExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitArgumentExpression(ctx);
    }

    @Override
    public String visitPrimaryExpression(ObjectiveCParser.PrimaryExpressionContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitPrimaryExpression(ctx);
    }

    @Override
    public String visitConstant(ObjectiveCParser.ConstantContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitConstant(ctx);
    }

    @Override
    public String visitStringLiteral(ObjectiveCParser.StringLiteralContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitStringLiteral(ctx);
    }

    @Override
    public String visitIdentifier(ObjectiveCParser.IdentifierContext ctx) {
        this.printCTXText(ctx, this.getMethodName());
        return super.visitIdentifier(ctx);
    }
}
