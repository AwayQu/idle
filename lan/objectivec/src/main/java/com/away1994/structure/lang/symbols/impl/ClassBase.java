package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

public class ClassBase implements Class {


    /**
     * className
     */
    public String name;

    /**
     * class owner, always file
     */
    public Symbol owner;

    /**
     * implements interfaces
     */
    public ArrayList<Interface> iInterfaces = new ArrayList<>();

    /**
     * super classes
     */
    public ArrayList<Class> superCls = new ArrayList<>();

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

    public ClassBase(String name, Symbol owner) {
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
        return owner.identify() + name;
    }

    @Override
    public String description() {
        return owner.identify() + name;
    }

}
