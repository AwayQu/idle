package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;

import java.util.ArrayList;

public interface LanguageParser {


    public ArrayList<Symbol> parseInterface(InterfaceImpl anInterface);

    public ArrayList<Symbol> parseVariable(VariableImpl variable);

    public ArrayList<Symbol> parseFunction(FunctionImpl function);

    public ArrayList<Symbol> parseFile(FileImpl file);

    public ArrayList<Symbol> parseClass(ClassImpl clazz);

    public ArrayList<Symbol> parsePath(PathImpl path);

    public ArrayList<Symbol> parseEnumerator(EnumeratorImpl enumerator);


}
