package com.away1994.idlerest.jobs;

import com.away1994.idlerest.bean.IdentifyList;
import com.away1994.idlerest.message.JobProgressMessage;
import com.away1994.lang.aggregator.Session;
import com.away1994.lang.aggregator.impl.AggregatorImpl;
import com.away1994.lang.aggregator.impl.ClassDiagram;
import com.away1994.lang.aggregator.impl.SessionImpl;
import com.away1994.lang.project.Project;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.ArrayList;

public class ClassDiagramJob implements DetailedJob {
    private SimpMessagingTemplate template;

    private Project project;

    private String state = "NEW";

    private String taskName = "";

    private Integer progess = 0;

    private IdentifyList identifyList;

    public ClassDiagramJob(SimpMessagingTemplate template, Project project) {
        this.template = template;
        this.project = project;
        project.setParsingClassDiagram(true);
    }

    public ClassDiagramJob(SimpMessagingTemplate template, Project project, IdentifyList identifyList) {
        this.template = template;
        this.project = project;
        this.identifyList = identifyList;
        project.setParsingClassDiagram(true);
    }

    @Override
    public int getProgress() {
        return 0;
    }

    @Override
    public String getState() {
        return null;
    }

    @Override
    public String getJobName() {
        return "Parse class diagram";
    }

    @Override
    public void run() {

        state = "RUNNING";
        sendProgress();

        System.out.println("do clone job");
        Session idleSession = new SessionImpl(project.getProjectPath(),
                project.getSymbolsPath());
        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        ArrayList<ClassDiagram> diagrams = new ArrayList<>();

        if (identifyList != null) {
            ArrayList<ClassDiagram> res = aggregator.getClassDiagrams(identifyList.getIdentifies(), 2);
            diagrams.addAll(res);
        } else {
            ArrayList<ClassDiagram> res = aggregator.getClassDiagrams(1);
            diagrams.addAll(res);
        }

        progess = 100;
        template.convertAndSend("/topic/classDiagram", diagrams);

        sendProgress();
        state = "DONE";

        this.project.setParsingClassDiagram(false);

        System.out.println("finish clone job");
    }

    public void sendProgress() {
        JobProgressMessage temp = new JobProgressMessage(this.getJobName());
        temp.setProgress(progess);
        temp.setState(state);
        temp.setTaskName(taskName);
        template.convertAndSend("/topic/status", temp);
    }
}
