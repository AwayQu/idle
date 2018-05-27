package com.away1994.idlerest.jobs;

import com.away1994.common.utils.DirectoryUtils;
import com.away1994.idlerest.bean.Response;
import com.away1994.idlerest.message.JobProgressMessage;
import com.away1994.jgit.repository.RepositoryProvider;
import com.away1994.jgit.repository.TaskProgress;
import com.away1994.jgit.repository.impl.RepositoryProviderCloneImpl;
import com.away1994.lang.project.Project;
import org.eclipse.jgit.api.Git;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.io.File;

public class CloneRepositoryJob implements DetailedJob {

    private SimpMessagingTemplate template;

    private Project project;

    private String state = "NEW";

    private String taskName = "";

    private Integer progess = 0;

    public CloneRepositoryJob(SimpMessagingTemplate template, Project project) {
        this.template = template;
        this.project = project;
        this.project.setCloning(true);
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
        return "Clone repository " + this.project.getGitURL();
    }

    @Override
    public void run() {
        state = "RUNNING";
        sendProgress();

        System.out.println("do clone job");

        RepositoryProvider repoProvider = new RepositoryProviderCloneImpl(this.project.getGitURL(), this.project.getProjectPath());

        repoProvider.setProgress(new TaskProgress() {
            @Override
            public void startProgress(String progressName) {
            }

            @Override
            public void startTask(String taskName, int totalNum) {
                CloneRepositoryJob.this.taskName = "start task: " + taskName;
                CloneRepositoryJob.this.progess = 0;
                sendProgress();
            }

            @Override
            public void updateTask(String taskName, int increaseNum, int percent) {
                /// too often so commented
//                CloneRepositoryJob.this.progess = percent;
//                sendProgress();
            }

            @Override
            public void endTask(String taskName) {
                CloneRepositoryJob.this.progess = 100;
                sendProgress();
            }

            @Override
            public void endProgress(String progressName) {
                sendProgress();
            }
        });
        // delete all projects
        DirectoryUtils.deleteDir(new File(this.project.getProjectPath()));

        try (Git git = new Git(repoProvider.get())) {
            this.project.setCloned(true);
            this.project.setCloning(false);
//            git.pull().call();
        } catch (Exception e) {
            this.project.setCloned(false);
            this.template.convertAndSend("/topic/info", new Response(Response.CODE_FAIL, "Clone repository fail, please check repository url."));

            e.printStackTrace();
        }

        sendProgress();
        state = "DONE";

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
