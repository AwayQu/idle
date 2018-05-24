package com.away1994.lang.parser.impl;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.FineConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.lang.parser.LanguageParser;
import com.away1994.lang.parser.Options;
import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.FileImpl;
import com.away1994.lang.symbols.impl.PathImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Logger;

import static java.util.logging.Level.FINE;
import static java.util.logging.Level.SEVERE;

public abstract class LanguageParserImpl implements LanguageParser {

    private static final transient Logger LOGGER = Logger.getLogger(LanguageParserImpl.class.getName());

    private Options options;

    public Options getOptions() {
        return options;
    }

    public void setOptions(Options options) {
        this.options = options;
    }

    @Override
    public Options options() {
        return this.getOptions();
    }

    /**
     * TODO: 添加更复杂的过滤支持
     */
    @Override
    public ArrayList<Symbol> parsePath(PathImpl path) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        File dir = new File(path.getPath());

        assert dir.isDirectory();

        File[] fds = dir.listFiles();
        if (fds != null) {
            ArrayList<FileImpl> files = new ArrayList<>();
            ArrayList<PathImpl> paths = new ArrayList<>();
            for (File f : fds) {
                if (f.isFile()) {
                    if (this.getOptions() != null && this.getOptions().getIgnoreFiles().contains(f.getPath())) {
                        LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.PARSE_IGNORE_FILE_FINE, f.getPath()));
                        continue;
                    }
                    files.add(new FileImpl(f.getName(), path));
                } else if (f.isDirectory()) {
                    if (this.getOptions() != null && this.getOptions().getIgnorePaths().contains(f.getPath())) {
                        LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.PARSE_IGNORE_DIRECTORY_FINE, f.getPath()));
                        continue;
                    }
                    LOGGER.log(FINE, LogUtils.buildLogString(FineConstants.PARSE_DIRECTORY_FINE, f));
                    paths.add(new PathImpl(f.getPath(), path));
                } else {
                    LOGGER.log(SEVERE, LogUtils.buildLogString(ErrorConstants.UNKNOWN_FILE_TYPE_ERROR, f));
                }
            }
            path.getFiles().addAll(files);
            path.getPaths().addAll(paths);

            symbols.addAll(files);
            symbols.addAll(paths);
        } else {
            LOGGER.log(FINE, FineConstants.EMPTY_DIRECTORY_FINE);
        }
        return symbols;
    }
}
