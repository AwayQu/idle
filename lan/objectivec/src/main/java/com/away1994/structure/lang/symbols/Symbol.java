package com.away1994.structure.lang.symbols;

import com.away1994.structure.lang.parser.Type;

import java.util.Collection;

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


    public Type state();


    public Collection<Symbol> allSymbols();


    public void setName(String name);

    public String getName();

    public void setIdentify(String identify);

    public void merge(Symbol s);


}
