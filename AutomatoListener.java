// Generated from Automato.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutomatoParser}.
 */
public interface AutomatoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(AutomatoParser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(AutomatoParser.DefinicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#listaestados}.
	 * @param ctx the parse tree
	 */
	void enterListaestados(AutomatoParser.ListaestadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#listaestados}.
	 * @param ctx the parse tree
	 */
	void exitListaestados(AutomatoParser.ListaestadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(AutomatoParser.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(AutomatoParser.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(AutomatoParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(AutomatoParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void enterAlfabeto(AutomatoParser.AlfabetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void exitAlfabeto(AutomatoParser.AlfabetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#palavra}.
	 * @param ctx the parse tree
	 */
	void enterPalavra(AutomatoParser.PalavraContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#palavra}.
	 * @param ctx the parse tree
	 */
	void exitPalavra(AutomatoParser.PalavraContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#transicao}.
	 * @param ctx the parse tree
	 */
	void enterTransicao(AutomatoParser.TransicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#transicao}.
	 * @param ctx the parse tree
	 */
	void exitTransicao(AutomatoParser.TransicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(AutomatoParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(AutomatoParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#inicial}.
	 * @param ctx the parse tree
	 */
	void enterInicial(AutomatoParser.InicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#inicial}.
	 * @param ctx the parse tree
	 */
	void exitInicial(AutomatoParser.InicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomatoParser#finais}.
	 * @param ctx the parse tree
	 */
	void enterFinais(AutomatoParser.FinaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomatoParser#finais}.
	 * @param ctx the parse tree
	 */
	void exitFinais(AutomatoParser.FinaisContext ctx);
}