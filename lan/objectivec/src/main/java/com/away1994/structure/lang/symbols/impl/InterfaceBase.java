package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class InterfaceBase implements Interface {
    /**
     * interface Name
     */
    public String name;

    /**
     * owner always file
     */
    public Symbol owner;


    /**
     * instance variables
     */
    public ArrayList<Variable> iVariables = new ArrayList<>();

    /**
     * static variables
     */
    public ArrayList<Variable> sVariables = new ArrayList<>();

    /**
     * instance functions
     */
    public ArrayList<Function> iFunctions = new ArrayList<>();

    /**
     * static functions
     */
    public ArrayList<Function> sFunctions = new ArrayList<>();


    public InterfaceBase(String name, Symbol owner) {
        this.name = name;
        this.owner = owner;
    }




    public String identify() {
        return  "$INTERFACE(" + this.name + ")" + this.owner.identify();
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


        sb.append("iVariables:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.iVariables) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }


        sb.append("sVariables:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.sVariables) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }

        sb.append("iFunctions:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.iFunctions) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }

        sb.append("sFunctions:");

        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.sFunctions) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }

        return sb.toString();
    }


    @Override
    public State state() {
        return State.INTERFACE_STATE;
    }

    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }
}
