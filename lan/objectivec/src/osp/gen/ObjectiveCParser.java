package osp.gen;// Generated from ObjectiveCParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjectiveCParser extends Parser {
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
		RULE_translationUnit = 0, RULE_externalDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_classInterface = 3, RULE_categoryInterface = 4, RULE_classImplementation = 5, 
		RULE_categoryImplementation = 6, RULE_protocolDeclaration = 7, RULE_protocolDeclarationList = 8, 
		RULE_classDeclarationList = 9, RULE_classList = 10, RULE_protocolReferenceList = 11, 
		RULE_protocolList = 12, RULE_propertyDeclaration = 13, RULE_propertyAttributesList = 14, 
		RULE_propertyAttribute = 15, RULE_className = 16, RULE_superclassName = 17, 
		RULE_categoryName = 18, RULE_protocolName = 19, RULE_instanceVariables = 20, 
		RULE_visibilitySpecification = 21, RULE_interfaceDeclarationList = 22, 
		RULE_classMethodDeclaration = 23, RULE_instanceMethodDeclaration = 24, 
		RULE_methodDeclaration = 25, RULE_implementationDefinitionList = 26, RULE_classMethodDefinition = 27, 
		RULE_instanceMethodDefinition = 28, RULE_methodDefinition = 29, RULE_methodSelector = 30, 
		RULE_keywordDeclarator = 31, RULE_selector = 32, RULE_methodType = 33, 
		RULE_propertyImplementation = 34, RULE_propertySynthesizeList = 35, RULE_propertySynthesizeItem = 36, 
		RULE_blockType = 37, RULE_genericsSpecifier = 38, RULE_protocolQualifier = 39, 
		RULE_dictionaryExpression = 40, RULE_dictionaryPair = 41, RULE_arrayExpression = 42, 
		RULE_boxExpression = 43, RULE_blockParameters = 44, RULE_blockExpression = 45, 
		RULE_messageExpression = 46, RULE_receiver = 47, RULE_messageSelector = 48, 
		RULE_keywordArgument = 49, RULE_selectorExpression = 50, RULE_selectorName = 51, 
		RULE_protocolExpression = 52, RULE_encodeExpression = 53, RULE_typeVariableDeclarator = 54, 
		RULE_throwStatement = 55, RULE_tryBlock = 56, RULE_catchStatement = 57, 
		RULE_synchronizedStatement = 58, RULE_autoreleaseStatement = 59, RULE_functionDefinition = 60, 
		RULE_attributeSpecifier = 61, RULE_attribute = 62, RULE_attributeName = 63, 
		RULE_attributeParameters = 64, RULE_attributeParameterList = 65, RULE_attributeParameter = 66, 
		RULE_attributeParameterAssignment = 67, RULE_declaration = 68, RULE_functionCallDeclaration = 69, 
		RULE_enumDeclaration = 70, RULE_varDeclaration = 71, RULE_declarationSpecifiers = 72, 
		RULE_ibOutletSpecifier = 73, RULE_initDeclaratorList = 74, RULE_initDeclarator = 75, 
		RULE_structOrUnionSpecifier = 76, RULE_structDeclaration = 77, RULE_specifierQualifierList = 78, 
		RULE_arcBehaviourSpecifier = 79, RULE_nullabilitySpecifier = 80, RULE_storageClassSpecifier = 81, 
		RULE_typeSpecifier = 82, RULE_typeQualifier = 83, RULE_typeofExpression = 84, 
		RULE_classNameGeneric = 85, RULE_structDeclaratorList = 86, RULE_structDeclarator = 87, 
		RULE_enumSpecifier = 88, RULE_enumeratorList = 89, RULE_enumerator = 90, 
		RULE_enumeratorIdentifier = 91, RULE_directDeclarator = 92, RULE_declaratorSuffix = 93, 
		RULE_parameterList = 94, RULE_pointer = 95, RULE_macros = 96, RULE_initializer = 97, 
		RULE_arrayInitializer = 98, RULE_structInitializer = 99, RULE_initializerList = 100, 
		RULE_typeName = 101, RULE_abstractDeclarator = 102, RULE_abstractDeclaratorSuffix = 103, 
		RULE_parameterDeclarationList = 104, RULE_parameterDeclaration = 105, 
		RULE_declarator = 106, RULE_statement = 107, RULE_labeledStatement = 108, 
		RULE_rangeExpression = 109, RULE_compoundStatement = 110, RULE_selectionStatement = 111, 
		RULE_switchStatement = 112, RULE_switchBlock = 113, RULE_switchSection = 114, 
		RULE_switchLabel = 115, RULE_forLoopInitializer = 116, RULE_iterationStatement = 117, 
		RULE_whileStatement = 118, RULE_doStatement = 119, RULE_forStatement = 120, 
		RULE_forInStatement = 121, RULE_jumpStatement = 122, RULE_expression = 123, 
		RULE_assignmentExpression = 124, RULE_conditionalExpression = 125, RULE_binaryExpression = 126, 
		RULE_castExpression = 127, RULE_assignmentOperator = 128, RULE_constantExpression = 129, 
		RULE_unaryExpression = 130, RULE_unaryOperator = 131, RULE_postfixExpression = 132, 
		RULE_argumentExpressionList = 133, RULE_argumentExpression = 134, RULE_primaryExpression = 135, 
		RULE_constant = 136, RULE_stringLiteral = 137, RULE_identifier = 138;
	public static final String[] ruleNames = {
		"translationUnit", "externalDeclaration", "importDeclaration", "classInterface", 
		"categoryInterface", "classImplementation", "categoryImplementation", 
		"protocolDeclaration", "protocolDeclarationList", "classDeclarationList", 
		"classList", "protocolReferenceList", "protocolList", "propertyDeclaration", 
		"propertyAttributesList", "propertyAttribute", "className", "superclassName", 
		"categoryName", "protocolName", "instanceVariables", "visibilitySpecification", 
		"interfaceDeclarationList", "classMethodDeclaration", "instanceMethodDeclaration", 
		"methodDeclaration", "implementationDefinitionList", "classMethodDefinition", 
		"instanceMethodDefinition", "methodDefinition", "methodSelector", "keywordDeclarator", 
		"selector", "methodType", "propertyImplementation", "propertySynthesizeList", 
		"propertySynthesizeItem", "blockType", "genericsSpecifier", "protocolQualifier", 
		"dictionaryExpression", "dictionaryPair", "arrayExpression", "boxExpression", 
		"blockParameters", "blockExpression", "messageExpression", "receiver", 
		"messageSelector", "keywordArgument", "selectorExpression", "selectorName", 
		"protocolExpression", "encodeExpression", "typeVariableDeclarator", "throwStatement", 
		"tryBlock", "catchStatement", "synchronizedStatement", "autoreleaseStatement", 
		"functionDefinition", "attributeSpecifier", "attribute", "attributeName", 
		"attributeParameters", "attributeParameterList", "attributeParameter", 
		"attributeParameterAssignment", "declaration", "functionCallDeclaration", 
		"enumDeclaration", "varDeclaration", "declarationSpecifiers", "ibOutletSpecifier", 
		"initDeclaratorList", "initDeclarator", "structOrUnionSpecifier", "structDeclaration", 
		"specifierQualifierList", "arcBehaviourSpecifier", "nullabilitySpecifier", 
		"storageClassSpecifier", "typeSpecifier", "typeQualifier", "typeofExpression", 
		"classNameGeneric", "structDeclaratorList", "structDeclarator", "enumSpecifier", 
		"enumeratorList", "enumerator", "enumeratorIdentifier", "directDeclarator", 
		"declaratorSuffix", "parameterList", "pointer", "macros", "initializer", 
		"arrayInitializer", "structInitializer", "initializerList", "typeName", 
		"abstractDeclarator", "abstractDeclaratorSuffix", "parameterDeclarationList", 
		"parameterDeclaration", "declarator", "statement", "labeledStatement", 
		"rangeExpression", "compoundStatement", "selectionStatement", "switchStatement", 
		"switchBlock", "switchSection", "switchLabel", "forLoopInitializer", "iterationStatement", 
		"whileStatement", "doStatement", "forStatement", "forInStatement", "jumpStatement", 
		"expression", "assignmentExpression", "conditionalExpression", "binaryExpression", 
		"castExpression", "assignmentOperator", "constantExpression", "unaryExpression", 
		"unaryOperator", "postfixExpression", "argumentExpressionList", "argumentExpression", 
		"primaryExpression", "constant", "stringLiteral", "identifier"
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
	public String getGrammarFileName() { return "ObjectiveCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjectiveCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjectiveCParser.EOF, 0); }
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTranslationUnit(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << DYNAMIC) | (1L << IMPLEMENTATION) | (1L << INTERFACE) | (1L << IMPORT) | (1L << PROTOCOL) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				{
				setState(278);
				externalDeclaration();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ClassInterfaceContext classInterface() {
			return getRuleContext(ClassInterfaceContext.class,0);
		}
		public ClassImplementationContext classImplementation() {
			return getRuleContext(ClassImplementationContext.class,0);
		}
		public CategoryInterfaceContext categoryInterface() {
			return getRuleContext(CategoryInterfaceContext.class,0);
		}
		public CategoryImplementationContext categoryImplementation() {
			return getRuleContext(CategoryImplementationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public ProtocolDeclarationListContext protocolDeclarationList() {
			return getRuleContext(ProtocolDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitExternalDeclaration(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_externalDeclaration);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				classInterface();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				classImplementation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				categoryInterface();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				categoryImplementation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				protocolDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				protocolDeclarationList();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				classDeclarationList();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(296);
				implementationDefinitionList();
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IMPORT);
			setState(300);
			identifier();
			setState(301);
			match(SEMI);
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

	public static class ClassInterfaceContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public SuperclassNameContext superclassName() {
			return getRuleContext(SuperclassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public ClassInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassInterface(this);
		}
	}

	public final ClassInterfaceContext classInterface() throws RecognitionException {
		ClassInterfaceContext _localctx = new ClassInterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(INTERFACE);
			setState(304);
			classNameGeneric();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(305);
				match(COLON);
				setState(306);
				superclassName();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(309);
				protocolReferenceList();
				}
			}

			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(312);
				instanceVariables();
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(315);
				interfaceDeclarationList();
				}
			}

			setState(318);
			match(END);
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

	public static class CategoryInterfaceContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CategoryNameContext categoryName() {
			return getRuleContext(CategoryNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList() {
			return getRuleContext(InterfaceDeclarationListContext.class,0);
		}
		public CategoryInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryInterface(this);
		}
	}

	public final CategoryInterfaceContext categoryInterface() throws RecognitionException {
		CategoryInterfaceContext _localctx = new CategoryInterfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_categoryInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(INTERFACE);
			setState(321);
			classNameGeneric();
			setState(322);
			match(LP);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(323);
				categoryName();
				}
			}

			setState(326);
			match(RP);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(327);
				protocolReferenceList();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(330);
				instanceVariables();
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROPERTY) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(333);
				interfaceDeclarationList();
				}
			}

			setState(336);
			match(END);
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

	public static class ClassImplementationContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public SuperclassNameContext superclassName() {
			return getRuleContext(SuperclassNameContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public ClassImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassImplementation(this);
		}
	}

	public final ClassImplementationContext classImplementation() throws RecognitionException {
		ClassImplementationContext _localctx = new ClassImplementationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(IMPLEMENTATION);
			setState(339);
			classNameGeneric();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(340);
				match(COLON);
				setState(341);
				superclassName();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(344);
				instanceVariables();
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(347);
				implementationDefinitionList();
				}
			}

			setState(350);
			match(END);
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

	public static class CategoryImplementationContext extends ParserRuleContext {
		public ClassNameGenericContext classNameGeneric() {
			return getRuleContext(ClassNameGenericContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public CategoryNameContext categoryName() {
			return getRuleContext(CategoryNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ImplementationDefinitionListContext implementationDefinitionList() {
			return getRuleContext(ImplementationDefinitionListContext.class,0);
		}
		public CategoryImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryImplementation(this);
		}
	}

	public final CategoryImplementationContext categoryImplementation() throws RecognitionException {
		CategoryImplementationContext _localctx = new CategoryImplementationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_categoryImplementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(IMPLEMENTATION);
			setState(353);
			classNameGeneric();
			setState(354);
			match(LP);
			setState(355);
			categoryName();
			setState(356);
			match(RP);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DYNAMIC) | (1L << SYNTHESIZE) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(357);
				implementationDefinitionList();
				}
			}

			setState(360);
			match(END);
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

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public List<InterfaceDeclarationListContext> interfaceDeclarationList() {
			return getRuleContexts(InterfaceDeclarationListContext.class);
		}
		public InterfaceDeclarationListContext interfaceDeclarationList(int i) {
			return getRuleContext(InterfaceDeclarationListContext.class,i);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolDeclaration(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(PROTOCOL);
			setState(363);
			protocolName();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(364);
				protocolReferenceList();
				}
			}

			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPTIONAL) | (1L << PROPERTY) | (1L << REQUIRED) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REQUIRED:
					{
					setState(367);
					match(REQUIRED);
					}
					break;
				case PROPERTY:
				case AUTO:
				case BYCOPY:
				case BYREF:
				case CHAR:
				case CONST:
				case DOUBLE:
				case ENUM:
				case EXTERN:
				case FLOAT:
				case ID:
				case IN:
				case INOUT:
				case INSTANCETYPE:
				case INT:
				case LONG:
				case ONEWAY:
				case OUT:
				case REGISTER:
				case SHORT:
				case SIGNED:
				case SIZEOF:
				case STATIC:
				case STRUCT:
				case TYPEDEF:
				case UNION:
				case UNSIGNED:
				case VOID:
				case VOLATILE:
				case NS_OPTIONS:
				case NS_ENUM:
				case WWEAK:
				case WUNSAFE_UNRETAINED:
				case WUNUSED:
				case WDEPRECATED:
				case WAUTORELEASING:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case ATTRIBUTE:
				case NULLABLE:
				case ADD:
				case SUB:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IB_OUTLET:
				case IB_OUTLET_COLLECTION:
				case IDENTIFIER:
					{
					setState(368);
					interfaceDeclarationList();
					}
					break;
				case OPTIONAL:
					{
					setState(369);
					match(OPTIONAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(END);
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

	public static class ProtocolDeclarationListContext extends ParserRuleContext {
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public ProtocolDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolDeclarationList(this);
		}
	}

	public final ProtocolDeclarationListContext protocolDeclarationList() throws RecognitionException {
		ProtocolDeclarationListContext _localctx = new ProtocolDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_protocolDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(PROTOCOL);
			setState(378);
			protocolList();
			setState(379);
			match(SEMI);
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

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public ClassListContext classList() {
			return getRuleContext(ClassListContext.class,0);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassDeclarationList(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classDeclarationList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(CLASS);
			setState(382);
			classList();
			setState(383);
			match(SEMI);
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

	public static class ClassListContext extends ParserRuleContext {
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassList(this);
		}
	}

	public final ClassListContext classList() throws RecognitionException {
		ClassListContext _localctx = new ClassListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			className();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386);
				match(COMMA);
				setState(387);
				className();
				}
				}
				setState(392);
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

	public static class ProtocolReferenceListContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public ProtocolListContext protocolList() {
			return getRuleContext(ProtocolListContext.class,0);
		}
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public ProtocolReferenceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolReferenceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolReferenceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolReferenceList(this);
		}
	}

	public final ProtocolReferenceListContext protocolReferenceList() throws RecognitionException {
		ProtocolReferenceListContext _localctx = new ProtocolReferenceListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocolReferenceList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(LT);
			setState(394);
			protocolList();
			setState(395);
			match(GT);
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

	public static class ProtocolListContext extends ParserRuleContext {
		public List<ProtocolNameContext> protocolName() {
			return getRuleContexts(ProtocolNameContext.class);
		}
		public ProtocolNameContext protocolName(int i) {
			return getRuleContext(ProtocolNameContext.class,i);
		}
		public ProtocolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolList(this);
		}
	}

	public final ProtocolListContext protocolList() throws RecognitionException {
		ProtocolListContext _localctx = new ProtocolListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_protocolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			protocolName();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(398);
				match(COMMA);
				setState(399);
				protocolName();
				}
				}
				setState(404);
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

	public static class PropertyDeclarationContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public PropertyAttributesListContext propertyAttributesList() {
			return getRuleContext(PropertyAttributesListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public IbOutletSpecifierContext ibOutletSpecifier() {
			return getRuleContext(IbOutletSpecifierContext.class,0);
		}
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyDeclaration(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(PROPERTY);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(406);
				match(LP);
				setState(407);
				propertyAttributesList();
				setState(408);
				match(RP);
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IB_OUTLET || _la==IB_OUTLET_COLLECTION) {
				{
				setState(412);
				ibOutletSpecifier();
				}
			}

			setState(415);
			structDeclaration();
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

	public static class PropertyAttributesListContext extends ParserRuleContext {
		public List<PropertyAttributeContext> propertyAttribute() {
			return getRuleContexts(PropertyAttributeContext.class);
		}
		public PropertyAttributeContext propertyAttribute(int i) {
			return getRuleContext(PropertyAttributeContext.class,i);
		}
		public PropertyAttributesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttributesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyAttributesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyAttributesList(this);
		}
	}

	public final PropertyAttributesListContext propertyAttributesList() throws RecognitionException {
		PropertyAttributesListContext _localctx = new PropertyAttributesListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyAttributesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			propertyAttribute();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				propertyAttribute();
				}
				}
				setState(424);
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

	public static class PropertyAttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NullabilitySpecifierContext nullabilitySpecifier() {
			return getRuleContext(NullabilitySpecifierContext.class,0);
		}
		public PropertyAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyAttribute(this);
		}
	}

	public final PropertyAttributeContext propertyAttribute() throws RecognitionException {
		PropertyAttributeContext _localctx = new PropertyAttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_propertyAttribute);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(NONATOMIC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(ASSIGNPA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				match(WEAK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(STRONG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(RETAIN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				match(READONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				match(READWRITE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				match(GETTER);
				setState(433);
				match(ASSIGN);
				setState(434);
				identifier();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(435);
				match(SETTER);
				setState(436);
				match(ASSIGN);
				setState(437);
				identifier();
				setState(438);
				match(COLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(440);
				nullabilitySpecifier();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(441);
				identifier();
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

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			identifier();
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

	public static class SuperclassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SuperclassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSuperclassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSuperclassName(this);
		}
	}

	public final SuperclassNameContext superclassName() throws RecognitionException {
		SuperclassNameContext _localctx = new SuperclassNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_superclassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			identifier();
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

	public static class CategoryNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CategoryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCategoryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCategoryName(this);
		}
	}

	public final CategoryNameContext categoryName() throws RecognitionException {
		CategoryNameContext _localctx = new CategoryNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_categoryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			identifier();
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

	public static class ProtocolNameContext extends ParserRuleContext {
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolName(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_protocolName);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				protocolReferenceList();
				}
				break;
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(451);
					_la = _input.LA(1);
					if ( !(_la==COVARIANT || _la==CONTRAVARIANT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(454);
				identifier();
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

	public static class InstanceVariablesContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public VisibilitySpecificationContext visibilitySpecification() {
			return getRuleContext(VisibilitySpecificationContext.class,0);
		}
		public InstanceVariablesContext instanceVariables() {
			return getRuleContext(InstanceVariablesContext.class,0);
		}
		public InstanceVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceVariables(this);
		}
	}

	public final InstanceVariablesContext instanceVariables() throws RecognitionException {
		InstanceVariablesContext _localctx = new InstanceVariablesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instanceVariables);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(LBRACE);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					{
					setState(458);
					structDeclaration();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(464);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(LBRACE);
				setState(466);
				visibilitySpecification();
				setState(468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(467);
					structDeclaration();
					}
					}
					setState(470); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(472);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(LBRACE);
				setState(476); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(475);
					structDeclaration();
					}
					}
					setState(478); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(480);
				instanceVariables();
				setState(481);
				match(RBRACE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				match(LBRACE);
				setState(484);
				visibilitySpecification();
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(485);
					structDeclaration();
					}
					}
					setState(488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(490);
				instanceVariables();
				setState(491);
				match(RBRACE);
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

	public static class VisibilitySpecificationContext extends ParserRuleContext {
		public VisibilitySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilitySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterVisibilitySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitVisibilitySpecification(this);
		}
	}

	public final VisibilitySpecificationContext visibilitySpecification() throws RecognitionException {
		VisibilitySpecificationContext _localctx = new VisibilitySpecificationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_visibilitySpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
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

	public static class InterfaceDeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDeclarationContext> classMethodDeclaration() {
			return getRuleContexts(ClassMethodDeclarationContext.class);
		}
		public ClassMethodDeclarationContext classMethodDeclaration(int i) {
			return getRuleContext(ClassMethodDeclarationContext.class,i);
		}
		public List<InstanceMethodDeclarationContext> instanceMethodDeclaration() {
			return getRuleContexts(InstanceMethodDeclarationContext.class);
		}
		public InstanceMethodDeclarationContext instanceMethodDeclaration(int i) {
			return getRuleContext(InstanceMethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public InterfaceDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInterfaceDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInterfaceDeclarationList(this);
		}
	}

	public final InterfaceDeclarationListContext interfaceDeclarationList() throws RecognitionException {
		InterfaceDeclarationListContext _localctx = new InterfaceDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_interfaceDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(501);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AUTO:
					case BYCOPY:
					case BYREF:
					case CHAR:
					case CONST:
					case DOUBLE:
					case ENUM:
					case EXTERN:
					case FLOAT:
					case ID:
					case IN:
					case INOUT:
					case INSTANCETYPE:
					case INT:
					case LONG:
					case ONEWAY:
					case OUT:
					case REGISTER:
					case SHORT:
					case SIGNED:
					case SIZEOF:
					case STATIC:
					case STRUCT:
					case TYPEDEF:
					case UNION:
					case UNSIGNED:
					case VOID:
					case VOLATILE:
					case NS_OPTIONS:
					case NS_ENUM:
					case WWEAK:
					case WUNSAFE_UNRETAINED:
					case WUNUSED:
					case WDEPRECATED:
					case WAUTORELEASING:
					case TYPEOF:
					case TYPEOF__:
					case TYPEOF____:
					case KINDOF__:
					case COVARIANT:
					case CONTRAVARIANT:
					case ATTRIBUTE:
					case NULLABLE:
					case ASSIGNPA:
					case GETTER:
					case NONATOMIC:
					case SETTER:
					case STRONG:
					case RETAIN:
					case READONLY:
					case READWRITE:
					case WEAK:
					case IB_OUTLET:
					case IB_OUTLET_COLLECTION:
					case IDENTIFIER:
						{
						setState(497);
						declaration();
						}
						break;
					case ADD:
						{
						setState(498);
						classMethodDeclaration();
						}
						break;
					case SUB:
						{
						setState(499);
						instanceMethodDeclaration();
						}
						break;
					case PROPERTY:
						{
						setState(500);
						propertyDeclaration();
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
				setState(503); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassMethodDeclaration(this);
		}
	}

	public final ClassMethodDeclarationContext classMethodDeclaration() throws RecognitionException {
		ClassMethodDeclarationContext _localctx = new ClassMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(ADD);
			setState(506);
			methodDeclaration();
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

	public static class InstanceMethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InstanceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceMethodDeclaration(this);
		}
	}

	public final InstanceMethodDeclarationContext instanceMethodDeclaration() throws RecognitionException {
		InstanceMethodDeclarationContext _localctx = new InstanceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_instanceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(SUB);
			setState(509);
			methodDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MacrosContext macros() {
			return getRuleContext(MacrosContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(511);
				methodType();
				}
			}

			setState(514);
			methodSelector();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(515);
				macros();
				}
			}

			setState(518);
			match(SEMI);
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

	public static class ImplementationDefinitionListContext extends ParserRuleContext {
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ClassMethodDefinitionContext> classMethodDefinition() {
			return getRuleContexts(ClassMethodDefinitionContext.class);
		}
		public ClassMethodDefinitionContext classMethodDefinition(int i) {
			return getRuleContext(ClassMethodDefinitionContext.class,i);
		}
		public List<InstanceMethodDefinitionContext> instanceMethodDefinition() {
			return getRuleContexts(InstanceMethodDefinitionContext.class);
		}
		public InstanceMethodDefinitionContext instanceMethodDefinition(int i) {
			return getRuleContext(InstanceMethodDefinitionContext.class,i);
		}
		public List<PropertyImplementationContext> propertyImplementation() {
			return getRuleContexts(PropertyImplementationContext.class);
		}
		public PropertyImplementationContext propertyImplementation(int i) {
			return getRuleContext(PropertyImplementationContext.class,i);
		}
		public ImplementationDefinitionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementationDefinitionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterImplementationDefinitionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitImplementationDefinitionList(this);
		}
	}

	public final ImplementationDefinitionListContext implementationDefinitionList() throws RecognitionException {
		ImplementationDefinitionListContext _localctx = new ImplementationDefinitionListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_implementationDefinitionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(525);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(520);
						functionDefinition();
						}
						break;
					case 2:
						{
						setState(521);
						declaration();
						}
						break;
					case 3:
						{
						setState(522);
						classMethodDefinition();
						}
						break;
					case 4:
						{
						setState(523);
						instanceMethodDefinition();
						}
						break;
					case 5:
						{
						setState(524);
						propertyImplementation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(527); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ClassMethodDefinitionContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public ClassMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassMethodDefinition(this);
		}
	}

	public final ClassMethodDefinitionContext classMethodDefinition() throws RecognitionException {
		ClassMethodDefinitionContext _localctx = new ClassMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_classMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(ADD);
			setState(530);
			methodDefinition();
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

	public static class InstanceMethodDefinitionContext extends ParserRuleContext {
		public MethodDefinitionContext methodDefinition() {
			return getRuleContext(MethodDefinitionContext.class,0);
		}
		public InstanceMethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceMethodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInstanceMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInstanceMethodDefinition(this);
		}
	}

	public final InstanceMethodDefinitionContext instanceMethodDefinition() throws RecognitionException {
		InstanceMethodDefinitionContext _localctx = new InstanceMethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_instanceMethodDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(SUB);
			setState(533);
			methodDefinition();
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

	public static class MethodDefinitionContext extends ParserRuleContext {
		public MethodSelectorContext methodSelector() {
			return getRuleContext(MethodSelectorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodDefinition(this);
		}
	}

	public final MethodDefinitionContext methodDefinition() throws RecognitionException {
		MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_methodDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(535);
				methodType();
				}
			}

			setState(538);
			methodSelector();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
				{
				setState(539);
				initDeclaratorList();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(542);
				match(SEMI);
				}
			}

			setState(545);
			compoundStatement();
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

	public static class MethodSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordDeclaratorContext> keywordDeclarator() {
			return getRuleContexts(KeywordDeclaratorContext.class);
		}
		public KeywordDeclaratorContext keywordDeclarator(int i) {
			return getRuleContext(KeywordDeclaratorContext.class,i);
		}
		public MethodSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodSelector(this);
		}
	}

	public final MethodSelectorContext methodSelector() throws RecognitionException {
		MethodSelectorContext _localctx = new MethodSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodSelector);
		int _la;
		try {
			int _alt;
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(548);
						keywordDeclarator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(551); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(553);
					match(COMMA);
					setState(554);
					match(ELIPSIS);
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

	public static class KeywordDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<MethodTypeContext> methodType() {
			return getRuleContexts(MethodTypeContext.class);
		}
		public MethodTypeContext methodType(int i) {
			return getRuleContext(MethodTypeContext.class,i);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier() {
			return getRuleContext(ArcBehaviourSpecifierContext.class,0);
		}
		public KeywordDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterKeywordDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitKeywordDeclarator(this);
		}
	}

	public final KeywordDeclaratorContext keywordDeclarator() throws RecognitionException {
		KeywordDeclaratorContext _localctx = new KeywordDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_keywordDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(559);
				selector();
				}
			}

			setState(562);
			match(COLON);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(563);
				methodType();
				}
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(569);
				arcBehaviourSpecifier();
				}
				break;
			}
			setState(572);
			identifier();
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

	public static class SelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selector);
		try {
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				identifier();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(RETURN);
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

	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMethodType(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(LP);
			setState(579);
			typeName();
			setState(580);
			match(RP);
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

	public static class PropertyImplementationContext extends ParserRuleContext {
		public PropertySynthesizeListContext propertySynthesizeList() {
			return getRuleContext(PropertySynthesizeListContext.class,0);
		}
		public PropertyImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyImplementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyImplementation(this);
		}
	}

	public final PropertyImplementationContext propertyImplementation() throws RecognitionException {
		PropertyImplementationContext _localctx = new PropertyImplementationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyImplementation);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYNTHESIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(SYNTHESIZE);
				setState(583);
				propertySynthesizeList();
				setState(584);
				match(SEMI);
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(DYNAMIC);
				setState(587);
				propertySynthesizeList();
				setState(588);
				match(SEMI);
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

	public static class PropertySynthesizeListContext extends ParserRuleContext {
		public List<PropertySynthesizeItemContext> propertySynthesizeItem() {
			return getRuleContexts(PropertySynthesizeItemContext.class);
		}
		public PropertySynthesizeItemContext propertySynthesizeItem(int i) {
			return getRuleContext(PropertySynthesizeItemContext.class,i);
		}
		public PropertySynthesizeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertySynthesizeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertySynthesizeList(this);
		}
	}

	public final PropertySynthesizeListContext propertySynthesizeList() throws RecognitionException {
		PropertySynthesizeListContext _localctx = new PropertySynthesizeListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_propertySynthesizeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			propertySynthesizeItem();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				propertySynthesizeItem();
				}
				}
				setState(599);
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

	public static class PropertySynthesizeItemContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PropertySynthesizeItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySynthesizeItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertySynthesizeItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertySynthesizeItem(this);
		}
	}

	public final PropertySynthesizeItemContext propertySynthesizeItem() throws RecognitionException {
		PropertySynthesizeItemContext _localctx = new PropertySynthesizeItemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_propertySynthesizeItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			identifier();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(601);
				match(ASSIGN);
				setState(602);
				identifier();
				}
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

	public static class BlockTypeContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockType(this);
		}
	}

	public final BlockTypeContext blockType() throws RecognitionException {
		BlockTypeContext _localctx = new BlockTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_blockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			typeSpecifier();
			setState(606);
			match(LP);
			setState(607);
			match(CARET);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(608);
				typeSpecifier();
				}
			}

			setState(611);
			match(RP);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(612);
				blockParameters();
				}
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

	public static class GenericsSpecifierContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ObjectiveCParser.LT, 0); }
		public TerminalNode GT() { return getToken(ObjectiveCParser.GT, 0); }
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public GenericsSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericsSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterGenericsSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitGenericsSpecifier(this);
		}
	}

	public final GenericsSpecifierContext genericsSpecifier() throws RecognitionException {
		GenericsSpecifierContext _localctx = new GenericsSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_genericsSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(LT);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(616);
				typeSpecifier();
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(619);
				match(COMMA);
				setState(620);
				typeSpecifier();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(GT);
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

	public static class ProtocolQualifierContext extends ParserRuleContext {
		public ProtocolQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolQualifier(this);
		}
	}

	public final ProtocolQualifierContext protocolQualifier() throws RecognitionException {
		ProtocolQualifierContext _localctx = new ProtocolQualifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_protocolQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYCOPY) | (1L << BYREF) | (1L << IN) | (1L << INOUT) | (1L << ONEWAY) | (1L << OUT))) != 0)) ) {
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

	public static class DictionaryExpressionContext extends ParserRuleContext {
		public List<DictionaryPairContext> dictionaryPair() {
			return getRuleContexts(DictionaryPairContext.class);
		}
		public DictionaryPairContext dictionaryPair(int i) {
			return getRuleContext(DictionaryPairContext.class,i);
		}
		public DictionaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDictionaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDictionaryExpression(this);
		}
	}

	public final DictionaryExpressionContext dictionaryExpression() throws RecognitionException {
		DictionaryExpressionContext _localctx = new DictionaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dictionaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(AT);
			setState(631);
			match(LBRACE);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(632);
				dictionaryPair();
				}
			}

			setState(639);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(COMMA);
					setState(636);
					dictionaryPair();
					}
					} 
				}
				setState(641);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(642);
				match(COMMA);
				}
			}

			setState(645);
			match(RBRACE);
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

	public static class DictionaryPairContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public DictionaryPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDictionaryPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDictionaryPair(this);
		}
	}

	public final DictionaryPairContext dictionaryPair() throws RecognitionException {
		DictionaryPairContext _localctx = new DictionaryPairContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dictionaryPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			castExpression();
			setState(648);
			match(COLON);
			setState(649);
			conditionalExpression();
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

	public static class ArrayExpressionContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArrayExpression(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arrayExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(AT);
			setState(652);
			match(LBRACK);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(653);
				conditionalExpression();
				}
			}

			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(656);
					match(COMMA);
					setState(657);
					conditionalExpression();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(663);
				match(COMMA);
				}
			}

			setState(666);
			match(RBRACK);
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

	public static class BoxExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBoxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBoxExpression(this);
		}
	}

	public final BoxExpressionContext boxExpression() throws RecognitionException {
		BoxExpressionContext _localctx = new BoxExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boxExpression);
		try {
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(AT);
				setState(669);
				match(LP);
				setState(670);
				expression();
				setState(671);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(AT);
				setState(676);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
				case SUB:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(674);
					constant();
					}
					break;
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(675);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class BlockParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<TypeVariableDeclaratorContext> typeVariableDeclarator() {
			return getRuleContexts(TypeVariableDeclaratorContext.class);
		}
		public TypeVariableDeclaratorContext typeVariableDeclarator(int i) {
			return getRuleContext(TypeVariableDeclaratorContext.class,i);
		}
		public List<TypeNameContext> typeName() {
			return getRuleContexts(TypeNameContext.class);
		}
		public TypeNameContext typeName(int i) {
			return getRuleContext(TypeNameContext.class,i);
		}
		public BlockParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockParameters(this);
		}
	}

	public final BlockParametersContext blockParameters() throws RecognitionException {
		BlockParametersContext _localctx = new BlockParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_blockParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(LP);
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(681);
				typeVariableDeclarator();
				}
				break;
			case 2:
				{
				setState(682);
				typeName();
				}
				break;
			case 3:
				{
				setState(683);
				match(VOID);
				}
				break;
			}
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(686);
				match(COMMA);
				setState(689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(687);
					typeVariableDeclarator();
					}
					break;
				case 2:
					{
					setState(688);
					typeName();
					}
					break;
				}
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			match(RP);
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

	public static class BlockExpressionContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public BlockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBlockExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBlockExpression(this);
		}
	}

	public final BlockExpressionContext blockExpression() throws RecognitionException {
		BlockExpressionContext _localctx = new BlockExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_blockExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(CARET);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (CHAR - 31)) | (1L << (DOUBLE - 31)) | (1L << (ENUM - 31)) | (1L << (FLOAT - 31)) | (1L << (ID - 31)) | (1L << (INSTANCETYPE - 31)) | (1L << (INT - 31)) | (1L << (LONG - 31)) | (1L << (SHORT - 31)) | (1L << (SIGNED - 31)) | (1L << (SIZEOF - 31)) | (1L << (STRUCT - 31)) | (1L << (UNION - 31)) | (1L << (UNSIGNED - 31)) | (1L << (VOID - 31)) | (1L << (NS_OPTIONS - 31)) | (1L << (NS_ENUM - 31)) | (1L << (WWEAK - 31)) | (1L << (WUNUSED - 31)) | (1L << (TYPEOF - 31)) | (1L << (TYPEOF__ - 31)) | (1L << (TYPEOF____ - 31)) | (1L << (KINDOF__ - 31)) | (1L << (COVARIANT - 31)) | (1L << (CONTRAVARIANT - 31)) | (1L << (NULLABLE - 31)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(699);
				typeSpecifier();
				}
			}

			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(702);
				blockParameters();
				}
			}

			setState(705);
			compoundStatement();
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

	public static class MessageExpressionContext extends ParserRuleContext {
		public ReceiverContext receiver() {
			return getRuleContext(ReceiverContext.class,0);
		}
		public MessageSelectorContext messageSelector() {
			return getRuleContext(MessageSelectorContext.class,0);
		}
		public MessageExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMessageExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMessageExpression(this);
		}
	}

	public final MessageExpressionContext messageExpression() throws RecognitionException {
		MessageExpressionContext _localctx = new MessageExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_messageExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(LBRACK);
			setState(708);
			receiver();
			setState(709);
			messageSelector();
			setState(710);
			match(RBRACK);
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

	public static class ReceiverContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_receiver);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				typeSpecifier();
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

	public static class MessageSelectorContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<KeywordArgumentContext> keywordArgument() {
			return getRuleContexts(KeywordArgumentContext.class);
		}
		public KeywordArgumentContext keywordArgument(int i) {
			return getRuleContext(KeywordArgumentContext.class,i);
		}
		public MessageSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMessageSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMessageSelector(this);
		}
	}

	public final MessageSelectorContext messageSelector() throws RecognitionException {
		MessageSelectorContext _localctx = new MessageSelectorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_messageSelector);
		int _la;
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(717);
					keywordArgument();
					}
					}
					setState(720); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (COLON - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
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

	public static class KeywordArgumentContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<InitializerListContext> initializerList() {
			return getRuleContexts(InitializerListContext.class);
		}
		public InitializerListContext initializerList(int i) {
			return getRuleContext(InitializerListContext.class,i);
		}
		public KeywordArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitKeywordArgument(this);
		}
	}

	public final KeywordArgumentContext keywordArgument() throws RecognitionException {
		KeywordArgumentContext _localctx = new KeywordArgumentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_keywordArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(724);
				selector();
				}
			}

			setState(727);
			match(COLON);
			setState(728);
			expression();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(729);
				match(LBRACE);
				setState(730);
				initializerList();
				setState(731);
				match(RBRACE);
				}
			}

			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(735);
				match(COMMA);
				setState(736);
				expression();
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(737);
					match(LBRACE);
					setState(738);
					initializerList();
					setState(739);
					match(RBRACE);
					}
				}

				}
				}
				setState(747);
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

	public static class SelectorExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public SelectorNameContext selectorName() {
			return getRuleContext(SelectorNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectorExpression(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(SELECTOR);
			setState(749);
			match(LP);
			setState(750);
			selectorName();
			setState(751);
			match(RP);
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

	public static class SelectorNameContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public SelectorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectorName(this);
		}
	}

	public final SelectorNameContext selectorName() throws RecognitionException {
		SelectorNameContext _localctx = new SelectorNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectorName);
		int _la;
		try {
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				selector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
						{
						setState(754);
						selector();
						}
					}

					setState(757);
					match(COLON);
					}
					}
					setState(760); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (RETURN - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (COLON - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
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

	public static class ProtocolExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ProtocolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterProtocolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitProtocolExpression(this);
		}
	}

	public final ProtocolExpressionContext protocolExpression() throws RecognitionException {
		ProtocolExpressionContext _localctx = new ProtocolExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_protocolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(PROTOCOL);
			setState(765);
			match(LP);
			setState(766);
			protocolName();
			setState(767);
			match(RP);
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

	public static class EncodeExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public EncodeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEncodeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEncodeExpression(this);
		}
	}

	public final EncodeExpressionContext encodeExpression() throws RecognitionException {
		EncodeExpressionContext _localctx = new EncodeExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_encodeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(ENCODE);
			setState(770);
			match(LP);
			setState(771);
			typeName();
			setState(772);
			match(RP);
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

	public static class TypeVariableDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TypeVariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeVariableDeclarator(this);
		}
	}

	public final TypeVariableDeclaratorContext typeVariableDeclarator() throws RecognitionException {
		TypeVariableDeclaratorContext _localctx = new TypeVariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_typeVariableDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			declarationSpecifiers();
			setState(775);
			declarator();
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_throwStatement);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(THROW);
				setState(778);
				match(LP);
				setState(779);
				identifier();
				setState(780);
				match(RP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				match(THROW);
				setState(783);
				expression();
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

	public static class TryBlockContext extends ParserRuleContext {
		public CompoundStatementContext tryStatement;
		public CompoundStatementContext finallyStatement;
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<CatchStatementContext> catchStatement() {
			return getRuleContexts(CatchStatementContext.class);
		}
		public CatchStatementContext catchStatement(int i) {
			return getRuleContext(CatchStatementContext.class,i);
		}
		public TryBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTryBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTryBlock(this);
		}
	}

	public final TryBlockContext tryBlock() throws RecognitionException {
		TryBlockContext _localctx = new TryBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_tryBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(TRY);
			setState(787);
			((TryBlockContext)_localctx).tryStatement = compoundStatement();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(788);
				catchStatement();
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(794);
				match(FINALLY);
				setState(795);
				((TryBlockContext)_localctx).finallyStatement = compoundStatement();
				}
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

	public static class CatchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCatchStatement(this);
		}
	}

	public final CatchStatementContext catchStatement() throws RecognitionException {
		CatchStatementContext _localctx = new CatchStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_catchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(CATCH);
			setState(799);
			match(LP);
			setState(800);
			typeVariableDeclarator();
			setState(801);
			match(RP);
			setState(802);
			compoundStatement();
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

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(SYNCHRONIZED);
			setState(805);
			match(LP);
			setState(806);
			expression();
			setState(807);
			match(RP);
			setState(808);
			compoundStatement();
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

	public static class AutoreleaseStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AutoreleaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoreleaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAutoreleaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAutoreleaseStatement(this);
		}
	}

	public final AutoreleaseStatementContext autoreleaseStatement() throws RecognitionException {
		AutoreleaseStatementContext _localctx = new AutoreleaseStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_autoreleaseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(AUTORELEASEPOOL);
			setState(811);
			compoundStatement();
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<DeclarationSpecifiersContext> declarationSpecifiers() {
			return getRuleContexts(DeclarationSpecifiersContext.class);
		}
		public DeclarationSpecifiersContext declarationSpecifiers(int i) {
			return getRuleContext(DeclarationSpecifiersContext.class,i);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(813);
				declarationSpecifiers();
				}
				break;
			}
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(816);
				attributeSpecifier();
				}
				break;
			}
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(819);
				declarationSpecifiers();
				}
				break;
			}
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(822);
				attributeSpecifier();
				}
			}

			setState(825);
			identifier();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(826);
				match(LP);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (AUTO - 25)) | (1L << (BYCOPY - 25)) | (1L << (BYREF - 25)) | (1L << (CHAR - 25)) | (1L << (CONST - 25)) | (1L << (DOUBLE - 25)) | (1L << (ENUM - 25)) | (1L << (EXTERN - 25)) | (1L << (FLOAT - 25)) | (1L << (ID - 25)) | (1L << (IN - 25)) | (1L << (INOUT - 25)) | (1L << (INSTANCETYPE - 25)) | (1L << (INT - 25)) | (1L << (LONG - 25)) | (1L << (ONEWAY - 25)) | (1L << (OUT - 25)) | (1L << (REGISTER - 25)) | (1L << (SHORT - 25)) | (1L << (SIGNED - 25)) | (1L << (SIZEOF - 25)) | (1L << (STATIC - 25)) | (1L << (STRUCT - 25)) | (1L << (TYPEDEF - 25)) | (1L << (UNION - 25)) | (1L << (UNSIGNED - 25)) | (1L << (VOID - 25)) | (1L << (VOLATILE - 25)) | (1L << (NS_OPTIONS - 25)) | (1L << (NS_ENUM - 25)) | (1L << (WWEAK - 25)) | (1L << (WUNSAFE_UNRETAINED - 25)) | (1L << (WUNUSED - 25)) | (1L << (WDEPRECATED - 25)) | (1L << (WAUTORELEASING - 25)) | (1L << (TYPEOF - 25)) | (1L << (TYPEOF__ - 25)) | (1L << (TYPEOF____ - 25)) | (1L << (KINDOF__ - 25)) | (1L << (COVARIANT - 25)) | (1L << (CONTRAVARIANT - 25)) | (1L << (NULLABLE - 25)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(827);
					parameterList();
					}
				}

				setState(830);
				match(RP);
				}
			}

			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(833);
				attributeSpecifier();
				}
			}

			setState(836);
			compoundStatement();
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

	public static class AttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LP() { return getTokens(ObjectiveCParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(ObjectiveCParser.LP, i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(ObjectiveCParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(ObjectiveCParser.RP, i);
		}
		public AttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeSpecifier(this);
		}
	}

	public final AttributeSpecifierContext attributeSpecifier() throws RecognitionException {
		AttributeSpecifierContext _localctx = new AttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_attributeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(ATTRIBUTE);
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(839);
				match(LP);
				setState(840);
				match(LP);
				setState(841);
				attribute();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(842);
					match(COMMA);
					setState(843);
					attribute();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849);
				match(RP);
				setState(850);
				match(RP);
				}
				break;
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

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeParametersContext attributeParameters() {
			return getRuleContext(AttributeParametersContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			attributeName();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(855);
				attributeParameters();
				}
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

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectiveCParser.IDENTIFIER, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if ( !(_la==CONST || _la==IDENTIFIER) ) {
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

	public static class AttributeParametersContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public AttributeParameterListContext attributeParameterList() {
			return getRuleContext(AttributeParameterListContext.class,0);
		}
		public AttributeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameters(this);
		}
	}

	public final AttributeParametersContext attributeParameters() throws RecognitionException {
		AttributeParametersContext _localctx = new AttributeParametersContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attributeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(LP);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (QUOTE_STRING - 114)) | (1L << (STRING - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
				{
				setState(861);
				attributeParameterList();
				}
			}

			setState(864);
			match(RP);
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

	public static class AttributeParameterListContext extends ParserRuleContext {
		public List<AttributeParameterContext> attributeParameter() {
			return getRuleContexts(AttributeParameterContext.class);
		}
		public AttributeParameterContext attributeParameter(int i) {
			return getRuleContext(AttributeParameterContext.class,i);
		}
		public AttributeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameterList(this);
		}
	}

	public final AttributeParameterListContext attributeParameterList() throws RecognitionException {
		AttributeParameterListContext _localctx = new AttributeParameterListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_attributeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			attributeParameter();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(867);
				match(COMMA);
				setState(868);
				attributeParameter();
				}
				}
				setState(873);
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

	public static class AttributeParameterContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext attributeParameterAssignment() {
			return getRuleContext(AttributeParameterAssignmentContext.class,0);
		}
		public AttributeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameter(this);
		}
	}

	public final AttributeParameterContext attributeParameter() throws RecognitionException {
		AttributeParameterContext _localctx = new AttributeParameterContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_attributeParameter);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(877);
				attributeParameterAssignment();
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

	public static class AttributeParameterAssignmentContext extends ParserRuleContext {
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public AttributeParameterAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeParameterAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAttributeParameterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAttributeParameterAssignment(this);
		}
	}

	public final AttributeParameterAssignmentContext attributeParameterAssignment() throws RecognitionException {
		AttributeParameterAssignmentContext _localctx = new AttributeParameterAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_attributeParameterAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			attributeName();
			setState(881);
			match(ASSIGN);
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				{
				setState(882);
				constant();
				}
				break;
			case CONST:
			case IDENTIFIER:
				{
				setState(883);
				attributeName();
				}
				break;
			case QUOTE_STRING:
			case STRING:
				{
				setState(884);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public FunctionCallDeclarationContext functionCallDeclaration() {
			return getRuleContext(FunctionCallDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_declaration);
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				functionCallDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(889);
				varDeclaration();
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

	public static class FunctionCallDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public FunctionCallDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionCallDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionCallDeclaration(this);
		}
	}

	public final FunctionCallDeclarationContext functionCallDeclaration() throws RecognitionException {
		FunctionCallDeclarationContext _localctx = new FunctionCallDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_functionCallDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(892);
				attributeSpecifier();
				}
			}

			setState(895);
			className();
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(896);
				attributeSpecifier();
				}
			}

			setState(899);
			match(LP);
			setState(900);
			directDeclarator();
			setState(901);
			match(RP);
			setState(902);
			match(SEMI);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public AttributeSpecifierContext attributeSpecifier() {
			return getRuleContext(AttributeSpecifierContext.class,0);
		}
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(904);
				attributeSpecifier();
				}
			}

			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) {
				{
				setState(907);
				storageClassSpecifier();
				}
			}

			setState(910);
			enumSpecifier();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(911);
				className();
				}
			}

			setState(914);
			match(SEMI);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public List<AttributeSpecifierContext> attributeSpecifier() {
			return getRuleContexts(AttributeSpecifierContext.class);
		}
		public AttributeSpecifierContext attributeSpecifier(int i) {
			return getRuleContext(AttributeSpecifierContext.class,i);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(916);
				attributeSpecifier();
				}
			}

			setState(919);
			declarationSpecifiers();
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(920);
				attributeSpecifier();
				}
			}

			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
				{
				setState(923);
				initDeclaratorList();
				}
			}

			setState(926);
			match(SEMI);
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<StorageClassSpecifierContext> storageClassSpecifier() {
			return getRuleContexts(StorageClassSpecifierContext.class);
		}
		public StorageClassSpecifierContext storageClassSpecifier(int i) {
			return getRuleContext(StorageClassSpecifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public List<IbOutletSpecifierContext> ibOutletSpecifier() {
			return getRuleContexts(IbOutletSpecifierContext.class);
		}
		public IbOutletSpecifierContext ibOutletSpecifier(int i) {
			return getRuleContext(IbOutletSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclarationSpecifiers(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(933);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(928);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(929);
						storageClassSpecifier();
						}
						break;
					case 3:
						{
						setState(930);
						typeSpecifier();
						}
						break;
					case 4:
						{
						setState(931);
						typeQualifier();
						}
						break;
					case 5:
						{
						setState(932);
						ibOutletSpecifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(935); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IbOutletSpecifierContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public IbOutletSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ibOutletSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIbOutletSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIbOutletSpecifier(this);
		}
	}

	public final IbOutletSpecifierContext ibOutletSpecifier() throws RecognitionException {
		IbOutletSpecifierContext _localctx = new IbOutletSpecifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ibOutletSpecifier);
		try {
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IB_OUTLET_COLLECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				match(IB_OUTLET_COLLECTION);
				setState(938);
				match(LP);
				setState(939);
				className();
				setState(940);
				match(RP);
				}
				break;
			case IB_OUTLET:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(IB_OUTLET);
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitDeclaratorList(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			initDeclarator();
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(946);
				match(COMMA);
				setState(947);
				initDeclarator();
				}
				}
				setState(952);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitDeclarator(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			declarator();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(954);
				match(ASSIGN);
				setState(955);
				initializer();
				}
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructOrUnionSpecifier(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_structOrUnionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			_la = _input.LA(1);
			if ( !(_la==STRUCT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(959);
				identifier();
				}
				break;
			case 2:
				{
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(960);
					identifier();
					}
				}

				setState(963);
				match(LBRACE);
				setState(965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(964);
					structDeclaration();
					}
					}
					setState(967); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (BYCOPY - 28)) | (1L << (BYREF - 28)) | (1L << (CHAR - 28)) | (1L << (CONST - 28)) | (1L << (DOUBLE - 28)) | (1L << (ENUM - 28)) | (1L << (FLOAT - 28)) | (1L << (ID - 28)) | (1L << (IN - 28)) | (1L << (INOUT - 28)) | (1L << (INSTANCETYPE - 28)) | (1L << (INT - 28)) | (1L << (LONG - 28)) | (1L << (ONEWAY - 28)) | (1L << (OUT - 28)) | (1L << (SHORT - 28)) | (1L << (SIGNED - 28)) | (1L << (SIZEOF - 28)) | (1L << (STRUCT - 28)) | (1L << (UNION - 28)) | (1L << (UNSIGNED - 28)) | (1L << (VOID - 28)) | (1L << (VOLATILE - 28)) | (1L << (NS_OPTIONS - 28)) | (1L << (NS_ENUM - 28)) | (1L << (WWEAK - 28)) | (1L << (WUNSAFE_UNRETAINED - 28)) | (1L << (WUNUSED - 28)) | (1L << (WDEPRECATED - 28)) | (1L << (WAUTORELEASING - 28)) | (1L << (TYPEOF - 28)) | (1L << (TYPEOF__ - 28)) | (1L << (TYPEOF____ - 28)) | (1L << (KINDOF__ - 28)) | (1L << (COVARIANT - 28)) | (1L << (CONTRAVARIANT - 28)) | (1L << (NULLABLE - 28)) | (1L << (NONNULL - 28)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0) );
				setState(969);
				match(RBRACE);
				}
				break;
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public MacrosContext macros() {
			return getRuleContext(MacrosContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			specifierQualifierList();
			setState(974);
			structDeclaratorList();
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
				{
				setState(975);
				macros();
				}
			}

			setState(978);
			match(SEMI);
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public List<ArcBehaviourSpecifierContext> arcBehaviourSpecifier() {
			return getRuleContexts(ArcBehaviourSpecifierContext.class);
		}
		public ArcBehaviourSpecifierContext arcBehaviourSpecifier(int i) {
			return getRuleContext(ArcBehaviourSpecifierContext.class,i);
		}
		public List<NullabilitySpecifierContext> nullabilitySpecifier() {
			return getRuleContexts(NullabilitySpecifierContext.class);
		}
		public NullabilitySpecifierContext nullabilitySpecifier(int i) {
			return getRuleContext(NullabilitySpecifierContext.class,i);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSpecifierQualifierList(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_specifierQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(984); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(984);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(980);
						arcBehaviourSpecifier();
						}
						break;
					case 2:
						{
						setState(981);
						nullabilitySpecifier();
						}
						break;
					case 3:
						{
						setState(982);
						typeSpecifier();
						}
						break;
					case 4:
						{
						setState(983);
						typeQualifier();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(986); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ArcBehaviourSpecifierContext extends ParserRuleContext {
		public ArcBehaviourSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcBehaviourSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArcBehaviourSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArcBehaviourSpecifier(this);
		}
	}

	public final ArcBehaviourSpecifierContext arcBehaviourSpecifier() throws RecognitionException {
		ArcBehaviourSpecifierContext _localctx = new ArcBehaviourSpecifierContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_arcBehaviourSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNSAFE_UNRETAINED - 68)) | (1L << (WUNUSED - 68)) | (1L << (WDEPRECATED - 68)) | (1L << (WAUTORELEASING - 68)))) != 0)) ) {
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

	public static class NullabilitySpecifierContext extends ParserRuleContext {
		public NullabilitySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullabilitySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterNullabilitySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitNullabilitySpecifier(this);
		}
	}

	public final NullabilitySpecifierContext nullabilitySpecifier() throws RecognitionException {
		NullabilitySpecifierContext _localctx = new NullabilitySpecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nullabilitySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			_la = _input.LA(1);
			if ( !(_la==NULLABLE || _la==NONNULL) ) {
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStorageClassSpecifier(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO) | (1L << EXTERN) | (1L << REGISTER) | (1L << STATIC) | (1L << TYPEDEF))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeofExpressionContext typeofExpression() {
			return getRuleContext(TypeofExpressionContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeSpecifier);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				match(VOID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(996);
				match(SHORT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(998);
				match(LONG);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(999);
				match(FLOAT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1000);
				match(DOUBLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1001);
				match(INSTANCETYPE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1002);
				match(SIGNED);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1003);
				match(UNSIGNED);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1004);
				typeofExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(1005);
				className();
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1006);
					protocolReferenceList();
					}
					break;
				case 2:
					{
					setState(1007);
					genericsSpecifier();
					}
					break;
				}
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1010);
				structOrUnionSpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1011);
				enumSpecifier();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1012);
				identifier();
				setState(1014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1013);
					pointer();
					}
					break;
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public ProtocolQualifierContext protocolQualifier() {
			return getRuleContext(ProtocolQualifierContext.class,0);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeQualifier(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_typeQualifier);
		try {
			setState(1021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1018);
				match(CONST);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				match(VOLATILE);
				}
				break;
			case BYCOPY:
			case BYREF:
			case IN:
			case INOUT:
			case ONEWAY:
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1020);
				protocolQualifier();
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

	public static class TypeofExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public TypeofExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeofExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeofExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeofExpression(this);
		}
	}

	public final TypeofExpressionContext typeofExpression() throws RecognitionException {
		TypeofExpressionContext _localctx = new TypeofExpressionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_typeofExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (TYPEOF - 73)) | (1L << (TYPEOF__ - 73)) | (1L << (TYPEOF____ - 73)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(1024);
			match(LP);
			setState(1025);
			expression();
			setState(1026);
			match(RP);
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

	public static class ClassNameGenericContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ProtocolReferenceListContext protocolReferenceList() {
			return getRuleContext(ProtocolReferenceListContext.class,0);
		}
		public GenericsSpecifierContext genericsSpecifier() {
			return getRuleContext(GenericsSpecifierContext.class,0);
		}
		public ClassNameGenericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameGeneric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterClassNameGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitClassNameGeneric(this);
		}
	}

	public final ClassNameGenericContext classNameGeneric() throws RecognitionException {
		ClassNameGenericContext _localctx = new ClassNameGenericContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_classNameGeneric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			className();
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1029);
				protocolReferenceList();
				}
				break;
			case 2:
				{
				setState(1030);
				genericsSpecifier();
				}
				break;
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			structDeclarator();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1034);
				match(COMMA);
				setState(1035);
				structDeclarator();
				}
				}
				setState(1040);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_structDeclarator);
		int _la;
		try {
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1041);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)) | (1L << (LP - 42)))) != 0) || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (ASSIGNPA - 116)) | (1L << (GETTER - 116)) | (1L << (NONATOMIC - 116)) | (1L << (SETTER - 116)) | (1L << (STRONG - 116)) | (1L << (RETAIN - 116)) | (1L << (READONLY - 116)) | (1L << (READWRITE - 116)) | (1L << (WEAK - 116)) | (1L << (IDENTIFIER - 116)))) != 0)) {
					{
					setState(1042);
					declarator();
					}
				}

				setState(1045);
				match(COLON);
				setState(1046);
				constant();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumSpecifier(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumSpecifier);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(ENUM);
				setState(1055);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
						{
						setState(1050);
						identifier();
						}
					}

					setState(1053);
					match(COLON);
					setState(1054);
					typeName();
					}
					break;
				}
				setState(1068);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(1057);
					identifier();
					setState(1062);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1058);
						match(LBRACE);
						setState(1059);
						enumeratorList();
						setState(1060);
						match(RBRACE);
						}
						break;
					}
					}
					break;
				case LBRACE:
					{
					setState(1064);
					match(LBRACE);
					setState(1065);
					enumeratorList();
					setState(1066);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NS_OPTIONS:
			case NS_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				_la = _input.LA(1);
				if ( !(_la==NS_OPTIONS || _la==NS_ENUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1071);
				match(LP);
				setState(1072);
				typeName();
				setState(1073);
				match(COMMA);
				setState(1074);
				identifier();
				setState(1075);
				match(RP);
				setState(1076);
				match(LBRACE);
				setState(1077);
				enumeratorList();
				setState(1078);
				match(RBRACE);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumeratorList(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratorList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			enumerator();
			setState(1087);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1083);
					match(COMMA);
					setState(1084);
					enumerator();
					}
					} 
				}
				setState(1089);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1090);
				match(COMMA);
				}
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorIdentifierContext enumeratorIdentifier() {
			return getRuleContext(EnumeratorIdentifierContext.class,0);
		}
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			enumeratorIdentifier();
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1094);
				match(ASSIGN);
				setState(1095);
				binaryExpression(0);
				}
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

	public static class EnumeratorIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumeratorIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterEnumeratorIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitEnumeratorIdentifier(this);
		}
	}

	public final EnumeratorIdentifierContext enumeratorIdentifier() throws RecognitionException {
		EnumeratorIdentifierContext _localctx = new EnumeratorIdentifierContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enumeratorIdentifier);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				identifier();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(DEFAULT);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<DeclaratorSuffixContext> declaratorSuffix() {
			return getRuleContexts(DeclaratorSuffixContext.class);
		}
		public DeclaratorSuffixContext declaratorSuffix(int i) {
			return getRuleContext(DeclaratorSuffixContext.class,i);
		}
		public BlockParametersContext blockParameters() {
			return getRuleContext(BlockParametersContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDirectDeclarator(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_directDeclarator);
		int _la;
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
					{
					setState(1102);
					identifier();
					}
					break;
				case LP:
					{
					setState(1103);
					match(LP);
					setState(1104);
					declarator();
					setState(1105);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LP || _la==LBRACK) {
					{
					{
					setState(1109);
					declaratorSuffix();
					}
					}
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1115);
				match(LP);
				setState(1116);
				match(CARET);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(1117);
					identifier();
					}
				}

				setState(1120);
				match(RP);
				setState(1121);
				blockParameters();
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

	public static class DeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public DeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclaratorSuffix(this);
		}
	}

	public final DeclaratorSuffixContext declaratorSuffix() throws RecognitionException {
		DeclaratorSuffixContext _localctx = new DeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_declaratorSuffix);
		int _la;
		try {
			setState(1133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				match(LBRACK);
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
					{
					setState(1125);
					constantExpression();
					}
				}

				setState(1128);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1129);
				match(LP);
				setState(1130);
				parameterList();
				setState(1131);
				match(RP);
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

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			parameterDeclarationList();
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1136);
				match(COMMA);
				setState(1137);
				match(ELIPSIS);
				}
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

	public static class PointerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(MUL);
			setState(1142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1141);
				declarationSpecifiers();
				}
				break;
			}
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1144);
				pointer();
				}
				break;
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

	public static class MacrosContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MacrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterMacros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitMacros(this);
		}
	}

	public final MacrosContext macros() throws RecognitionException {
		MacrosContext _localctx = new MacrosContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_macros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			identifier();
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(1148);
				match(LP);
				setState(1149);
				primaryExpression();
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1150);
					match(COMMA);
					setState(1151);
					primaryExpression();
					}
					}
					setState(1156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1157);
				match(RP);
				}
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

	public static class InitializerContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public StructInitializerContext structInitializer() {
			return getRuleContext(StructInitializerContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_initializer);
		try {
			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				arrayInitializer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				structInitializer();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			match(LBRACE);
			setState(1178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1167);
				conditionalExpression();
				setState(1172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1168);
						match(COMMA);
						setState(1169);
						conditionalExpression();
						}
						} 
					}
					setState(1174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1175);
					match(COMMA);
					}
				}

				}
			}

			setState(1180);
			match(RBRACE);
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

	public static class StructInitializerContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public StructInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStructInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStructInitializer(this);
		}
	}

	public final StructInitializerContext structInitializer() throws RecognitionException {
		StructInitializerContext _localctx = new StructInitializerContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_structInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(LBRACE);
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1183);
				match(DOT);
				setState(1184);
				assignmentExpression();
				setState(1190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1185);
						match(COMMA);
						setState(1186);
						match(DOT);
						setState(1187);
						assignmentExpression();
						}
						} 
					}
					setState(1192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1193);
					match(COMMA);
					}
				}

				}
			}

			setState(1198);
			match(RBRACE);
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

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitInitializerList(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			initializer();
			setState(1205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1201);
					match(COMMA);
					setState(1202);
					initializer();
					}
					} 
				}
				setState(1207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1208);
				match(COMMA);
				}
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public BlockTypeContext blockType() {
			return getRuleContext(BlockTypeContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeName);
		int _la;
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211);
				specifierQualifierList();
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1212);
					abstractDeclarator();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				blockType();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<AbstractDeclaratorSuffixContext> abstractDeclaratorSuffix() {
			return getRuleContexts(AbstractDeclaratorSuffixContext.class);
		}
		public AbstractDeclaratorSuffixContext abstractDeclaratorSuffix(int i) {
			return getRuleContext(AbstractDeclaratorSuffixContext.class,i);
		}
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAbstractDeclarator(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_abstractDeclarator);
		int _la;
		try {
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1218);
				pointer();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1219);
					abstractDeclarator();
					}
				}

				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				match(LP);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (LP - 88)) | (1L << (LBRACK - 88)) | (1L << (MUL - 88)))) != 0)) {
					{
					setState(1223);
					abstractDeclarator();
					}
				}

				setState(1226);
				match(RP);
				setState(1228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1227);
					abstractDeclaratorSuffix();
					}
					}
					setState(1230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LP || _la==LBRACK );
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1232);
					match(LBRACK);
					setState(1234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
						{
						setState(1233);
						constantExpression();
						}
					}

					setState(1236);
					match(RBRACK);
					}
					}
					setState(1239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
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

	public static class AbstractDeclaratorSuffixContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ParameterDeclarationListContext parameterDeclarationList() {
			return getRuleContext(ParameterDeclarationListContext.class,0);
		}
		public AbstractDeclaratorSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclaratorSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAbstractDeclaratorSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAbstractDeclaratorSuffix(this);
		}
	}

	public final AbstractDeclaratorSuffixContext abstractDeclaratorSuffix() throws RecognitionException {
		AbstractDeclaratorSuffixContext _localctx = new AbstractDeclaratorSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_abstractDeclaratorSuffix);
		int _la;
		try {
			setState(1253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				match(LBRACK);
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (ADD - 114)) | (1L << (SUB - 114)) | (1L << (ASSIGNPA - 114)) | (1L << (GETTER - 114)) | (1L << (NONATOMIC - 114)) | (1L << (SETTER - 114)) | (1L << (STRONG - 114)) | (1L << (RETAIN - 114)) | (1L << (READONLY - 114)) | (1L << (READWRITE - 114)) | (1L << (WEAK - 114)) | (1L << (IDENTIFIER - 114)) | (1L << (CHARACTER_LITERAL - 114)) | (1L << (HEX_LITERAL - 114)) | (1L << (OCTAL_LITERAL - 114)) | (1L << (BINARY_LITERAL - 114)) | (1L << (DECIMAL_LITERAL - 114)) | (1L << (FLOATING_POINT_LITERAL - 114)))) != 0)) {
					{
					setState(1244);
					constantExpression();
					}
				}

				setState(1247);
				match(RBRACK);
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(LP);
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (AUTO - 25)) | (1L << (BYCOPY - 25)) | (1L << (BYREF - 25)) | (1L << (CHAR - 25)) | (1L << (CONST - 25)) | (1L << (DOUBLE - 25)) | (1L << (ENUM - 25)) | (1L << (EXTERN - 25)) | (1L << (FLOAT - 25)) | (1L << (ID - 25)) | (1L << (IN - 25)) | (1L << (INOUT - 25)) | (1L << (INSTANCETYPE - 25)) | (1L << (INT - 25)) | (1L << (LONG - 25)) | (1L << (ONEWAY - 25)) | (1L << (OUT - 25)) | (1L << (REGISTER - 25)) | (1L << (SHORT - 25)) | (1L << (SIGNED - 25)) | (1L << (SIZEOF - 25)) | (1L << (STATIC - 25)) | (1L << (STRUCT - 25)) | (1L << (TYPEDEF - 25)) | (1L << (UNION - 25)) | (1L << (UNSIGNED - 25)) | (1L << (VOID - 25)) | (1L << (VOLATILE - 25)) | (1L << (NS_OPTIONS - 25)) | (1L << (NS_ENUM - 25)) | (1L << (WWEAK - 25)) | (1L << (WUNSAFE_UNRETAINED - 25)) | (1L << (WUNUSED - 25)) | (1L << (WDEPRECATED - 25)) | (1L << (WAUTORELEASING - 25)) | (1L << (TYPEOF - 25)) | (1L << (TYPEOF__ - 25)) | (1L << (TYPEOF____ - 25)) | (1L << (KINDOF__ - 25)) | (1L << (COVARIANT - 25)) | (1L << (CONTRAVARIANT - 25)) | (1L << (NULLABLE - 25)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) {
					{
					setState(1249);
					parameterDeclarationList();
					}
				}

				setState(1252);
				match(RP);
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

	public static class ParameterDeclarationListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterDeclarationList(this);
		}
	}

	public final ParameterDeclarationListContext parameterDeclarationList() throws RecognitionException {
		ParameterDeclarationListContext _localctx = new ParameterDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_parameterDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			parameterDeclaration();
			setState(1260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1256);
					match(COMMA);
					setState(1257);
					parameterDeclaration();
					}
					} 
				}
				setState(1262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_parameterDeclaration);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				declarationSpecifiers();
				setState(1264);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
				match(VOID);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUL) {
				{
				setState(1269);
				pointer();
				}
			}

			setState(1272);
			directDeclarator();
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
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AutoreleaseStatementContext autoreleaseStatement() {
			return getRuleContext(AutoreleaseStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryBlockContext tryBlock() {
			return getRuleContext(TryBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_statement);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				labeledStatement();
				setState(1276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1275);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				compoundStatement();
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1279);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1282);
				selectionStatement();
				setState(1284);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1283);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1286);
				iterationStatement();
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1287);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1290);
				jumpStatement();
				setState(1292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1291);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1294);
				synchronizedStatement();
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1295);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1298);
				autoreleaseStatement();
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1299);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1302);
				throwStatement();
				setState(1304);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1303);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1306);
				tryBlock();
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1307);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1310);
				expression();
				setState(1312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1311);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1314);
				match(SEMI);
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			identifier();
			setState(1318);
			match(COLON);
			setState(1319);
			statement();
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public List<ConstantExpressionContext> constantExpression() {
			return getRuleContexts(ConstantExpressionContext.class);
		}
		public ConstantExpressionContext constantExpression(int i) {
			return getRuleContext(ConstantExpressionContext.class,i);
		}
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitRangeExpression(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_rangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			constantExpression();
			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELIPSIS) {
				{
				setState(1322);
				match(ELIPSIS);
				setState(1323);
				constantExpression();
				}
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(LBRACE);
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << AUTO) | (1L << BREAK) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << GOTO) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << RETURN) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << SWITCH) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (WHILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (ATTRIBUTE - 64)) | (1L << (NULLABLE - 64)) | (1L << (LP - 64)) | (1L << (LBRACE - 64)) | (1L << (LBRACK - 64)) | (1L << (SEMI - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1327);
					declaration();
					}
					break;
				case 2:
					{
					setState(1328);
					statement();
					}
					break;
				}
				}
				setState(1333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1334);
			match(RBRACE);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ObjectiveCParser.IF, 0); }
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ObjectiveCParser.ELSE, 0); }
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSelectionStatement(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_selectionStatement);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				match(IF);
				setState(1337);
				match(LP);
				setState(1338);
				expression();
				setState(1339);
				match(RP);
				setState(1340);
				statement();
				setState(1343);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1341);
					match(ELSE);
					setState(1342);
					statement();
					}
					break;
				}
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1345);
				switchStatement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(SWITCH);
			setState(1349);
			match(LP);
			setState(1350);
			expression();
			setState(1351);
			match(RP);
			setState(1352);
			switchBlock();
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

	public static class SwitchBlockContext extends ParserRuleContext {
		public List<SwitchSectionContext> switchSection() {
			return getRuleContexts(SwitchSectionContext.class);
		}
		public SwitchSectionContext switchSection(int i) {
			return getRuleContext(SwitchSectionContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1354);
			match(LBRACE);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1355);
				switchSection();
				}
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			match(RBRACE);
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

	public static class SwitchSectionContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SwitchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchSection(this);
		}
	}

	public final SwitchSectionContext switchSection() throws RecognitionException {
		SwitchSectionContext _localctx = new SwitchSectionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_switchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1363);
				switchLabel();
				}
				}
				setState(1366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1368);
				statement();
				}
				}
				setState(1371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTORELEASEPOOL) | (1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << SYNCHRONIZED) | (1L << THROW) | (1L << TRY) | (1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << ID) | (1L << IF) | (1L << GOTO) | (1L << RETURN) | (1L << SIZEOF) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (WWEAK - 65)) | (1L << (WUNUSED - 65)) | (1L << (TYPEOF - 65)) | (1L << (TYPEOF__ - 65)) | (1L << (TYPEOF____ - 65)) | (1L << (KINDOF__ - 65)) | (1L << (COVARIANT - 65)) | (1L << (CONTRAVARIANT - 65)) | (1L << (NULLABLE - 65)) | (1L << (LP - 65)) | (1L << (LBRACE - 65)) | (1L << (LBRACK - 65)) | (1L << (SEMI - 65)) | (1L << (AT - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (BITAND - 65)) | (1L << (CARET - 65)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_switchLabel);
		try {
			setState(1385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				match(CASE);
				setState(1379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case SIZEOF:
				case WWEAK:
				case WUNUSED:
				case TYPEOF:
				case TYPEOF__:
				case TYPEOF____:
				case KINDOF__:
				case COVARIANT:
				case CONTRAVARIANT:
				case NULLABLE:
				case ADD:
				case SUB:
				case ASSIGNPA:
				case GETTER:
				case NONATOMIC:
				case SETTER:
				case STRONG:
				case RETAIN:
				case READONLY:
				case READWRITE:
				case WEAK:
				case IDENTIFIER:
				case CHARACTER_LITERAL:
				case HEX_LITERAL:
				case OCTAL_LITERAL:
				case BINARY_LITERAL:
				case DECIMAL_LITERAL:
				case FLOATING_POINT_LITERAL:
					{
					setState(1374);
					rangeExpression();
					}
					break;
				case LP:
					{
					setState(1375);
					match(LP);
					setState(1376);
					rangeExpression();
					setState(1377);
					match(RP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1381);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1383);
				match(DEFAULT);
				setState(1384);
				match(COLON);
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

	public static class ForLoopInitializerContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForLoopInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForLoopInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForLoopInitializer(this);
		}
	}

	public final ForLoopInitializerContext forLoopInitializer() throws RecognitionException {
		ForLoopInitializerContext _localctx = new ForLoopInitializerContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_forLoopInitializer);
		try {
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1387);
				declarationSpecifiers();
				setState(1388);
				initDeclaratorList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1390);
				expression();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIterationStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_iterationStatement);
		try {
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				whileStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				doStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				forInStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(WHILE);
			setState(1400);
			match(LP);
			setState(1401);
			expression();
			setState(1402);
			match(RP);
			setState(1403);
			statement();
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

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(DO);
			setState(1406);
			statement();
			setState(1407);
			match(WHILE);
			setState(1408);
			match(LP);
			setState(1409);
			expression();
			setState(1410);
			match(RP);
			setState(1411);
			match(SEMI);
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
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForLoopInitializerContext forLoopInitializer() {
			return getRuleContext(ForLoopInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			match(FOR);
			setState(1414);
			match(LP);
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << AUTO) | (1L << BYCOPY) | (1L << BYREF) | (1L << CHAR) | (1L << CONST) | (1L << DOUBLE) | (1L << ENUM) | (1L << EXTERN) | (1L << FLOAT) | (1L << ID) | (1L << IN) | (1L << INOUT) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << ONEWAY) | (1L << OUT) | (1L << REGISTER) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STATIC) | (1L << STRUCT) | (1L << TYPEDEF) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (VOLATILE - 64)) | (1L << (NS_OPTIONS - 64)) | (1L << (NS_ENUM - 64)) | (1L << (WWEAK - 64)) | (1L << (WUNSAFE_UNRETAINED - 64)) | (1L << (WUNUSED - 64)) | (1L << (WDEPRECATED - 64)) | (1L << (WAUTORELEASING - 64)) | (1L << (TYPEOF - 64)) | (1L << (TYPEOF__ - 64)) | (1L << (TYPEOF____ - 64)) | (1L << (KINDOF__ - 64)) | (1L << (COVARIANT - 64)) | (1L << (CONTRAVARIANT - 64)) | (1L << (NULLABLE - 64)) | (1L << (LP - 64)) | (1L << (LBRACK - 64)) | (1L << (AT - 64)) | (1L << (BANG - 64)) | (1L << (TILDE - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (ADD - 64)) | (1L << (SUB - 64)) | (1L << (MUL - 64)) | (1L << (BITAND - 64)) | (1L << (CARET - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IB_OUTLET - 133)) | (1L << (IB_OUTLET_COLLECTION - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1415);
				forLoopInitializer();
				}
			}

			setState(1418);
			match(SEMI);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1419);
				expression();
				}
			}

			setState(1422);
			match(SEMI);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1423);
				expression();
				}
			}

			setState(1426);
			match(RP);
			setState(1427);
			statement();
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

	public static class ForInStatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeVariableDeclaratorContext typeVariableDeclarator() {
			return getRuleContext(TypeVariableDeclaratorContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitForInStatement(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(FOR);
			setState(1430);
			match(LP);
			setState(1431);
			typeVariableDeclarator();
			setState(1432);
			match(IN);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
				{
				setState(1433);
				expression();
				}
			}

			setState(1436);
			match(RP);
			setState(1437);
			statement();
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

	public static class JumpStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitJumpStatement(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_jumpStatement);
		int _la;
		try {
			setState(1452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GOTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(GOTO);
				setState(1440);
				identifier();
				setState(1441);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1443);
				match(CONTINUE);
				setState(1444);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1445);
				match(BREAK);
				setState(1446);
				match(SEMI);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1447);
				match(RETURN);
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
					{
					setState(1448);
					expression();
					}
				}

				setState(1451);
				match(SEMI);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			assignmentExpression();
			setState(1459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1455);
					match(COMMA);
					setState(1456);
					assignmentExpression();
					}
					} 
				}
				setState(1461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_assignmentExpression);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1463);
				unaryExpression();
				setState(1464);
				assignmentOperator();
				setState(1465);
				assignmentExpression();
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_conditionalExpression);
		int _la;
		try {
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469);
				binaryExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470);
				binaryExpression(0);
				setState(1471);
				match(QUESTION);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << ID) | (1L << SIZEOF))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (WWEAK - 68)) | (1L << (WUNUSED - 68)) | (1L << (TYPEOF - 68)) | (1L << (TYPEOF__ - 68)) | (1L << (TYPEOF____ - 68)) | (1L << (KINDOF__ - 68)) | (1L << (COVARIANT - 68)) | (1L << (CONTRAVARIANT - 68)) | (1L << (NULLABLE - 68)) | (1L << (LP - 68)) | (1L << (LBRACK - 68)) | (1L << (AT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (MUL - 68)) | (1L << (BITAND - 68)) | (1L << (CARET - 68)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
					{
					setState(1472);
					expression();
					}
				}

				setState(1475);
				match(COLON);
				setState(1476);
				conditionalExpression();
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

	public static class BinaryExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ObjectiveCParser.DIV, 0); }
		public List<TerminalNode> LT() { return getTokens(ObjectiveCParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(ObjectiveCParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(ObjectiveCParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(ObjectiveCParser.GT, i);
		}
		public TerminalNode LE() { return getToken(ObjectiveCParser.LE, 0); }
		public TerminalNode GE() { return getToken(ObjectiveCParser.GE, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ObjectiveCParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(ObjectiveCParser.EQUAL, 0); }
		public TerminalNode AND() { return getToken(ObjectiveCParser.AND, 0); }
		public TerminalNode OR() { return getToken(ObjectiveCParser.OR, 0); }
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitBinaryExpression(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		return binaryExpression(0);
	}

	private BinaryExpressionContext binaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, _parentState);
		BinaryExpressionContext _prevctx = _localctx;
		int _startState = 252;
		enterRecursionRule(_localctx, 252, RULE_binaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1481);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1518);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1483);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1484);
						_la = _input.LA(1);
						if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (MUL - 116)) | (1L << (DIV - 116)) | (1L << (MOD - 116)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1485);
						binaryExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1486);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1487);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1488);
						binaryExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1489);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1494);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(1490);
							match(LT);
							setState(1491);
							match(LT);
							}
							break;
						case GT:
							{
							setState(1492);
							match(GT);
							setState(1493);
							match(GT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1496);
						binaryExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1497);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1498);
						_la = _input.LA(1);
						if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (GT - 100)) | (1L << (LT - 100)) | (1L << (LE - 100)) | (1L << (GE - 100)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1499);
						binaryExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1500);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1501);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1502);
						binaryExpression(7);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1503);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1504);
						match(BITAND);
						setState(1505);
						binaryExpression(6);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1506);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1507);
						match(CARET);
						setState(1508);
						binaryExpression(5);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1509);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1510);
						match(BITOR);
						setState(1511);
						binaryExpression(4);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1512);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1513);
						match(AND);
						setState(1514);
						binaryExpression(3);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(1515);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1516);
						match(OR);
						setState(1517);
						binaryExpression(2);
						}
						break;
					}
					} 
				}
				setState(1522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_castExpression);
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(LP);
				setState(1524);
				typeName();
				setState(1525);
				match(RP);
				setState(1528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1526);
					castExpression();
					}
					break;
				case 2:
					{
					setState(1527);
					initializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				unaryExpression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (ASSIGN - 99)) | (1L << (ADD_ASSIGN - 99)) | (1L << (SUB_ASSIGN - 99)) | (1L << (MUL_ASSIGN - 99)) | (1L << (DIV_ASSIGN - 99)) | (1L << (AND_ASSIGN - 99)) | (1L << (OR_ASSIGN - 99)) | (1L << (XOR_ASSIGN - 99)) | (1L << (MOD_ASSIGN - 99)) | (1L << (LSHIFT_ASSIGN - 99)) | (1L << (RSHIFT_ASSIGN - 99)))) != 0)) ) {
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_constantExpression);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case SIZEOF:
			case WWEAK:
			case WUNUSED:
			case TYPEOF:
			case TYPEOF__:
			case TYPEOF____:
			case KINDOF__:
			case COVARIANT:
			case CONTRAVARIANT:
			case NULLABLE:
			case ASSIGNPA:
			case GETTER:
			case NONATOMIC:
			case SETTER:
			case STRONG:
			case RETAIN:
			case READONLY:
			case READWRITE:
			case WEAK:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1535);
				identifier();
				}
				break;
			case ADD:
			case SUB:
			case CHARACTER_LITERAL:
			case HEX_LITERAL:
			case OCTAL_LITERAL:
			case BINARY_LITERAL:
			case DECIMAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				constant();
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_unaryExpression);
		try {
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				match(INC);
				setState(1541);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				match(DEC);
				setState(1543);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1544);
				unaryOperator();
				setState(1545);
				castExpression();
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode BANG() { return getToken(ObjectiveCParser.BANG, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (BANG - 102)) | (1L << (TILDE - 102)) | (1L << (ADD - 102)) | (1L << (SUB - 102)) | (1L << (MUL - 102)) | (1L << (BITAND - 102)))) != 0)) ) {
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexerExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexerExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIndexerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIndexerExpression(this);
		}
	}
	public static class FunctionCallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FunctionCallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitFunctionCallExpression(this);
		}
	}
	public static class PrimaryInPostfixExpressionContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryInPostfixExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPrimaryInPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPrimaryInPostfixExpression(this);
		}
	}
	public static class PropertyExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PropertyExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPropertyExpression(this);
		}
	}
	public static class IncDecExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IncDecExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIncDecExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIncDecExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryInPostfixExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1552);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1572);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1570);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
					case 1:
						{
						_localctx = new IndexerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1554);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1555);
						match(LBRACK);
						setState(1556);
						expression();
						setState(1557);
						match(RBRACK);
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1559);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1560);
						match(LP);
						setState(1562);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENCODE) | (1L << PROTOCOL) | (1L << SELECTOR) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FLOAT) | (1L << ID) | (1L << INSTANCETYPE) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << SIGNED) | (1L << SIZEOF) | (1L << STRUCT) | (1L << UNION) | (1L << UNSIGNED) | (1L << VOID))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NS_OPTIONS - 66)) | (1L << (NS_ENUM - 66)) | (1L << (WWEAK - 66)) | (1L << (WUNUSED - 66)) | (1L << (TYPEOF - 66)) | (1L << (TYPEOF__ - 66)) | (1L << (TYPEOF____ - 66)) | (1L << (KINDOF__ - 66)) | (1L << (COVARIANT - 66)) | (1L << (CONTRAVARIANT - 66)) | (1L << (NULLABLE - 66)) | (1L << (LP - 66)) | (1L << (LBRACK - 66)) | (1L << (AT - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (BITAND - 66)) | (1L << (CARET - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)) | (1L << (CHARACTER_LITERAL - 133)) | (1L << (QUOTE_STRING - 133)) | (1L << (STRING - 133)) | (1L << (HEX_LITERAL - 133)) | (1L << (OCTAL_LITERAL - 133)) | (1L << (BINARY_LITERAL - 133)) | (1L << (DECIMAL_LITERAL - 133)) | (1L << (FLOATING_POINT_LITERAL - 133)))) != 0)) {
							{
							setState(1561);
							argumentExpressionList();
							}
						}

						setState(1564);
						match(RP);
						}
						break;
					case 3:
						{
						_localctx = new PropertyExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1565);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1566);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==STRUCTACCESS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1567);
						identifier();
						}
						break;
					case 4:
						{
						_localctx = new IncDecExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(1568);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1569);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(1574);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<ArgumentExpressionContext> argumentExpression() {
			return getRuleContexts(ArgumentExpressionContext.class);
		}
		public ArgumentExpressionContext argumentExpression(int i) {
			return getRuleContext(ArgumentExpressionContext.class,i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArgumentExpressionList(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			argumentExpression();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1576);
				match(COMMA);
				setState(1577);
				argumentExpression();
				}
				}
				setState(1582);
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

	public static class ArgumentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ArgumentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterArgumentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitArgumentExpression(this);
		}
	}

	public final ArgumentExpressionContext argumentExpression() throws RecognitionException {
		ArgumentExpressionContext _localctx = new ArgumentExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_argumentExpression);
		try {
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1583);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1584);
				typeSpecifier();
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(ObjectiveCParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(ObjectiveCParser.RP, 0); }
		public MessageExpressionContext messageExpression() {
			return getRuleContext(MessageExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public ProtocolExpressionContext protocolExpression() {
			return getRuleContext(ProtocolExpressionContext.class,0);
		}
		public EncodeExpressionContext encodeExpression() {
			return getRuleContext(EncodeExpressionContext.class,0);
		}
		public DictionaryExpressionContext dictionaryExpression() {
			return getRuleContext(DictionaryExpressionContext.class,0);
		}
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public BoxExpressionContext boxExpression() {
			return getRuleContext(BoxExpressionContext.class,0);
		}
		public BlockExpressionContext blockExpression() {
			return getRuleContext(BlockExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_primaryExpression);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1589);
				stringLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1590);
				match(LP);
				setState(1591);
				expression();
				setState(1592);
				match(RP);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1594);
				messageExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1595);
				selectorExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1596);
				protocolExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1597);
				encodeExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1598);
				dictionaryExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1599);
				arrayExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1600);
				boxExpression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1601);
				blockExpression();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode HEX_LITERAL() { return getToken(ObjectiveCParser.HEX_LITERAL, 0); }
		public TerminalNode OCTAL_LITERAL() { return getToken(ObjectiveCParser.OCTAL_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(ObjectiveCParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(ObjectiveCParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(ObjectiveCParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(ObjectiveCParser.CHARACTER_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_constant);
		int _la;
		try {
			setState(1616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				match(HEX_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				match(OCTAL_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1606);
				match(BINARY_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1607);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1610);
				match(DECIMAL_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUB) {
					{
					setState(1611);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1614);
				match(FLOATING_POINT_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1615);
				match(CHARACTER_LITERAL);
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

	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(ObjectiveCParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ObjectiveCParser.STRING, i);
		}
		public List<TerminalNode> QUOTE_STRING() { return getTokens(ObjectiveCParser.QUOTE_STRING); }
		public TerminalNode QUOTE_STRING(int i) {
			return getToken(ObjectiveCParser.QUOTE_STRING, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1618);
				match(STRING);
				setState(1625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1620);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==BACKSLASH) {
							{
							setState(1619);
							match(BACKSLASH);
							}
						}

						setState(1622);
						match(STRING);
						}
						} 
					}
					setState(1627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				}
				break;
			case QUOTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1629); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1628);
						match(QUOTE_STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1631); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ObjectiveCParser.IDENTIFIER, 0); }
		public TerminalNode NULLABLE() { return getToken(ObjectiveCParser.NULLABLE, 0); }
		public TerminalNode WWEAK() { return getToken(ObjectiveCParser.WWEAK, 0); }
		public TerminalNode TYPEOF() { return getToken(ObjectiveCParser.TYPEOF, 0); }
		public TerminalNode TYPEOF__() { return getToken(ObjectiveCParser.TYPEOF__, 0); }
		public TerminalNode TYPEOF____() { return getToken(ObjectiveCParser.TYPEOF____, 0); }
		public TerminalNode KINDOF__() { return getToken(ObjectiveCParser.KINDOF__, 0); }
		public TerminalNode SIZEOF() { return getToken(ObjectiveCParser.SIZEOF, 0); }
		public TerminalNode ASSIGNPA() { return getToken(ObjectiveCParser.ASSIGNPA, 0); }
		public TerminalNode GETTER() { return getToken(ObjectiveCParser.GETTER, 0); }
		public TerminalNode NONATOMIC() { return getToken(ObjectiveCParser.NONATOMIC, 0); }
		public TerminalNode SETTER() { return getToken(ObjectiveCParser.SETTER, 0); }
		public TerminalNode STRONG() { return getToken(ObjectiveCParser.STRONG, 0); }
		public TerminalNode RETAIN() { return getToken(ObjectiveCParser.RETAIN, 0); }
		public TerminalNode READONLY() { return getToken(ObjectiveCParser.READONLY, 0); }
		public TerminalNode READWRITE() { return getToken(ObjectiveCParser.READWRITE, 0); }
		public TerminalNode WEAK() { return getToken(ObjectiveCParser.WEAK, 0); }
		public TerminalNode ID() { return getToken(ObjectiveCParser.ID, 0); }
		public TerminalNode COVARIANT() { return getToken(ObjectiveCParser.COVARIANT, 0); }
		public TerminalNode CONTRAVARIANT() { return getToken(ObjectiveCParser.CONTRAVARIANT, 0); }
		public TerminalNode WUNUSED() { return getToken(ObjectiveCParser.WUNUSED, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjectiveCParserListener ) ((ObjectiveCParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (ID - 42)) | (1L << (SIZEOF - 42)) | (1L << (WWEAK - 42)) | (1L << (WUNUSED - 42)) | (1L << (TYPEOF - 42)) | (1L << (TYPEOF__ - 42)) | (1L << (TYPEOF____ - 42)) | (1L << (KINDOF__ - 42)) | (1L << (COVARIANT - 42)) | (1L << (CONTRAVARIANT - 42)) | (1L << (NULLABLE - 42)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (ASSIGNPA - 133)) | (1L << (GETTER - 133)) | (1L << (NONATOMIC - 133)) | (1L << (SETTER - 133)) | (1L << (STRONG - 133)) | (1L << (RETAIN - 133)) | (1L << (READONLY - 133)) | (1L << (READWRITE - 133)) | (1L << (WEAK - 133)) | (1L << (IDENTIFIER - 133)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 126:
			return binaryExpression_sempred((BinaryExpressionContext)_localctx, predIndex);
		case 132:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean binaryExpression_sempred(BinaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c5\u0668\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\7\2\u011a\n\2\f\2"+
		"\16\2\u011d\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u012c\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u0136\n\5\3\5\5\5\u0139"+
		"\n\5\3\5\5\5\u013c\n\5\3\5\5\5\u013f\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0147"+
		"\n\6\3\6\3\6\5\6\u014b\n\6\3\6\5\6\u014e\n\6\3\6\5\6\u0151\n\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\7\u0159\n\7\3\7\5\7\u015c\n\7\3\7\5\7\u015f\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0169\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u0170"+
		"\n\t\3\t\3\t\3\t\7\t\u0175\n\t\f\t\16\t\u0178\13\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0187\n\f\f\f\16\f\u018a\13\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0193\n\16\f\16\16\16\u0196\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u019d\n\17\3\17\5\17\u01a0\n\17\3\17\3"+
		"\17\3\20\3\20\3\20\7\20\u01a7\n\20\f\20\16\20\u01aa\13\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u01bd\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u01c7"+
		"\n\25\3\25\5\25\u01ca\n\25\3\26\3\26\7\26\u01ce\n\26\f\26\16\26\u01d1"+
		"\13\26\3\26\3\26\3\26\3\26\6\26\u01d7\n\26\r\26\16\26\u01d8\3\26\3\26"+
		"\3\26\3\26\6\26\u01df\n\26\r\26\16\26\u01e0\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\6\26\u01e9\n\26\r\26\16\26\u01ea\3\26\3\26\3\26\5\26\u01f0\n\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\6\30\u01f8\n\30\r\30\16\30\u01f9\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\5\33\u0203\n\33\3\33\3\33\5\33\u0207\n\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\6\34\u0210\n\34\r\34\16\34\u0211\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\5\37\u021b\n\37\3\37\3\37\5\37\u021f\n"+
		"\37\3\37\5\37\u0222\n\37\3\37\3\37\3 \3 \6 \u0228\n \r \16 \u0229\3 \3"+
		" \5 \u022e\n \5 \u0230\n \3!\5!\u0233\n!\3!\3!\7!\u0237\n!\f!\16!\u023a"+
		"\13!\3!\5!\u023d\n!\3!\3!\3\"\3\"\5\"\u0243\n\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\5$\u0251\n$\3%\3%\3%\7%\u0256\n%\f%\16%\u0259\13%\3&\3&"+
		"\3&\5&\u025e\n&\3\'\3\'\3\'\3\'\5\'\u0264\n\'\3\'\3\'\5\'\u0268\n\'\3"+
		"(\3(\5(\u026c\n(\3(\3(\7(\u0270\n(\f(\16(\u0273\13(\3(\3(\3)\3)\3*\3*"+
		"\3*\5*\u027c\n*\3*\3*\7*\u0280\n*\f*\16*\u0283\13*\3*\5*\u0286\n*\3*\3"+
		"*\3+\3+\3+\3+\3,\3,\3,\5,\u0291\n,\3,\3,\7,\u0295\n,\f,\16,\u0298\13,"+
		"\3,\5,\u029b\n,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02a7\n-\5-\u02a9\n-"+
		"\3.\3.\3.\3.\5.\u02af\n.\3.\3.\3.\5.\u02b4\n.\7.\u02b6\n.\f.\16.\u02b9"+
		"\13.\3.\3.\3/\3/\5/\u02bf\n/\3/\5/\u02c2\n/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\5\61\u02cd\n\61\3\62\3\62\6\62\u02d1\n\62\r\62\16\62\u02d2"+
		"\5\62\u02d5\n\62\3\63\5\63\u02d8\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5"+
		"\63\u02e0\n\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02e8\n\63\7\63\u02ea"+
		"\n\63\f\63\16\63\u02ed\13\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u02f6"+
		"\n\65\3\65\6\65\u02f9\n\65\r\65\16\65\u02fa\5\65\u02fd\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\39\39\39\39\39\39\3"+
		"9\59\u0313\n9\3:\3:\3:\7:\u0318\n:\f:\16:\u031b\13:\3:\3:\5:\u031f\n:"+
		"\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\5>\u0331\n>\3>\5>\u0334"+
		"\n>\3>\5>\u0337\n>\3>\5>\u033a\n>\3>\3>\3>\5>\u033f\n>\3>\5>\u0342\n>"+
		"\3>\5>\u0345\n>\3>\3>\3?\3?\3?\3?\3?\3?\7?\u034f\n?\f?\16?\u0352\13?\3"+
		"?\3?\3?\5?\u0357\n?\3@\3@\5@\u035b\n@\3A\3A\3B\3B\5B\u0361\nB\3B\3B\3"+
		"C\3C\3C\7C\u0368\nC\fC\16C\u036b\13C\3D\3D\3D\3D\5D\u0371\nD\3E\3E\3E"+
		"\3E\3E\5E\u0378\nE\3F\3F\3F\5F\u037d\nF\3G\5G\u0380\nG\3G\3G\5G\u0384"+
		"\nG\3G\3G\3G\3G\3G\3H\5H\u038c\nH\3H\5H\u038f\nH\3H\3H\5H\u0393\nH\3H"+
		"\3H\3I\5I\u0398\nI\3I\3I\5I\u039c\nI\3I\5I\u039f\nI\3I\3I\3J\3J\3J\3J"+
		"\3J\6J\u03a8\nJ\rJ\16J\u03a9\3K\3K\3K\3K\3K\3K\5K\u03b2\nK\3L\3L\3L\7"+
		"L\u03b7\nL\fL\16L\u03ba\13L\3M\3M\3M\5M\u03bf\nM\3N\3N\3N\5N\u03c4\nN"+
		"\3N\3N\6N\u03c8\nN\rN\16N\u03c9\3N\3N\5N\u03ce\nN\3O\3O\3O\5O\u03d3\n"+
		"O\3O\3O\3P\3P\3P\3P\6P\u03db\nP\rP\16P\u03dc\3Q\3Q\3R\3R\3S\3S\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u03f3\nT\3T\3T\3T\3T\5T\u03f9\n"+
		"T\5T\u03fb\nT\3U\3U\3U\5U\u0400\nU\3V\3V\3V\3V\3V\3W\3W\3W\5W\u040a\n"+
		"W\3X\3X\3X\7X\u040f\nX\fX\16X\u0412\13X\3Y\3Y\5Y\u0416\nY\3Y\3Y\5Y\u041a"+
		"\nY\3Z\3Z\5Z\u041e\nZ\3Z\3Z\5Z\u0422\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u0429\nZ\3Z"+
		"\3Z\3Z\3Z\5Z\u042f\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u043b\nZ\3[\3["+
		"\3[\7[\u0440\n[\f[\16[\u0443\13[\3[\5[\u0446\n[\3\\\3\\\3\\\5\\\u044b"+
		"\n\\\3]\3]\5]\u044f\n]\3^\3^\3^\3^\3^\5^\u0456\n^\3^\7^\u0459\n^\f^\16"+
		"^\u045c\13^\3^\3^\3^\5^\u0461\n^\3^\3^\5^\u0465\n^\3_\3_\5_\u0469\n_\3"+
		"_\3_\3_\3_\3_\5_\u0470\n_\3`\3`\3`\5`\u0475\n`\3a\3a\5a\u0479\na\3a\5"+
		"a\u047c\na\3b\3b\3b\3b\3b\7b\u0483\nb\fb\16b\u0486\13b\3b\3b\5b\u048a"+
		"\nb\3c\3c\3c\5c\u048f\nc\3d\3d\3d\3d\7d\u0495\nd\fd\16d\u0498\13d\3d\5"+
		"d\u049b\nd\5d\u049d\nd\3d\3d\3e\3e\3e\3e\3e\3e\7e\u04a7\ne\fe\16e\u04aa"+
		"\13e\3e\5e\u04ad\ne\5e\u04af\ne\3e\3e\3f\3f\3f\7f\u04b6\nf\ff\16f\u04b9"+
		"\13f\3f\5f\u04bc\nf\3g\3g\5g\u04c0\ng\3g\5g\u04c3\ng\3h\3h\5h\u04c7\n"+
		"h\3h\3h\5h\u04cb\nh\3h\3h\6h\u04cf\nh\rh\16h\u04d0\3h\3h\5h\u04d5\nh\3"+
		"h\6h\u04d8\nh\rh\16h\u04d9\5h\u04dc\nh\3i\3i\5i\u04e0\ni\3i\3i\3i\5i\u04e5"+
		"\ni\3i\5i\u04e8\ni\3j\3j\3j\7j\u04ed\nj\fj\16j\u04f0\13j\3k\3k\3k\3k\5"+
		"k\u04f6\nk\3l\5l\u04f9\nl\3l\3l\3m\3m\5m\u04ff\nm\3m\3m\5m\u0503\nm\3"+
		"m\3m\5m\u0507\nm\3m\3m\5m\u050b\nm\3m\3m\5m\u050f\nm\3m\3m\5m\u0513\n"+
		"m\3m\3m\5m\u0517\nm\3m\3m\5m\u051b\nm\3m\3m\5m\u051f\nm\3m\3m\5m\u0523"+
		"\nm\3m\5m\u0526\nm\3n\3n\3n\3n\3o\3o\3o\5o\u052f\no\3p\3p\3p\7p\u0534"+
		"\np\fp\16p\u0537\13p\3p\3p\3q\3q\3q\3q\3q\3q\3q\5q\u0542\nq\3q\5q\u0545"+
		"\nq\3r\3r\3r\3r\3r\3r\3s\3s\7s\u054f\ns\fs\16s\u0552\13s\3s\3s\3t\6t\u0557"+
		"\nt\rt\16t\u0558\3t\6t\u055c\nt\rt\16t\u055d\3u\3u\3u\3u\3u\3u\5u\u0566"+
		"\nu\3u\3u\3u\3u\5u\u056c\nu\3v\3v\3v\3v\5v\u0572\nv\3w\3w\3w\3w\5w\u0578"+
		"\nw\3x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3y\3z\3z\3z\5z\u058b\nz\3z"+
		"\3z\5z\u058f\nz\3z\3z\5z\u0593\nz\3z\3z\3z\3{\3{\3{\3{\3{\5{\u059d\n{"+
		"\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u05ac\n|\3|\5|\u05af\n|\3}"+
		"\3}\3}\7}\u05b4\n}\f}\16}\u05b7\13}\3~\3~\3~\3~\3~\5~\u05be\n~\3\177\3"+
		"\177\3\177\3\177\5\177\u05c4\n\177\3\177\3\177\3\177\5\177\u05c9\n\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05d9\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\7\u0080\u05f1\n\u0080\f\u0080\16\u0080\u05f4"+
		"\13\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05fb\n\u0081"+
		"\3\u0081\5\u0081\u05fe\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\5\u0083"+
		"\u0604\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\5\u0084\u060e\n\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086"+
		"\u061d\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086"+
		"\u0625\n\u0086\f\u0086\16\u0086\u0628\13\u0086\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u062d\n\u0087\f\u0087\16\u0087\u0630\13\u0087\3\u0088\3\u0088"+
		"\5\u0088\u0634\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0645\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u064b\n"+
		"\u008a\3\u008a\3\u008a\5\u008a\u064f\n\u008a\3\u008a\3\u008a\5\u008a\u0653"+
		"\n\u008a\3\u008b\3\u008b\5\u008b\u0657\n\u008b\3\u008b\7\u008b\u065a\n"+
		"\u008b\f\u008b\16\u008b\u065d\13\u008b\3\u008b\6\u008b\u0660\n\u008b\r"+
		"\u008b\16\u008b\u0661\5\u008b\u0664\n\u008b\3\u008c\3\u008c\3\u008c\2"+
		"\4\u00fe\u010a\u008d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\2\25\3\2OP\5\2\r\r\20\20\22\23\5\2\36\37./\64\65\4\2\"\"\u0092\u0092"+
		"\4\2<<??\3\2FJ\3\2RS\7\2\33\33))\66\66;;>>\3\2KM\3\2DE\4\2vw{{\3\2tu\4"+
		"\2fgmn\4\2lloo\4\2ee|\u0085\5\2hitvxx\3\2bc\3\2rs\n\2,,::FFHHKPRR\u0087"+
		"\u008f\u0092\u0092\2\u0713\2\u011b\3\2\2\2\4\u012b\3\2\2\2\6\u012d\3\2"+
		"\2\2\b\u0131\3\2\2\2\n\u0142\3\2\2\2\f\u0154\3\2\2\2\16\u0162\3\2\2\2"+
		"\20\u016c\3\2\2\2\22\u017b\3\2\2\2\24\u017f\3\2\2\2\26\u0183\3\2\2\2\30"+
		"\u018b\3\2\2\2\32\u018f\3\2\2\2\34\u0197\3\2\2\2\36\u01a3\3\2\2\2 \u01bc"+
		"\3\2\2\2\"\u01be\3\2\2\2$\u01c0\3\2\2\2&\u01c2\3\2\2\2(\u01c9\3\2\2\2"+
		"*\u01ef\3\2\2\2,\u01f1\3\2\2\2.\u01f7\3\2\2\2\60\u01fb\3\2\2\2\62\u01fe"+
		"\3\2\2\2\64\u0202\3\2\2\2\66\u020f\3\2\2\28\u0213\3\2\2\2:\u0216\3\2\2"+
		"\2<\u021a\3\2\2\2>\u022f\3\2\2\2@\u0232\3\2\2\2B\u0242\3\2\2\2D\u0244"+
		"\3\2\2\2F\u0250\3\2\2\2H\u0252\3\2\2\2J\u025a\3\2\2\2L\u025f\3\2\2\2N"+
		"\u0269\3\2\2\2P\u0276\3\2\2\2R\u0278\3\2\2\2T\u0289\3\2\2\2V\u028d\3\2"+
		"\2\2X\u02a8\3\2\2\2Z\u02aa\3\2\2\2\\\u02bc\3\2\2\2^\u02c5\3\2\2\2`\u02cc"+
		"\3\2\2\2b\u02d4\3\2\2\2d\u02d7\3\2\2\2f\u02ee\3\2\2\2h\u02fc\3\2\2\2j"+
		"\u02fe\3\2\2\2l\u0303\3\2\2\2n\u0308\3\2\2\2p\u0312\3\2\2\2r\u0314\3\2"+
		"\2\2t\u0320\3\2\2\2v\u0326\3\2\2\2x\u032c\3\2\2\2z\u0330\3\2\2\2|\u0348"+
		"\3\2\2\2~\u0358\3\2\2\2\u0080\u035c\3\2\2\2\u0082\u035e\3\2\2\2\u0084"+
		"\u0364\3\2\2\2\u0086\u0370\3\2\2\2\u0088\u0372\3\2\2\2\u008a\u037c\3\2"+
		"\2\2\u008c\u037f\3\2\2\2\u008e\u038b\3\2\2\2\u0090\u0397\3\2\2\2\u0092"+
		"\u03a7\3\2\2\2\u0094\u03b1\3\2\2\2\u0096\u03b3\3\2\2\2\u0098\u03bb\3\2"+
		"\2\2\u009a\u03c0\3\2\2\2\u009c\u03cf\3\2\2\2\u009e\u03da\3\2\2\2\u00a0"+
		"\u03de\3\2\2\2\u00a2\u03e0\3\2\2\2\u00a4\u03e2\3\2\2\2\u00a6\u03fa\3\2"+
		"\2\2\u00a8\u03ff\3\2\2\2\u00aa\u0401\3\2\2\2\u00ac\u0406\3\2\2\2\u00ae"+
		"\u040b\3\2\2\2\u00b0\u0419\3\2\2\2\u00b2\u043a\3\2\2\2\u00b4\u043c\3\2"+
		"\2\2\u00b6\u0447\3\2\2\2\u00b8\u044e\3\2\2\2\u00ba\u0464\3\2\2\2\u00bc"+
		"\u046f\3\2\2\2\u00be\u0471\3\2\2\2\u00c0\u0476\3\2\2\2\u00c2\u047d\3\2"+
		"\2\2\u00c4\u048e\3\2\2\2\u00c6\u0490\3\2\2\2\u00c8\u04a0\3\2\2\2\u00ca"+
		"\u04b2\3\2\2\2\u00cc\u04c2\3\2\2\2\u00ce\u04db\3\2\2\2\u00d0\u04e7\3\2"+
		"\2\2\u00d2\u04e9\3\2\2\2\u00d4\u04f5\3\2\2\2\u00d6\u04f8\3\2\2\2\u00d8"+
		"\u0525\3\2\2\2\u00da\u0527\3\2\2\2\u00dc\u052b\3\2\2\2\u00de\u0530\3\2"+
		"\2\2\u00e0\u0544\3\2\2\2\u00e2\u0546\3\2\2\2\u00e4\u054c\3\2\2\2\u00e6"+
		"\u0556\3\2\2\2\u00e8\u056b\3\2\2\2\u00ea\u0571\3\2\2\2\u00ec\u0577\3\2"+
		"\2\2\u00ee\u0579\3\2\2\2\u00f0\u057f\3\2\2\2\u00f2\u0587\3\2\2\2\u00f4"+
		"\u0597\3\2\2\2\u00f6\u05ae\3\2\2\2\u00f8\u05b0\3\2\2\2\u00fa\u05bd\3\2"+
		"\2\2\u00fc\u05c8\3\2\2\2\u00fe\u05ca\3\2\2\2\u0100\u05fd\3\2\2\2\u0102"+
		"\u05ff\3\2\2\2\u0104\u0603\3\2\2\2\u0106\u060d\3\2\2\2\u0108\u060f\3\2"+
		"\2\2\u010a\u0611\3\2\2\2\u010c\u0629\3\2\2\2\u010e\u0633\3\2\2\2\u0110"+
		"\u0644\3\2\2\2\u0112\u0652\3\2\2\2\u0114\u0663\3\2\2\2\u0116\u0665\3\2"+
		"\2\2\u0118\u011a\5\4\3\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u011f\7\2\2\3\u011f\3\3\2\2\2\u0120\u012c\5\6\4\2\u0121\u012c"+
		"\5z>\2\u0122\u012c\5\u008aF\2\u0123\u012c\5\b\5\2\u0124\u012c\5\f\7\2"+
		"\u0125\u012c\5\n\6\2\u0126\u012c\5\16\b\2\u0127\u012c\5\20\t\2\u0128\u012c"+
		"\5\22\n\2\u0129\u012c\5\24\13\2\u012a\u012c\5\66\34\2\u012b\u0120\3\2"+
		"\2\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b"+
		"\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c"+
		"\5\3\2\2\2\u012d\u012e\7\f\2\2\u012e\u012f\5\u0116\u008c\2\u012f\u0130"+
		"\7`\2\2\u0130\7\3\2\2\2\u0131\u0132\7\13\2\2\u0132\u0135\5\u00acW\2\u0133"+
		"\u0134\7k\2\2\u0134\u0136\5$\23\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5\30\r\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u013c\5*\26\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\5.\30\2\u013e"+
		"\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\b"+
		"\2\2\u0141\t\3\2\2\2\u0142\u0143\7\13\2\2\u0143\u0144\5\u00acW\2\u0144"+
		"\u0146\7Z\2\2\u0145\u0147\5&\24\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u014a\7[\2\2\u0149\u014b\5\30\r\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5*"+
		"\26\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f"+
		"\u0151\5.\30\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u0153\7\b\2\2\u0153\13\3\2\2\2\u0154\u0155\7\n\2\2\u0155\u0158"+
		"\5\u00acW\2\u0156\u0157\7k\2\2\u0157\u0159\5$\23\2\u0158\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u015c\5*\26\2\u015b\u015a"+
		"\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015f\5\66\34\2"+
		"\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161"+
		"\7\b\2\2\u0161\r\3\2\2\2\u0162\u0163\7\n\2\2\u0163\u0164\5\u00acW\2\u0164"+
		"\u0165\7Z\2\2\u0165\u0166\5&\24\2\u0166\u0168\7[\2\2\u0167\u0169\5\66"+
		"\34\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\7\b\2\2\u016b\17\3\2\2\2\u016c\u016d\7\16\2\2\u016d\u016f\5(\25"+
		"\2\u016e\u0170\5\30\r\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0176\3\2\2\2\u0171\u0175\7\24\2\2\u0172\u0175\5.\30\2\u0173\u0175\7"+
		"\17\2\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7\b\2\2\u017a\21\3\2\2\2\u017b\u017c"+
		"\7\16\2\2\u017c\u017d\5\32\16\2\u017d\u017e\7`\2\2\u017e\23\3\2\2\2\u017f"+
		"\u0180\7\5\2\2\u0180\u0181\5\26\f\2\u0181\u0182\7`\2\2\u0182\25\3\2\2"+
		"\2\u0183\u0188\5\"\22\2\u0184\u0185\7a\2\2\u0185\u0187\5\"\22\2\u0186"+
		"\u0184\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\27\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7g\2\2\u018c\u018d"+
		"\5\32\16\2\u018d\u018e\7f\2\2\u018e\31\3\2\2\2\u018f\u0194\5(\25\2\u0190"+
		"\u0191\7a\2\2\u0191\u0193\5(\25\2\u0192\u0190\3\2\2\2\u0193\u0196\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\33\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u019c\7\21\2\2\u0198\u0199\7Z\2\2\u0199\u019a\5\36\20\2"+
		"\u019a\u019b\7[\2\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u01a0\5\u0094K\2\u019f\u019e\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5\u009cO\2\u01a2"+
		"\35\3\2\2\2\u01a3\u01a8\5 \21\2\u01a4\u01a5\7a\2\2\u01a5\u01a7\5 \21\2"+
		"\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\37\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01bd\7\u0089\2\2"+
		"\u01ac\u01bd\7\u0087\2\2\u01ad\u01bd\7\u008f\2\2\u01ae\u01bd\7\u008b\2"+
		"\2\u01af\u01bd\7\u008c\2\2\u01b0\u01bd\7\u008d\2\2\u01b1\u01bd\7\u008e"+
		"\2\2\u01b2\u01b3\7\u0088\2\2\u01b3\u01b4\7e\2\2\u01b4\u01bd\5\u0116\u008c"+
		"\2\u01b5\u01b6\7\u008a\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\5\u0116\u008c"+
		"\2\u01b8\u01b9\7k\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bd\5\u00a2R\2\u01bb"+
		"\u01bd\5\u0116\u008c\2\u01bc\u01ab\3\2\2\2\u01bc\u01ac\3\2\2\2\u01bc\u01ad"+
		"\3\2\2\2\u01bc\u01ae\3\2\2\2\u01bc\u01af\3\2\2\2\u01bc\u01b0\3\2\2\2\u01bc"+
		"\u01b1\3\2\2\2\u01bc\u01b2\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd!\3\2\2\2\u01be\u01bf\5\u0116\u008c\2\u01bf"+
		"#\3\2\2\2\u01c0\u01c1\5\u0116\u008c\2\u01c1%\3\2\2\2\u01c2\u01c3\5\u0116"+
		"\u008c\2\u01c3\'\3\2\2\2\u01c4\u01ca\5\30\r\2\u01c5\u01c7\t\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\5\u0116"+
		"\u008c\2\u01c9\u01c4\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca)\3\2\2\2\u01cb"+
		"\u01cf\7\\\2\2\u01cc\u01ce\5\u009cO\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d2\u01f0\7]\2\2\u01d3\u01d4\7\\\2\2\u01d4\u01d6\5,\27"+
		"\2\u01d5\u01d7\5\u009cO\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7]"+
		"\2\2\u01db\u01f0\3\2\2\2\u01dc\u01de\7\\\2\2\u01dd\u01df\5\u009cO\2\u01de"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\5*\26\2\u01e3\u01e4\7]\2\2\u01e4"+
		"\u01f0\3\2\2\2\u01e5\u01e6\7\\\2\2\u01e6\u01e8\5,\27\2\u01e7\u01e9\5\u009c"+
		"O\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5*\26\2\u01ed\u01ee\7]"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01cb\3\2\2\2\u01ef\u01d3\3\2\2\2\u01ef"+
		"\u01dc\3\2\2\2\u01ef\u01e5\3\2\2\2\u01f0+\3\2\2\2\u01f1\u01f2\t\3\2\2"+
		"\u01f2-\3\2\2\2\u01f3\u01f8\5\u008aF\2\u01f4\u01f8\5\60\31\2\u01f5\u01f8"+
		"\5\62\32\2\u01f6\u01f8\5\34\17\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2"+
		"\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa/\3\2\2\2\u01fb\u01fc\7t\2\2\u01fc\u01fd"+
		"\5\64\33\2\u01fd\61\3\2\2\2\u01fe\u01ff\7u\2\2\u01ff\u0200\5\64\33\2\u0200"+
		"\63\3\2\2\2\u0201\u0203\5D#\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2"+
		"\u0203\u0204\3\2\2\2\u0204\u0206\5> \2\u0205\u0207\5\u00c2b\2\u0206\u0205"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\7`\2\2\u0209"+
		"\65\3\2\2\2\u020a\u0210\5z>\2\u020b\u0210\5\u008aF\2\u020c\u0210\58\35"+
		"\2\u020d\u0210\5:\36\2\u020e\u0210\5F$\2\u020f\u020a\3\2\2\2\u020f\u020b"+
		"\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\67\3\2\2"+
		"\2\u0213\u0214\7t\2\2\u0214\u0215\5<\37\2\u02159\3\2\2\2\u0216\u0217\7"+
		"u\2\2\u0217\u0218\5<\37\2\u0218;\3\2\2\2\u0219\u021b\5D#\2\u021a\u0219"+
		"\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\5> \2\u021d"+
		"\u021f\5\u0096L\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221"+
		"\3\2\2\2\u0220\u0222\7`\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\5\u00dep\2\u0224=\3\2\2\2\u0225\u0230\5B\""+
		"\2\u0226\u0228\5@!\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u022c\7a\2\2\u022c"+
		"\u022e\7\u0086\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230"+
		"\3\2\2\2\u022f\u0225\3\2\2\2\u022f\u0227\3\2\2\2\u0230?\3\2\2\2\u0231"+
		"\u0233\5B\"\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0238\7k\2\2\u0235\u0237\5D#\2\u0236\u0235\3\2\2\2\u0237\u023a"+
		"\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023b\u023d\5\u00a0Q\2\u023c\u023b\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u0116\u008c\2\u023fA\3\2\2"+
		"\2\u0240\u0243\5\u0116\u008c\2\u0241\u0243\7\67\2\2\u0242\u0240\3\2\2"+
		"\2\u0242\u0241\3\2\2\2\u0243C\3\2\2\2\u0244\u0245\7Z\2\2\u0245\u0246\5"+
		"\u00ccg\2\u0246\u0247\7[\2\2\u0247E\3\2\2\2\u0248\u0249\7\27\2\2\u0249"+
		"\u024a\5H%\2\u024a\u024b\7`\2\2\u024b\u0251\3\2\2\2\u024c\u024d\7\6\2"+
		"\2\u024d\u024e\5H%\2\u024e\u024f\7`\2\2\u024f\u0251\3\2\2\2\u0250\u0248"+
		"\3\2\2\2\u0250\u024c\3\2\2\2\u0251G\3\2\2\2\u0252\u0257\5J&\2\u0253\u0254"+
		"\7a\2\2\u0254\u0256\5J&\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258I\3\2\2\2\u0259\u0257\3\2\2\2"+
		"\u025a\u025d\5\u0116\u008c\2\u025b\u025c\7e\2\2\u025c\u025e\5\u0116\u008c"+
		"\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025eK\3\2\2\2\u025f\u0260"+
		"\5\u00a6T\2\u0260\u0261\7Z\2\2\u0261\u0263\7z\2\2\u0262\u0264\5\u00a6"+
		"T\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"\u0267\7[\2\2\u0266\u0268\5Z.\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2"+
		"\2\u0268M\3\2\2\2\u0269\u026b\7g\2\2\u026a\u026c\5\u00a6T\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0271\3\2\2\2\u026d\u026e\7a\2\2\u026e"+
		"\u0270\5\u00a6T\2\u026f\u026d\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274"+
		"\u0275\7f\2\2\u0275O\3\2\2\2\u0276\u0277\t\4\2\2\u0277Q\3\2\2\2\u0278"+
		"\u0279\7d\2\2\u0279\u027b\7\\\2\2\u027a\u027c\5T+\2\u027b\u027a\3\2\2"+
		"\2\u027b\u027c\3\2\2\2\u027c\u0281\3\2\2\2\u027d\u027e\7a\2\2\u027e\u0280"+
		"\5T+\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0286\7a"+
		"\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\7]\2\2\u0288S\3\2\2\2\u0289\u028a\5\u0100\u0081\2\u028a\u028b\7"+
		"k\2\2\u028b\u028c\5\u00fc\177\2\u028cU\3\2\2\2\u028d\u028e\7d\2\2\u028e"+
		"\u0290\7^\2\2\u028f\u0291\5\u00fc\177\2\u0290\u028f\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0293\7a\2\2\u0293\u0295\5\u00fc\177"+
		"\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0299\u029b\7a\2\2\u029a"+
		"\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7_"+
		"\2\2\u029dW\3\2\2\2\u029e\u029f\7d\2\2\u029f\u02a0\7Z\2\2\u02a0\u02a1"+
		"\5\u00f8}\2\u02a1\u02a2\7[\2\2\u02a2\u02a9\3\2\2\2\u02a3\u02a6\7d\2\2"+
		"\u02a4\u02a7\5\u0112\u008a\2\u02a5\u02a7\5\u0116\u008c\2\u02a6\u02a4\3"+
		"\2\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u029e\3\2\2\2\u02a8"+
		"\u02a3\3\2\2\2\u02a9Y\3\2\2\2\u02aa\u02ae\7Z\2\2\u02ab\u02af\5n8\2\u02ac"+
		"\u02af\5\u00ccg\2\u02ad\u02af\7A\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3"+
		"\2\2\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b7\3\2\2\2\u02b0"+
		"\u02b3\7a\2\2\u02b1\u02b4\5n8\2\u02b2\u02b4\5\u00ccg\2\u02b3\u02b1\3\2"+
		"\2\2\u02b3\u02b2\3\2\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b0\3\2\2\2\u02b6"+
		"\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2"+
		"\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\7[\2\2\u02bb[\3\2\2\2\u02bc\u02be"+
		"\7z\2\2\u02bd\u02bf\5\u00a6T\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2"+
		"\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5Z.\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\5\u00dep\2\u02c4]\3\2\2\2\u02c5"+
		"\u02c6\7^\2\2\u02c6\u02c7\5`\61\2\u02c7\u02c8\5b\62\2\u02c8\u02c9\7_\2"+
		"\2\u02c9_\3\2\2\2\u02ca\u02cd\5\u00f8}\2\u02cb\u02cd\5\u00a6T\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cda\3\2\2\2\u02ce\u02d5\5B\"\2\u02cf"+
		"\u02d1\5d\63\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d0\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02ce\3\2\2\2\u02d4"+
		"\u02d0\3\2\2\2\u02d5c\3\2\2\2\u02d6\u02d8\5B\"\2\u02d7\u02d6\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7k\2\2\u02da\u02df\5\u00f8"+
		"}\2\u02db\u02dc\7\\\2\2\u02dc\u02dd\5\u00caf\2\u02dd\u02de\7]\2\2\u02de"+
		"\u02e0\3\2\2\2\u02df\u02db\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02eb\3\2"+
		"\2\2\u02e1\u02e2\7a\2\2\u02e2\u02e7\5\u00f8}\2\u02e3\u02e4\7\\\2\2\u02e4"+
		"\u02e5\5\u00caf\2\u02e5\u02e6\7]\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e3\3"+
		"\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e1\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ece\3\2\2\2"+
		"\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7\25\2\2\u02ef\u02f0\7Z\2\2\u02f0\u02f1"+
		"\5h\65\2\u02f1\u02f2\7[\2\2\u02f2g\3\2\2\2\u02f3\u02fd\5B\"\2\u02f4\u02f6"+
		"\5B\"\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f9\7k\2\2\u02f8\u02f5\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fc"+
		"\u02f8\3\2\2\2\u02fdi\3\2\2\2\u02fe\u02ff\7\16\2\2\u02ff\u0300\7Z\2\2"+
		"\u0300\u0301\5(\25\2\u0301\u0302\7[\2\2\u0302k\3\2\2\2\u0303\u0304\7\7"+
		"\2\2\u0304\u0305\7Z\2\2\u0305\u0306\5\u00ccg\2\u0306\u0307\7[\2\2\u0307"+
		"m\3\2\2\2\u0308\u0309\5\u0092J\2\u0309\u030a\5\u00d6l\2\u030ao\3\2\2\2"+
		"\u030b\u030c\7\30\2\2\u030c\u030d\7Z\2\2\u030d\u030e\5\u0116\u008c\2\u030e"+
		"\u030f\7[\2\2\u030f\u0313\3\2\2\2\u0310\u0311\7\30\2\2\u0311\u0313\5\u00f8"+
		"}\2\u0312\u030b\3\2\2\2\u0312\u0310\3\2\2\2\u0313q\3\2\2\2\u0314\u0315"+
		"\7\31\2\2\u0315\u0319\5\u00dep\2\u0316\u0318\5t;\2\u0317\u0316\3\2\2\2"+
		"\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031e"+
		"\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u031d\7\t\2\2\u031d\u031f\5\u00dep"+
		"\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031fs\3\2\2\2\u0320\u0321"+
		"\7\4\2\2\u0321\u0322\7Z\2\2\u0322\u0323\5n8\2\u0323\u0324\7[\2\2\u0324"+
		"\u0325\5\u00dep\2\u0325u\3\2\2\2\u0326\u0327\7\26\2\2\u0327\u0328\7Z\2"+
		"\2\u0328\u0329\5\u00f8}\2\u0329\u032a\7[\2\2\u032a\u032b\5\u00dep\2\u032b"+
		"w\3\2\2\2\u032c\u032d\7\3\2\2\u032d\u032e\5\u00dep\2\u032ey\3\2\2\2\u032f"+
		"\u0331\5\u0092J\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u0334\5|?\2\u0333\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0336\3\2\2\2\u0335\u0337\5\u0092J\2\u0336\u0335\3\2\2\2\u0336\u0337"+
		"\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5|?\2\u0339\u0338\3\2\2\2\u0339"+
		"\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0341\5\u0116\u008c\2\u033c\u033e"+
		"\7Z\2\2\u033d\u033f\5\u00be`\2\u033e\u033d\3\2\2\2\u033e\u033f\3\2\2\2"+
		"\u033f\u0340\3\2\2\2\u0340\u0342\7[\2\2\u0341\u033c\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342\u0344\3\2\2\2\u0343\u0345\5|?\2\u0344\u0343\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\5\u00dep\2\u0347{\3\2\2"+
		"\2\u0348\u0356\7Q\2\2\u0349\u034a\7Z\2\2\u034a\u034b\7Z\2\2\u034b\u0350"+
		"\5~@\2\u034c\u034d\7a\2\2\u034d\u034f\5~@\2\u034e\u034c\3\2\2\2\u034f"+
		"\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\3\2"+
		"\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7[\2\2\u0354\u0355\7[\2\2\u0355\u0357"+
		"\3\2\2\2\u0356\u0349\3\2\2\2\u0356\u0357\3\2\2\2\u0357}\3\2\2\2\u0358"+
		"\u035a\5\u0080A\2\u0359\u035b\5\u0082B\2\u035a\u0359\3\2\2\2\u035a\u035b"+
		"\3\2\2\2\u035b\177\3\2\2\2\u035c\u035d\t\5\2\2\u035d\u0081\3\2\2\2\u035e"+
		"\u0360\7Z\2\2\u035f\u0361\5\u0084C\2\u0360\u035f\3\2\2\2\u0360\u0361\3"+
		"\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\7[\2\2\u0363\u0083\3\2\2\2\u0364"+
		"\u0369\5\u0086D\2\u0365\u0366\7a\2\2\u0366\u0368\5\u0086D\2\u0367\u0365"+
		"\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u0085\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u0371\5~@\2\u036d\u0371\5\u0112"+
		"\u008a\2\u036e\u0371\5\u0114\u008b\2\u036f\u0371\5\u0088E\2\u0370\u036c"+
		"\3\2\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u036f\3\2\2\2\u0371"+
		"\u0087\3\2\2\2\u0372\u0373\5\u0080A\2\u0373\u0377\7e\2\2\u0374\u0378\5"+
		"\u0112\u008a\2\u0375\u0378\5\u0080A\2\u0376\u0378\5\u0114\u008b\2\u0377"+
		"\u0374\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378\u0089\3\2"+
		"\2\2\u0379\u037d\5\u008cG\2\u037a\u037d\5\u008eH\2\u037b\u037d\5\u0090"+
		"I\2\u037c\u0379\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037b\3\2\2\2\u037d"+
		"\u008b\3\2\2\2\u037e\u0380\5|?\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2"+
		"\2\u0380\u0381\3\2\2\2\u0381\u0383\5\"\22\2\u0382\u0384\5|?\2\u0383\u0382"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7Z\2\2\u0386"+
		"\u0387\5\u00ba^\2\u0387\u0388\7[\2\2\u0388\u0389\7`\2\2\u0389\u008d\3"+
		"\2\2\2\u038a\u038c\5|?\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038e\3\2\2\2\u038d\u038f\5\u00a4S\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\5\u00b2Z\2\u0391\u0393\5\"\22"+
		"\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395"+
		"\7`\2\2\u0395\u008f\3\2\2\2\u0396\u0398\5|?\2\u0397\u0396\3\2\2\2\u0397"+
		"\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\5\u0092J\2\u039a\u039c"+
		"\5|?\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039e\3\2\2\2\u039d"+
		"\u039f\5\u0096L\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0"+
		"\3\2\2\2\u03a0\u03a1\7`\2\2\u03a1\u0091\3\2\2\2\u03a2\u03a8\5\u00a0Q\2"+
		"\u03a3\u03a8\5\u00a4S\2\u03a4\u03a8\5\u00a6T\2\u03a5\u03a8\5\u00a8U\2"+
		"\u03a6\u03a8\5\u0094K\2\u03a7\u03a2\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a7"+
		"\u03a4\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a6\3\2\2\2\u03a8\u03a9\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u0093\3\2\2\2\u03ab"+
		"\u03ac\7\u0091\2\2\u03ac\u03ad\7Z\2\2\u03ad\u03ae\5\"\22\2\u03ae\u03af"+
		"\7[\2\2\u03af\u03b2\3\2\2\2\u03b0\u03b2\7\u0090\2\2\u03b1\u03ab\3\2\2"+
		"\2\u03b1\u03b0\3\2\2\2\u03b2\u0095\3\2\2\2\u03b3\u03b8\5\u0098M\2\u03b4"+
		"\u03b5\7a\2\2\u03b5\u03b7\5\u0098M\2\u03b6\u03b4\3\2\2\2\u03b7\u03ba\3"+
		"\2\2\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u0097\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03bb\u03be\5\u00d6l\2\u03bc\u03bd\7e\2\2\u03bd\u03bf\5"+
		"\u00c4c\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u0099\3\2\2\2"+
		"\u03c0\u03cd\t\6\2\2\u03c1\u03ce\5\u0116\u008c\2\u03c2\u03c4\5\u0116\u008c"+
		"\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7"+
		"\7\\\2\2\u03c6\u03c8\5\u009cO\2\u03c7\u03c6\3\2\2\2\u03c8\u03c9\3\2\2"+
		"\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc"+
		"\7]\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03c1\3\2\2\2\u03cd\u03c3\3\2\2\2\u03ce"+
		"\u009b\3\2\2\2\u03cf\u03d0\5\u009eP\2\u03d0\u03d2\5\u00aeX\2\u03d1\u03d3"+
		"\5\u00c2b\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2"+
		"\2\u03d4\u03d5\7`\2\2\u03d5\u009d\3\2\2\2\u03d6\u03db\5\u00a0Q\2\u03d7"+
		"\u03db\5\u00a2R\2\u03d8\u03db\5\u00a6T\2\u03d9\u03db\5\u00a8U\2\u03da"+
		"\u03d6\3\2\2\2\u03da\u03d7\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2"+
		"\2\2\u03db\u03dc\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd"+
		"\u009f\3\2\2\2\u03de\u03df\t\7\2\2\u03df\u00a1\3\2\2\2\u03e0\u03e1\t\b"+
		"\2\2\u03e1\u00a3\3\2\2\2\u03e2\u03e3\t\t\2\2\u03e3\u00a5\3\2\2\2\u03e4"+
		"\u03fb\7A\2\2\u03e5\u03fb\7!\2\2\u03e6\u03fb\78\2\2\u03e7\u03fb\7\62\2"+
		"\2\u03e8\u03fb\7\63\2\2\u03e9\u03fb\7*\2\2\u03ea\u03fb\7&\2\2\u03eb\u03fb"+
		"\7\60\2\2\u03ec\u03fb\79\2\2\u03ed\u03fb\7@\2\2\u03ee\u03fb\5\u00aaV\2"+
		"\u03ef\u03f2\5\"\22\2\u03f0\u03f3\5\30\r\2\u03f1\u03f3\5N(\2\u03f2\u03f0"+
		"\3\2\2\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03fb\3\2\2\2\u03f4"+
		"\u03fb\5\u009aN\2\u03f5\u03fb\5\u00b2Z\2\u03f6\u03f8\5\u0116\u008c\2\u03f7"+
		"\u03f9\5\u00c0a\2\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb"+
		"\3\2\2\2\u03fa\u03e4\3\2\2\2\u03fa\u03e5\3\2\2\2\u03fa\u03e6\3\2\2\2\u03fa"+
		"\u03e7\3\2\2\2\u03fa\u03e8\3\2\2\2\u03fa\u03e9\3\2\2\2\u03fa\u03ea\3\2"+
		"\2\2\u03fa\u03eb\3\2\2\2\u03fa\u03ec\3\2\2\2\u03fa\u03ed\3\2\2\2\u03fa"+
		"\u03ee\3\2\2\2\u03fa\u03ef\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f5\3\2"+
		"\2\2\u03fa\u03f6\3\2\2\2\u03fb\u00a7\3\2\2\2\u03fc\u0400\7\"\2\2\u03fd"+
		"\u0400\7B\2\2\u03fe\u0400\5P)\2\u03ff\u03fc\3\2\2\2\u03ff\u03fd\3\2\2"+
		"\2\u03ff\u03fe\3\2\2\2\u0400\u00a9\3\2\2\2\u0401\u0402\t\n\2\2\u0402\u0403"+
		"\7Z\2\2\u0403\u0404\5\u00f8}\2\u0404\u0405\7[\2\2\u0405\u00ab\3\2\2\2"+
		"\u0406\u0409\5\"\22\2\u0407\u040a\5\30\r\2\u0408\u040a\5N(\2\u0409\u0407"+
		"\3\2\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u00ad\3\2\2\2\u040b"+
		"\u0410\5\u00b0Y\2\u040c\u040d\7a\2\2\u040d\u040f\5\u00b0Y\2\u040e\u040c"+
		"\3\2\2\2\u040f\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411"+
		"\u00af\3\2\2\2\u0412\u0410\3\2\2\2\u0413\u041a\5\u00d6l\2\u0414\u0416"+
		"\5\u00d6l\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2"+
		"\2\u0417\u0418\7k\2\2\u0418\u041a\5\u0112\u008a\2\u0419\u0413\3\2\2\2"+
		"\u0419\u0415\3\2\2\2\u041a\u00b1\3\2\2\2\u041b\u0421\7(\2\2\u041c\u041e"+
		"\5\u0116\u008c\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3"+
		"\2\2\2\u041f\u0420\7k\2\2\u0420\u0422\5\u00ccg\2\u0421\u041d\3\2\2\2\u0421"+
		"\u0422\3\2\2\2\u0422\u042e\3\2\2\2\u0423\u0428\5\u0116\u008c\2\u0424\u0425"+
		"\7\\\2\2\u0425\u0426\5\u00b4[\2\u0426\u0427\7]\2\2\u0427\u0429\3\2\2\2"+
		"\u0428\u0424\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042f\3\2\2\2\u042a\u042b"+
		"\7\\\2\2\u042b\u042c\5\u00b4[\2\u042c\u042d\7]\2\2\u042d\u042f\3\2\2\2"+
		"\u042e\u0423\3\2\2\2\u042e\u042a\3\2\2\2\u042f\u043b\3\2\2\2\u0430\u0431"+
		"\t\13\2\2\u0431\u0432\7Z\2\2\u0432\u0433\5\u00ccg\2\u0433\u0434\7a\2\2"+
		"\u0434\u0435\5\u0116\u008c\2\u0435\u0436\7[\2\2\u0436\u0437\7\\\2\2\u0437"+
		"\u0438\5\u00b4[\2\u0438\u0439\7]\2\2\u0439\u043b\3\2\2\2\u043a\u041b\3"+
		"\2\2\2\u043a\u0430\3\2\2\2\u043b\u00b3\3\2\2\2\u043c\u0441\5\u00b6\\\2"+
		"\u043d\u043e\7a\2\2\u043e\u0440\5\u00b6\\\2\u043f\u043d\3\2\2\2\u0440"+
		"\u0443\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0445\3\2"+
		"\2\2\u0443\u0441\3\2\2\2\u0444\u0446\7a\2\2\u0445\u0444\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446\u00b5\3\2\2\2\u0447\u044a\5\u00b8]\2\u0448\u0449"+
		"\7e\2\2\u0449\u044b\5\u00fe\u0080\2\u044a\u0448\3\2\2\2\u044a\u044b\3"+
		"\2\2\2\u044b\u00b7\3\2\2\2\u044c\u044f\5\u0116\u008c\2\u044d\u044f\7$"+
		"\2\2\u044e\u044c\3\2\2\2\u044e\u044d\3\2\2\2\u044f\u00b9\3\2\2\2\u0450"+
		"\u0456\5\u0116\u008c\2\u0451\u0452\7Z\2\2\u0452\u0453\5\u00d6l\2\u0453"+
		"\u0454\7[\2\2\u0454\u0456\3\2\2\2\u0455\u0450\3\2\2\2\u0455\u0451\3\2"+
		"\2\2\u0456\u045a\3\2\2\2\u0457\u0459\5\u00bc_\2\u0458\u0457\3\2\2\2\u0459"+
		"\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0465\3\2"+
		"\2\2\u045c\u045a\3\2\2\2\u045d\u045e\7Z\2\2\u045e\u0460\7z\2\2\u045f\u0461"+
		"\5\u0116\u008c\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0462\3"+
		"\2\2\2\u0462\u0463\7[\2\2\u0463\u0465\5Z.\2\u0464\u0455\3\2\2\2\u0464"+
		"\u045d\3\2\2\2\u0465\u00bb\3\2\2\2\u0466\u0468\7^\2\2\u0467\u0469\5\u0104"+
		"\u0083\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u0470\7_\2\2\u046b\u046c\7Z\2\2\u046c\u046d\5\u00be`\2\u046d\u046e\7"+
		"[\2\2\u046e\u0470\3\2\2\2\u046f\u0466\3\2\2\2\u046f\u046b\3\2\2\2\u0470"+
		"\u00bd\3\2\2\2\u0471\u0474\5\u00d2j\2\u0472\u0473\7a\2\2\u0473\u0475\7"+
		"\u0086\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u00bf\3\2\2\2"+
		"\u0476\u0478\7v\2\2\u0477\u0479\5\u0092J\2\u0478\u0477\3\2\2\2\u0478\u0479"+
		"\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u047c\5\u00c0a\2\u047b\u047a\3\2\2"+
		"\2\u047b\u047c\3\2\2\2\u047c\u00c1\3\2\2\2\u047d\u0489\5\u0116\u008c\2"+
		"\u047e\u047f\7Z\2\2\u047f\u0484\5\u0110\u0089\2\u0480\u0481\7a\2\2\u0481"+
		"\u0483\5\u0110\u0089\2\u0482\u0480\3\2\2\2\u0483\u0486\3\2\2\2\u0484\u0482"+
		"\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u0484\3\2\2\2\u0487"+
		"\u0488\7[\2\2\u0488\u048a\3\2\2\2\u0489\u047e\3\2\2\2\u0489\u048a\3\2"+
		"\2\2\u048a\u00c3\3\2\2\2\u048b\u048f\5\u00fc\177\2\u048c\u048f\5\u00c6"+
		"d\2\u048d\u048f\5\u00c8e\2\u048e\u048b\3\2\2\2\u048e\u048c\3\2\2\2\u048e"+
		"\u048d\3\2\2\2\u048f\u00c5\3\2\2\2\u0490\u049c\7\\\2\2\u0491\u0496\5\u00fc"+
		"\177\2\u0492\u0493\7a\2\2\u0493\u0495\5\u00fc\177\2\u0494\u0492\3\2\2"+
		"\2\u0495\u0498\3\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u049a"+
		"\3\2\2\2\u0498\u0496\3\2\2\2\u0499\u049b\7a\2\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c\u0491\3\2\2\2\u049c\u049d\3\2"+
		"\2\2\u049d\u049e\3\2\2\2\u049e\u049f\7]\2\2\u049f\u00c7\3\2\2\2\u04a0"+
		"\u04ae\7\\\2\2\u04a1\u04a2\7b\2\2\u04a2\u04a8\5\u00fa~\2\u04a3\u04a4\7"+
		"a\2\2\u04a4\u04a5\7b\2\2\u04a5\u04a7\5\u00fa~\2\u04a6\u04a3\3\2\2\2\u04a7"+
		"\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ac\3\2"+
		"\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ad\7a\2\2\u04ac\u04ab\3\2\2\2\u04ac"+
		"\u04ad\3\2\2\2\u04ad\u04af\3\2\2\2\u04ae\u04a1\3\2\2\2\u04ae\u04af\3\2"+
		"\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b1\7]\2\2\u04b1\u00c9\3\2\2\2\u04b2"+
		"\u04b7\5\u00c4c\2\u04b3\u04b4\7a\2\2\u04b4\u04b6\5\u00c4c\2\u04b5\u04b3"+
		"\3\2\2\2\u04b6\u04b9\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04ba\u04bc\7a\2\2\u04bb\u04ba\3\2"+
		"\2\2\u04bb\u04bc\3\2\2\2\u04bc\u00cb\3\2\2\2\u04bd\u04bf\5\u009eP\2\u04be"+
		"\u04c0\5\u00ceh\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c3"+
		"\3\2\2\2\u04c1\u04c3\5L\'\2\u04c2\u04bd\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3"+
		"\u00cd\3\2\2\2\u04c4\u04c6\5\u00c0a\2\u04c5\u04c7\5\u00ceh\2\u04c6\u04c5"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04dc\3\2\2\2\u04c8\u04ca\7Z\2\2\u04c9"+
		"\u04cb\5\u00ceh\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc"+
		"\3\2\2\2\u04cc\u04ce\7[\2\2\u04cd\u04cf\5\u00d0i\2\u04ce\u04cd\3\2\2\2"+
		"\u04cf\u04d0\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04dc"+
		"\3\2\2\2\u04d2\u04d4\7^\2\2\u04d3\u04d5\5\u0104\u0083\2\u04d4\u04d3\3"+
		"\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d8\7_\2\2\u04d7"+
		"\u04d2\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04da\3\2"+
		"\2\2\u04da\u04dc\3\2\2\2\u04db\u04c4\3\2\2\2\u04db\u04c8\3\2\2\2\u04db"+
		"\u04d7\3\2\2\2\u04dc\u00cf\3\2\2\2\u04dd\u04df\7^\2\2\u04de\u04e0\5\u0104"+
		"\u0083\2\u04df\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1"+
		"\u04e8\7_\2\2\u04e2\u04e4\7Z\2\2\u04e3\u04e5\5\u00d2j\2\u04e4\u04e3\3"+
		"\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e8\7[\2\2\u04e7"+
		"\u04dd\3\2\2\2\u04e7\u04e2\3\2\2\2\u04e8\u00d1\3\2\2\2\u04e9\u04ee\5\u00d4"+
		"k\2\u04ea\u04eb\7a\2\2\u04eb\u04ed\5\u00d4k\2\u04ec\u04ea\3\2\2\2\u04ed"+
		"\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u00d3\3\2"+
		"\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f2\5\u0092J\2\u04f2\u04f3\5\u00d6l\2"+
		"\u04f3\u04f6\3\2\2\2\u04f4\u04f6\7A\2\2\u04f5\u04f1\3\2\2\2\u04f5\u04f4"+
		"\3\2\2\2\u04f6\u00d5\3\2\2\2\u04f7\u04f9\5\u00c0a\2\u04f8\u04f7\3\2\2"+
		"\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\5\u00ba^\2\u04fb"+
		"\u00d7\3\2\2\2\u04fc\u04fe\5\u00dan\2\u04fd\u04ff\7`\2\2\u04fe\u04fd\3"+
		"\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0526\3\2\2\2\u0500\u0502\5\u00dep\2"+
		"\u0501\u0503\7`\2\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0526"+
		"\3\2\2\2\u0504\u0506\5\u00e0q\2\u0505\u0507\7`\2\2\u0506\u0505\3\2\2\2"+
		"\u0506\u0507\3\2\2\2\u0507\u0526\3\2\2\2\u0508\u050a\5\u00ecw\2\u0509"+
		"\u050b\7`\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u0526\3\2"+
		"\2\2\u050c\u050e\5\u00f6|\2\u050d\u050f\7`\2\2\u050e\u050d\3\2\2\2\u050e"+
		"\u050f\3\2\2\2\u050f\u0526\3\2\2\2\u0510\u0512\5v<\2\u0511\u0513\7`\2"+
		"\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0526\3\2\2\2\u0514\u0516"+
		"\5x=\2\u0515\u0517\7`\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0526\3\2\2\2\u0518\u051a\5p9\2\u0519\u051b\7`\2\2\u051a\u0519\3\2\2"+
		"\2\u051a\u051b\3\2\2\2\u051b\u0526\3\2\2\2\u051c\u051e\5r:\2\u051d\u051f"+
		"\7`\2\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0526\3\2\2\2\u0520"+
		"\u0522\5\u00f8}\2\u0521\u0523\7`\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3"+
		"\2\2\2\u0523\u0526\3\2\2\2\u0524\u0526\7`\2\2\u0525\u04fc\3\2\2\2\u0525"+
		"\u0500\3\2\2\2\u0525\u0504\3\2\2\2\u0525\u0508\3\2\2\2\u0525\u050c\3\2"+
		"\2\2\u0525\u0510\3\2\2\2\u0525\u0514\3\2\2\2\u0525\u0518\3\2\2\2\u0525"+
		"\u051c\3\2\2\2\u0525\u0520\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u00d9\3\2"+
		"\2\2\u0527\u0528\5\u0116\u008c\2\u0528\u0529\7k\2\2\u0529\u052a\5\u00d8"+
		"m\2\u052a\u00db\3\2\2\2\u052b\u052e\5\u0104\u0083\2\u052c\u052d\7\u0086"+
		"\2\2\u052d\u052f\5\u0104\u0083\2\u052e\u052c\3\2\2\2\u052e\u052f\3\2\2"+
		"\2\u052f\u00dd\3\2\2\2\u0530\u0535\7\\\2\2\u0531\u0534\5\u008aF\2\u0532"+
		"\u0534\5\u00d8m\2\u0533\u0531\3\2\2\2\u0533\u0532\3\2\2\2\u0534\u0537"+
		"\3\2\2\2\u0535\u0533\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0538\u0539\7]\2\2\u0539\u00df\3\2\2\2\u053a\u053b\7-\2"+
		"\2\u053b\u053c\7Z\2\2\u053c\u053d\5\u00f8}\2\u053d\u053e\7[\2\2\u053e"+
		"\u0541\5\u00d8m\2\u053f\u0540\7\'\2\2\u0540\u0542\5\u00d8m\2\u0541\u053f"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0545\3\2\2\2\u0543\u0545\5\u00e2r"+
		"\2\u0544\u053a\3\2\2\2\u0544\u0543\3\2\2\2\u0545\u00e1\3\2\2\2\u0546\u0547"+
		"\7=\2\2\u0547\u0548\7Z\2\2\u0548\u0549\5\u00f8}\2\u0549\u054a\7[\2\2\u054a"+
		"\u054b\5\u00e4s\2\u054b\u00e3\3\2\2\2\u054c\u0550\7\\\2\2\u054d\u054f"+
		"\5\u00e6t\2\u054e\u054d\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2"+
		"\2\u0550\u0551\3\2\2\2\u0551\u0553\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0554"+
		"\7]\2\2\u0554\u00e5\3\2\2\2\u0555\u0557\5\u00e8u\2\u0556\u0555\3\2\2\2"+
		"\u0557\u0558\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b"+
		"\3\2\2\2\u055a\u055c\5\u00d8m\2\u055b\u055a\3\2\2\2\u055c\u055d\3\2\2"+
		"\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u00e7\3\2\2\2\u055f\u0565"+
		"\7 \2\2\u0560\u0566\5\u00dco\2\u0561\u0562\7Z\2\2\u0562\u0563\5\u00dc"+
		"o\2\u0563\u0564\7[\2\2\u0564\u0566\3\2\2\2\u0565\u0560\3\2\2\2\u0565\u0561"+
		"\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\7k\2\2\u0568\u056c\3\2\2\2\u0569"+
		"\u056a\7$\2\2\u056a\u056c\7k\2\2\u056b\u055f\3\2\2\2\u056b\u0569\3\2\2"+
		"\2\u056c\u00e9\3\2\2\2\u056d\u056e\5\u0092J\2\u056e\u056f\5\u0096L\2\u056f"+
		"\u0572\3\2\2\2\u0570\u0572\5\u00f8}\2\u0571\u056d\3\2\2\2\u0571\u0570"+
		"\3\2\2\2\u0572\u00eb\3\2\2\2\u0573\u0578\5\u00eex\2\u0574\u0578\5\u00f0"+
		"y\2\u0575\u0578\5\u00f2z\2\u0576\u0578\5\u00f4{\2\u0577\u0573\3\2\2\2"+
		"\u0577\u0574\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0576\3\2\2\2\u0578\u00ed"+
		"\3\2\2\2\u0579\u057a\7C\2\2\u057a\u057b\7Z\2\2\u057b\u057c\5\u00f8}\2"+
		"\u057c\u057d\7[\2\2\u057d\u057e\5\u00d8m\2\u057e\u00ef\3\2\2\2\u057f\u0580"+
		"\7%\2\2\u0580\u0581\5\u00d8m\2\u0581\u0582\7C\2\2\u0582\u0583\7Z\2\2\u0583"+
		"\u0584\5\u00f8}\2\u0584\u0585\7[\2\2\u0585\u0586\7`\2\2\u0586\u00f1\3"+
		"\2\2\2\u0587\u0588\7+\2\2\u0588\u058a\7Z\2\2\u0589\u058b\5\u00eav\2\u058a"+
		"\u0589\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058e\7`"+
		"\2\2\u058d\u058f\5\u00f8}\2\u058e\u058d\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0590\3\2\2\2\u0590\u0592\7`\2\2\u0591\u0593\5\u00f8}\2\u0592\u0591\3"+
		"\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595\7[\2\2\u0595"+
		"\u0596\5\u00d8m\2\u0596\u00f3\3\2\2\2\u0597\u0598\7+\2\2\u0598\u0599\7"+
		"Z\2\2\u0599\u059a\5n8\2\u059a\u059c\7.\2\2\u059b\u059d\5\u00f8}\2\u059c"+
		"\u059b\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u059f\7["+
		"\2\2\u059f\u05a0\5\u00d8m\2\u05a0\u00f5\3\2\2\2\u05a1\u05a2\7\61\2\2\u05a2"+
		"\u05a3\5\u0116\u008c\2\u05a3\u05a4\7`\2\2\u05a4\u05af\3\2\2\2\u05a5\u05a6"+
		"\7#\2\2\u05a6\u05af\7`\2\2\u05a7\u05a8\7\35\2\2\u05a8\u05af\7`\2\2\u05a9"+
		"\u05ab\7\67\2\2\u05aa\u05ac\5\u00f8}\2\u05ab\u05aa\3\2\2\2\u05ab\u05ac"+
		"\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\7`\2\2\u05ae\u05a1\3\2\2\2\u05ae"+
		"\u05a5\3\2\2\2\u05ae\u05a7\3\2\2\2\u05ae\u05a9\3\2\2\2\u05af\u00f7\3\2"+
		"\2\2\u05b0\u05b5\5\u00fa~\2\u05b1\u05b2\7a\2\2\u05b2\u05b4\5\u00fa~\2"+
		"\u05b3\u05b1\3\2\2\2\u05b4\u05b7\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6"+
		"\3\2\2\2\u05b6\u00f9\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b8\u05be\5\u00fc\177"+
		"\2\u05b9\u05ba\5\u0106\u0084\2\u05ba\u05bb\5\u0102\u0082\2\u05bb\u05bc"+
		"\5\u00fa~\2\u05bc\u05be\3\2\2\2\u05bd\u05b8\3\2\2\2\u05bd\u05b9\3\2\2"+
		"\2\u05be\u00fb\3\2\2\2\u05bf\u05c9\5\u00fe\u0080\2\u05c0\u05c1\5\u00fe"+
		"\u0080\2\u05c1\u05c3\7j\2\2\u05c2\u05c4\5\u00f8}\2\u05c3\u05c2\3\2\2\2"+
		"\u05c3\u05c4\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\7k\2\2\u05c6\u05c7"+
		"\5\u00fc\177\2\u05c7\u05c9\3\2\2\2\u05c8\u05bf\3\2\2\2\u05c8\u05c0\3\2"+
		"\2\2\u05c9\u00fd\3\2\2\2\u05ca\u05cb\b\u0080\1\2\u05cb\u05cc\5\u0100\u0081"+
		"\2\u05cc\u05f2\3\2\2\2\u05cd\u05ce\f\f\2\2\u05ce\u05cf\t\f\2\2\u05cf\u05f1"+
		"\5\u00fe\u0080\r\u05d0\u05d1\f\13\2\2\u05d1\u05d2\t\r\2\2\u05d2\u05f1"+
		"\5\u00fe\u0080\f\u05d3\u05d8\f\n\2\2\u05d4\u05d5\7g\2\2\u05d5\u05d9\7"+
		"g\2\2\u05d6\u05d7\7f\2\2\u05d7\u05d9\7f\2\2\u05d8\u05d4\3\2\2\2\u05d8"+
		"\u05d6\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05f1\5\u00fe\u0080\13\u05db"+
		"\u05dc\f\t\2\2\u05dc\u05dd\t\16\2\2\u05dd\u05f1\5\u00fe\u0080\n\u05de"+
		"\u05df\f\b\2\2\u05df\u05e0\t\17\2\2\u05e0\u05f1\5\u00fe\u0080\t\u05e1"+
		"\u05e2\f\7\2\2\u05e2\u05e3\7x\2\2\u05e3\u05f1\5\u00fe\u0080\b\u05e4\u05e5"+
		"\f\6\2\2\u05e5\u05e6\7z\2\2\u05e6\u05f1\5\u00fe\u0080\7\u05e7\u05e8\f"+
		"\5\2\2\u05e8\u05e9\7y\2\2\u05e9\u05f1\5\u00fe\u0080\6\u05ea\u05eb\f\4"+
		"\2\2\u05eb\u05ec\7p\2\2\u05ec\u05f1\5\u00fe\u0080\5\u05ed\u05ee\f\3\2"+
		"\2\u05ee\u05ef\7q\2\2\u05ef\u05f1\5\u00fe\u0080\4\u05f0\u05cd\3\2\2\2"+
		"\u05f0\u05d0\3\2\2\2\u05f0\u05d3\3\2\2\2\u05f0\u05db\3\2\2\2\u05f0\u05de"+
		"\3\2\2\2\u05f0\u05e1\3\2\2\2\u05f0\u05e4\3\2\2\2\u05f0\u05e7\3\2\2\2\u05f0"+
		"\u05ea\3\2\2\2\u05f0\u05ed\3\2\2\2\u05f1\u05f4\3\2\2\2\u05f2\u05f0\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3\u00ff\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5"+
		"\u05f6\7Z\2\2\u05f6\u05f7\5\u00ccg\2\u05f7\u05fa\7[\2\2\u05f8\u05fb\5"+
		"\u0100\u0081\2\u05f9\u05fb\5\u00c4c\2\u05fa\u05f8\3\2\2\2\u05fa\u05f9"+
		"\3\2\2\2\u05fb\u05fe\3\2\2\2\u05fc\u05fe\5\u0106\u0084\2\u05fd\u05f5\3"+
		"\2\2\2\u05fd\u05fc\3\2\2\2\u05fe\u0101\3\2\2\2\u05ff\u0600\t\20\2\2\u0600"+
		"\u0103\3\2\2\2\u0601\u0604\5\u0116\u008c\2\u0602\u0604\5\u0112\u008a\2"+
		"\u0603\u0601\3\2\2\2\u0603\u0602\3\2\2\2\u0604\u0105\3\2\2\2\u0605\u060e"+
		"\5\u010a\u0086\2\u0606\u0607\7r\2\2\u0607\u060e\5\u0106\u0084\2\u0608"+
		"\u0609\7s\2\2\u0609\u060e\5\u0106\u0084\2\u060a\u060b\5\u0108\u0085\2"+
		"\u060b\u060c\5\u0100\u0081\2\u060c\u060e\3\2\2\2\u060d\u0605\3\2\2\2\u060d"+
		"\u0606\3\2\2\2\u060d\u0608\3\2\2\2\u060d\u060a\3\2\2\2\u060e\u0107\3\2"+
		"\2\2\u060f\u0610\t\21\2\2\u0610\u0109\3\2\2\2\u0611\u0612\b\u0086\1\2"+
		"\u0612\u0613\5\u0110\u0089\2\u0613\u0626\3\2\2\2\u0614\u0615\f\6\2\2\u0615"+
		"\u0616\7^\2\2\u0616\u0617\5\u00f8}\2\u0617\u0618\7_\2\2\u0618\u0625\3"+
		"\2\2\2\u0619\u061a\f\5\2\2\u061a\u061c\7Z\2\2\u061b\u061d\5\u010c\u0087"+
		"\2\u061c\u061b\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0625"+
		"\7[\2\2\u061f\u0620\f\4\2\2\u0620\u0621\t\22\2\2\u0621\u0625\5\u0116\u008c"+
		"\2\u0622\u0623\f\3\2\2\u0623\u0625\t\23\2\2\u0624\u0614\3\2\2\2\u0624"+
		"\u0619\3\2\2\2\u0624\u061f\3\2\2\2\u0624\u0622\3\2\2\2\u0625\u0628\3\2"+
		"\2\2\u0626\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u010b\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0629\u062e\5\u010e\u0088\2\u062a\u062b\7a\2\2\u062b\u062d"+
		"\5\u010e\u0088\2\u062c\u062a\3\2\2\2\u062d\u0630\3\2\2\2\u062e\u062c\3"+
		"\2\2\2\u062e\u062f\3\2\2\2\u062f\u010d\3\2\2\2\u0630\u062e\3\2\2\2\u0631"+
		"\u0634\5\u00fa~\2\u0632\u0634\5\u00a6T\2\u0633\u0631\3\2\2\2\u0633\u0632"+
		"\3\2\2\2\u0634\u010f\3\2\2\2\u0635\u0645\5\u0116\u008c\2\u0636\u0645\5"+
		"\u0112\u008a\2\u0637\u0645\5\u0114\u008b\2\u0638\u0639\7Z\2\2\u0639\u063a"+
		"\5\u00f8}\2\u063a\u063b\7[\2\2\u063b\u0645\3\2\2\2\u063c\u0645\5^\60\2"+
		"\u063d\u0645\5f\64\2\u063e\u0645\5j\66\2\u063f\u0645\5l\67\2\u0640\u0645"+
		"\5R*\2\u0641\u0645\5V,\2\u0642\u0645\5X-\2\u0643\u0645\5\\/\2\u0644\u0635"+
		"\3\2\2\2\u0644\u0636\3\2\2\2\u0644\u0637\3\2\2\2\u0644\u0638\3\2\2\2\u0644"+
		"\u063c\3\2\2\2\u0644\u063d\3\2\2\2\u0644\u063e\3\2\2\2\u0644\u063f\3\2"+
		"\2\2\u0644\u0640\3\2\2\2\u0644\u0641\3\2\2\2\u0644\u0642\3\2\2\2\u0644"+
		"\u0643\3\2\2\2\u0645\u0111\3\2\2\2\u0646\u0653\7\u0096\2\2\u0647\u0653"+
		"\7\u0097\2\2\u0648\u0653\7\u0098\2\2\u0649\u064b\t\r\2\2\u064a\u0649\3"+
		"\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u0653\7\u0099\2\2"+
		"\u064d\u064f\t\r\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650"+
		"\3\2\2\2\u0650\u0653\7\u009a\2\2\u0651\u0653\7\u0093\2\2\u0652\u0646\3"+
		"\2\2\2\u0652\u0647\3\2\2\2\u0652\u0648\3\2\2\2\u0652\u064a\3\2\2\2\u0652"+
		"\u064e\3\2\2\2\u0652\u0651\3\2\2\2\u0653\u0113\3\2\2\2\u0654\u065b\7\u0095"+
		"\2\2\u0655\u0657\7\u009e\2\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657"+
		"\u0658\3\2\2\2\u0658\u065a\7\u0095\2\2\u0659\u0656\3\2\2\2\u065a\u065d"+
		"\3\2\2\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u0664\3\2\2\2\u065d"+
		"\u065b\3\2\2\2\u065e\u0660\7\u0094\2\2\u065f\u065e\3\2\2\2\u0660\u0661"+
		"\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663"+
		"\u0654\3\2\2\2\u0663\u065f\3\2\2\2\u0664\u0115\3\2\2\2\u0665\u0666\t\24"+
		"\2\2\u0666\u0117\3\2\2\2\u00db\u011b\u012b\u0135\u0138\u013b\u013e\u0146"+
		"\u014a\u014d\u0150\u0158\u015b\u015e\u0168\u016f\u0174\u0176\u0188\u0194"+
		"\u019c\u019f\u01a8\u01bc\u01c6\u01c9\u01cf\u01d8\u01e0\u01ea\u01ef\u01f7"+
		"\u01f9\u0202\u0206\u020f\u0211\u021a\u021e\u0221\u0229\u022d\u022f\u0232"+
		"\u0238\u023c\u0242\u0250\u0257\u025d\u0263\u0267\u026b\u0271\u027b\u0281"+
		"\u0285\u0290\u0296\u029a\u02a6\u02a8\u02ae\u02b3\u02b7\u02be\u02c1\u02cc"+
		"\u02d2\u02d4\u02d7\u02df\u02e7\u02eb\u02f5\u02fa\u02fc\u0312\u0319\u031e"+
		"\u0330\u0333\u0336\u0339\u033e\u0341\u0344\u0350\u0356\u035a\u0360\u0369"+
		"\u0370\u0377\u037c\u037f\u0383\u038b\u038e\u0392\u0397\u039b\u039e\u03a7"+
		"\u03a9\u03b1\u03b8\u03be\u03c3\u03c9\u03cd\u03d2\u03da\u03dc\u03f2\u03f8"+
		"\u03fa\u03ff\u0409\u0410\u0415\u0419\u041d\u0421\u0428\u042e\u043a\u0441"+
		"\u0445\u044a\u044e\u0455\u045a\u0460\u0464\u0468\u046f\u0474\u0478\u047b"+
		"\u0484\u0489\u048e\u0496\u049a\u049c\u04a8\u04ac\u04ae\u04b7\u04bb\u04bf"+
		"\u04c2\u04c6\u04ca\u04d0\u04d4\u04d9\u04db\u04df\u04e4\u04e7\u04ee\u04f5"+
		"\u04f8\u04fe\u0502\u0506\u050a\u050e\u0512\u0516\u051a\u051e\u0522\u0525"+
		"\u052e\u0533\u0535\u0541\u0544\u0550\u0558\u055d\u0565\u056b\u0571\u0577"+
		"\u058a\u058e\u0592\u059c\u05ab\u05ae\u05b5\u05bd\u05c3\u05c8\u05d8\u05f0"+
		"\u05f2\u05fa\u05fd\u0603\u060d\u061c\u0624\u0626\u062e\u0633\u0644\u064a"+
		"\u064e\u0652\u0656\u065b\u0661\u0663";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}