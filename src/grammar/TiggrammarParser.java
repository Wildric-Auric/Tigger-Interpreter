// Generated from src/grammar/Tiggrammar.g4 by ANTLR 4.13.1

    package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TiggrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INT=16, BOOL=17, 
		ID=18, LINE_COMMENT=19, COMMENT=20, SPACE=21;
	public static final int
		RULE_prog = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'$'", "'-'", "'+'", "'('", "')'", "'=='", "'!='", "'>'", 
			"'>='", "'<'", "'<='", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT", "BOOL", "ID", "LINE_COMMENT", "COMMENT", 
			"SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Tiggrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TiggrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ast.ASTprogram node;
		public ExprContext body;
		public TerminalNode EOF() { return getToken(TiggrammarParser.EOF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((ProgContext)_localctx).body = expr(0);
			setState(5);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ast.ASTexpression node;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.node = ctx.node;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ExprContext {
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstIntegerContext extends ExprContext {
		public Token intConst;
		public TerminalNode INT() { return getToken(TiggrammarParser.INT, 0); }
		public ConstIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterConstInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitConstInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstBoolContext extends ExprContext {
		public Token boolConst;
		public TerminalNode BOOL() { return getToken(TiggrammarParser.BOOL, 0); }
		public ConstBoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterConstBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitConstBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryContext extends ExprContext {
		public ExprContext arg1;
		public Token op;
		public ExprContext arg2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitBinary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceContext extends ExprContext {
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SequenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitSequence(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitUnary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupedExprContext extends ExprContext {
		public ExprContext arg;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GroupedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).enterGroupedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiggrammarListener ) ((TiggrammarListener)listener).exitGroupedExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new PrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(8);
				match(T__1);
				setState(9);
				((PrintContext)_localctx).arg = expr(8);
				}
				break;
			case T__2:
			case T__3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(10);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__3) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(11);
				((UnaryContext)_localctx).arg = expr(7);
				}
				break;
			case T__4:
				{
				_localctx = new GroupedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(12);
				match(T__4);
				setState(13);
				((GroupedExprContext)_localctx).arg = expr(0);
				setState(14);
				match(T__5);
				}
				break;
			case INT:
				{
				_localctx = new ConstIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				((ConstIntegerContext)_localctx).intConst = match(INT);
				}
				break;
			case BOOL:
				{
				_localctx = new ConstBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				((ConstBoolContext)_localctx).boolConst = match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).arg1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(20);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(21);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(22);
						((BinaryContext)_localctx).arg2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).arg1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(23);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(24);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						((BinaryContext)_localctx).arg2 = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new ExprContext(_parentctx, _parentState));
						((BinaryContext)_localctx).arg1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(26);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(27);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						((BinaryContext)_localctx).arg2 = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new SequenceContext(new ExprContext(_parentctx, _parentState));
						((SequenceContext)_localctx).arg = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(30);
						match(T__0);
						}
						break;
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0015%\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t"+
		"\u0001\u0001\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0003\u0001"+
		"\u0000\u0003\u0004\u0001\u0000\u0007\f\u0001\u0000\r\u000f*\u0000\u0004"+
		"\u0001\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0006\u0001\uffff\uffff\u0000\b\t\u0005"+
		"\u0002\u0000\u0000\t\u0013\u0003\u0002\u0001\b\n\u000b\u0007\u0000\u0000"+
		"\u0000\u000b\u0013\u0003\u0002\u0001\u0007\f\r\u0005\u0005\u0000\u0000"+
		"\r\u000e\u0003\u0002\u0001\u0000\u000e\u000f\u0005\u0006\u0000\u0000\u000f"+
		"\u0013\u0001\u0000\u0000\u0000\u0010\u0013\u0005\u0010\u0000\u0000\u0011"+
		"\u0013\u0005\u0011\u0000\u0000\u0012\u0007\u0001\u0000\u0000\u0000\u0012"+
		"\n\u0001\u0000\u0000\u0000\u0012\f\u0001\u0000\u0000\u0000\u0012\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013!\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\n\u0005\u0000\u0000\u0015\u0016\u0007\u0001"+
		"\u0000\u0000\u0016 \u0003\u0002\u0001\u0006\u0017\u0018\n\u0004\u0000"+
		"\u0000\u0018\u0019\u0007\u0002\u0000\u0000\u0019 \u0003\u0002\u0001\u0005"+
		"\u001a\u001b\n\u0003\u0000\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c"+
		" \u0003\u0002\u0001\u0004\u001d\u001e\n\t\u0000\u0000\u001e \u0005\u0001"+
		"\u0000\u0000\u001f\u0014\u0001\u0000\u0000\u0000\u001f\u0017\u0001\u0000"+
		"\u0000\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000\u0003\u0012\u001f!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}