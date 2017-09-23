package tsp.feature.plantuml;

import org.junit.Test;
import tsp.feature.constants.TestConstants;
import tsp.feature.plantuml.classes.ClassesDiagram;
import tsp.g4.Output;
import tsp.program.Project;
import tsp.program.impl.ObjcProject;

public class ProjectTest {

    @Test
    public void projectTest1() throws Exception {

        Project project = new ObjcProject(TestConstants.IOS_HELLO_PROJECT_PATH);

        project.readProject();

        ClassesDiagram diagram = project.getClassesDiagram();

        System.out.println(diagram.getPUTextDescription());


        Output.writeToFile("./test/res/out/plantuml/projectTest1.puml", diagram.getPUTextDescription());

    }
}
