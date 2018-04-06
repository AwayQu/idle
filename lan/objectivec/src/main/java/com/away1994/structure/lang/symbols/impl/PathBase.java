package com.away1994.structure.lang.symbols.impl;

import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Path;
import com.away1994.structure.lang.symbols.Symbol;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class PathBase implements Path {

    /**
     * path string
     */
    private String path;

    /**
     * owner of path
     */
    private Symbol owner;

    /**
     * files in path
     */
    public ArrayList<File> files = new ArrayList<>();

    public ArrayList<Path> paths = new ArrayList<>();


    public PathBase(String path) {
        this.path = path;
    }

    public PathBase(Symbol owner, String path) {
        this.owner = owner;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public ArrayList<Path> getPaths() {
        return paths;
    }

    public void setPaths(ArrayList<Path> paths) {
        this.paths = paths;
    }

    public String identify() {

        try {


            return "PATH(" + URLEncoder.encode(this.path, "utf8") + ")";
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";

    }

    public String description() {
        StringBuilder sb = new StringBuilder();


        sb.append("path:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.path);
        sb.append(LINE_SEPARATOR);

        if (this.owner != null) {

            sb.append("owner:");
            sb.append(LINE_SEPARATOR);
            sb.append(this.owner.identify());
            sb.append(LINE_SEPARATOR);
        }

        return sb.toString();
    }

    @Override
    public State state() {
        return State.PATH_STATE;
    }

    public ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }

}
