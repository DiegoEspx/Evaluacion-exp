// Generated from For.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ForParser}.
 */
public interface ForListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ForParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ForParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ForParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ForParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ForParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(ForParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(ForParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(ForParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(ForParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ForParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ForParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void enterActualizacion(ForParser.ActualizacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#actualizacion}.
	 * @param ctx the parse tree
	 */
	void exitActualizacion(ForParser.ActualizacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ForParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ForParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(ForParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(ForParser.ExpresionContext ctx);
}