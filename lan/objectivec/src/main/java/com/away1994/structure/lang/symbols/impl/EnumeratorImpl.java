package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.io.seriablize.ClassDeserializer;
import com.away1994.structure.lang.io.seriablize.ClassSerializer;
import com.away1994.structure.lang.io.seriablize.VariableDeserializer;
import com.away1994.structure.lang.io.seriablize.VariableSerializer;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Enumerator;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class EnumeratorImpl extends SymbolImpl implements Enumerator {

    public EnumeratorImpl() {
    }

    public EnumeratorImpl(String name, Symbol owner) {
        super(name, owner);
    }


    @JsonDeserialize(using = ClassDeserializer.class)
    @JsonSerialize(using = ClassSerializer.class)
    public Class type;

    @JsonDeserialize(contentUsing = VariableDeserializer.class)
    @JsonSerialize(contentUsing = VariableSerializer.class)
    public ArrayList<Variable> values = new ArrayList<>();

    public ArrayList<Variable> getValues() {
        return values;
    }

    public void setValues(ArrayList<Variable> values) {
        this.values = values;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }


    @Override
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

        if (this.type != null) {

            sb.append("type:");
            sb.append(LINE_SEPARATOR);
            sb.append(this.type.identify());
            sb.append(LINE_SEPARATOR);
        }


        sb.append("values:");
        sb.append(LINE_SEPARATOR);
        for (Symbol i : this.values) {
            sb.append(i.identify());
            sb.append(LINE_SEPARATOR);
        }

        return sb.toString();
    }

    @Override
    public State state() {
        return State.ENUM_STATE;
    }



}
