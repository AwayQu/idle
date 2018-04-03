package com.away1994.structure.lang.parser;

import java.util.ArrayList;
import java.util.Map;

public interface ParseVisitor {

    public void enterVisitor(State state, ArrayList<State> stateStacks, Map<State, ParseVisitor> visitorMap);


    public void visit(State state, ArrayList<State> stateStacks, Map<State, ParseVisitor> visitorMap);

    public void exitVisitor(State state, ArrayList<State> stateStacks, Map<State, ParseVisitor> visitorMap);
}
