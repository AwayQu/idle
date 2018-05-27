package com.away1994.idlerest.jobs;

import com.away1994.idlerest.message.JobProgressMessage;
import com.away1994.lang.aggregator.Session;
import com.away1994.lang.aggregator.impl.AggregatorImpl;
import com.away1994.lang.aggregator.impl.FileTree;
import com.away1994.lang.aggregator.impl.SessionImpl;
import com.away1994.lang.project.Project;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class FileTreeJob implements DetailedJob {

    private SimpMessagingTemplate template;

    private Project project;

    private String state = "NEW";

    private String taskName = "";

    private Integer progess = 0;

    public FileTreeJob(SimpMessagingTemplate template, Project project) {
        this.template = template;
        this.project = project;
        project.setParsingFileTree(true);
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
        return "Parse file tree";
    }

    @Override
    public void run() {
        state = "RUNNING";
        sendProgress();

        System.out.println("do fileTree job");


        Session idleSession = new SessionImpl(project.getProjectPath(),
                project.getSymbolsPath());
        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        FileTree tree = aggregator.getFileTree();

        template.convertAndSend("/topic/fileTree", tree);
        progess = 100;
        sendProgress();
        state = "DONE";

        project.setParsingFileTree(false);
        System.out.println("finish fileTree job");
    }


    public void sendProgress() {
        JobProgressMessage temp = new JobProgressMessage(this.getJobName());
        temp.setProgress(progess);
        temp.setState(state);
        temp.setTaskName(taskName);
        template.convertAndSend("/topic/status", temp);
    }


}
