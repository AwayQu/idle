package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Enumerator;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class EnumeratorImpl implements Enumerator {
    /**
     * enum Name
     */
    public String name;

    /**
     * class owner, always file
     */
    public Symbol owner;

    public Class type;

    public ArrayList<Variable> values = new ArrayList<>();

    public EnumeratorImpl(String name, Symbol owner) {
        this.name = name;
        this.owner = owner;
    }

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
    public String identify() {
        return "$ENUM(" + name + ")" + this.owner.identify();
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


    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }


}
