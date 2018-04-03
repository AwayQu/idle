package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Path;
import com.away1994.structure.lang.symbols.Symbol;

import java.util.ArrayList;

public class PathBase implements Path {

    /**
     * path string
     */
    private String path;

    /**
     * owner of path
     */
    private Symbol owner;

    /**
     * files in path
     */
    public ArrayList<File> files = new ArrayList<>();

    public ArrayList<Path> paths = new ArrayList<>();


    public PathBase(String path) {
        this.path = path;
    }

    public PathBase(Symbol owner, String path) {
        this.owner = owner;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Path> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<Path> paths) {
        this.paths = paths;
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
