package com.away1994.tsp.feature.plantuml;

import com.away1994.constants.TestConstants;
import com.away1994.tsp.feature.plantuml.classes.ClassesDiagram;
import com.away1994.tsp.g4.Output;
import com.away1994.tsp.program.Project;
import com.away1994.tsp.program.impl.ObjcProject;
import org.junit.Test;

import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class ProjectTest {

    @Test
    public void projectTest1() throws Exception {

        Project project = new ObjcProject(TestConstants.IOS_HELLO_PROJECT_PATH);

        project.readProject();

        ClassesDiagram diagram = project.getClassesDiagram();

        System.out.println(diagram.getPUTextDescription());


        Output.writeToFile(TEST_RESOURCES_PATH + "out/plantuml/projectTest1.puml", diagram.getPUTextDescription());

    }


    @Test
    public void AFNetworkingProjectTest2() throws Exception {

        Project project = new ObjcProject(TestConstants.AFNetworking_PROJECT_PATH);

        project.readProject();

        ClassesDiagram diagram = project.getClassesDiagram();

        System.out.println(diagram.getPUTextDescription());


        Output.writeToFile(TEST_RESOURCES_PATH + "out/plantuml/AFNetworkingProjectTest2.puml", diagram.getPUTextDescription());

    }

    @Test
    public void ReactiveCocoaProjectTest3() throws Exception {

        Project project = new ObjcProject(TestConstants.ReactiveCocoa_PROJECT_PATH);

        project.readProject();

        ClassesDiagram diagram = project.getClassesDiagram();

        System.out.println(diagram.getPUTextDescription());


        Output.writeToFile(TEST_RESOURCES_PATH + "out/plantuml/ReactiveCocoaProjectTest3.puml", diagram.getPUTextDescription());

    }
}
