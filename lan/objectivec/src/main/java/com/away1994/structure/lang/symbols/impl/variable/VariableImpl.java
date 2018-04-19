package com.away1994.structure.lang.symbols.impl.variable;

import com.away1994.structure.lang.io.seriablize.serializer.ClassDeserializer;
import com.away1994.structure.lang.io.seriablize.serializer.ClassSerializer;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.SymbolImpl;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.ArrayList;
import java.util.Collection;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class VariableImpl extends SymbolImpl implements Variable {

    public VariableImpl() {
    }

    public VariableImpl(Class type) {
        this.type = type;
    }

    public VariableImpl(String name, Symbol owner) {
        super(name, owner);
    }

    @JsonDeserialize(using = ClassDeserializer.class)
    @JsonSerialize(using = ClassSerializer.class)
    public Class type;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
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


        sb.append("tpye:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.type.identify());


        return sb.toString();
    }

    @Override
    public Type state() {
        return Type.VARIABLE_STATE;
    }


    @Override
    public Collection<Symbol> allSymbols() {
        ArrayList<Symbol> symbols = new ArrayList<>();
        symbols.add(type);
        return symbols;
    }
}
