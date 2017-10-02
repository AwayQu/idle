package com.away1994.tsp.gen;// Generated from ObjectiveCParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjectiveCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjectiveCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(ObjectiveCParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(ObjectiveCParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ObjectiveCParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#categoryInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImplementation(ObjectiveCParser.ClassImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#categoryImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryImplementation(ObjectiveCParser.CategoryImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclaration(ObjectiveCParser.ProtocolDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolDeclarationList(ObjectiveCParser.ProtocolDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationList(ObjectiveCParser.ClassDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassList(ObjectiveCParser.ClassListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolReferenceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolReferenceList(ObjectiveCParser.ProtocolReferenceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolList(ObjectiveCParser.ProtocolListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ObjectiveCParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertyAttributesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttributesList(ObjectiveCParser.PropertyAttributesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertyAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAttribute(ObjectiveCParser.PropertyAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(ObjectiveCParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#superclassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclassName(ObjectiveCParser.SuperclassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#categoryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategoryName(ObjectiveCParser.CategoryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolName(ObjectiveCParser.ProtocolNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#instanceVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceVariables(ObjectiveCParser.InstanceVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#visibilitySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilitySpecification(ObjectiveCParser.VisibilitySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#interfaceDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationList(ObjectiveCParser.InterfaceDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDeclaration(ObjectiveCParser.ClassMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#instanceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDeclaration(ObjectiveCParser.InstanceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ObjectiveCParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#implementationDefinitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementationDefinitionList(ObjectiveCParser.ImplementationDefinitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethodDefinition(ObjectiveCParser.ClassMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#instanceMethodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceMethodDefinition(ObjectiveCParser.InstanceMethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDefinition(ObjectiveCParser.MethodDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#methodSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodSelector(ObjectiveCParser.MethodSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#keywordDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordDeclarator(ObjectiveCParser.KeywordDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ObjectiveCParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(ObjectiveCParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertyImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyImplementation(ObjectiveCParser.PropertyImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertySynthesizeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeList(ObjectiveCParser.PropertySynthesizeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#propertySynthesizeItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySynthesizeItem(ObjectiveCParser.PropertySynthesizeItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#blockType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockType(ObjectiveCParser.BlockTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#genericsSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericsSpecifier(ObjectiveCParser.GenericsSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolQualifier(ObjectiveCParser.ProtocolQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#dictionaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExpression(ObjectiveCParser.DictionaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#dictionaryPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryPair(ObjectiveCParser.DictionaryPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(ObjectiveCParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#boxExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxExpression(ObjectiveCParser.BoxExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#blockParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockParameters(ObjectiveCParser.BlockParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#blockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpression(ObjectiveCParser.BlockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#messageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageExpression(ObjectiveCParser.MessageExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(ObjectiveCParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#messageSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageSelector(ObjectiveCParser.MessageSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#keywordArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(ObjectiveCParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#selectorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorExpression(ObjectiveCParser.SelectorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#selectorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorName(ObjectiveCParser.SelectorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#protocolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocolExpression(ObjectiveCParser.ProtocolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#encodeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodeExpression(ObjectiveCParser.EncodeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#typeVariableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariableDeclarator(ObjectiveCParser.TypeVariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(ObjectiveCParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#tryBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryBlock(ObjectiveCParser.TryBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#catchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchStatement(ObjectiveCParser.CatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(ObjectiveCParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#autoreleaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoreleaseStatement(ObjectiveCParser.AutoreleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(ObjectiveCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeSpecifier(ObjectiveCParser.AttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ObjectiveCParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(ObjectiveCParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameters(ObjectiveCParser.AttributeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterList(ObjectiveCParser.AttributeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameter(ObjectiveCParser.AttributeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#attributeParameterAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeParameterAssignment(ObjectiveCParser.AttributeParameterAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ObjectiveCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#functionCallDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallDeclaration(ObjectiveCParser.FunctionCallDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ObjectiveCParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(ObjectiveCParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(ObjectiveCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#ibOutletSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIbOutletSpecifier(ObjectiveCParser.IbOutletSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(ObjectiveCParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(ObjectiveCParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(ObjectiveCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(ObjectiveCParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(ObjectiveCParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#arcBehaviourSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcBehaviourSpecifier(ObjectiveCParser.ArcBehaviourSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#nullabilitySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullabilitySpecifier(ObjectiveCParser.NullabilitySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(ObjectiveCParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(ObjectiveCParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(ObjectiveCParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#typeofExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeofExpression(ObjectiveCParser.TypeofExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#classNameGeneric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameGeneric(ObjectiveCParser.ClassNameGenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(ObjectiveCParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(ObjectiveCParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(ObjectiveCParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(ObjectiveCParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(ObjectiveCParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#enumeratorIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorIdentifier(ObjectiveCParser.EnumeratorIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(ObjectiveCParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#declaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaratorSuffix(ObjectiveCParser.DeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ObjectiveCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(ObjectiveCParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#macros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacros(ObjectiveCParser.MacrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(ObjectiveCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ObjectiveCParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#structInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructInitializer(ObjectiveCParser.StructInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(ObjectiveCParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ObjectiveCParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(ObjectiveCParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#abstractDeclaratorSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclaratorSuffix(ObjectiveCParser.AbstractDeclaratorSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#parameterDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarationList(ObjectiveCParser.ParameterDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(ObjectiveCParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(ObjectiveCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ObjectiveCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(ObjectiveCParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(ObjectiveCParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(ObjectiveCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(ObjectiveCParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(ObjectiveCParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(ObjectiveCParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#switchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSection(ObjectiveCParser.SwitchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ObjectiveCParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#forLoopInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopInitializer(ObjectiveCParser.ForLoopInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(ObjectiveCParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ObjectiveCParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(ObjectiveCParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(ObjectiveCParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#forInStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(ObjectiveCParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(ObjectiveCParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ObjectiveCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(ObjectiveCParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(ObjectiveCParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(ObjectiveCParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(ObjectiveCParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(ObjectiveCParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ObjectiveCParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ObjectiveCParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(ObjectiveCParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexerExpression}
	 * labeled alternative in {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexerExpression(ObjectiveCParser.IndexerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(ObjectiveCParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryInPostfixExpression}
	 * labeled alternative in {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryInPostfixExpression(ObjectiveCParser.PrimaryInPostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyExpression}
	 * labeled alternative in {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyExpression(ObjectiveCParser.PropertyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incDecExpression}
	 * labeled alternative in {@link ObjectiveCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpression(ObjectiveCParser.IncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(ObjectiveCParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#argumentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpression(ObjectiveCParser.ArgumentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ObjectiveCParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ObjectiveCParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ObjectiveCParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ObjectiveCParser.IdentifierContext ctx);
}