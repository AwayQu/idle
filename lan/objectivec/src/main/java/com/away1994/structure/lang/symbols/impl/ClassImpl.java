package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.io.seriablize.serializer.*;
import com.away1994.structure.lang.io.seriablize.views.Views;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.Collection;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;


public class ClassImpl extends SymbolImpl implements Class {

    public ClassImpl() {
    }

    public ClassImpl(String name, Symbol owner) {
        super(name, owner);
    }

    /**
     * implements interfaces
     */
    @JsonDeserialize(contentUsing = InterfaceDeserializer.class)
    @JsonSerialize(contentUsing = InterfaceSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Interface> iInterfaces = new ArrayList<>();

    /**
     * super classes
     */
    @JsonDeserialize(contentUsing = ClassDeserializer.class)
    @JsonSerialize(contentUsing = ClassSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Class> superCls = new ArrayList<>();

    /**
     * instance variables
     */
    @JsonDeserialize(contentUsing = VariableDeserializer.class)
    @JsonSerialize(contentUsing = VariableSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Variable> iVariables = new ArrayList<>();

    /**
     * static variables
     */

    @JsonDeserialize(contentUsing = VariableDeserializer.class)
    @JsonSerialize(contentUsing = VariableSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Variable> sVariables = new ArrayList<>();

    /**
     * instance functions
     */
    @JsonDeserialize(contentUsing = FunctionDeserializer.class)
    @JsonSerialize(contentUsing = FunctionSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Function> iFunctions = new ArrayList<>();

    /**
     * static functions
     */
    @JsonDeserialize(contentUsing = FunctionDeserializer.class)
    @JsonSerialize(contentUsing = FunctionSerializer.class)
    @JsonView(Views.WebViewPublic.class)
    public ArrayList<Function> sFunctions = new ArrayList<>();


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
    public Type state() {
        return Type.CLASS_STATE;
    }


    @Override
    public Collection<Symbol> allSymbols() {
        ArrayList<Symbol> symbols = new ArrayList<>();
        symbols.addAll(iInterfaces);
        symbols.addAll(superCls);
        symbols.addAll(iVariables);
        symbols.addAll(sVariables);
        symbols.addAll(iFunctions);
        symbols.addAll(sFunctions);
        return symbols;
    }

    @Override
    public void merge(Symbol s) {
        super.merge(s);
        if (s instanceof ClassImpl) {
            // TODO: 去除 合并后 重复的方法 和 变量
            ClassImpl c = (ClassImpl) s;
            this.superCls.addAll(c.superCls);
            this.iInterfaces.addAll(c.iInterfaces);
            this.iVariables.addAll(c.iVariables);
            this.sVariables.addAll(c.sVariables);
            this.iFunctions.addAll(c.iFunctions);
            this.sFunctions.addAll(c.sFunctions);
        }

    }
}
