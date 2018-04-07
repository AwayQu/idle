package com.away1994.structure.lang.symbols.impl;

import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.io.seriablize.FileDeserializer;
import com.away1994.structure.lang.io.seriablize.FileSerializer;
import com.away1994.structure.lang.io.seriablize.PathDeserializer;
import com.away1994.structure.lang.io.seriablize.PathSerializer;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.File;
import com.away1994.structure.lang.symbols.Path;
import com.away1994.structure.lang.symbols.Symbol;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.away1994.common.constants.CharacterConstants.LEFT_PARENTHESIS_CHAR;
import static com.away1994.common.constants.CharacterConstants.RIGHT_PARENTHESIS_CHAR;
import static com.away1994.common.constants.log.ErrorConstants.NULL_POINTER_NAME_ERROR;
import static com.away1994.common.constants.log.ErrorConstants.URL_ENCODE_PATH_ERROR;
import static com.away1994.tsp.constants.CommonConstants.LINE_SEPARATOR;

public class PathImpl extends SymbolImpl implements Path {
    private static final transient Logger LOGGER = Logger.getLogger(PathImpl.class.getName());

    public PathImpl() {
    }

    public PathImpl(String path) {
        this.setPath(path);
    }

    public PathImpl(String name, Symbol owner) {
        super(name, owner);
    }

    /**
     * name is path string
     */

    /**
     * files in path
     */
    @JsonSerialize(contentUsing = FileSerializer.class)
    @JsonDeserialize(contentUsing = FileDeserializer.class)
    public ArrayList<File> files = new ArrayList<>();

    @JsonSerialize(contentUsing = PathSerializer.class)
    @JsonDeserialize(contentUsing = PathDeserializer.class)
    public ArrayList<Path> paths = new ArrayList<>();


    public String getPath() {
        return this.getName();
    }

    public void setPath(String path) {
        this.setName(path);
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


    @Override
    public String absIdentify() {
        if (this.getName() == null) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(NULL_POINTER_NAME_ERROR, this));
        }
        try {
            return this.state().getDescription() + LEFT_PARENTHESIS_CHAR + URLEncoder.encode(this.getName(), "utf8") + RIGHT_PARENTHESIS_CHAR;
        } catch (UnsupportedEncodingException e) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(URL_ENCODE_PATH_ERROR, e));
        }
        return null;
    }


    public String description() {
        StringBuilder sb = new StringBuilder();


        sb.append("path:");
        sb.append(LINE_SEPARATOR);
        sb.append(this.getName());
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

}
