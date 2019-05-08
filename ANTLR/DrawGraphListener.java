// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawGraphParser}.
 */
public interface DrawGraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DrawGraphParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DrawGraphParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DrawGraphParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DrawGraphParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DrawGraphParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DrawGraphParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link DrawGraphParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DrawGraphParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#originStatement}.
	 * @param ctx the parse tree
	 */
	void enterOriginStatement(DrawGraphParser.OriginStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#originStatement}.
	 * @param ctx the parse tree
	 */
	void exitOriginStatement(DrawGraphParser.OriginStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#scaleStatement}.
	 * @param ctx the parse tree
	 */
	void enterScaleStatement(DrawGraphParser.ScaleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#scaleStatement}.
	 * @param ctx the parse tree
	 */
	void exitScaleStatement(DrawGraphParser.ScaleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#rotStatement}.
	 * @param ctx the parse tree
	 */
	void enterRotStatement(DrawGraphParser.RotStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#rotStatement}.
	 * @param ctx the parse tree
	 */
	void exitRotStatement(DrawGraphParser.RotStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(DrawGraphParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(DrawGraphParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawGraphParser#colorStatement}.
	 * @param ctx the parse tree
	 */
	void enterColorStatement(DrawGraphParser.ColorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawGraphParser#colorStatement}.
	 * @param ctx the parse tree
	 */
	void exitColorStatement(DrawGraphParser.ColorStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpr(DrawGraphParser.PowerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpr(DrawGraphParser.PowerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(DrawGraphParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(DrawGraphParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarT}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarT(DrawGraphParser.VarTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarT}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarT(DrawGraphParser.VarTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(DrawGraphParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(DrawGraphParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(DrawGraphParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(DrawGraphParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusMinusExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpr(DrawGraphParser.PlusMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpr(DrawGraphParser.NestedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpr(DrawGraphParser.NestedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(DrawGraphParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(DrawGraphParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(DrawGraphParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link DrawGraphParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(DrawGraphParser.FuncExprContext ctx);
}