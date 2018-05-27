package com.away1994.jgit.repository.impl;


import com.away1994.jgit.repository.RepositoryProvider;
import com.away1994.jgit.repository.TaskProgress;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.ProgressMonitor;
import org.eclipse.jgit.lib.Repository;
import java.io.File;

public class RepositoryProviderCloneImpl implements RepositoryProvider {
    private String repoPath;
    private String clientPath;

    private static final String progressName = "Clone repo";
    private TaskProgress listener;

    public RepositoryProviderCloneImpl(String repoPath, String clientPath) {
        this.repoPath = repoPath;
        this.clientPath = clientPath;

    }

    @Override
    public Repository get() throws GitAPIException, InvalidRemoteException, TransportException {
        File client = new File(clientPath);
        client.mkdirs();
        try (Git result = Git.cloneRepository().setProgressMonitor(new ProgressMonitor() {
            private int totalCount = 0;
            private int progress = 0;
            private String taskName = null;
            @Override
            public void start(int i) {
                if (RepositoryProviderCloneImpl.this.listener != null) {
                    RepositoryProviderCloneImpl.this.listener.startProgress(RepositoryProviderCloneImpl.progressName);
                }
            }

            @Override
            public void beginTask(String s, int i) {
                totalCount = i;
                taskName = s;
                progress = 0;
                if (RepositoryProviderCloneImpl.this.listener != null) {
                    RepositoryProviderCloneImpl.this.listener.startTask(s, i);
                }
            }

            @Override
            public void update(int i) {
                progress += i;
                if (RepositoryProviderCloneImpl.this.listener != null) {
                    RepositoryProviderCloneImpl.this.listener.updateTask(taskName, i, totalCount == 0 ? 0 : progress * 100 / totalCount);
                }
            }

            @Override
            public void endTask() {
                if (RepositoryProviderCloneImpl.this.listener != null) {
                    RepositoryProviderCloneImpl.this.listener.endTask(taskName);
                }
            }


            @Override
            public boolean isCancelled() {
                return false;
            }
        }).setURI(repoPath)
                .setDirectory(client)
                .call()) {
            if (this.listener != null) {
                this.listener.endProgress(progressName);
            }
            return result.getRepository();
        }
    }

    @Override
    public void setProgress(TaskProgress progress) {
        this.listener = progress;
    }
}