package com.away1994.jgit.repository;

import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.lib.Repository;

public interface RepositoryProvider {
    Repository get() throws GitAPIException, InvalidRemoteException, TransportException;


    public void setProgress(TaskProgress progress);
}

