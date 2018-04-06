package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class FileBase implements File {

    /**
     * owner always path
     */
    public Symbol owner;


    /**
     * name of file
     */
    public String name;


    /**
     * all symbols in the file
     */
    public ArrayList<Symbol> symbols = new ArrayList<>();


    /**
     * classes in the file
     */
    public ArrayList<Class> classes = new ArrayList<>();

    /**
     * interface in the file
     */
    public ArrayList<Interface> interfaces = new ArrayList<>();

    /**
     * variables in the file
     */
    public ArrayList<Variable> variables = new ArrayList<>();

    /**
     * other symbols
     */
    public ArrayList<Symbol> otherSymbols = new ArrayList<>();

    public FileBase(Symbol owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return extension of file
     */
    public String getExtension() {
        int lastIndex = this.getName().lastIndexOf(".");
        return this.getName().substring(lastIndex + 1);
    }



    public String getFullPath() {

        if (owner instanceof PathBase) {
            return ((PathBase) this.owner).getPath() + "/" + this.name;
        } else {
            return null;
        }

    }


    public String identify() {
        return  "$FILE(" +(this.name) + ")" + owner.identify();
    }

    public String description() {
        StringBuilder sb = new StringBuilder();


        sb.append("name:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.name);
        sb.append(LINE_SEPARATOR);

        sb.append("owner:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.owner.identify());
        sb.append(LINE_SEPARATOR);

        return sb.toString();
    }

    @Override
    public State state() {
        return State.FILE_STATE;
    }

    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }


}
