package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Symbol;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class FunctionBase implements Function {

    public Symbol owner;

    /**
     * signature of function
     */
    public String signature;


    public FunctionBase(Symbol owner, String signature) {
        this.owner = owner;
        this.signature = signature;
    }


    /**
     * TODO :
     * callees
     * contains variables
     * contains classes
     */

    public String identify() {
        return  "$FUNCTION("+this.signature + ")" + owner.identify();
    }

    public String description() {

        StringBuilder sb = new StringBuilder();


        sb.append("signature:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.signature);
        sb.append(LINE_SEPARATOR);

        sb.append("owner:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.owner.identify());
        sb.append(LINE_SEPARATOR);

        return sb.toString();
    }
}
