package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Symbol;

import java.util.ArrayList;

public interface LanguageParser {


    public ArrayList<Symbol> parseInterface(Symbol symbol);

    public ArrayList<Symbol> parseVariable(Symbol symbol);

    public ArrayList<Symbol> parseFunction(Symbol symbol);

    public ArrayList<Symbol> parseFile(Symbol symbol);

    public ArrayList<Symbol> parseClass(Symbol symbol);

    public ArrayList<Symbol> parsePath(Symbol symbol);

    public ArrayList<Symbol> parseEnumerator(Symbol symbol);


}
