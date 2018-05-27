package com.away1994.idlerest.classdiagram;

import com.away1994.idlerest.bean.IdentifyList;
import com.away1994.idlerest.bean.Response;
import com.away1994.idlerest.config.BaseConfiguration;
import com.away1994.idlerest.jobs.CloneRepositoryJob;
import com.away1994.idlerest.jobs.ExampleJob;
import com.away1994.idlerest.jobs.FileTreeJob;
import com.away1994.idlerest.jobs.ParseJob;
import com.away1994.idlerest.service.AsyncService;
import com.away1994.jgit.url.GitURL;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class GithubProjectController {

    public static class ProjectSubmit {
        public String url;
    }

    @Autowired
    private BaseConfiguration configuration;

    /**
     * save user input project url
     */
    @RequestMapping(value = "/github/project", method = RequestMethod.POST)
    public Response project(@RequestBody ProjectSubmit projectSubmit,
                            HttpServletResponse response, HttpServletRequest request, HttpSession session) {
        if (projectSubmit.url == null) {
            return new Response(Response.CODE_FAIL, Response.MSG_FAIL);
        }
        String projectURL = projectSubmit.url;
        session.setAttribute("project", projectURL);
        response.addCookie(new Cookie("project", projectURL));


        GitURL gitUrl = new GitURL(projectURL);
        String repositoryURL = null;
        try {
            repositoryURL = gitUrl.getURL();
        } catch (GitURL.GitURLFormatErrorException e) {
            return new Response(Response.CODE_FAIL, "URL Format error, not invalid git URL");
        }
        com.away1994.lang.project.Project pro = (Project) session.getAttribute("pro");
        if (repositoryURL != null && pro != null && repositoryURL.equals(pro.getGitURL())) {
            //pass
        } else {
            String repositoryName = null;
            try {
                repositoryName = gitUrl.getRepositoryName();
            } catch (GitURL.GitURLNameNotFoundException e) {
                return new Response(Response.CODE_FAIL, "Repository name found error, not invalid git URL");
            }

            pro = new com.away1994.lang.project.Project(repositoryURL);
            pro.setProjectName(repositoryName);
            pro.setProjectPath(PathUtils.append(configuration.getProjectPath(), repositoryName));
            pro.setSymbolsPath(PathUtils.append(configuration.getSymbolsPath(), repositoryName));
            session.setAttribute("pro", pro);
        }

        if (pro.getCloning()) {
            return new Response(Response.CODE_FAIL, "Is cloning please wait a moment.");
        }

        if (pro.getParsing()) {
            return new Response(Response.CODE_FAIL, "Is parsing please wait a moment.");
        }


        if (!pro.getCloned()) {
            CloneRepositoryJob newJob = new CloneRepositoryJob(template, pro);
            jobNumber = jobNumber + 1;
            myJobList.add(newJob);
            myExecutor.execute(newJob);
        }

        if (!pro.getParsed()) {
            ParseJob newJob1 = new ParseJob(template, pro);
            jobNumber = jobNumber + 1;
            myJobList.add(newJob1);
            myExecutor.execute(newJob1);
        }

        FileTreeJob newJob2 = new FileTreeJob(template, pro);
        jobNumber = jobNumber + 1;
        myJobList.add(newJob2);
        myExecutor.execute(newJob2);

        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
    }

    @RequestMapping(value = "/github/diagram/files", method = RequestMethod.POST)
    public Response files(@RequestBody IdentifyList identifyList, @CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {
        Project pro = (Project) session.getAttribute("pro");
        if (pro == null) {
            return new Response(Response.CODE_FAIL, "Need submit project url.");
        }
        if (!pro.getCloned()) {
            return new Response(Response.CODE_FAIL, "Repository was not cloned.");
        }

        Session idleSession = new SessionImpl(pro.getProjectPath(),
                pro.getSymbolsPath());

        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        ArrayList<ClassDiagram> res = aggregator.getClassDiagrams(identifyList.getIdentifies(), 2);
        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS, res);
    }


    @RequestMapping(value = "/github", method = RequestMethod.POST)
    public Response github(@CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {

        Project pro = (Project) session.getAttribute("pro");
        if (pro == null) {
            return new Response(Response.CODE_FAIL, "Need submit project url.");
        }
        if (!pro.getCloned()) {
            return new Response(Response.CODE_FAIL, "Repository was not cloned.");
        }

        Session idleSession = new SessionImpl(pro.getProjectPath(),
                pro.getSymbolsPath());

        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        ClassDiagram res = aggregator.getClassDiagram(1);
        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS, res);
    }

    @RequestMapping(value = "/github/fileTree", method = RequestMethod.POST)
    public Response fileTree(@CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {
        Project pro = (Project) session.getAttribute("pro");
        if (pro == null) {
            return new Response(Response.CODE_FAIL, "Need submit project url.");
        }
        if (!pro.getCloned()) {
            return new Response(Response.CODE_FAIL, "Repository was not cloned.");
        }

        Session idleSession = new SessionImpl(pro.getProjectPath(),
                pro.getSymbolsPath());
        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        FileTree tree = aggregator.getFileTree();

        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS, tree);
    }


    private static int jobNumber;
    private final AsyncService myService;
    @Qualifier("taskExecutor")
    @Autowired
    private ThreadPoolTaskExecutor myExecutor;

    @Autowired
    private SimpMessagingTemplate template;

    private ArrayList myJobList = new ArrayList<>(5);

    @Autowired
    GithubProjectController(AsyncService myService) {
        this.myService = myService;
    }
}
