package com.away1994.structure.lang.aggregator;

public interface Aggregator {

    public AggregateInfo getClassDependencyInfo(String className, int depth);

}
