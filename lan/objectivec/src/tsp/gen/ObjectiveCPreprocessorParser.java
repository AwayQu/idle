package tsp.gen;// Generated from ObjectiveCPreprocessorParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjectiveCPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHARP=1, CODE=2, IMPORT=3, INCLUDE=4, PRAGMA=5, DEFINE=6, DEFINED=7, IF=8, 
		ELIF=9, ELSE=10, UNDEF=11, IFDEF=12, IFNDEF=13, ENDIF=14, TRUE=15, FALSE=16, 
		ERROR=17, BANG=18, LPAREN=19, RPAREN=20, EQUAL=21, NOTEQUAL=22, AND=23, 
		OR=24, LT=25, GT=26, LE=27, GE=28, DIRECTIVE_WHITESPACES=29, DIRECTIVE_STRING=30, 
		CONDITIONAL_SYMBOL=31, DECIMAL_LITERAL=32, FLOAT=33, NEW_LINE=34, DIRECITVE_COMMENT=35, 
		DIRECITVE_LINE_COMMENT=36, DIRECITVE_NEW_LINE=37, DIRECITVE_TEXT_NEW_LINE=38, 
		TEXT=39, SLASH=40;
	public static final int
		RULE_objectiveCDocument = 0, RULE_text = 1, RULE_code = 2, RULE_directive = 3, 
		RULE_directive_text = 4, RULE_preprocessor_expression = 5;
	public static final String[] ruleNames = {
		"objectiveCDocument", "text", "code", "directive", "directive_text", "preprocessor_expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", null, null, null, "'pragma'", null, "'defined'", "'if'", 
		"'elif'", "'else'", "'undef'", "'ifdef'", "'ifndef'", "'endif'", null, 
		null, "'error'", "'!'", "'('", "')'", "'=='", "'!='", "'&&'", "'||'", 
		"'<'", "'>'", "'<='", "'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SHARP", "CODE", "IMPORT", "INCLUDE", "PRAGMA", "DEFINE", "DEFINED", 
		"IF", "ELIF", "ELSE", "UNDEF", "IFDEF", "IFNDEF", "ENDIF", "TRUE", "FALSE", 
		"ERROR", "BANG", "LPAREN", "RPAREN", "EQUAL", "NOTEQUAL", "AND", "OR", 
		"LT", "GT", "LE", "GE", "DIRECTIVE_WHITESPACES", "DIRECTIVE_STRING", "CONDITIONAL_SYMBOL", 
		"DECIMAL_LITERAL", "FLOAT", "NEW_LINE", "DIRECITVE_COMMENT", "DIRECITVE_LINE_COMMENT", 
		"DIRECITVE_NEW_LINE", "DIRECITVE_TEXT_NEW_LINE", "TEXT", "SLASH"
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
	public String getGrammarFileName() { return "ObjectiveCPreprocessorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectiveCPreprocessorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ObjectiveCDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjectiveCPreprocessorParser.EOF, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public ObjectiveCDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectiveCDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterObjectiveCDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitObjectiveCDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitObjectiveCDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectiveCDocumentContext objectiveCDocument() throws RecognitionException {
		ObjectiveCDocumentContext _localctx = new ObjectiveCDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_objectiveCDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARP || _la==CODE) {
				{
				{
				setState(12);
				text();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
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

	public static class TextContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(ObjectiveCPreprocessorParser.NEW_LINE, 0); }
		public TerminalNode EOF() { return getToken(ObjectiveCPreprocessorParser.EOF, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		int _la;
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				code();
				}
				break;
			case SHARP:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(SHARP);
				setState(22);
				directive();
				setState(23);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEW_LINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CodeContext extends ParserRuleContext {
		public List<TerminalNode> CODE() { return getTokens(ObjectiveCPreprocessorParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(ObjectiveCPreprocessorParser.CODE, i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_code);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(27);
					match(CODE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreprocessorDefContext extends DirectiveContext {
		public TerminalNode IFDEF() { return getToken(ObjectiveCPreprocessorParser.IFDEF, 0); }
		public TerminalNode CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.CONDITIONAL_SYMBOL, 0); }
		public TerminalNode IFNDEF() { return getToken(ObjectiveCPreprocessorParser.IFNDEF, 0); }
		public TerminalNode UNDEF() { return getToken(ObjectiveCPreprocessorParser.UNDEF, 0); }
		public PreprocessorDefContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorErrorContext extends DirectiveContext {
		public TerminalNode ERROR() { return getToken(ObjectiveCPreprocessorParser.ERROR, 0); }
		public Directive_textContext directive_text() {
			return getRuleContext(Directive_textContext.class,0);
		}
		public PreprocessorErrorContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorError(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorConditionalContext extends DirectiveContext {
		public TerminalNode IF() { return getToken(ObjectiveCPreprocessorParser.IF, 0); }
		public Preprocessor_expressionContext preprocessor_expression() {
			return getRuleContext(Preprocessor_expressionContext.class,0);
		}
		public TerminalNode ELIF() { return getToken(ObjectiveCPreprocessorParser.ELIF, 0); }
		public TerminalNode ELSE() { return getToken(ObjectiveCPreprocessorParser.ELSE, 0); }
		public TerminalNode ENDIF() { return getToken(ObjectiveCPreprocessorParser.ENDIF, 0); }
		public PreprocessorConditionalContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorImportContext extends DirectiveContext {
		public Directive_textContext directive_text() {
			return getRuleContext(Directive_textContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(ObjectiveCPreprocessorParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(ObjectiveCPreprocessorParser.INCLUDE, 0); }
		public PreprocessorImportContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorImport(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorPragmaContext extends DirectiveContext {
		public TerminalNode PRAGMA() { return getToken(ObjectiveCPreprocessorParser.PRAGMA, 0); }
		public Directive_textContext directive_text() {
			return getRuleContext(Directive_textContext.class,0);
		}
		public PreprocessorPragmaContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorPragma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorDefineContext extends DirectiveContext {
		public TerminalNode DEFINE() { return getToken(ObjectiveCPreprocessorParser.DEFINE, 0); }
		public TerminalNode CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.CONDITIONAL_SYMBOL, 0); }
		public Directive_textContext directive_text() {
			return getRuleContext(Directive_textContext.class,0);
		}
		public PreprocessorDefineContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directive);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case INCLUDE:
				_localctx = new PreprocessorImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				_la = _input.LA(1);
				if ( !(_la==IMPORT || _la==INCLUDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				directive_text();
				}
				break;
			case IF:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(IF);
				setState(35);
				preprocessor_expression(0);
				}
				break;
			case ELIF:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(ELIF);
				setState(37);
				preprocessor_expression(0);
				}
				break;
			case ELSE:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(ELSE);
				}
				break;
			case ENDIF:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(ENDIF);
				}
				break;
			case IFDEF:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				match(IFDEF);
				setState(41);
				match(CONDITIONAL_SYMBOL);
				}
				break;
			case IFNDEF:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(IFNDEF);
				setState(43);
				match(CONDITIONAL_SYMBOL);
				}
				break;
			case UNDEF:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(44);
				match(UNDEF);
				setState(45);
				match(CONDITIONAL_SYMBOL);
				}
				break;
			case PRAGMA:
				_localctx = new PreprocessorPragmaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				match(PRAGMA);
				setState(47);
				directive_text();
				}
				break;
			case ERROR:
				_localctx = new PreprocessorErrorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(48);
				match(ERROR);
				setState(49);
				directive_text();
				}
				break;
			case DEFINE:
				_localctx = new PreprocessorDefineContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(50);
				match(DEFINE);
				setState(51);
				match(CONDITIONAL_SYMBOL);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXT) {
					{
					setState(52);
					directive_text();
					}
				}

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

	public static class Directive_textContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(ObjectiveCPreprocessorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ObjectiveCPreprocessorParser.TEXT, i);
		}
		public Directive_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterDirective_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitDirective_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitDirective_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_textContext directive_text() throws RecognitionException {
		Directive_textContext _localctx = new Directive_textContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_directive_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(TEXT);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class Preprocessor_expressionContext extends ParserRuleContext {
		public Preprocessor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessor_expression; }
	 
		public Preprocessor_expressionContext() { }
		public void copyFrom(Preprocessor_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreprocessorParenthesisContext extends Preprocessor_expressionContext {
		public TerminalNode LPAREN() { return getToken(ObjectiveCPreprocessorParser.LPAREN, 0); }
		public Preprocessor_expressionContext preprocessor_expression() {
			return getRuleContext(Preprocessor_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectiveCPreprocessorParser.RPAREN, 0); }
		public PreprocessorParenthesisContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorNotContext extends Preprocessor_expressionContext {
		public TerminalNode BANG() { return getToken(ObjectiveCPreprocessorParser.BANG, 0); }
		public Preprocessor_expressionContext preprocessor_expression() {
			return getRuleContext(Preprocessor_expressionContext.class,0);
		}
		public PreprocessorNotContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorBinaryContext extends Preprocessor_expressionContext {
		public Token op;
		public List<Preprocessor_expressionContext> preprocessor_expression() {
			return getRuleContexts(Preprocessor_expressionContext.class);
		}
		public Preprocessor_expressionContext preprocessor_expression(int i) {
			return getRuleContext(Preprocessor_expressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ObjectiveCPreprocessorParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ObjectiveCPreprocessorParser.NOTEQUAL, 0); }
		public TerminalNode AND() { return getToken(ObjectiveCPreprocessorParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObjectiveCPreprocessorParser.OR, 0); }
		public TerminalNode LT() { return getToken(ObjectiveCPreprocessorParser.LT, 0); }
		public TerminalNode GT() { return getToken(ObjectiveCPreprocessorParser.GT, 0); }
		public TerminalNode LE() { return getToken(ObjectiveCPreprocessorParser.LE, 0); }
		public TerminalNode GE() { return getToken(ObjectiveCPreprocessorParser.GE, 0); }
		public PreprocessorBinaryContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorConstantContext extends Preprocessor_expressionContext {
		public TerminalNode TRUE() { return getToken(ObjectiveCPreprocessorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ObjectiveCPreprocessorParser.FALSE, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjectiveCPreprocessorParser.DECIMAL_LITERAL, 0); }
		public TerminalNode DIRECTIVE_STRING() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_STRING, 0); }
		public PreprocessorConstantContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorConditionalSymbolContext extends Preprocessor_expressionContext {
		public TerminalNode CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.CONDITIONAL_SYMBOL, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectiveCPreprocessorParser.LPAREN, 0); }
		public Preprocessor_expressionContext preprocessor_expression() {
			return getRuleContext(Preprocessor_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ObjectiveCPreprocessorParser.RPAREN, 0); }
		public PreprocessorConditionalSymbolContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditionalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditionalSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorConditionalSymbol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreprocessorDefinedContext extends Preprocessor_expressionContext {
		public TerminalNode DEFINED() { return getToken(ObjectiveCPreprocessorParser.DEFINED, 0); }
		public TerminalNode CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.CONDITIONAL_SYMBOL, 0); }
		public TerminalNode LPAREN() { return getToken(ObjectiveCPreprocessorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ObjectiveCPreprocessorParser.RPAREN, 0); }
		public PreprocessorDefinedContext(Preprocessor_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDefined(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ObjectiveCPreprocessorParserVisitor ) return ((ObjectiveCPreprocessorParserVisitor<? extends T>)visitor).visitPreprocessorDefined(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Preprocessor_expressionContext preprocessor_expression() throws RecognitionException {
		return preprocessor_expression(0);
	}

	private Preprocessor_expressionContext preprocessor_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Preprocessor_expressionContext _localctx = new Preprocessor_expressionContext(_ctx, _parentState);
		Preprocessor_expressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_preprocessor_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(FALSE);
				}
				break;
			case DECIMAL_LITERAL:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(DECIMAL_LITERAL);
				}
				break;
			case DIRECTIVE_STRING:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(DIRECTIVE_STRING);
				}
				break;
			case CONDITIONAL_SYMBOL:
				{
				_localctx = new PreprocessorConditionalSymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(CONDITIONAL_SYMBOL);
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(68);
					match(LPAREN);
					setState(69);
					preprocessor_expression(0);
					setState(70);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case LPAREN:
				{
				_localctx = new PreprocessorParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(LPAREN);
				setState(75);
				preprocessor_expression(0);
				setState(76);
				match(RPAREN);
				}
				break;
			case BANG:
				{
				_localctx = new PreprocessorNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(BANG);
				setState(79);
				preprocessor_expression(6);
				}
				break;
			case DEFINED:
				{
				_localctx = new PreprocessorDefinedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(DEFINED);
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONDITIONAL_SYMBOL:
					{
					setState(81);
					match(CONDITIONAL_SYMBOL);
					}
					break;
				case LPAREN:
					{
					setState(82);
					match(LPAREN);
					setState(83);
					match(CONDITIONAL_SYMBOL);
					setState(84);
					match(RPAREN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PreprocessorBinaryContext(new Preprocessor_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessor_expression);
						setState(89);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(90);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						preprocessor_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new PreprocessorBinaryContext(new Preprocessor_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessor_expression);
						setState(92);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(93);
						((PreprocessorBinaryContext)_localctx).op = match(AND);
						setState(94);
						preprocessor_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new PreprocessorBinaryContext(new Preprocessor_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessor_expression);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						((PreprocessorBinaryContext)_localctx).op = match(OR);
						setState(97);
						preprocessor_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new PreprocessorBinaryContext(new Preprocessor_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessor_expression);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						preprocessor_expression(3);
						}
						break;
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		case 5:
			return preprocessor_expression_sempred((Preprocessor_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean preprocessor_expression_sempred(Preprocessor_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*m\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\6\4\37\n\4\r\4\16\4 \3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\58\n\5\5\5:\n\5\3\6\6\6=\n\6\r\6\16\6>\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7K\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7X\n\7\5\7Z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7h"+
		"\n\7\f\7\16\7k\13\7\3\7\2\3\f\b\2\4\6\b\n\f\2\6\3\3$$\3\2\5\6\3\2\27\30"+
		"\3\2\33\36\2\u0082\2\21\3\2\2\2\4\33\3\2\2\2\6\36\3\2\2\2\b9\3\2\2\2\n"+
		"<\3\2\2\2\fY\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3"+
		"\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3"+
		"\2\2\2\26\34\5\6\4\2\27\30\7\3\2\2\30\31\5\b\5\2\31\32\t\2\2\2\32\34\3"+
		"\2\2\2\33\26\3\2\2\2\33\27\3\2\2\2\34\5\3\2\2\2\35\37\7\4\2\2\36\35\3"+
		"\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\"#\t\3\2\2#:\5\n\6"+
		"\2$%\7\n\2\2%:\5\f\7\2&\'\7\13\2\2\':\5\f\7\2(:\7\f\2\2):\7\20\2\2*+\7"+
		"\16\2\2+:\7!\2\2,-\7\17\2\2-:\7!\2\2./\7\r\2\2/:\7!\2\2\60\61\7\7\2\2"+
		"\61:\5\n\6\2\62\63\7\23\2\2\63:\5\n\6\2\64\65\7\b\2\2\65\67\7!\2\2\66"+
		"8\5\n\6\2\67\66\3\2\2\2\678\3\2\2\28:\3\2\2\29\"\3\2\2\29$\3\2\2\29&\3"+
		"\2\2\29(\3\2\2\29)\3\2\2\29*\3\2\2\29,\3\2\2\29.\3\2\2\29\60\3\2\2\29"+
		"\62\3\2\2\29\64\3\2\2\2:\t\3\2\2\2;=\7)\2\2<;\3\2\2\2=>\3\2\2\2><\3\2"+
		"\2\2>?\3\2\2\2?\13\3\2\2\2@A\b\7\1\2AZ\7\21\2\2BZ\7\22\2\2CZ\7\"\2\2D"+
		"Z\7 \2\2EJ\7!\2\2FG\7\25\2\2GH\5\f\7\2HI\7\26\2\2IK\3\2\2\2JF\3\2\2\2"+
		"JK\3\2\2\2KZ\3\2\2\2LM\7\25\2\2MN\5\f\7\2NO\7\26\2\2OZ\3\2\2\2PQ\7\24"+
		"\2\2QZ\5\f\7\bRW\7\t\2\2SX\7!\2\2TU\7\25\2\2UV\7!\2\2VX\7\26\2\2WS\3\2"+
		"\2\2WT\3\2\2\2XZ\3\2\2\2Y@\3\2\2\2YB\3\2\2\2YC\3\2\2\2YD\3\2\2\2YE\3\2"+
		"\2\2YL\3\2\2\2YP\3\2\2\2YR\3\2\2\2Zi\3\2\2\2[\\\f\7\2\2\\]\t\4\2\2]h\5"+
		"\f\7\b^_\f\6\2\2_`\7\31\2\2`h\5\f\7\7ab\f\5\2\2bc\7\32\2\2ch\5\f\7\6d"+
		"e\f\4\2\2ef\t\5\2\2fh\5\f\7\5g[\3\2\2\2g^\3\2\2\2ga\3\2\2\2gd\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\r\3\2\2\2ki\3\2\2\2\r\21\33 \679>JWYg"+
		"i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}