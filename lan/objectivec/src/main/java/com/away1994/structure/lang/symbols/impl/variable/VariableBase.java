package com.away1994.structure.lang.symbols.impl.variable;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;
import org.antlr.v4.runtime.ParserRuleContext;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class VariableBase implements Variable {


    public Symbol owner;

    public String name;

    public Class type;

    public VariableBase(Symbol owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String identify() {
        return "$VARIABLE(" + name + ")" + this.owner.identify();
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
    public State state() {
        return State.VARIABLE_STATE;
    }

    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }

}
