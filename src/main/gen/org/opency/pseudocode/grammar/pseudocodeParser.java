// Generated from pseudocode.g4 by ANTLR 4.13.2
package org.opency.pseudocode.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pseudocodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, ID=47, BOOL=48, NUMBER=49, STRING=50, WS=51, COMMENT=52;
	public static final int
		RULE_program = 0, RULE_algorithmDecl = 1, RULE_paramList = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_assignment = 5, RULE_ifStatement = 6, RULE_whileStatement = 7, 
		RULE_forStatement = 8, RULE_repeatStatement = 9, RULE_returnStatement = 10, 
		RULE_expressionStatement = 11, RULE_expression = 12, RULE_arrayList = 13, 
		RULE_primary = 14, RULE_argList = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "algorithmDecl", "paramList", "block", "statement", "assignment", 
			"ifStatement", "whileStatement", "forStatement", "repeatStatement", "returnStatement", 
			"expressionStatement", "expression", "arrayList", "primary", "argList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Algorithm'", "'('", "')'", "'end'", "'Procedure'", "','", "'\\u2190'", 
			"'['", "']'", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", 
			"'to'", "'each'", "'in'", "'repeat'", "'until'", "'return'", "'\\u230A'", 
			"'\\u230B'", "'\\u2308'", "'\\u2309'", "'\\u00D7'", "'*'", "'\\u00F7'", 
			"'/'", "'+'", "'-'", "'='", "'\\u2260'", "'<'", "'>'", "'\\u2264'", "'\\u2265'", 
			"'\\u2208'", "'\\u2209'", "'\\u222A'", "'\\u2229'", "'null'", "'true'", 
			"'false'", "'\\u221E'", "'\\u2205'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"BOOL", "NUMBER", "STRING", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "pseudocode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pseudocodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pseudocodeParser.EOF, 0); }
		public List<AlgorithmDeclContext> algorithmDecl() {
			return getRuleContexts(AlgorithmDeclContext.class);
		}
		public AlgorithmDeclContext algorithmDecl(int i) {
			return getRuleContext(AlgorithmDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__4) {
				{
				{
				setState(32);
				algorithmDecl();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
	public static class AlgorithmDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseudocodeParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public AlgorithmDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithmDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterAlgorithmDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitAlgorithmDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitAlgorithmDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgorithmDeclContext algorithmDecl() throws RecognitionException {
		AlgorithmDeclContext _localctx = new AlgorithmDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_algorithmDecl);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(ID);
				setState(42);
				match(T__1);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(43);
					paramList();
					}
				}

				setState(46);
				match(T__2);
				setState(47);
				block();
				setState(48);
				match(T__3);
				setState(49);
				match(T__0);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__4);
				setState(52);
				match(ID);
				setState(53);
				match(T__1);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(54);
					paramList();
					}
				}

				setState(57);
				match(T__2);
				setState(58);
				block();
				setState(59);
				match(T__3);
				setState(60);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pseudocodeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pseudocodeParser.ID, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(65);
				match(T__5);
				setState(66);
				match(ID);
				}
				}
				setState(71);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1965926814098692L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				forStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				repeatStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				expressionStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseudocodeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(ID);
				setState(88);
				match(T__6);
				setState(89);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__7);
				setState(92);
				expression(0);
				setState(93);
				match(T__8);
				setState(94);
				match(T__6);
				setState(95);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__9);
			setState(100);
			expression(0);
			setState(101);
			match(T__10);
			setState(102);
			block();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					match(T__11);
					setState(104);
					match(T__9);
					setState(105);
					expression(0);
					setState(106);
					match(T__10);
					setState(107);
					block();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(114);
				match(T__11);
				setState(115);
				block();
				}
			}

			setState(118);
			match(T__3);
			setState(119);
			match(T__9);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(122);
			expression(0);
			setState(123);
			match(T__13);
			setState(124);
			block();
			setState(125);
			match(T__3);
			setState(126);
			match(T__12);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pseudocodeParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__14);
				setState(129);
				match(ID);
				setState(130);
				match(T__6);
				setState(131);
				expression(0);
				setState(132);
				match(T__15);
				setState(133);
				expression(0);
				setState(134);
				match(T__13);
				setState(135);
				block();
				setState(136);
				match(T__3);
				setState(137);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__14);
				setState(140);
				match(T__16);
				setState(141);
				match(ID);
				setState(142);
				match(T__17);
				setState(143);
				expression(0);
				setState(144);
				match(T__13);
				setState(145);
				block();
				setState(146);
				match(T__3);
				setState(147);
				match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__18);
			setState(152);
			block();
			setState(153);
			match(T__19);
			setState(154);
			expression(0);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__20);
			setState(157);
			expression(0);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			expression(0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(pseudocodeParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ArrayListContext arrayList() {
			return getRuleContext(ArrayListContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(162);
				match(T__21);
				setState(163);
				expression(0);
				setState(164);
				match(T__22);
				}
				break;
			case 2:
				{
				setState(166);
				match(T__23);
				setState(167);
				expression(0);
				setState(168);
				match(T__24);
				}
				break;
			case 3:
				{
				setState(170);
				match(ID);
				setState(171);
				match(T__1);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1965926811435268L) != 0)) {
					{
					setState(172);
					argList();
					}
				}

				setState(175);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(176);
				match(ID);
				setState(177);
				match(T__7);
				setState(178);
				arrayList();
				setState(179);
				match(T__8);
				}
				break;
			case 5:
				{
				setState(181);
				primary();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(185);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(188);
						_la = _input.LA(1);
						if ( !(_la==T__29 || _la==T__30) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(191);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(194);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(195);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(197);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(198);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayListContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pseudocodeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(pseudocodeParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(pseudocodeParser.BOOL, 0); }
		public ArrayListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterArrayList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitArrayList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayListContext arrayList() throws RecognitionException {
		ArrayListContext _localctx = new ArrayListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1974722883485696L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(pseudocodeParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(pseudocodeParser.STRING, 0); }
		public TerminalNode ID() { return getToken(pseudocodeParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(ID);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
				match(T__43);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				match(T__41);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 8);
				{
				setState(213);
				match(T__45);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				match(T__1);
				setState(215);
				expression(0);
				setState(216);
				match(T__2);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 10);
				{
				setState(218);
				match(T__7);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1965926811435268L) != 0)) {
					{
					setState(219);
					argList();
					}
				}

				setState(222);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pseudocodeListener ) ((pseudocodeListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pseudocodeVisitor ) return ((pseudocodeVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expression(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(226);
				match(T__5);
				setState(227);
				expression(0);
				}
				}
				setState(232);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u00ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"-\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002D\b\u0002\n\u0002"+
		"\f\u0002G\t\u0002\u0001\u0003\u0005\u0003J\b\u0003\n\u0003\f\u0003M\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006n\b\u0006\n\u0006\f\u0006q\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b7\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00c8\b\f\n\f\f\f\u00cb\t\f\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00dd\b\u000e\u0001\u000e\u0003\u000e"+
		"\u00e0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00e5\b"+
		"\u000f\n\u000f\f\u000f\u00e8\t\u000f\u0001\u000f\u0000\u0001\u0018\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0006\u0001\u0000\u001a\u001d\u0001\u0000\u001e\u001f"+
		"\u0001\u0000 %\u0001\u0000&\'\u0001\u0000()\u0002\u0000**02\u00fe\u0000"+
		"#\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004@\u0001"+
		"\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000"+
		"\u0000\na\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000ey\u0001"+
		"\u0000\u0000\u0000\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u0097\u0001"+
		"\u0000\u0000\u0000\u0014\u009c\u0001\u0000\u0000\u0000\u0016\u009f\u0001"+
		"\u0000\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00cc\u0001"+
		"\u0000\u0000\u0000\u001c\u00df\u0001\u0000\u0000\u0000\u001e\u00e1\u0001"+
		"\u0000\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000"+
		"\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000"+
		"\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0000"+
		"\u0000\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000"+
		")*\u0005/\u0000\u0000*,\u0005\u0002\u0000\u0000+-\u0003\u0004\u0002\u0000"+
		",+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000"+
		"\u0000./\u0005\u0003\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u0004"+
		"\u0000\u000012\u0005\u0001\u0000\u00002?\u0001\u0000\u0000\u000034\u0005"+
		"\u0005\u0000\u000045\u0005/\u0000\u000057\u0005\u0002\u0000\u000068\u0003"+
		"\u0004\u0002\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\u0006\u0003"+
		"\u0000;<\u0005\u0004\u0000\u0000<=\u0005\u0005\u0000\u0000=?\u0001\u0000"+
		"\u0000\u0000>(\u0001\u0000\u0000\u0000>3\u0001\u0000\u0000\u0000?\u0003"+
		"\u0001\u0000\u0000\u0000@E\u0005/\u0000\u0000AB\u0005\u0006\u0000\u0000"+
		"BD\u0005/\u0000\u0000CA\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000F\u0005\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0003\b\u0004\u0000IH\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NV\u0003\n\u0005\u0000OV\u0003\f\u0006\u0000PV\u0003\u000e\u0007"+
		"\u0000QV\u0003\u0010\b\u0000RV\u0003\u0012\t\u0000SV\u0003\u0014\n\u0000"+
		"TV\u0003\u0016\u000b\u0000UN\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000"+
		"\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\t\u0001"+
		"\u0000\u0000\u0000WX\u0005/\u0000\u0000XY\u0005\u0007\u0000\u0000Yb\u0003"+
		"\u0018\f\u0000Z[\u0005/\u0000\u0000[\\\u0005\b\u0000\u0000\\]\u0003\u0018"+
		"\f\u0000]^\u0005\t\u0000\u0000^_\u0005\u0007\u0000\u0000_`\u0003\u0018"+
		"\f\u0000`b\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000aZ\u0001\u0000"+
		"\u0000\u0000b\u000b\u0001\u0000\u0000\u0000cd\u0005\n\u0000\u0000de\u0003"+
		"\u0018\f\u0000ef\u0005\u000b\u0000\u0000fo\u0003\u0006\u0003\u0000gh\u0005"+
		"\f\u0000\u0000hi\u0005\n\u0000\u0000ij\u0003\u0018\f\u0000jk\u0005\u000b"+
		"\u0000\u0000kl\u0003\u0006\u0003\u0000ln\u0001\u0000\u0000\u0000mg\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pt\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rs\u0005\f\u0000\u0000su\u0003\u0006\u0003\u0000tr\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0005\u0004"+
		"\u0000\u0000wx\u0005\n\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005"+
		"\r\u0000\u0000z{\u0003\u0018\f\u0000{|\u0005\u000e\u0000\u0000|}\u0003"+
		"\u0006\u0003\u0000}~\u0005\u0004\u0000\u0000~\u007f\u0005\r\u0000\u0000"+
		"\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u000f\u0000\u0000"+
		"\u0081\u0082\u0005/\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083"+
		"\u0084\u0003\u0018\f\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\u0086"+
		"\u0003\u0018\f\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u0088\u0003"+
		"\u0006\u0003\u0000\u0088\u0089\u0005\u0004\u0000\u0000\u0089\u008a\u0005"+
		"\u000f\u0000\u0000\u008a\u0096\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u000f\u0000\u0000\u008c\u008d\u0005\u0011\u0000\u0000\u008d\u008e\u0005"+
		"/\u0000\u0000\u008e\u008f\u0005\u0012\u0000\u0000\u008f\u0090\u0003\u0018"+
		"\f\u0000\u0090\u0091\u0005\u000e\u0000\u0000\u0091\u0092\u0003\u0006\u0003"+
		"\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093\u0094\u0005\u000f\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0080\u0001\u0000\u0000"+
		"\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0096\u0011\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0013\u0000\u0000\u0098\u0099\u0003\u0006\u0003"+
		"\u0000\u0099\u009a\u0005\u0014\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000"+
		"\u009b\u0013\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0015\u0000\u0000"+
		"\u009d\u009e\u0003\u0018\f\u0000\u009e\u0015\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003\u0018\f\u0000\u00a0\u0017\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0006\f\uffff\uffff\u0000\u00a2\u00a3\u0005\u0016\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u0017\u0000\u0000\u00a5\u00b7\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0018\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0018\f\u0000\u00a8\u00a9\u0005\u0019\u0000\u0000\u00a9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005/\u0000\u0000\u00ab\u00ad\u0005\u0002\u0000"+
		"\u0000\u00ac\u00ae\u0003\u001e\u000f\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b7\u0005\u0003\u0000\u0000\u00b0\u00b1\u0005/\u0000\u0000"+
		"\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0003\u001a\r\u0000\u00b3"+
		"\u00b4\u0005\t\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7"+
		"\u0003\u001c\u000e\u0000\u00b6\u00a1\u0001\u0000\u0000\u0000\u00b6\u00a6"+
		"\u0001\u0000\u0000\u0000\u00b6\u00aa\u0001\u0000\u0000\u0000\u00b6\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\n\b\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0000\u0000\u0000\u00ba\u00c8\u0003\u0018\f\t\u00bb\u00bc\n\u0007\u0000"+
		"\u0000\u00bc\u00bd\u0007\u0001\u0000\u0000\u00bd\u00c8\u0003\u0018\f\b"+
		"\u00be\u00bf\n\u0006\u0000\u0000\u00bf\u00c0\u0007\u0002\u0000\u0000\u00c0"+
		"\u00c8\u0003\u0018\f\u0007\u00c1\u00c2\n\u0005\u0000\u0000\u00c2\u00c3"+
		"\u0007\u0003\u0000\u0000\u00c3\u00c8\u0003\u0018\f\u0006\u00c4\u00c5\n"+
		"\u0004\u0000\u0000\u00c5\u00c6\u0007\u0004\u0000\u0000\u00c6\u00c8\u0003"+
		"\u0018\f\u0005\u00c7\u00b8\u0001\u0000\u0000\u0000\u00c7\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c7\u00be\u0001\u0000\u0000\u0000\u00c7\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u0019\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0007\u0005\u0000\u0000\u00cd\u001b\u0001\u0000"+
		"\u0000\u0000\u00ce\u00e0\u00051\u0000\u0000\u00cf\u00e0\u00052\u0000\u0000"+
		"\u00d0\u00e0\u0005/\u0000\u0000\u00d1\u00e0\u0005+\u0000\u0000\u00d2\u00e0"+
		"\u0005,\u0000\u0000\u00d3\u00e0\u0005*\u0000\u0000\u00d4\u00e0\u0005-"+
		"\u0000\u0000\u00d5\u00e0\u0005.\u0000\u0000\u00d6\u00d7\u0005\u0002\u0000"+
		"\u0000\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0005\u0003\u0000\u0000"+
		"\u00d9\u00e0\u0001\u0000\u0000\u0000\u00da\u00dc\u0005\b\u0000\u0000\u00db"+
		"\u00dd\u0003\u001e\u000f\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u00e0\u0005\t\u0000\u0000\u00df\u00ce\u0001\u0000\u0000\u0000\u00df\u00cf"+
		"\u0001\u0000\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d1"+
		"\u0001\u0000\u0000\u0000\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00d3"+
		"\u0001\u0000\u0000\u0000\u00df\u00d4\u0001\u0000\u0000\u0000\u00df\u00d5"+
		"\u0001\u0000\u0000\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00da"+
		"\u0001\u0000\u0000\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00e6"+
		"\u0003\u0018\f\u0000\u00e2\u00e3\u0005\u0006\u0000\u0000\u00e3\u00e5\u0003"+
		"\u0018\f\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u001f\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u0012#,7>EKUaot\u0095\u00ad\u00b6\u00c7\u00c9\u00dc\u00df"+
		"\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}