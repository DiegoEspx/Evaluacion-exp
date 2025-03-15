// Generated from ControlFlow.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ControlFlowParser}.
 */
public interface ControlFlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ControlFlowParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ControlFlowParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ControlFlowParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ControlFlowParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ControlFlowParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ControlFlowParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ControlFlowParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ControlFlowParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ControlFlowParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ControlFlowParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ControlFlowParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ControlFlowParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ControlFlowParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ControlFlowParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ControlFlowParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ControlFlowParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ControlFlowParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ControlFlowParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ControlFlowParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ControlFlowParser.CondContext ctx);
}