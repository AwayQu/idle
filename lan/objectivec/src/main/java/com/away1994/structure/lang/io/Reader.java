package com.away1994.structure.lang.io;

import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Symbol;

import java.util.Collection;

public interface Reader {

    /**
     * 只读最高层级的symbol
     * @param name name of symbol
     * @param type type of symbol
     * @return a collection of symbols
     */
    public <T extends Symbol> Collection<T> getSymbols(String name, Type type);

    public <T extends Symbol> T getSymbol(T symbol);

    public <T extends Symbol> Collection<T> getSymbols(Type type);

    public <T extends Symbol> T getSymbol(String identify);
}
