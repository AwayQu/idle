package com.away1994.structure.lang.symbols;

import com.away1994.structure.lang.parser.State;

public interface Symbol {

    /**
     * unique string
     * @return identify of a symbol
     */
    public String identify();


    /**
     * @return description of a symbol
     */
    public String description();


    public State state();

}
