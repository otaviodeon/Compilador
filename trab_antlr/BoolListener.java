// Generated from Bool.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolParser}.
 */
public interface BoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoolParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(BoolParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(BoolParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(BoolParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(BoolParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#pa}.
	 * @param ctx the parse tree
	 */
	void enterPa(BoolParser.PaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#pa}.
	 * @param ctx the parse tree
	 */
	void exitPa(BoolParser.PaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterPf(BoolParser.PfContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitPf(BoolParser.PfContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoolParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(BoolParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoolParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(BoolParser.CContext ctx);
}