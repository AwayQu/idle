package com.away1994.java8.g4;

import com.away1994.gen.java8.Java8Lexer;
import com.away1994.gen.java8.Java8Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

public class Java8G4Test {

    @Test
    public void java8EnumVisitTest() throws Exception {
        String s = "public enum TypeRelationTag {\n" +
                "\n" +
                "    EXTEND, /// super\n" +
                "    IMPLEMENT, /// protocol\n" +
                "    USE,       /// use in method ?\n" +
                "    ASSOCIATE; ///\n" +
                "\n" +
                "}\n";
        visit(s);
    }

    @Test
    public void java8VariableVisitTest() throws Exception {
        String s = "@JsonIgnoreProperties({\"ruleContext\", \"cachedIdentify\"})\n" +
                "public class SymbolImpl implements Symbol {\n" +
                "\n" +
                "    private static final transient Logger LOGGER = Logger.getLogger(SymbolImpl.class.getName());\n" +
                "\n" +
                "    @JsonView(Views.WebViewPublic.class)\n" +
                "    public String name;\n" +
                "\n" +
                "    @JsonSerialize(using = SymbolSerializer.class)\n" +
                "    @JsonDeserialize(using = SymbolDeserializer.class)\n" +
                "    @JsonView(Views.WebViewPublic.class)\n" +
                "    public Symbol owner;\n" +
                "\n" +
                "    public String getName() {\n" +
                "        return name;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void setName(String name) {\n" +
                "        this.name = name;\n" +
                "    }\n" +
                "\n" +
                "    public Symbol getOwner() {\n" +
                "        return owner;\n" +
                "    }\n" +
                "\n" +
                "    public void setOwner(Symbol owner) {\n" +
                "        this.owner = owner;\n" +
                "    }\n" +
                "\n" +
                "    public SymbolImpl() {\n" +
                "    }\n" +
                "\n" +
                "    public SymbolImpl(String name, Symbol owner) {\n" +
                "        this.name = name;\n" +
                "        this.owner = owner;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void setIdentify(String identify) {\n" +
                "        this.setCachedIdentify(identify);\n" +
                "    }\n" +
                "\n" +
                "    public SymbolImpl(String cachedIdentify) {\n" +
                "        this.cachedIdentify = cachedIdentify;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String identify() {\n" +
                "        if (this.getCachedIdentify() != null) {\n" +
                "            return this.getCachedIdentify();\n" +
                "        }\n" +
                "        String absIdentify = this.absIdentify();\n" +
                "        if (this.getOwner() == null) {\n" +
                "            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(NULL_POINTER_OWNER_ERROR, absIdentify));\n" +
                "            return absIdentify;\n" +
                "        } else {\n" +
                "            return absIdentify + this.getOwner().identify();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String absIdentify() {\n" +
                "        if (this.getName() == null) {\n" +
                "            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(NULL_POINTER_NAME_ERROR, this));\n" +
                "        }\n" +
                "        return this.state().getDescription() + LEFT_PARENTHESIS_CHAR + this.getName() + RIGHT_PARENTHESIS_CHAR;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String description() {\n" +
                "        return null;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public Type state() {\n" +
                "        return Type.PLACEHOLD_STATE;\n" +
                "    }\n" +
                "\n" +
                "    @JsonView(Views.Internal.class)\n" +
                "    private String cachedIdentify;\n" +
                "\n" +
                "    public String getCachedIdentify() {\n" +
                "        return cachedIdentify;\n" +
                "    }\n" +
                "\n" +
                "    public void setCachedIdentify(String cachedIdentify) {\n" +
                "        this.cachedIdentify = cachedIdentify;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    private ParserRuleContext ruleContext;\n" +
                "\n" +
                "    public void setRuleContext(ParserRuleContext ruleContext) {\n" +
                "        this.ruleContext = ruleContext;\n" +
                "    }\n" +
                "\n" +
                "    public ParserRuleContext getRuleContext() {\n" +
                "        return ruleContext;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    public Symbol extractNameAndOwnerCachedIdentify() {\n" +
                "        if (this.getCachedIdentify() == null) {\n" +
                "            return null;\n" +
                "        }\n" +
                "        String des = this.state().getDescription();\n" +
                "        if (this.getCachedIdentify().startsWith(des)) {\n" +
                "            String subId = des.substring(des.length());\n" +
                "            int nextIndex = subId.indexOf('$');\n" +
                "            String name = subId.substring(1, nextIndex - 1);\n" +
                "            String ownerId = subId.substring(nextIndex);\n" +
                "\n" +
                "        }\n" +
                "        return null;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public Collection<Symbol> allSymbols() {\n" +
                "        return new ArrayList<>();\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void merge(Symbol s) {\n" +
                "\n" +
                "    }\n" +
                "}\n";

        visit(s);
    }

    @Test
    public void java8InterfaceVisitTest() throws Exception {
        String simpleClass = "public interface Node extends SuperNode {\n" +
                "\n" +
                "    public Node node;\n" +

                "\n" +

                "    public Node getParent();\n" +
                "\n" +
                "    public Node getChild(int idx);\n" +
                "\n" +
                "    public int getChildCount();\n" +
                "\n" +
                "    public Node[] getChildren();\n" +
                "\n" +
                "    public <T> T accept(NodeVisitor<? extends T> visitor);\n" +
                "\n" +
                "\n" +
                "}\n";

        visit(simpleClass);
    }

    @Test
    public void java8VisitTest() throws Exception {
        String simpleClass = "package com.away1994.tsp.language;\n" +
                "\n" +
                "import java.util.ArrayList;\n" +
                "\n" +
                "public class Java10 extends Language {\n" +
                "    public Java8() {\n" +
                "        this.name = Constant.LANGUAGE_JAVA8;\n" +
                "\n" +
                "        this.fileExtensions = new ArrayList<>();\n" +
                "        this.fileExtensions.add(Constant.EXTENSION_JAVA);\n" +
                "\n" +
                "        this.ignores = new ArrayList<>();\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "\n";

        visit(simpleClass);

    }

    private void visit(String simpleClass) {
        ParseTree tree = getParseTree(simpleClass);


        AbstractParseTreeVisitor visitor = new TestJava8BaseVisitor();

        visitor.visit(tree);
    }

    private ParseTree getParseTree(String simpleClass) {
        ANTLRInputStream fs = new ANTLRInputStream(simpleClass);
        Java8Lexer lexer = new Java8Lexer(fs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Java8Parser java8Parser = new Java8Parser(tokenStream);
        return java8Parser.compilationUnit();
    }
}
