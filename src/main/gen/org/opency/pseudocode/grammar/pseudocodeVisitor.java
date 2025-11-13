// Generated from pseudocode.g4 by ANTLR 4.13.2
package org.opency.pseudocode.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pseudocodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pseudocodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pseudocodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#algorithmDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithmDecl(pseudocodeParser.AlgorithmDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(pseudocodeParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pseudocodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pseudocodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pseudocodeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(pseudocodeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(pseudocodeParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(pseudocodeParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(pseudocodeParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(pseudocodeParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(pseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pseudocodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#arrayList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayList(pseudocodeParser.ArrayListContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(pseudocodeParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link pseudocodeParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(pseudocodeParser.ArgListContext ctx);
}