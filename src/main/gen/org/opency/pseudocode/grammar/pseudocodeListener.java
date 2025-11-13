// Generated from pseudocode.g4 by ANTLR 4.13.2
package org.opency.pseudocode.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pseudocodeParser}.
 */
public interface pseudocodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pseudocodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pseudocodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#algorithmDecl}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithmDecl(pseudocodeParser.AlgorithmDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#algorithmDecl}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithmDecl(pseudocodeParser.AlgorithmDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(pseudocodeParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(pseudocodeParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pseudocodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pseudocodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pseudocodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pseudocodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pseudocodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pseudocodeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(pseudocodeParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(pseudocodeParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(pseudocodeParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(pseudocodeParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(pseudocodeParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(pseudocodeParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(pseudocodeParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(pseudocodeParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(pseudocodeParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(pseudocodeParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(pseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(pseudocodeParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pseudocodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pseudocodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void enterArrayList(pseudocodeParser.ArrayListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#arrayList}.
	 * @param ctx the parse tree
	 */
	void exitArrayList(pseudocodeParser.ArrayListContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(pseudocodeParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(pseudocodeParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link pseudocodeParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(pseudocodeParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link pseudocodeParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(pseudocodeParser.ArgListContext ctx);
}