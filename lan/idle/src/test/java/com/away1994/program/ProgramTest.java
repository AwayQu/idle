package com.away1994.program;

import com.away1994.common.utils.DirectoryUtils;
import com.away1994.jgit.repository.RepositoryProvider;
import com.away1994.jgit.repository.TaskProgress;
import com.away1994.jgit.repository.impl.RepositoryProviderCloneImpl;
import com.away1994.lang.aggregator.Session;
import com.away1994.lang.aggregator.impl.AggregatorImpl;
import com.away1994.lang.aggregator.impl.ClassDiagram;
import com.away1994.lang.aggregator.impl.FileTree;
import com.away1994.lang.aggregator.impl.SessionImpl;
import com.away1994.lang.parser.Parser;
import com.away1994.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.lang.project.Project;
import com.away1994.lang.symbols.impl.PathImpl;
import com.away1994.utils.PathUtils;
import org.eclipse.jgit.api.Git;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

public class ProgramTest {
    private Project project;

    @Before
    public void cloneRepoAndParse() {
        Project project = new Project("/Users/away/code/github/Dash-iOS");
        project.setProjectName("Dash-iOS");
        project.setProjectPath("/Users/away/Desktop/projects/Dash-iOS");
        project.setSymbolsPath("/Users/away/Desktop/symbols/Dash-iOS");

        // delete all projects
        DirectoryUtils.deleteDir(new File(project.getProjectPath()));

        RepositoryProvider repoProvider = new RepositoryProviderCloneImpl(project.getGitURL(), project.getProjectPath());

        try (Git git = new Git(repoProvider.get())) {
            project.setCloned(true);
//            git.pull().call();
        } catch (Exception e) {
            project.setCloned(false);
            e.printStackTrace();
        }
        this.project = project;

        File client = new File(project.getSymbolsPath());
        client.mkdirs();

        Parser parser = new Parser(new PathImpl(project.getProjectPath()),
                new ObjectiveCLanguageParser());
        parser.setOutputPath(project.getSymbolsPath());
        parser.runParseStateMachine();
    }

    @Test
    public void diagramTest() {
        Session idleSession = new SessionImpl(project.getProjectPath(),
                project.getSymbolsPath());
        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        FileTree tree = aggregator.getFileTree();



        Project pro = project;
        if (pro == null) {
            return;
        }
        if (!pro.getCloned()) {
            return;
        }
        ArrayList<String> identifyList = new ArrayList<>();
        for (FileTree.FD fd: tree.getFds()) {
            identifyList.add(fd.getIdentify());
        }


        ArrayList<ClassDiagram> res = aggregator.getClassDiagrams(identifyList, 2);

        System.out.println(res);

    }



}
