package com.away1994.tsp.program;

public abstract class AbstractProject implements Project {

    String path;

    @Override
    public void readProject() {


    }

    public AbstractProject(String path) {
        this.path = path;
    }

    @Override
    public String getName() {
        return this.path;
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
