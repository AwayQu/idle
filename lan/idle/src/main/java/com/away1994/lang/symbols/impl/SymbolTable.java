package com.away1994.lang.symbols.impl;

import java.util.HashMap;

public class SymbolTable {
    /**
     * hashMap -> Identify
     */
    private HashMap<String, String> symbolMaps = new HashMap<>();

    public SymbolTable() {
    }

    public HashMap<String, String> getSymbolMaps() {
        return symbolMaps;
    }

    public void setSymbolMaps(HashMap<String, String> symbolMaps) {
        this.symbolMaps = symbolMaps;
    }
}
