package com.away1994.dist.program;

import com.away1994.dist.program.uml.ToClassesDiagram;

public interface Project extends ProgramElement, ToClassesDiagram {

    String getPath();
    void readProject();

}
