package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

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


    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }

    @Override
    public String identify() {
        return this.owner.identify() + this.name;
    }

    @Override
    public String description() {
        return this.owner.identify() + this.name;
    }
}
