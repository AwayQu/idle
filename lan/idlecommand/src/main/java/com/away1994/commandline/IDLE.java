package com.away1994.commandline;

import com.away1994.tsp.g4.Output;
import com.away1994.tsp.program.Project;
import com.away1994.tsp.program.impl.ObjcProject;
import io.airlift.airline.*;

import java.io.IOException;

public class IDLE {


    public static void main(String[] args) {
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("idle")
                .withDescription("analyze uml classes diagram with file")
                .withDefaultCommand(Help.class)
                .withCommands(Help.class, ClassesDiagram.class);


        Cli<Runnable> gitParser = builder.build();

        gitParser.parse(args).run();

    }

    public static class IDLECommand implements Runnable
    {
        @Option(type = OptionType.GLOBAL, name = "-v", description = "Verbose mode")
        public boolean verbose;

        public void run()
        {
            System.out.println(getClass().getSimpleName());
        }
    }


    @Command(name = "analyze", description = "analyze uml classes diagram with file")
    public static class ClassesDiagram extends IDLECommand
    {
        @Option(name = "-p", description = "Project Path")
        public String path;

        @Option(name = "-o", description = "Output file name")
        public String output;

        @Override
        public void run() {
            Project project = new ObjcProject(path);


            project.readProject();

            com.away1994.tsp.feature.plantuml.classes.ClassesDiagram diagram = project.getClassesDiagram();
            try {
                Output.writeToFile(output, diagram.getPUTextDescription());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
