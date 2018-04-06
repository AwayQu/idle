package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.io.seriablize.*;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;


@JsonIgnoreProperties({"ruleContext"})
public class ClassImpl implements Class {


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
    @JsonDeserialize(contentUsing = InterfaceDeserializer.class)
    @JsonSerialize(contentUsing = InterfaceSerializer.class)
    public ArrayList<Interface> iInterfaces = new ArrayList<>();

    /**
     * super classes
     */
    @JsonDeserialize(contentUsing = ClassDeserializer.class)
    @JsonSerialize(contentUsing = ClassSerializer.class)
    public ArrayList<Class> superCls = new ArrayList<>();

    /**
     * instance variables
     */
    @JsonDeserialize(contentUsing = VariableDeserializer.class)
    @JsonSerialize(contentUsing = VariableSerializer.class)
    public ArrayList<Variable> iVariables = new ArrayList<>();

    /**
     * static variables
     */

    @JsonDeserialize(contentUsing = VariableDeserializer.class)
    @JsonSerialize(contentUsing = VariableSerializer.class)
    public ArrayList<Variable> sVariables = new ArrayList<>();

    /**
     * instance functions
     */
    @JsonDeserialize(contentUsing = FunctionDeserializer.class)
    @JsonSerialize(contentUsing = FunctionSerializer.class)
    public ArrayList<Function> iFunctions = new ArrayList<>();

    /**
     * static functions
     */
    @JsonDeserialize(contentUsing = FunctionDeserializer.class)
    @JsonSerialize(contentUsing = FunctionSerializer.class)
    public ArrayList<Function> sFunctions = new ArrayList<>();

    public ClassImpl(String name, Symbol owner) {
        this.name = name;
        this.owner = owner;
    }


    public String identify() {
        return "$CLASS(" + name + ")" + owner.identify();
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



        sb.append("superCls:");
        sb.append(LINE_SEPARATOR);

        for (Symbol i : this.superCls) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }


        sb.append("iInterface:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.iInterfaces) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }

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
        return State.CLASS_STATE;
    }

    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }


    private String cachedIdentify;
}
