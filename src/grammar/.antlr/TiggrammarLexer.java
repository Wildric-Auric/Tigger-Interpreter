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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, INT=19, BOOL=20, ID=21, LINE_COMMENT=22, COMMENT=23, SPACE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "INT", "BOOL", "ID", "LINE_COMMENT", "COMMENT", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'$'", "'if'", "'then'", "'else'", "'-'", "'+'", "'('", 
			"')'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "BOOL", "ID", "LINE_COMMENT", 
			"COMMENT", "SPACE"
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
		"\u0004\u0000\u0018\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0004\u0012b\b\u0012\u000b\u0012\f\u0012c\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013p\b\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015y\b\u0015\n\u0015\f\u0015|\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0086\b\u0016\n\u0016\f\u0016\u0089\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u0091"+
		"\b\u0017\u000b\u0017\f\u0017\u0092\u0001\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u0018\u0001\u0000\b\u0001\u000009\u0002\u0000FFTT\u0001\u0000az\u0004"+
		"\u000009AZ__az\u0002\u0000\n\n\r\r\u0001\u0000//\u0001\u0000**\u0003\u0000"+
		"\t\n\r\r  \u009c\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"3\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00078\u0001"+
		"\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000"+
		"\u0000\rD\u0001\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011"+
		"H\u0001\u0000\u0000\u0000\u0013J\u0001\u0000\u0000\u0000\u0015M\u0001"+
		"\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000"+
		"\u0000\u001bU\u0001\u0000\u0000\u0000\u001dW\u0001\u0000\u0000\u0000\u001f"+
		"Z\u0001\u0000\u0000\u0000!\\\u0001\u0000\u0000\u0000#^\u0001\u0000\u0000"+
		"\u0000%a\u0001\u0000\u0000\u0000\'o\u0001\u0000\u0000\u0000)q\u0001\u0000"+
		"\u0000\u0000+t\u0001\u0000\u0000\u0000-\u007f\u0001\u0000\u0000\u0000"+
		"/\u0090\u0001\u0000\u0000\u000012\u0005;\u0000\u00002\u0002\u0001\u0000"+
		"\u0000\u000034\u0005$\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005"+
		"i\u0000\u000067\u0005f\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005"+
		"t\u0000\u00009:\u0005h\u0000\u0000:;\u0005e\u0000\u0000;<\u0005n\u0000"+
		"\u0000<\b\u0001\u0000\u0000\u0000=>\u0005e\u0000\u0000>?\u0005l\u0000"+
		"\u0000?@\u0005s\u0000\u0000@A\u0005e\u0000\u0000A\n\u0001\u0000\u0000"+
		"\u0000BC\u0005-\u0000\u0000C\f\u0001\u0000\u0000\u0000DE\u0005+\u0000"+
		"\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\u0010\u0001"+
		"\u0000\u0000\u0000HI\u0005)\u0000\u0000I\u0012\u0001\u0000\u0000\u0000"+
		"JK\u0005=\u0000\u0000KL\u0005=\u0000\u0000L\u0014\u0001\u0000\u0000\u0000"+
		"MN\u0005!\u0000\u0000NO\u0005=\u0000\u0000O\u0016\u0001\u0000\u0000\u0000"+
		"PQ\u0005>\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005>\u0000\u0000"+
		"ST\u0005=\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0005<\u0000\u0000"+
		"V\u001c\u0001\u0000\u0000\u0000WX\u0005<\u0000\u0000XY\u0005=\u0000\u0000"+
		"Y\u001e\u0001\u0000\u0000\u0000Z[\u0005*\u0000\u0000[ \u0001\u0000\u0000"+
		"\u0000\\]\u0005/\u0000\u0000]\"\u0001\u0000\u0000\u0000^_\u0005%\u0000"+
		"\u0000_$\u0001\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d&\u0001\u0000\u0000\u0000ef\u0005t\u0000\u0000fg\u0005"+
		"r\u0000\u0000gh\u0005u\u0000\u0000hp\u0005e\u0000\u0000ij\u0005f\u0000"+
		"\u0000jk\u0005a\u0000\u0000kl\u0005l\u0000\u0000lm\u0005s\u0000\u0000"+
		"mp\u0005e\u0000\u0000np\u0007\u0001\u0000\u0000oe\u0001\u0000\u0000\u0000"+
		"oi\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p(\u0001\u0000\u0000"+
		"\u0000qr\u0007\u0002\u0000\u0000rs\u0007\u0003\u0000\u0000s*\u0001\u0000"+
		"\u0000\u0000tu\u0005/\u0000\u0000uv\u0005/\u0000\u0000vz\u0001\u0000\u0000"+
		"\u0000wy\b\u0004\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\u0015\u0000\u0000~,\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005/\u0000\u0000\u0080\u0081\u0005*\u0000"+
		"\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0083\u0005*\u0000\u0000"+
		"\u0083\u0086\b\u0005\u0000\u0000\u0084\u0086\b\u0006\u0000\u0000\u0085"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005*\u0000\u0000\u008b\u008c"+
		"\u0005/\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0006"+
		"\u0016\u0000\u0000\u008e.\u0001\u0000\u0000\u0000\u008f\u0091\u0007\u0007"+
		"\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0006\u0017"+
		"\u0000\u0000\u00950\u0001\u0000\u0000\u0000\u0007\u0000coz\u0085\u0087"+
		"\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}