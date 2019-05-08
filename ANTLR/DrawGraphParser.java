// Generated from DrawGraph.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, POWER=6, SEMICO=7, L_BRACKET=8, 
		R_BRACKET=9, COMMA=10, CONST_ID=11, ORIGIN=12, SCALE=13, ROT=14, IS=15, 
		TO=16, STEP=17, DRAW=18, FOR=19, FROM=20, RED=21, BLUE=22, GREEN=23, COLOR=24, 
		T1=25, WS=26, COMMENT=27, ID=28, ErrText=29;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableStatement = 2, RULE_originStatement = 3, 
		RULE_scaleStatement = 4, RULE_rotStatement = 5, RULE_forStatement = 6, 
		RULE_colorStatement = 7, RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableStatement", "originStatement", "scaleStatement", 
			"rotStatement", "forStatement", "colorStatement", "expr"
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

	@Override
	public String getGrammarFileName() { return "DrawGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawGraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DrawGraphParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICO() { return getTokens(DrawGraphParser.SEMICO); }
		public TerminalNode SEMICO(int i) {
			return getToken(DrawGraphParser.SEMICO, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << ROT) | (1L << FOR) | (1L << COLOR) | (1L << ID))) != 0)) {
				{
				{
				setState(18);
				statement();
				setState(19);
				match(SEMICO);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
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

	public static class StatementContext extends ParserRuleContext {
		public OriginStatementContext originStatement() {
			return getRuleContext(OriginStatementContext.class,0);
		}
		public ScaleStatementContext scaleStatement() {
			return getRuleContext(ScaleStatementContext.class,0);
		}
		public RotStatementContext rotStatement() {
			return getRuleContext(RotStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ColorStatementContext colorStatement() {
			return getRuleContext(ColorStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORIGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				originStatement();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				scaleStatement();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				rotStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				forStatement();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				colorStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				variableStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	 
		public VariableStatementContext() { }
		public void copyFrom(VariableStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends VariableStatementContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitAssign(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableStatement);
		try {
			_localctx = new AssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(T__0);
			setState(38);
			expr(0);
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

	public static class OriginStatementContext extends ParserRuleContext {
		public TerminalNode ORIGIN() { return getToken(DrawGraphParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public OriginStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterOriginStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitOriginStatement(this);
		}
	}

	public final OriginStatementContext originStatement() throws RecognitionException {
		OriginStatementContext _localctx = new OriginStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_originStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ORIGIN);
			setState(41);
			match(IS);
			setState(42);
			match(L_BRACKET);
			setState(43);
			expr(0);
			setState(44);
			match(COMMA);
			setState(45);
			expr(0);
			setState(46);
			match(R_BRACKET);
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

	public static class ScaleStatementContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(DrawGraphParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ScaleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterScaleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitScaleStatement(this);
		}
	}

	public final ScaleStatementContext scaleStatement() throws RecognitionException {
		ScaleStatementContext _localctx = new ScaleStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scaleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(SCALE);
			setState(49);
			match(IS);
			setState(50);
			match(L_BRACKET);
			setState(51);
			expr(0);
			setState(52);
			match(COMMA);
			setState(53);
			expr(0);
			setState(54);
			match(R_BRACKET);
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

	public static class RotStatementContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(DrawGraphParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterRotStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitRotStatement(this);
		}
	}

	public final RotStatementContext rotStatement() throws RecognitionException {
		RotStatementContext _localctx = new RotStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rotStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ROT);
			setState(57);
			match(IS);
			setState(58);
			expr(0);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DrawGraphParser.FOR, 0); }
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public TerminalNode FROM() { return getToken(DrawGraphParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(DrawGraphParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DrawGraphParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DrawGraphParser.DRAW, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DrawGraphParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FOR);
			setState(61);
			match(T1);
			setState(62);
			match(FROM);
			setState(63);
			expr(0);
			setState(64);
			match(TO);
			setState(65);
			expr(0);
			setState(66);
			match(STEP);
			setState(67);
			expr(0);
			setState(68);
			match(DRAW);
			setState(69);
			match(L_BRACKET);
			setState(70);
			expr(0);
			setState(71);
			match(COMMA);
			setState(72);
			expr(0);
			setState(73);
			match(R_BRACKET);
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

	public static class ColorStatementContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawGraphParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(DrawGraphParser.IS, 0); }
		public TerminalNode BLUE() { return getToken(DrawGraphParser.BLUE, 0); }
		public TerminalNode GREEN() { return getToken(DrawGraphParser.GREEN, 0); }
		public TerminalNode RED() { return getToken(DrawGraphParser.RED, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawGraphParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawGraphParser.COMMA, i);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public ColorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterColorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitColorStatement(this);
		}
	}

	public final ColorStatementContext colorStatement() throws RecognitionException {
		ColorStatementContext _localctx = new ColorStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colorStatement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(COLOR);
				setState(76);
				match(IS);
				setState(77);
				match(BLUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(COLOR);
				setState(79);
				match(IS);
				setState(80);
				match(GREEN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(COLOR);
				setState(82);
				match(IS);
				setState(83);
				match(RED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				match(COLOR);
				setState(85);
				match(IS);
				setState(86);
				match(L_BRACKET);
				setState(87);
				expr(0);
				setState(88);
				match(COMMA);
				setState(89);
				expr(0);
				setState(90);
				match(COMMA);
				setState(91);
				expr(0);
				setState(92);
				match(R_BRACKET);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(DrawGraphParser.POWER, 0); }
		public PowerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterPowerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitPowerExpr(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawGraphParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawGraphParser.DIV, 0); }
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitMulDivExpr(this);
		}
	}
	public static class VarTContext extends ExprContext {
		public TerminalNode T1() { return getToken(DrawGraphParser.T1, 0); }
		public VarTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterVarT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitVarT(this);
		}
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode CONST_ID() { return getToken(DrawGraphParser.CONST_ID, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitConst(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitVarExpr(this);
		}
	}
	public static class PlusMinusExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public PlusMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitPlusMinusExpr(this);
		}
	}
	public static class NestedExprContext extends ExprContext {
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public NestedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitNestedExpr(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DrawGraphParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DrawGraphParser.MINUS, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitUnaryExpr(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(DrawGraphParser.ID, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawGraphParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawGraphParser.R_BRACKET, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DrawGraphListener ) ((DrawGraphListener)listener).exitFuncExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(97);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				expr(8);
				}
				break;
			case 2:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(CONST_ID);
				}
				break;
			case 3:
				{
				_localctx = new VarTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(T1);
				}
				break;
			case 4:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(ID);
				setState(102);
				match(L_BRACKET);
				setState(103);
				expr(0);
				setState(104);
				match(R_BRACKET);
				}
				break;
			case 5:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(L_BRACKET);
				setState(107);
				expr(0);
				setState(108);
				match(R_BRACKET);
				}
				break;
			case 6:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(114);
						match(POWER);
						setState(115);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(117);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(118);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"%\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\n\2\3\22\13\2\4\6\b\n\f\16\20\22\2"+
		"\4\3\2\4\5\3\2\6\7\2\u0089\2\31\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b*\3\2\2"+
		"\2\n\62\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20`\3\2\2\2\22q\3\2\2\2\24\25\5"+
		"\4\3\2\25\26\7\t\2\2\26\30\3\2\2\2\27\24\3\2\2\2\30\33\3\2\2\2\31\27\3"+
		"\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7\2\2\3\35\3\3"+
		"\2\2\2\36%\5\b\5\2\37%\5\n\6\2 %\5\f\7\2!%\5\16\b\2\"%\5\20\t\2#%\5\6"+
		"\4\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2"+
		"%\5\3\2\2\2&\'\7\36\2\2\'(\7\3\2\2()\5\22\n\2)\7\3\2\2\2*+\7\16\2\2+,"+
		"\7\21\2\2,-\7\n\2\2-.\5\22\n\2./\7\f\2\2/\60\5\22\n\2\60\61\7\13\2\2\61"+
		"\t\3\2\2\2\62\63\7\17\2\2\63\64\7\21\2\2\64\65\7\n\2\2\65\66\5\22\n\2"+
		"\66\67\7\f\2\2\678\5\22\n\289\7\13\2\29\13\3\2\2\2:;\7\20\2\2;<\7\21\2"+
		"\2<=\5\22\n\2=\r\3\2\2\2>?\7\25\2\2?@\7\33\2\2@A\7\26\2\2AB\5\22\n\2B"+
		"C\7\22\2\2CD\5\22\n\2DE\7\23\2\2EF\5\22\n\2FG\7\24\2\2GH\7\n\2\2HI\5\22"+
		"\n\2IJ\7\f\2\2JK\5\22\n\2KL\7\13\2\2L\17\3\2\2\2MN\7\32\2\2NO\7\21\2\2"+
		"Oa\7\30\2\2PQ\7\32\2\2QR\7\21\2\2Ra\7\31\2\2ST\7\32\2\2TU\7\21\2\2Ua\7"+
		"\27\2\2VW\7\32\2\2WX\7\21\2\2XY\7\n\2\2YZ\5\22\n\2Z[\7\f\2\2[\\\5\22\n"+
		"\2\\]\7\f\2\2]^\5\22\n\2^_\7\13\2\2_a\3\2\2\2`M\3\2\2\2`P\3\2\2\2`S\3"+
		"\2\2\2`V\3\2\2\2a\21\3\2\2\2bc\b\n\1\2cd\t\2\2\2dr\5\22\n\ner\7\r\2\2"+
		"fr\7\33\2\2gh\7\36\2\2hi\7\n\2\2ij\5\22\n\2jk\7\13\2\2kr\3\2\2\2lm\7\n"+
		"\2\2mn\5\22\n\2no\7\13\2\2or\3\2\2\2pr\7\36\2\2qb\3\2\2\2qe\3\2\2\2qf"+
		"\3\2\2\2qg\3\2\2\2ql\3\2\2\2qp\3\2\2\2r~\3\2\2\2st\f\13\2\2tu\7\b\2\2"+
		"u}\5\22\n\13vw\f\t\2\2wx\t\3\2\2x}\5\22\n\nyz\f\b\2\2z{\t\2\2\2{}\5\22"+
		"\n\t|s\3\2\2\2|v\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\23\3\2\2\2\u0080~\3\2\2\2\b\31$`q|~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}