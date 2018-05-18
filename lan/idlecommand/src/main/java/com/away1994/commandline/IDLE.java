package com.away1994.commandline;

import com.away1994.dist.g4.Output;
import com.away1994.dist.program.Project;
import com.away1994.dist.program.impl.ObjcProject;
import io.airlift.airline.*;

import java.io.File;
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

            File file = new File(path);
            if (!file.exists()) {
                System.out.println("Project path not exists!");
                return;
            }
            Project project = new ObjcProject(path);


            project.readProject();

            com.away1994.dist.feature.plantuml.classes.ClassesDiagram diagram = project.getClassesDiagram();
            try {
                String out = output != null ? output: "./" + file.getName() + ".puml";
                Output.writeToFile(out, diagram.getPUTextDescription());
            } catch (IOException e) {
                System.out.println("Write to output file fail");
            }

        }
    }

}
