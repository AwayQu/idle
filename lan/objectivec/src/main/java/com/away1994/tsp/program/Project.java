package com.away1994.tsp.program;

import com.away1994.tsp.program.uml.ToClassesDiagram;

public interface Project extends ProgramElement, ToClassesDiagram {

    String getPath();
    void readProject();

}
