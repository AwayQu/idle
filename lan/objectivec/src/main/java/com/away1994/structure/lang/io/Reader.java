package com.away1994.structure.lang.io;

import com.away1994.structure.lang.symbols.Symbol;

import java.util.Collection;

public interface Reader {

    /**
     * 只读最高层级的symbol
     * @param name name of symbol
     * @param type type of symbol
     * @return a collection of symbols
     */
    public Collection<Symbol> getSymbols(String name, String type);
}
