package com.away1994.structure.lang.aggregator.impl;

import com.away1994.structure.lang.aggregator.Session;

public class SessionImpl implements Session {

    private String projectPath;

    private String symbolsPath;


    public SessionImpl(String projectPath, String symbolsPath) {
        this.projectPath = projectPath;
        this.symbolsPath = symbolsPath;
    }


    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getSymbolsPath() {
        return symbolsPath;
    }

    public void setSymbolsPath(String symbolsPath) {
        this.symbolsPath = symbolsPath;
    }

    @Override
    public String projectPath() {
        return this.projectPath;
    }

    @Override
    public String symbolsPath() {
        return this.symbolsPath;
    }
}
