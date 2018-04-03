package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.Class;
import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.variable.Variable;

import java.util.ArrayList;

public class FileBase implements File {

    /**
     * owner always path
     */
    public Symbol owner;


    /**
     * name of file
     */
    public String name;

    /**
     * extension of file
     */
    public String extension;


    /**
     * all symbols in the file
     */
    public ArrayList<Symbol> symbols = new ArrayList<>();


    /**
     * classes in the file
     */
    public ArrayList<Class> classes = new ArrayList<>();

    /**
     * interface in the file
     */
    public ArrayList<Interface> interfaces = new ArrayList<>();

    /**
     * variables in the file
     */
    public ArrayList<Variable> variables = new ArrayList<>();

    /**
     * other symbols
     */
    public ArrayList<Symbol> otherSymbols = new ArrayList<>();

    public FileBase(Symbol owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String identify() {
        return owner.identify() + this.name;
    }

    @Override
    public String description() {
        return owner.identify() + this.name;
    }
}
