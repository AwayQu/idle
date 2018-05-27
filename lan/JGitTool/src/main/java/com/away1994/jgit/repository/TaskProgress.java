package com.away1994.jgit.repository;

/**
 * progress
 * task1
 * task2
 */
public interface TaskProgress {

    public void startProgress(String progressName);

    public void startTask(String taskName, int totalNum);

    public void updateTask(String taskName, int increaseNum, int percent);

    public void endTask(String taskName);

    public void endProgress(String progressName);
}


