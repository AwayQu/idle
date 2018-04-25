package com.away1994.idlerest.classdiagram;

import com.away1994.idlerest.bean.IdentifyList;
import com.away1994.idlerest.bean.Response;
import com.away1994.idlerest.config.BaseConfiguration;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.aggregator.impl.AggregatorImpl;
import com.away1994.structure.lang.aggregator.impl.ClassDiagram;
import com.away1994.structure.lang.aggregator.impl.FileTree;
import com.away1994.structure.lang.aggregator.impl.SessionImpl;
import com.away1994.structure.utils.PathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class GithubProjectController {

    public static class Project {
        public String url;
    }

    @Autowired
    private BaseConfiguration configuration;

    /**
     * save user input project url
     *
     * @param proj
     * @param project
     * @param response
     * @return
     */
    @RequestMapping(value = "/github/project", method = RequestMethod.POST)
    public Response project(@RequestBody Project proj, @CookieValue(value = "project", defaultValue = "") String project,
                            HttpServletResponse response, HttpServletRequest request) {
        if (proj.url == null) {
            return new Response(Response.CODE_FAIL, Response.MSG_FAIL);
        }
        String projectURL = proj.url;
        response.addCookie(new Cookie("project", projectURL));

//        Parser parser = new Parser(new PathImpl(PathUtils.append(configuration.getProjectPath(), projectURL)),
//                new ObjectiveCLanguageParser());
//        parser.setOutputPath(PathUtils.append(configuration.getSymbolsPath(), projectURL));
//        parser.runParseStateMachine();

        return new Response(Response.CODE_SUCCESS, Response.MSG_SUCCESS);
    }

    @RequestMapping(value = "/github/diagram/files", method = RequestMethod.POST)
    public ClassDiagram files(@RequestBody IdentifyList identifyList, @CookieValue(value = "project", defaultValue = "") String project) {
        Session idleSession = new SessionImpl(PathUtils.append(configuration.getProjectPath(), project),
                PathUtils.append(configuration.getSymbolsPath(), project));

        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        ClassDiagram res = aggregator.getClassDiagram(identifyList.getIdentifies(), 2);
        return res;
    }


    @RequestMapping(value = "/github", method = RequestMethod.POST)
    public ClassDiagram github(@CookieValue(value = "project", defaultValue = "") String project) {

        Session idleSession = new SessionImpl(PathUtils.append(configuration.getProjectPath(), project),
                PathUtils.append(configuration.getSymbolsPath(), project));

        AggregatorImpl aggregator = new AggregatorImpl(idleSession);
        ClassDiagram res = aggregator.getClassDiagram(1);
        return res;
    }

    @RequestMapping(value = "/github/fileTree", method = RequestMethod.POST)
    public FileTree fileTree(@CookieValue(value = "project", defaultValue = "") String project) {

        Session idleSession = new SessionImpl(PathUtils.append(configuration.getProjectPath(), project),
                PathUtils.append(configuration.getSymbolsPath(), project));

        AggregatorImpl aggregator = new AggregatorImpl(idleSession);

        FileTree tree = aggregator.getFileTree();
        return tree;
    }
}
