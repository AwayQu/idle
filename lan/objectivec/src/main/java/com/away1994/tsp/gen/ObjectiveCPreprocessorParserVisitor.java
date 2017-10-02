package com.away1994.tsp.gen;// Generated from ObjectiveCPreprocessorParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjectiveCPreprocessorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjectiveCPreprocessorParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjectiveCPreprocessorParser#objectiveCDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectiveCDocument(ObjectiveCPreprocessorParser.ObjectiveCDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCPreprocessorParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ObjectiveCPreprocessorParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCPreprocessorParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(ObjectiveCPreprocessorParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorImport}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorImport(ObjectiveCPreprocessorParser.PreprocessorImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorConditional}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorConditional(ObjectiveCPreprocessorParser.PreprocessorConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorDef}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorDef(ObjectiveCPreprocessorParser.PreprocessorDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorPragma}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorPragma(ObjectiveCPreprocessorParser.PreprocessorPragmaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorError}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorError(ObjectiveCPreprocessorParser.PreprocessorErrorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorDefine}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorDefine(ObjectiveCPreprocessorParser.PreprocessorDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjectiveCPreprocessorParser#directive_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_text(ObjectiveCPreprocessorParser.Directive_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorParenthesis}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorParenthesis(ObjectiveCPreprocessorParser.PreprocessorParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorNot}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorNot(ObjectiveCPreprocessorParser.PreprocessorNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorBinary}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorBinary(ObjectiveCPreprocessorParser.PreprocessorBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorConstant}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorConstant(ObjectiveCPreprocessorParser.PreprocessorConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorConditionalSymbol}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorConditionalSymbol(ObjectiveCPreprocessorParser.PreprocessorConditionalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preprocessorDefined}
	 * labeled alternative in {@link ObjectiveCPreprocessorParser#preprocessor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessorDefined(ObjectiveCPreprocessorParser.PreprocessorDefinedContext ctx);
}