package com.away1994.dist.program.impl;

import com.away1994.dist.program.G4SourceCodeContext;

public class G4SourceCodeContextImpl<T> implements G4SourceCodeContext<T> {

    private String path;

    private T context;

    public G4SourceCodeContextImpl(String path, T context) {
        this.path = path;
        this.context = context;
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public T getContext() {
        return this.context;
    }
}
