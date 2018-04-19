package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.io.seriablize.serializer.*;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class InterfaceImpl extends SymbolImpl implements Interface {

    private static final transient Logger LOGGER = Logger.getLogger(InterfaceImpl.class.getName());


    @JsonDeserialize(contentUsing = InterfaceDeserializer.class)
    @JsonSerialize(contentUsing = InterfaceSerializer.class)
    public ArrayList<Interface> extendInterfaces = new ArrayList<>();


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

    public ArrayList<Variable> getiVariables() {
        return iVariables;
    }

    public void setiVariables(ArrayList<Variable> iVariables) {
        this.iVariables = iVariables;
    }

    public ArrayList<Variable> getsVariables() {
        return sVariables;
    }

    public void setsVariables(ArrayList<Variable> sVariables) {
        this.sVariables = sVariables;
    }

    public ArrayList<Function> getiFunctions() {
        return iFunctions;
    }

    public void setiFunctions(ArrayList<Function> iFunctions) {
        this.iFunctions = iFunctions;
    }

    public ArrayList<Function> getsFunctions() {
        return sFunctions;
    }

    public void setsFunctions(ArrayList<Function> sFunctions) {
        this.sFunctions = sFunctions;
    }

    public InterfaceImpl(String name, Symbol owner) {
        this.name = name;
        this.owner = owner;
    }

    public InterfaceImpl() {
    }

    public ArrayList<Interface> getExtendInterfaces() {
        return extendInterfaces;
    }

    public void setExtendInterfaces(ArrayList<Interface> extendInterfaces) {
        this.extendInterfaces = extendInterfaces;
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

        sb.append("extendInterfaces:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.extendInterfaces) {
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
        return Type.INTERFACE_STATE;
    }


    @Override
    public Collection<Symbol> allSymbols() {
        ArrayList<Symbol> symbols = new ArrayList<>();
        symbols.addAll(extendInterfaces);
        symbols.addAll(iVariables);
        symbols.addAll(sVariables);
        symbols.addAll(iFunctions);
        symbols.addAll(sFunctions);
        return symbols;
    }
}
