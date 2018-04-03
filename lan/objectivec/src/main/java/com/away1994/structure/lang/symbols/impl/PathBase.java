package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Path;

import java.util.ArrayList;

public class PathBase implements Path {

    /**
     * path string
     */
    public String path;

    /**
     * files in path
     */
    public ArrayList<File> files = new ArrayList<>();

    public PathBase(String path) {
        this.path = path;
    }


    @Override
    public String identify() {
        return this.path;
    }

    @Override
    public String description() {
        return this.path;
    }
}
