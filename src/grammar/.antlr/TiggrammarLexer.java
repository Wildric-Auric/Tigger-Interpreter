// Generated from /home/hamon/Dropbox/ESIEE/E4S2/Tigger-Interpreter/src/grammar/Tiggrammar.g4 by ANTLR 4.13.1

    package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TiggrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INT=15, BOOL=16, LINE_COMMENT=17, 
		COMMENT=18, SPACE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "INT", "BOOL", "LINE_COMMENT", 
			"COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'-'", "'+'", "'('", "')'", "'=='", "'!='", "'>'", "'>='", 
			"'<'", "'<='", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "INT", "BOOL", "LINE_COMMENT", "COMMENT", "SPACE"
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


	public TiggrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiggrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000eI\b\u000e\u000b\u000e\f\u000eJ\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000fW\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010]\b\u0010\n\u0010\f\u0010`\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011j\b\u0011\n\u0011\f\u0011m\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0004\u0012u\b\u0012\u000b\u0012\f\u0012v\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0006"+
		"\u0001\u000009\u0002\u0000FFTT\u0002\u0000\n\n\r\r\u0001\u0000//\u0001"+
		"\u0000**\u0003\u0000\t\n\r\r  \u0080\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000"+
		"\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007"+
		"-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000"+
		"\u0000\u0000\r4\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000"+
		"\u00119\u0001\u0000\u0000\u0000\u0013<\u0001\u0000\u0000\u0000\u0015>"+
		"\u0001\u0000\u0000\u0000\u0017A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000"+
		"\u0000\u0000\u001bE\u0001\u0000\u0000\u0000\u001dH\u0001\u0000\u0000\u0000"+
		"\u001fV\u0001\u0000\u0000\u0000!X\u0001\u0000\u0000\u0000#c\u0001\u0000"+
		"\u0000\u0000%t\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)*\u0005-\u0000\u0000*\u0004\u0001\u0000\u0000\u0000"+
		"+,\u0005+\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\n\u0001\u0000\u0000"+
		"\u000012\u0005=\u0000\u000023\u0005=\u0000\u00003\f\u0001\u0000\u0000"+
		"\u000045\u0005!\u0000\u000056\u0005=\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u000078\u0005>\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005>\u0000"+
		"\u0000:;\u0005=\u0000\u0000;\u0012\u0001\u0000\u0000\u0000<=\u0005<\u0000"+
		"\u0000=\u0014\u0001\u0000\u0000\u0000>?\u0005<\u0000\u0000?@\u0005=\u0000"+
		"\u0000@\u0016\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000B\u0018\u0001"+
		"\u0000\u0000\u0000CD\u0005/\u0000\u0000D\u001a\u0001\u0000\u0000\u0000"+
		"EF\u0005%\u0000\u0000F\u001c\u0001\u0000\u0000\u0000GI\u0007\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\u001e\u0001\u0000\u0000\u0000"+
		"LM\u0005t\u0000\u0000MN\u0005r\u0000\u0000NO\u0005u\u0000\u0000OW\u0005"+
		"e\u0000\u0000PQ\u0005f\u0000\u0000QR\u0005a\u0000\u0000RS\u0005l\u0000"+
		"\u0000ST\u0005s\u0000\u0000TW\u0005e\u0000\u0000UW\u0007\u0001\u0000\u0000"+
		"VL\u0001\u0000\u0000\u0000VP\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000"+
		"\u0000W \u0001\u0000\u0000\u0000XY\u0005/\u0000\u0000YZ\u0005/\u0000\u0000"+
		"Z^\u0001\u0000\u0000\u0000[]\b\u0002\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0006"+
		"\u0010\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005/\u0000\u0000de\u0005"+
		"*\u0000\u0000ek\u0001\u0000\u0000\u0000fg\u0005*\u0000\u0000gj\b\u0003"+
		"\u0000\u0000hj\b\u0004\u0000\u0000if\u0001\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"no\u0005*\u0000\u0000op\u0005/\u0000\u0000pq\u0001\u0000\u0000\u0000q"+
		"r\u0006\u0011\u0000\u0000r$\u0001\u0000\u0000\u0000su\u0007\u0005\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006"+
		"\u0012\u0000\u0000y&\u0001\u0000\u0000\u0000\u0007\u0000JV^ikv\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}