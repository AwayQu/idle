package com.away1994.idlerest.classdiagram;

import com.away1994.idlerest.bean.IdentifyList;
import com.away1994.idlerest.bean.Response;
import com.away1994.idlerest.config.BaseConfiguration;
import com.away1994.idlerest.jobs.ClassDiagramJob;
import com.away1994.idlerest.jobs.CloneRepositoryJob;
import com.away1994.idlerest.jobs.FileTreeJob;
import com.away1994.idlerest.jobs.ParseJob;
import com.away1994.idlerest.service.AsyncService;
import com.away1994.jgit.url.GitURL;
import com.away1994.lang.project.Project;
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
        public String lan;
    }

    @Autowired
    private BaseConfiguration configuration;


    /**
     * save user input project url
     */
    @RequestMapping(value = "/github/project", method = RequestMethod.POST)
    public Response project(@RequestBody ProjectSubmit projectSubmit,
                            HttpServletResponse response, HttpServletRequest request, HttpSession session) {
        if (projectSubmit.url == null || projectSubmit.lan == null) {
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
        if ((repositoryURL != null && pro != null && repositoryURL.equals(pro.getGitURL())) && // url no change
                (pro != null && pro.getLanguage().equals(projectSubmit.lan)) // language is same
                ) {
            //pass
        } else {

            String repositoryName = null;
            try {
                repositoryName = gitUrl.getRepositoryName();
            } catch (GitURL.GitURLNameNotFoundException e) {
                return new Response(Response.CODE_FAIL, "Repository name found error, not invalid git URL");
            }

            pro = new com.away1994.lang.project.Project(repositoryURL);
            pro.setLanguage(projectSubmit.lan);
            pro.setProjectName(repositoryName);
            pro.setProjectPath(PathUtils.append(configuration.getProjectPath(), repositoryName));
            pro.setSymbolsPath(PathUtils.append(configuration.getSymbolsPath(), repositoryName));
            session.setAttribute("pro", pro);
        }

        Response res = checkIsParsing(pro);
        if (res != null) {
            return res;
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

        ClassDiagramJob newJob3 = new ClassDiagramJob(template, pro);
        jobNumber = jobNumber + 1;
        myJobList.add(newJob3);
        myExecutor.execute(newJob3);


        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
    }


    /**
     * 根据 identifyList 获取对应的 class diagram
     */
    @RequestMapping(value = "/github/diagram/files", method = RequestMethod.POST)
    public Response files(@RequestBody IdentifyList identifyList, @CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {
        Project pro = (Project) session.getAttribute("pro");

        Response res = checkProject(pro);
        if (res != null) {
            return res;
        }


        res = checkIsParsing(pro);
        if (res != null) {
            return res;
        }

        res = checkIsClonedAndParsed(pro);
        if (res != null) {
            return res;
        }


        ClassDiagramJob newJob2 = new ClassDiagramJob(template, pro, identifyList);
        jobNumber = jobNumber + 1;
        myJobList.add(newJob2);
        myExecutor.execute(newJob2);


        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
    }


    @RequestMapping(value = "/github/diagram/all", method = RequestMethod.POST)
    public Response github(@CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {

        Project pro = (Project) session.getAttribute("pro");
        Response res = checkProject(pro);
        if (res != null) {
            return res;
        }

        res = checkIsParsing(pro);
        if (res != null) {
            return res;
        }

        res = checkIsClonedAndParsed(pro);
        if (res != null) {
            return res;
        }


        ClassDiagramJob newJob2 = new ClassDiagramJob(template, pro);
        jobNumber = jobNumber + 1;
        myJobList.add(newJob2);
        myExecutor.execute(newJob2);


        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
    }

    @RequestMapping(value = "/github/fileTree", method = RequestMethod.POST)
    public Response fileTree(@CookieValue(value = "project", defaultValue = "") String project, HttpSession session) {
        Project pro = (Project) session.getAttribute("pro");
        Response res = checkProject(pro);
        if (res != null) {
            return res;
        }

        res = checkIsParsing(pro);
        if (res != null) {
            return res;
        }

        res = checkIsClonedAndParsed(pro);
        if (res != null) {
            return res;
        }


        FileTreeJob newJob2 = new FileTreeJob(template, pro);
        jobNumber = jobNumber + 1;
        myJobList.add(newJob2);
        myExecutor.execute(newJob2);

        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
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

    private Response checkProject(Project project) {
        if (project == null) {
            return new Response(Response.CODE_FAIL, "Need submit project url.");
        }
        return null;
    }

    private Response checkIsParsing(Project pro) {
        if (pro.getCloning()) {
            return new Response(Response.CODE_FAIL, "Is cloning please wait a moment.");
        }

        if (pro.getParsing()) {
            return new Response(Response.CODE_FAIL, "Is parsing please wait a moment.");
        }

        if (pro.getParsingFileTree()) {
            return new Response(Response.CODE_FAIL, "Is parsing file tree please wait a moment.");
        }

        if (pro.getParsingClassDiagram()) {
            return new Response(Response.CODE_FAIL, "Is parsing class diagram please wait a moment.");
        }
        return null;
    }

    private Response checkIsClonedAndParsed(Project pro) {
        if (!pro.getCloned()) {
            return new Response(Response.CODE_FAIL, "Repository was not cloned.");
        }

        if (!pro.getParsed()) {
            return new Response(Response.CODE_FAIL, "Repository was not parsed.");
        }
        return null;
    }
}
