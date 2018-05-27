package com.away1994.lang.project;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.nio.cs.FastCharsetProvider;

public class Project {

    private String gitURL;

    private String projectName;

    private String symbolsPath;

    private String projectPath;

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getSymbolsPath() {
        return symbolsPath;
    }

    public void setSymbolsPath(String symbolsPath) {
        this.symbolsPath = symbolsPath;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Project(String gitURL) {
        this.gitURL = gitURL;
    }

    public String getGitURL() {
        return gitURL;
    }

    public void setGitURL(String gitURL) {
        this.gitURL = gitURL;
    }



    private Boolean isCloning = false;

    /**
     * is clone to local
     */
    private Boolean cloned = false;

    private Boolean isParsing = false;

    /**
     * is parsed
     */
    private Boolean parsed = false;


    private Boolean parsingFileTree = false;

    private Boolean parsingClassDiagram = false;


    public Boolean getCloned() {
        return cloned;
    }

    public void setCloned(Boolean cloned) {
        this.cloned = cloned;
    }

    public Boolean getParsed() {
        return parsed;
    }

    public void setParsed(Boolean parsed) {
        this.parsed = parsed;
    }

    public Boolean getCloning() {
        return isCloning;
    }

    public void setCloning(Boolean cloning) {
        isCloning = cloning;
    }

    public Boolean getParsing() {
        return isParsing;
    }

    public void setParsing(Boolean parsing) {
        isParsing = parsing;
    }

    public Boolean getParsingFileTree() {
        return parsingFileTree;
    }

    public void setParsingFileTree(Boolean parsingFileTree) {
        this.parsingFileTree = parsingFileTree;
    }

    public Boolean getParsingClassDiagram() {
        return parsingClassDiagram;
    }

    public void setParsingClassDiagram(Boolean parsingClassDiagram) {
        this.parsingClassDiagram = parsingClassDiagram;
    }
}
