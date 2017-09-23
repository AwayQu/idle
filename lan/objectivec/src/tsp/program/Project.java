package tsp.program;

import tsp.program.uml.ToClassesDiagram;

public interface Project extends ProgramElement, ToClassesDiagram {

    String getPath();
    void readProject();

}
