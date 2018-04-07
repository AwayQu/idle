package com.away1994.structure.lang.symbols;

import com.away1994.structure.lang.parser.State;

public interface Symbol {

    /**
     * unique string
     * @return identify of a symbol
     */
    public String identify();


    /**
     * absolute unique string
     */
    public String absIdentify();

    /**
     * @return description of a symbol
     */
    public String description();


    public State state();

}
