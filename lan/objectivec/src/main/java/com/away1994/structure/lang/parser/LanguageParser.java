package com.away1994.structure.lang.parser;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableBase;

import java.util.ArrayList;

public interface LanguageParser {


    public ArrayList<Symbol> parseInterface(InterfaceBase anInterface);

    public ArrayList<Symbol> parseVariable(VariableBase variable);

    public ArrayList<Symbol> parseFunction(FunctionBase function);

    public ArrayList<Symbol> parseFile(FileBase file);

    public ArrayList<Symbol> parseClass(ClassBase clazz);

    public ArrayList<Symbol> parsePath(PathBase path);

    public ArrayList<Symbol> parseEnumerator(EnumeratorBase enumerator);


}
