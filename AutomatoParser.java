// Generated from Automato.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutomatoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, PAL=8, WS=9;
	public static final int
		RULE_definicao = 0, RULE_listaestados = 1, RULE_estados = 2, RULE_estado = 3, 
		RULE_alfabeto = 4, RULE_palavra = 5, RULE_transicao = 6, RULE_funcao = 7, 
		RULE_inicial = 8, RULE_finais = 9;
	public static final String[] ruleNames = {
		"definicao", "listaestados", "estados", "estado", "alfabeto", "palavra", 
		"transicao", "funcao", "inicial", "finais"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "','", "'q'", "'('", "')'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUM", "PAL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Automato.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutomatoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DefinicaoContext extends ParserRuleContext {
		public ListaestadosContext listaestados() {
			return getRuleContext(ListaestadosContext.class,0);
		}
		public AlfabetoContext alfabeto() {
			return getRuleContext(AlfabetoContext.class,0);
		}
		public TransicaoContext transicao() {
			return getRuleContext(TransicaoContext.class,0);
		}
		public InicialContext inicial() {
			return getRuleContext(InicialContext.class,0);
		}
		public FinaisContext finais() {
			return getRuleContext(FinaisContext.class,0);
		}
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterDefinicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitDefinicao(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_definicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			listaestados();
			setState(21);
			match(T__0);
			setState(22);
			alfabeto();
			setState(23);
			match(T__0);
			setState(24);
			transicao();
			setState(25);
			match(T__0);
			setState(26);
			inicial();
			setState(27);
			match(T__0);
			setState(28);
			finais();
			setState(29);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaestadosContext extends ParserRuleContext {
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public ListaestadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaestados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterListaestados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitListaestados(this);
		}
	}

	public final ListaestadosContext listaestados() throws RecognitionException {
		ListaestadosContext _localctx = new ListaestadosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaestados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			estados();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadosContext extends ParserRuleContext {
		public List<EstadoContext> estado() {
			return getRuleContexts(EstadoContext.class);
		}
		public EstadoContext estado(int i) {
			return getRuleContext(EstadoContext.class,i);
		}
		public EstadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterEstados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitEstados(this);
		}
	}

	public final EstadosContext estados() throws RecognitionException {
		EstadosContext _localctx = new EstadosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estados);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			estado();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(34);
				match(T__1);
				setState(35);
				estado();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AutomatoParser.NUM, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__2);
			setState(42);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlfabetoContext extends ParserRuleContext {
		public List<PalavraContext> palavra() {
			return getRuleContexts(PalavraContext.class);
		}
		public PalavraContext palavra(int i) {
			return getRuleContext(PalavraContext.class,i);
		}
		public AlfabetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfabeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterAlfabeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitAlfabeto(this);
		}
	}

	public final AlfabetoContext alfabeto() throws RecognitionException {
		AlfabetoContext _localctx = new AlfabetoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alfabeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			palavra();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(45);
				match(T__1);
				setState(46);
				palavra();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PalavraContext extends ParserRuleContext {
		public TerminalNode PAL() { return getToken(AutomatoParser.PAL, 0); }
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitPalavra(this);
		}
	}

	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_palavra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransicaoContext extends ParserRuleContext {
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public TransicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterTransicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitTransicao(this);
		}
	}

	public final TransicaoContext transicao() throws RecognitionException {
		TransicaoContext _localctx = new TransicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			funcao();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
				setState(56);
				funcao();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncaoContext extends ParserRuleContext {
		public List<EstadoContext> estado() {
			return getRuleContexts(EstadoContext.class);
		}
		public EstadoContext estado(int i) {
			return getRuleContext(EstadoContext.class,i);
		}
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__3);
			setState(63);
			estado();
			setState(64);
			match(T__1);
			setState(65);
			palavra();
			setState(66);
			match(T__4);
			setState(67);
			match(T__5);
			setState(68);
			estado();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InicialContext extends ParserRuleContext {
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public InicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitInicial(this);
		}
	}

	public final InicialContext inicial() throws RecognitionException {
		InicialContext _localctx = new InicialContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			estado();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinaisContext extends ParserRuleContext {
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public FinaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).enterFinais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutomatoListener ) ((AutomatoListener)listener).exitFinais(this);
		}
	}

	public final FinaisContext finais() throws RecognitionException {
		FinaisContext _localctx = new FinaisContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_finais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			estados();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\'\n"+
		"\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6\62\n\6\f\6\16\6\65\13\6"+
		"\3\7\3\7\3\b\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2E\2\26"+
		"\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b+\3\2\2\2\n.\3\2\2\2\f\66\3\2\2\2\168"+
		"\3\2\2\2\20@\3\2\2\2\22H\3\2\2\2\24J\3\2\2\2\26\27\5\4\3\2\27\30\7\3\2"+
		"\2\30\31\5\n\6\2\31\32\7\3\2\2\32\33\5\16\b\2\33\34\7\3\2\2\34\35\5\22"+
		"\n\2\35\36\7\3\2\2\36\37\5\24\13\2\37 \7\3\2\2 \3\3\2\2\2!\"\5\6\4\2\""+
		"\5\3\2\2\2#(\5\b\5\2$%\7\4\2\2%\'\5\b\5\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2"+
		"\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2+,\7\5\2\2,-\7\t\2\2-\t\3\2\2\2.\63\5"+
		"\f\7\2/\60\7\4\2\2\60\62\5\f\7\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\13\3\2\2\2\65\63\3\2\2\2\66\67\7\n\2\2\67\r\3\2\2"+
		"\28=\5\20\t\29:\7\4\2\2:<\5\20\t\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>\17\3\2\2\2?=\3\2\2\2@A\7\6\2\2AB\5\b\5\2BC\7\4\2\2CD\5\f\7\2DE\7"+
		"\7\2\2EF\7\b\2\2FG\5\b\5\2G\21\3\2\2\2HI\5\b\5\2I\23\3\2\2\2JK\5\6\4\2"+
		"K\25\3\2\2\2\5(\63=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}