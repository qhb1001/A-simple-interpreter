// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, SEMICO=7, L_BRACKET=8, 
		R_BRACKET=9, COMMA=10, CONST_ID=11, ORIGIN=12, SCALE=13, ROT=14, IS=15, 
		TO=16, STEP=17, DRAW=18, FOR=19, FROM=20, RED=21, BLUE=22, GREEN=23, COLOR=24, 
		T1=25, WS=26, COMMENT=27, ID=28, ErrText=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "CONST_ID", "Integer", "Digits", "Real", "Fraction", 
			"Exponent", "NamedConst", "ORIGIN", "SCALE", "ROT", "IS", "TO", "STEP", 
			"DRAW", "FOR", "FROM", "RED", "BLUE", "GREEN", "COLOR", "T1", "WS", "COMMENT", 
			"ID", "ErrText", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'/'", "'*'", "'**'", "';'", "'('", "')'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "POWER", "SEMICO", "L_BRACKET", 
			"R_BRACKET", "COMMA", "CONST_ID", "ORIGIN", "SCALE", "ROT", "IS", "TO", 
			"STEP", "DRAW", "FOR", "FROM", "RED", "BLUE", "GREEN", "COLOR", "T1", 
			"WS", "COMMENT", "ID", "ErrText"
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


	public DrawGraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DrawGraph.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0163\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\16\6\16\u009b"+
		"\n\16\r\16\16\16\u009c\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\5\17\u00a6"+
		"\n\17\3\20\5\20\u00a9\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3"+
		"\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bc\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\6!\u0100\n!\r!\16!\u0101"+
		"\3!\3!\3\"\3\"\3\"\3\"\7\"\u010a\n\"\f\"\16\"\u010d\13\"\3\"\3\"\3\"\3"+
		"\"\7\"\u0113\n\"\f\"\16\"\u0116\13\"\3\"\3\"\3\"\3\"\7\"\u011c\n\"\f\""+
		"\16\"\u011f\13\"\3\"\3\"\5\"\u0123\n\"\3\"\3\"\3#\3#\7#\u0129\n#\f#\16"+
		"#\u012c\13#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"\u011d\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2"+
		"\35\2\37\2!\2#\2%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30"+
		";\31=\32?\33A\34C\35E\36G\37I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2"+
		"e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2\3\2\"\3\2\62;\4\2--//\5\2\13\f\16"+
		"\17\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\4\2CCcc\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0152\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3}\3\2\2\2\5\177"+
		"\3\2\2\2\7\u0081\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r\u0087\3\2"+
		"\2\2\17\u008a\3\2\2\2\21\u008c\3\2\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2"+
		"\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u00a5\3\2\2\2"+
		"\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00bb\3\2\2\2%\u00bd\3\2\2\2\'\u00c4"+
		"\3\2\2\2)\u00ca\3\2\2\2+\u00ce\3\2\2\2-\u00d1\3\2\2\2/\u00d4\3\2\2\2\61"+
		"\u00d9\3\2\2\2\63\u00de\3\2\2\2\65\u00e2\3\2\2\2\67\u00e7\3\2\2\29\u00eb"+
		"\3\2\2\2;\u00f0\3\2\2\2=\u00f6\3\2\2\2?\u00fc\3\2\2\2A\u00ff\3\2\2\2C"+
		"\u0122\3\2\2\2E\u0126\3\2\2\2G\u012d\3\2\2\2I\u012f\3\2\2\2K\u0131\3\2"+
		"\2\2M\u0133\3\2\2\2O\u0135\3\2\2\2Q\u0137\3\2\2\2S\u0139\3\2\2\2U\u013b"+
		"\3\2\2\2W\u013d\3\2\2\2Y\u013f\3\2\2\2[\u0141\3\2\2\2]\u0143\3\2\2\2_"+
		"\u0145\3\2\2\2a\u0147\3\2\2\2c\u0149\3\2\2\2e\u014b\3\2\2\2g\u014d\3\2"+
		"\2\2i\u014f\3\2\2\2k\u0151\3\2\2\2m\u0153\3\2\2\2o\u0155\3\2\2\2q\u0157"+
		"\3\2\2\2s\u0159\3\2\2\2u\u015b\3\2\2\2w\u015d\3\2\2\2y\u015f\3\2\2\2{"+
		"\u0161\3\2\2\2}~\7?\2\2~\4\3\2\2\2\177\u0080\7-\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0082\7/\2\2\u0082\b\3\2\2\2\u0083\u0084\7\61\2\2\u0084\n\3\2\2\2\u0085"+
		"\u0086\7,\2\2\u0086\f\3\2\2\2\u0087\u0088\7,\2\2\u0088\u0089\7,\2\2\u0089"+
		"\16\3\2\2\2\u008a\u008b\7=\2\2\u008b\20\3\2\2\2\u008c\u008d\7*\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7+\2\2\u008f\24\3\2\2\2\u0090\u0091\7.\2\2\u0091"+
		"\26\3\2\2\2\u0092\u0096\5\31\r\2\u0093\u0096\5\35\17\2\u0094\u0096\5#"+
		"\22\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\30\3\2\2\2\u0097\u0098\5\33\16\2\u0098\32\3\2\2\2\u0099\u009b\t\2\2\2"+
		"\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\34\3\2\2\2\u009e\u00a0\5\37\20\2\u009f\u00a1\5!\21\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3\5\33"+
		"\16\2\u00a3\u00a4\5!\21\2\u00a4\u00a6\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5"+
		"\u00a2\3\2\2\2\u00a6\36\3\2\2\2\u00a7\u00a9\5\33\16\2\u00a8\u00a7\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab"+
		"\u00b0\5\33\16\2\u00ac\u00ad\5\33\16\2\u00ad\u00ae\7\60\2\2\u00ae\u00b0"+
		"\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00ac\3\2\2\2\u00b0 \3\2\2\2\u00b1"+
		"\u00b3\5Q)\2\u00b2\u00b4\t\3\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\33\16\2\u00b6\"\3\2\2\2\u00b7\u00b8"+
		"\5g\64\2\u00b8\u00b9\5Y-\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc\5Q)\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc$\3\2\2\2\u00bd\u00be\5e\63\2"+
		"\u00be\u00bf\5k\66\2\u00bf\u00c0\5Y-\2\u00c0\u00c1\5U+\2\u00c1\u00c2\5"+
		"Y-\2\u00c2\u00c3\5c\62\2\u00c3&\3\2\2\2\u00c4\u00c5\5m\67\2\u00c5\u00c6"+
		"\5M\'\2\u00c6\u00c7\5I%\2\u00c7\u00c8\5_\60\2\u00c8\u00c9\5Q)\2\u00c9"+
		"(\3\2\2\2\u00ca\u00cb\5k\66\2\u00cb\u00cc\5e\63\2\u00cc\u00cd\5o8\2\u00cd"+
		"*\3\2\2\2\u00ce\u00cf\5Y-\2\u00cf\u00d0\5m\67\2\u00d0,\3\2\2\2\u00d1\u00d2"+
		"\5o8\2\u00d2\u00d3\5e\63\2\u00d3.\3\2\2\2\u00d4\u00d5\5m\67\2\u00d5\u00d6"+
		"\5o8\2\u00d6\u00d7\5Q)\2\u00d7\u00d8\5g\64\2\u00d8\60\3\2\2\2\u00d9\u00da"+
		"\5O(\2\u00da\u00db\5k\66\2\u00db\u00dc\5I%\2\u00dc\u00dd\5u;\2\u00dd\62"+
		"\3\2\2\2\u00de\u00df\5S*\2\u00df\u00e0\5e\63\2\u00e0\u00e1\5k\66\2\u00e1"+
		"\64\3\2\2\2\u00e2\u00e3\5S*\2\u00e3\u00e4\5k\66\2\u00e4\u00e5\5e\63\2"+
		"\u00e5\u00e6\5a\61\2\u00e6\66\3\2\2\2\u00e7\u00e8\5k\66\2\u00e8\u00e9"+
		"\5Q)\2\u00e9\u00ea\5O(\2\u00ea8\3\2\2\2\u00eb\u00ec\5K&\2\u00ec\u00ed"+
		"\5_\60\2\u00ed\u00ee\5q9\2\u00ee\u00ef\5Q)\2\u00ef:\3\2\2\2\u00f0\u00f1"+
		"\5U+\2\u00f1\u00f2\5k\66\2\u00f2\u00f3\5Q)\2\u00f3\u00f4\5Q)\2\u00f4\u00f5"+
		"\5c\62\2\u00f5<\3\2\2\2\u00f6\u00f7\5M\'\2\u00f7\u00f8\5e\63\2\u00f8\u00f9"+
		"\5_\60\2\u00f9\u00fa\5e\63\2\u00fa\u00fb\5k\66\2\u00fb>\3\2\2\2\u00fc"+
		"\u00fd\5o8\2\u00fd@\3\2\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0104\b!\2\2\u0104B\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107"+
		"\7\61\2\2\u0107\u010b\3\2\2\2\u0108\u010a\n\5\2\2\u0109\u0108\3\2\2\2"+
		"\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0123"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7/\2\2\u010f\u0110\7/\2\2\u0110"+
		"\u0114\3\2\2\2\u0111\u0113\n\5\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0123\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7\61\2\2\u0118\u0119\7,\2\2\u0119\u011d\3\2"+
		"\2\2\u011a\u011c\13\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0121\7,\2\2\u0121\u0123\7\61\2\2\u0122\u0105\3\2\2\2\u0122"+
		"\u010e\3\2\2\2\u0122\u0117\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\""+
		"\2\2\u0125D\3\2\2\2\u0126\u012a\t\6\2\2\u0127\u0129\t\7\2\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"F\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\13\2\2\2\u012eH\3\2\2\2\u012f"+
		"\u0130\t\b\2\2\u0130J\3\2\2\2\u0131\u0132\t\t\2\2\u0132L\3\2\2\2\u0133"+
		"\u0134\t\n\2\2\u0134N\3\2\2\2\u0135\u0136\t\13\2\2\u0136P\3\2\2\2\u0137"+
		"\u0138\t\f\2\2\u0138R\3\2\2\2\u0139\u013a\t\r\2\2\u013aT\3\2\2\2\u013b"+
		"\u013c\t\16\2\2\u013cV\3\2\2\2\u013d\u013e\t\17\2\2\u013eX\3\2\2\2\u013f"+
		"\u0140\t\20\2\2\u0140Z\3\2\2\2\u0141\u0142\t\21\2\2\u0142\\\3\2\2\2\u0143"+
		"\u0144\t\22\2\2\u0144^\3\2\2\2\u0145\u0146\t\23\2\2\u0146`\3\2\2\2\u0147"+
		"\u0148\t\24\2\2\u0148b\3\2\2\2\u0149\u014a\t\25\2\2\u014ad\3\2\2\2\u014b"+
		"\u014c\t\26\2\2\u014cf\3\2\2\2\u014d\u014e\t\27\2\2\u014eh\3\2\2\2\u014f"+
		"\u0150\t\30\2\2\u0150j\3\2\2\2\u0151\u0152\t\31\2\2\u0152l\3\2\2\2\u0153"+
		"\u0154\t\32\2\2\u0154n\3\2\2\2\u0155\u0156\t\33\2\2\u0156p\3\2\2\2\u0157"+
		"\u0158\t\34\2\2\u0158r\3\2\2\2\u0159\u015a\t\35\2\2\u015at\3\2\2\2\u015b"+
		"\u015c\t\36\2\2\u015cv\3\2\2\2\u015d\u015e\t\37\2\2\u015ex\3\2\2\2\u015f"+
		"\u0160\t \2\2\u0160z\3\2\2\2\u0161\u0162\t!\2\2\u0162|\3\2\2\2\21\2\u0095"+
		"\u009c\u00a0\u00a5\u00a8\u00af\u00b3\u00bb\u0101\u010b\u0114\u011d\u0122"+
		"\u012a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}