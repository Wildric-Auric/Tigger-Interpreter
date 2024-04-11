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
		T__17=18, INT=19, BOOL=20, STRING=21, ID=22, LINE_COMMENT=23, COMMENT=24, 
		SPACE=25;
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
			"T__17", "INT", "BOOL", "STRING", "ID", "LINE_COMMENT", "COMMENT", "SPACE"
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
			null, null, null, null, null, null, null, "INT", "BOOL", "STRING", "ID", 
			"LINE_COMMENT", "COMMENT", "SPACE"
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
		"\u0004\u0000\u0019\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012d\b\u0012\u000b"+
		"\u0012\f\u0012e\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013r\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014v\b\u0014\n\u0014\f"+
		"\u0014y\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0084"+
		"\b\u0016\n\u0016\f\u0016\u0087\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0091\b\u0017\n\u0017\f\u0017\u0094\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u009c\b\u0018\u000b"+
		"\u0018\f\u0018\u009d\u0001\u0018\u0001\u0018\u0001w\u0000\u0019\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u0019\u0001\u0000\b\u0001\u000009\u0002\u0000FFTT\u0001\u0000"+
		"az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0001\u0000//\u0001\u0000*"+
		"*\u0003\u0000\t\n\r\r  \u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000"+
		"\u00057\u0001\u0000\u0000\u0000\u0007:\u0001\u0000\u0000\u0000\t?\u0001"+
		"\u0000\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000"+
		"\u0000\u000fH\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013"+
		"L\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017R\u0001"+
		"\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000"+
		"\u0000\u001dY\u0001\u0000\u0000\u0000\u001f\\\u0001\u0000\u0000\u0000"+
		"!^\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%c\u0001\u0000\u0000"+
		"\u0000\'q\u0001\u0000\u0000\u0000)s\u0001\u0000\u0000\u0000+|\u0001\u0000"+
		"\u0000\u0000-\u007f\u0001\u0000\u0000\u0000/\u008a\u0001\u0000\u0000\u0000"+
		"1\u009b\u0001\u0000\u0000\u000034\u0005;\u0000\u00004\u0002\u0001\u0000"+
		"\u0000\u000056\u0005$\u0000\u00006\u0004\u0001\u0000\u0000\u000078\u0005"+
		"i\u0000\u000089\u0005f\u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005"+
		"t\u0000\u0000;<\u0005h\u0000\u0000<=\u0005e\u0000\u0000=>\u0005n\u0000"+
		"\u0000>\b\u0001\u0000\u0000\u0000?@\u0005e\u0000\u0000@A\u0005l\u0000"+
		"\u0000AB\u0005s\u0000\u0000BC\u0005e\u0000\u0000C\n\u0001\u0000\u0000"+
		"\u0000DE\u0005-\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005+\u0000"+
		"\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005(\u0000\u0000I\u0010\u0001"+
		"\u0000\u0000\u0000JK\u0005)\u0000\u0000K\u0012\u0001\u0000\u0000\u0000"+
		"LM\u0005=\u0000\u0000MN\u0005=\u0000\u0000N\u0014\u0001\u0000\u0000\u0000"+
		"OP\u0005!\u0000\u0000PQ\u0005=\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000"+
		"RS\u0005>\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005>\u0000\u0000"+
		"UV\u0005=\u0000\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005<\u0000\u0000"+
		"X\u001c\u0001\u0000\u0000\u0000YZ\u0005<\u0000\u0000Z[\u0005=\u0000\u0000"+
		"[\u001e\u0001\u0000\u0000\u0000\\]\u0005*\u0000\u0000] \u0001\u0000\u0000"+
		"\u0000^_\u0005/\u0000\u0000_\"\u0001\u0000\u0000\u0000`a\u0005%\u0000"+
		"\u0000a$\u0001\u0000\u0000\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000f&\u0001\u0000\u0000\u0000gh\u0005t\u0000\u0000hi\u0005"+
		"r\u0000\u0000ij\u0005u\u0000\u0000jr\u0005e\u0000\u0000kl\u0005f\u0000"+
		"\u0000lm\u0005a\u0000\u0000mn\u0005l\u0000\u0000no\u0005s\u0000\u0000"+
		"or\u0005e\u0000\u0000pr\u0007\u0001\u0000\u0000qg\u0001\u0000\u0000\u0000"+
		"qk\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r(\u0001\u0000\u0000"+
		"\u0000sw\u0005\"\u0000\u0000tv\t\u0000\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\"\u0000\u0000{*\u0001\u0000\u0000\u0000|}\u0007\u0002\u0000\u0000}~\u0007"+
		"\u0003\u0000\u0000~,\u0001\u0000\u0000\u0000\u007f\u0080\u0005/\u0000"+
		"\u0000\u0080\u0081\u0005/\u0000\u0000\u0081\u0085\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\b\u0004\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0006\u0016\u0000\u0000\u0089"+
		".\u0001\u0000\u0000\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008c\u0005"+
		"*\u0000\u0000\u008c\u0092\u0001\u0000\u0000\u0000\u008d\u008e\u0005*\u0000"+
		"\u0000\u008e\u0091\b\u0005\u0000\u0000\u008f\u0091\b\u0006\u0000\u0000"+
		"\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005*\u0000\u0000\u0096"+
		"\u0097\u0005/\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0006\u0017\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u009a\u009c\u0007"+
		"\u0007\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006"+
		"\u0018\u0000\u0000\u00a02\u0001\u0000\u0000\u0000\b\u0000eqw\u0085\u0090"+
		"\u0092\u009d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}