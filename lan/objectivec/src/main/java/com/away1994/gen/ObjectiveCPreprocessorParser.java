package com.away1994.gen;// Generated from ObjectiveCPreprocessorParser.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjectiveCPreprocessorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTORELEASEPOOL=1, CATCH=2, CLASS=3, DYNAMIC=4, ENCODE=5, END=6, FINALLY=7, 
		IMPLEMENTATION=8, INTERFACE=9, IMPORT=10, PACKAGE=11, PROTOCOL=12, OPTIONAL=13, 
		PRIVATE=14, PROPERTY=15, PROTECTED=16, PUBLIC=17, REQUIRED=18, SELECTOR=19, 
		SYNCHRONIZED=20, SYNTHESIZE=21, THROW=22, TRY=23, ABSTRACT=24, AUTO=25, 
		BOOLEAN=26, BREAK=27, BYCOPY=28, BYREF=29, CASE=30, CHAR=31, CONST=32, 
		CONTINUE=33, DEFAULT=34, DO=35, DOUBLE=36, ELSE=37, ENUM=38, EXTERN=39, 
		FLOAT=40, FOR=41, ID=42, IF=43, IN=44, INOUT=45, INSTANCETYPE=46, GOTO=47, 
		INT=48, LONG=49, ONEWAY=50, OUT=51, REGISTER=52, RETURN=53, SHORT=54, 
		SIGNED=55, SIZEOF=56, STATIC=57, STRUCT=58, SWITCH=59, TYPEDEF=60, UNION=61, 
		UNSIGNED=62, VOID=63, VOLATILE=64, WHILE=65, NS_OPTIONS=66, NS_ENUM=67, 
		WWEAK=68, WUNSAFE_UNRETAINED=69, WUNUSED=70, WDEPRECATED=71, WAUTORELEASING=72, 
		TYPEOF=73, TYPEOF__=74, TYPEOF____=75, KINDOF__=76, COVARIANT=77, CONTRAVARIANT=78, 
		ATTRIBUTE=79, NULLABLE=80, NONNULL=81, NS_ASSUME_NONNULL_BEGIN=82, NS_ASSUME_NONNULL_END=83, 
		EXTERN_SUFFIX=84, IOS_SUFFIX=85, MAC_SUFFIX=86, TVOS_PROHIBITED=87, LP=88, 
		RP=89, LBRACE=90, RBRACE=91, LBRACK=92, RBRACK=93, SEMI=94, COMMA=95, 
		DOT=96, STRUCTACCESS=97, AT=98, ASSIGN=99, GT=100, LT=101, BANG=102, TILDE=103, 
		QUESTION=104, COLON=105, EQUAL=106, LE=107, GE=108, NOTEQUAL=109, AND=110, 
		OR=111, INC=112, DEC=113, ADD=114, SUB=115, MUL=116, DIV=117, BITAND=118, 
		BITOR=119, CARET=120, MOD=121, ADD_ASSIGN=122, SUB_ASSIGN=123, MUL_ASSIGN=124, 
		DIV_ASSIGN=125, AND_ASSIGN=126, OR_ASSIGN=127, XOR_ASSIGN=128, MOD_ASSIGN=129, 
		LSHIFT_ASSIGN=130, RSHIFT_ASSIGN=131, ELIPSIS=132, ASSIGNPA=133, GETTER=134, 
		NONATOMIC=135, SETTER=136, STRONG=137, RETAIN=138, READONLY=139, READWRITE=140, 
		WEAK=141, IB_OUTLET=142, IB_OUTLET_COLLECTION=143, IDENTIFIER=144, CHARACTER_LITERAL=145, 
		QUOTE_STRING=146, STRING=147, HEX_LITERAL=148, OCTAL_LITERAL=149, BINARY_LITERAL=150, 
		DECIMAL_LITERAL=151, FLOATING_POINT_LITERAL=152, WS=153, COMMENT=154, 
		LINE_COMMENT=155, BACKSLASH=156, SHARP=157, DIRECTIVE_IMPORT=158, DIRECTIVE_INCLUDE=159, 
		DIRECTIVE_PRAGMA=160, DIRECTIVE_DEFINE=161, DIRECTIVE_DEFINED=162, DIRECTIVE_IF=163, 
		DIRECTIVE_ELIF=164, DIRECTIVE_ELSE=165, DIRECTIVE_UNDEF=166, DIRECTIVE_IFDEF=167, 
		DIRECTIVE_IFNDEF=168, DIRECTIVE_ENDIF=169, DIRECTIVE_TRUE=170, DIRECTIVE_FALSE=171, 
		DIRECTIVE_ERROR=172, DIRECTIVE_WARNING=173, DIRECTIVE_BANG=174, DIRECTIVE_LP=175, 
		DIRECTIVE_RP=176, DIRECTIVE_EQUAL=177, DIRECTIVE_NOTEQUAL=178, DIRECTIVE_AND=179, 
		DIRECTIVE_OR=180, DIRECTIVE_LT=181, DIRECTIVE_GT=182, DIRECTIVE_LE=183, 
		DIRECTIVE_GE=184, DIRECTIVE_WS=185, DIRECTIVE_STRING=186, DIRECTIVE_CONDITIONAL_SYMBOL=187, 
		DIRECTIVE_DECIMAL_LITERAL=188, DIRECTIVE_FLOAT=189, DIRECTIVE_NEW_LINE=190, 
		DIRECTIVE_COMMENT=191, DIRECTIVE_LINE_COMMENT=192, DIRECTIVE_BACKSLASH_NEW_LINE=193, 
		DIRECTIVE_TEXT_NEW_LINE=194, DIRECTIVE_TEXT=195;
	public static final int
		RULE_directive = 0, RULE_directiveText = 1, RULE_preprocessorExpression = 2;
	public static final String[] ruleNames = {
		"directive", "directiveText", "preprocessorExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@autoreleasepool'", "'@catch'", "'@class'", "'@dynamic'", "'@encode'", 
		"'@end'", "'@finally'", "'@implementation'", "'@interface'", "'@import'", 
		"'@package'", "'@protocol'", "'@optional'", "'@private'", "'@property'", 
		"'@protected'", "'@public'", "'@required'", "'@selector'", "'@synchronized'", 
		"'@synthesize'", "'@throw'", "'@try'", "'abstract'", "'auto'", "'boolean'", 
		"'break'", "'bycopy'", "'byref'", "'case'", "'char'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", null, "'enum'", "'extern'", "'float'", 
		"'for'", "'id'", null, "'in'", "'inout'", "'instancetype'", "'goto'", 
		"'int'", "'long'", "'oneway'", "'out'", "'register'", "'return'", "'short'", 
		"'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", 
		"'union'", "'unsigned'", "'void'", "'volatile'", "'while'", "'NS_OPTIONS'", 
		"'NS_ENUM'", "'__weak'", "'__unsafe_unretained'", "'__unused'", "'__deprecated'", 
		"'__autoreleasing'", "'typeof'", "'__typeof'", "'__typeof__'", "'__kindof'", 
		"'__covariant'", "'__contravariant'", "'__attribute__'", "'nullable'", 
		"'nonnull'", null, null, null, null, null, "'__TVOS_PROHIBITED'", null, 
		null, "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'@'", 
		"'='", null, null, null, "'~'", "'?'", "':'", null, null, null, null, 
		null, null, "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'...'", "'assign'", "'getter'", "'nonatomic'", 
		"'setter'", "'strong'", "'retain'", "'readonly'", "'readwrite'", "'weak'", 
		"'IBOutlet'", "'IBOutletCollection'", null, null, null, null, null, null, 
		null, null, null, null, null, null, "'\\'", null, null, null, null, null, 
		"'defined'", null, "'elif'", null, "'undef'", "'ifdef'", "'ifndef'", "'endif'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AUTORELEASEPOOL", "CATCH", "CLASS", "DYNAMIC", "ENCODE", "END", 
		"FINALLY", "IMPLEMENTATION", "INTERFACE", "IMPORT", "PACKAGE", "PROTOCOL", 
		"OPTIONAL", "PRIVATE", "PROPERTY", "PROTECTED", "PUBLIC", "REQUIRED", 
		"SELECTOR", "SYNCHRONIZED", "SYNTHESIZE", "THROW", "TRY", "ABSTRACT", 
		"AUTO", "BOOLEAN", "BREAK", "BYCOPY", "BYREF", "CASE", "CHAR", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTERN", "FLOAT", 
		"FOR", "ID", "IF", "IN", "INOUT", "INSTANCETYPE", "GOTO", "INT", "LONG", 
		"ONEWAY", "OUT", "REGISTER", "RETURN", "SHORT", "SIGNED", "SIZEOF", "STATIC", 
		"STRUCT", "SWITCH", "TYPEDEF", "UNION", "UNSIGNED", "VOID", "VOLATILE", 
		"WHILE", "NS_OPTIONS", "NS_ENUM", "WWEAK", "WUNSAFE_UNRETAINED", "WUNUSED", 
		"WDEPRECATED", "WAUTORELEASING", "TYPEOF", "TYPEOF__", "TYPEOF____", "KINDOF__", 
		"COVARIANT", "CONTRAVARIANT", "ATTRIBUTE", "NULLABLE", "NONNULL", "NS_ASSUME_NONNULL_BEGIN", 
		"NS_ASSUME_NONNULL_END", "EXTERN_SUFFIX", "IOS_SUFFIX", "MAC_SUFFIX", 
		"TVOS_PROHIBITED", "LP", "RP", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "STRUCTACCESS", "AT", "ASSIGN", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"ELIPSIS", "ASSIGNPA", "GETTER", "NONATOMIC", "SETTER", "STRONG", "RETAIN", 
		"READONLY", "READWRITE", "WEAK", "IB_OUTLET", "IB_OUTLET_COLLECTION", 
		"IDENTIFIER", "CHARACTER_LITERAL", "QUOTE_STRING", "STRING", "HEX_LITERAL", 
		"OCTAL_LITERAL", "BINARY_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"WS", "COMMENT", "LINE_COMMENT", "BACKSLASH", "SHARP", "DIRECTIVE_IMPORT", 
		"DIRECTIVE_INCLUDE", "DIRECTIVE_PRAGMA", "DIRECTIVE_DEFINE", "DIRECTIVE_DEFINED", 
		"DIRECTIVE_IF", "DIRECTIVE_ELIF", "DIRECTIVE_ELSE", "DIRECTIVE_UNDEF", 
		"DIRECTIVE_IFDEF", "DIRECTIVE_IFNDEF", "DIRECTIVE_ENDIF", "DIRECTIVE_TRUE", 
		"DIRECTIVE_FALSE", "DIRECTIVE_ERROR", "DIRECTIVE_WARNING", "DIRECTIVE_BANG", 
		"DIRECTIVE_LP", "DIRECTIVE_RP", "DIRECTIVE_EQUAL", "DIRECTIVE_NOTEQUAL", 
		"DIRECTIVE_AND", "DIRECTIVE_OR", "DIRECTIVE_LT", "DIRECTIVE_GT", "DIRECTIVE_LE", 
		"DIRECTIVE_GE", "DIRECTIVE_WS", "DIRECTIVE_STRING", "DIRECTIVE_CONDITIONAL_SYMBOL", 
		"DIRECTIVE_DECIMAL_LITERAL", "DIRECTIVE_FLOAT", "DIRECTIVE_NEW_LINE", 
		"DIRECTIVE_COMMENT", "DIRECTIVE_LINE_COMMENT", "DIRECTIVE_BACKSLASH_NEW_LINE", 
		"DIRECTIVE_TEXT_NEW_LINE", "DIRECTIVE_TEXT"
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
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_IFDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IFDEF, 0); }
		public TerminalNode DIRECTIVE_CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_CONDITIONAL_SYMBOL, 0); }
		public TerminalNode DIRECTIVE_IFNDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IFNDEF, 0); }
		public TerminalNode DIRECTIVE_UNDEF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_UNDEF, 0); }
		public PreprocessorDefContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDef(this);
		}
	}
	public static class PreprocessorErrorContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_ERROR() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ERROR, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
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
	}
	public static class PreprocessorConditionalContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_IF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IF, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_ELIF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ELIF, 0); }
		public TerminalNode DIRECTIVE_ELSE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ELSE, 0); }
		public TerminalNode DIRECTIVE_ENDIF() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_ENDIF, 0); }
		public PreprocessorConditionalContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditional(this);
		}
	}
	public static class PreprocessorImportContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public TerminalNode DIRECTIVE_IMPORT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_IMPORT, 0); }
		public TerminalNode DIRECTIVE_INCLUDE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_INCLUDE, 0); }
		public PreprocessorImportContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorImport(this);
		}
	}
	public static class PreprocessorPragmaContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_PRAGMA() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_PRAGMA, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
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
	}
	public static class PreprocessorDefineContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_DEFINE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DEFINE, 0); }
		public TerminalNode DIRECTIVE_CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_CONDITIONAL_SYMBOL, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
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
	}
	public static class PreprocessorWarningContext extends DirectiveContext {
		public TerminalNode SHARP() { return getToken(ObjectiveCPreprocessorParser.SHARP, 0); }
		public TerminalNode DIRECTIVE_WARNING() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_WARNING, 0); }
		public DirectiveTextContext directiveText() {
			return getRuleContext(DirectiveTextContext.class,0);
		}
		public PreprocessorWarningContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorWarning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorWarning(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_directive);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PreprocessorImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(SHARP);
				setState(7);
				_la = _input.LA(1);
				if ( !(_la==DIRECTIVE_IMPORT || _la==DIRECTIVE_INCLUDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(8);
				directiveText();
				}
				break;
			case 2:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(9);
				match(SHARP);
				setState(10);
				match(DIRECTIVE_IF);
				setState(11);
				preprocessorExpression(0);
				}
				break;
			case 3:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(12);
				match(SHARP);
				setState(13);
				match(DIRECTIVE_ELIF);
				setState(14);
				preprocessorExpression(0);
				}
				break;
			case 4:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(15);
				match(SHARP);
				setState(16);
				match(DIRECTIVE_ELSE);
				}
				break;
			case 5:
				_localctx = new PreprocessorConditionalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(17);
				match(SHARP);
				setState(18);
				match(DIRECTIVE_ENDIF);
				}
				break;
			case 6:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(19);
				match(SHARP);
				setState(20);
				match(DIRECTIVE_IFDEF);
				setState(21);
				match(DIRECTIVE_CONDITIONAL_SYMBOL);
				}
				break;
			case 7:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				match(SHARP);
				setState(23);
				match(DIRECTIVE_IFNDEF);
				setState(24);
				match(DIRECTIVE_CONDITIONAL_SYMBOL);
				}
				break;
			case 8:
				_localctx = new PreprocessorDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(25);
				match(SHARP);
				setState(26);
				match(DIRECTIVE_UNDEF);
				setState(27);
				match(DIRECTIVE_CONDITIONAL_SYMBOL);
				}
				break;
			case 9:
				_localctx = new PreprocessorPragmaContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(28);
				match(SHARP);
				setState(29);
				match(DIRECTIVE_PRAGMA);
				setState(30);
				directiveText();
				}
				break;
			case 10:
				_localctx = new PreprocessorErrorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(31);
				match(SHARP);
				setState(32);
				match(DIRECTIVE_ERROR);
				setState(33);
				directiveText();
				}
				break;
			case 11:
				_localctx = new PreprocessorWarningContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(34);
				match(SHARP);
				setState(35);
				match(DIRECTIVE_WARNING);
				setState(36);
				directiveText();
				}
				break;
			case 12:
				_localctx = new PreprocessorDefineContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(37);
				match(SHARP);
				setState(38);
				match(DIRECTIVE_DEFINE);
				setState(39);
				match(DIRECTIVE_CONDITIONAL_SYMBOL);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIRECTIVE_TEXT) {
					{
					setState(40);
					directiveText();
					}
				}

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

	public static class DirectiveTextContext extends ParserRuleContext {
		public List<TerminalNode> DIRECTIVE_TEXT() { return getTokens(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT); }
		public TerminalNode DIRECTIVE_TEXT(int i) {
			return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_TEXT, i);
		}
		public DirectiveTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterDirectiveText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitDirectiveText(this);
		}
	}

	public final DirectiveTextContext directiveText() throws RecognitionException {
		DirectiveTextContext _localctx = new DirectiveTextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directiveText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				match(DIRECTIVE_TEXT);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIRECTIVE_TEXT );
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

	public static class PreprocessorExpressionContext extends ParserRuleContext {
		public PreprocessorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preprocessorExpression; }
	 
		public PreprocessorExpressionContext() { }
		public void copyFrom(PreprocessorExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreprocessorParenthesisContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorParenthesisContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorParenthesis(this);
		}
	}
	public static class PreprocessorNotContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_BANG() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_BANG, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public PreprocessorNotContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorNot(this);
		}
	}
	public static class PreprocessorBinaryContext extends PreprocessorExpressionContext {
		public Token op;
		public List<PreprocessorExpressionContext> preprocessorExpression() {
			return getRuleContexts(PreprocessorExpressionContext.class);
		}
		public PreprocessorExpressionContext preprocessorExpression(int i) {
			return getRuleContext(PreprocessorExpressionContext.class,i);
		}
		public TerminalNode DIRECTIVE_EQUAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_EQUAL, 0); }
		public TerminalNode DIRECTIVE_NOTEQUAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_NOTEQUAL, 0); }
		public TerminalNode DIRECTIVE_AND() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_AND, 0); }
		public TerminalNode DIRECTIVE_OR() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_OR, 0); }
		public TerminalNode DIRECTIVE_LT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LT, 0); }
		public TerminalNode DIRECTIVE_GT() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_GT, 0); }
		public TerminalNode DIRECTIVE_LE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LE, 0); }
		public TerminalNode DIRECTIVE_GE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_GE, 0); }
		public PreprocessorBinaryContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorBinary(this);
		}
	}
	public static class PreprocessorConstantContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_TRUE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_TRUE, 0); }
		public TerminalNode DIRECTIVE_FALSE() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_FALSE, 0); }
		public TerminalNode DIRECTIVE_DECIMAL_LITERAL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DECIMAL_LITERAL, 0); }
		public TerminalNode DIRECTIVE_STRING() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_STRING, 0); }
		public PreprocessorConstantContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConstant(this);
		}
	}
	public static class PreprocessorConditionalSymbolContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_CONDITIONAL_SYMBOL, 0); }
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public PreprocessorExpressionContext preprocessorExpression() {
			return getRuleContext(PreprocessorExpressionContext.class,0);
		}
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorConditionalSymbolContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorConditionalSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorConditionalSymbol(this);
		}
	}
	public static class PreprocessorDefinedContext extends PreprocessorExpressionContext {
		public TerminalNode DIRECTIVE_DEFINED() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_DEFINED, 0); }
		public TerminalNode DIRECTIVE_CONDITIONAL_SYMBOL() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_CONDITIONAL_SYMBOL, 0); }
		public TerminalNode DIRECTIVE_LP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_LP, 0); }
		public TerminalNode DIRECTIVE_RP() { return getToken(ObjectiveCPreprocessorParser.DIRECTIVE_RP, 0); }
		public PreprocessorDefinedContext(PreprocessorExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).enterPreprocessorDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCPreprocessorParserListener ) ((ObjectiveCPreprocessorParserListener)listener).exitPreprocessorDefined(this);
		}
	}

	public final PreprocessorExpressionContext preprocessorExpression() throws RecognitionException {
		return preprocessorExpression(0);
	}

	private PreprocessorExpressionContext preprocessorExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PreprocessorExpressionContext _localctx = new PreprocessorExpressionContext(_ctx, _parentState);
		PreprocessorExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_preprocessorExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIRECTIVE_TRUE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(DIRECTIVE_TRUE);
				}
				break;
			case DIRECTIVE_FALSE:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(DIRECTIVE_FALSE);
				}
				break;
			case DIRECTIVE_DECIMAL_LITERAL:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(DIRECTIVE_DECIMAL_LITERAL);
				}
				break;
			case DIRECTIVE_STRING:
				{
				_localctx = new PreprocessorConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(DIRECTIVE_STRING);
				}
				break;
			case DIRECTIVE_CONDITIONAL_SYMBOL:
				{
				_localctx = new PreprocessorConditionalSymbolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(DIRECTIVE_CONDITIONAL_SYMBOL);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					match(DIRECTIVE_LP);
					setState(57);
					preprocessorExpression(0);
					setState(58);
					match(DIRECTIVE_RP);
					}
					break;
				}
				}
				break;
			case DIRECTIVE_LP:
				{
				_localctx = new PreprocessorParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(DIRECTIVE_LP);
				setState(63);
				preprocessorExpression(0);
				setState(64);
				match(DIRECTIVE_RP);
				}
				break;
			case DIRECTIVE_BANG:
				{
				_localctx = new PreprocessorNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(DIRECTIVE_BANG);
				setState(67);
				preprocessorExpression(6);
				}
				break;
			case DIRECTIVE_DEFINED:
				{
				_localctx = new PreprocessorDefinedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(DIRECTIVE_DEFINED);
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIRECTIVE_CONDITIONAL_SYMBOL:
					{
					setState(69);
					match(DIRECTIVE_CONDITIONAL_SYMBOL);
					}
					break;
				case DIRECTIVE_LP:
					{
					setState(70);
					match(DIRECTIVE_LP);
					setState(71);
					match(DIRECTIVE_CONDITIONAL_SYMBOL);
					setState(72);
					match(DIRECTIVE_RP);
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
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(77);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(78);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIRECTIVE_EQUAL || _la==DIRECTIVE_NOTEQUAL) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						preprocessorExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(80);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(81);
						((PreprocessorBinaryContext)_localctx).op = match(DIRECTIVE_AND);
						setState(82);
						preprocessorExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(83);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(84);
						((PreprocessorBinaryContext)_localctx).op = match(DIRECTIVE_OR);
						setState(85);
						preprocessorExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new PreprocessorBinaryContext(new PreprocessorExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_preprocessorExpression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						((PreprocessorBinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & ((1L << (DIRECTIVE_LT - 181)) | (1L << (DIRECTIVE_GT - 181)) | (1L << (DIRECTIVE_LE - 181)) | (1L << (DIRECTIVE_GE - 181)))) != 0)) ) {
							((PreprocessorBinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						preprocessorExpression(3);
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 2:
			return preprocessorExpression_sempred((PreprocessorExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean preprocessorExpression_sempred(PreprocessorExpressionContext _localctx, int predIndex) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c5a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2,\n\2\5\2.\n\2\3\3\6\3\61\n\3\r\3\16\3\62\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4L\n\4\5\4N\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\2\3\6\5\2\4\6\2\5\3\2\u00a0\u00a1"+
		"\3\2\u00b3\u00b4\3\2\u00b7\u00ba\2w\2-\3\2\2\2\4\60\3\2\2\2\6M\3\2\2\2"+
		"\b\t\7\u009f\2\2\t\n\t\2\2\2\n.\5\4\3\2\13\f\7\u009f\2\2\f\r\7\u00a5\2"+
		"\2\r.\5\6\4\2\16\17\7\u009f\2\2\17\20\7\u00a6\2\2\20.\5\6\4\2\21\22\7"+
		"\u009f\2\2\22.\7\u00a7\2\2\23\24\7\u009f\2\2\24.\7\u00ab\2\2\25\26\7\u009f"+
		"\2\2\26\27\7\u00a9\2\2\27.\7\u00bd\2\2\30\31\7\u009f\2\2\31\32\7\u00aa"+
		"\2\2\32.\7\u00bd\2\2\33\34\7\u009f\2\2\34\35\7\u00a8\2\2\35.\7\u00bd\2"+
		"\2\36\37\7\u009f\2\2\37 \7\u00a2\2\2 .\5\4\3\2!\"\7\u009f\2\2\"#\7\u00ae"+
		"\2\2#.\5\4\3\2$%\7\u009f\2\2%&\7\u00af\2\2&.\5\4\3\2\'(\7\u009f\2\2()"+
		"\7\u00a3\2\2)+\7\u00bd\2\2*,\5\4\3\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-\b"+
		"\3\2\2\2-\13\3\2\2\2-\16\3\2\2\2-\21\3\2\2\2-\23\3\2\2\2-\25\3\2\2\2-"+
		"\30\3\2\2\2-\33\3\2\2\2-\36\3\2\2\2-!\3\2\2\2-$\3\2\2\2-\'\3\2\2\2.\3"+
		"\3\2\2\2/\61\7\u00c5\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\5\3\2\2\2\64\65\b\4\1\2\65N\7\u00ac\2\2\66N\7\u00ad\2\2\67"+
		"N\7\u00be\2\28N\7\u00bc\2\29>\7\u00bd\2\2:;\7\u00b1\2\2;<\5\6\4\2<=\7"+
		"\u00b2\2\2=?\3\2\2\2>:\3\2\2\2>?\3\2\2\2?N\3\2\2\2@A\7\u00b1\2\2AB\5\6"+
		"\4\2BC\7\u00b2\2\2CN\3\2\2\2DE\7\u00b0\2\2EN\5\6\4\bFK\7\u00a4\2\2GL\7"+
		"\u00bd\2\2HI\7\u00b1\2\2IJ\7\u00bd\2\2JL\7\u00b2\2\2KG\3\2\2\2KH\3\2\2"+
		"\2LN\3\2\2\2M\64\3\2\2\2M\66\3\2\2\2M\67\3\2\2\2M8\3\2\2\2M9\3\2\2\2M"+
		"@\3\2\2\2MD\3\2\2\2MF\3\2\2\2N]\3\2\2\2OP\f\7\2\2PQ\t\3\2\2Q\\\5\6\4\b"+
		"RS\f\6\2\2ST\7\u00b5\2\2T\\\5\6\4\7UV\f\5\2\2VW\7\u00b6\2\2W\\\5\6\4\6"+
		"XY\f\4\2\2YZ\t\4\2\2Z\\\5\6\4\5[O\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2"+
		"\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_]\3\2\2\2\n+-\62>KM[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}