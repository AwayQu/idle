package com.away1994.idlerest.message;

public class JobProgressMessage {
    private String jobName;
    private String state;
    private String taskName;
    private int progress;

    public JobProgressMessage(String jobName)
    {
        this.jobName = jobName;
    }

    public String getJobName() {
        return jobName;
    }

    public String getState() {
        return state;
    }

    public int getProgress() {
        return progress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
