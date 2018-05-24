/**
 * Created by away on 23/04/2017.
 */
package com.away1994.common.utils.log;


import com.away1994.common.utils.file.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public abstract class LogUtils {
    public static String buildLogString(String logMessage, Object args) {
        assert logMessage != null : "logMessage is null";

        assert args != null : "args is null";

        return buildLogString(logMessage, new String[]{args.toString()});
    }

    public static String buildLogString(String logMessage, Object[] args) {
        assert logMessage != null : "logMessage is null";

        String[] str = null;
        if(args != null) {
            str = new String[args.length];

            for(int i = 0; i < args.length; ++i) {
                str[i] = args[i].toString();
            }
        }

        return buildLogString(logMessage, str);
    }

    public static String buildLogString(String logMessage, String args) {
        assert logMessage != null : "logMessage is null";

        assert args != null : "args is null";

        return buildLogString(logMessage, new String[]{args});
    }

    public static String buildLogString(String logMessage, String[] args) {
        assert logMessage != null : "logMessage is null";

        String result = logMessage;
        int i;
        String tmp;
        if(args != null && args.length != 0) {
            i = 0;
            tmp = logMessage.replaceAll("\\{" + i + "\\" + "}", Matcher.quoteReplacement(args[i]));

            while(!tmp.equals(result)) {
                ++i;
                result = tmp;
                if(i >= args.length) {
                    tmp = tmp.replaceAll("\\{" + i + "\\" + "}", "");
                } else {
                    tmp = tmp.replaceAll("\\{" + i + "\\" + "}", Matcher.quoteReplacement(args[i]));
                }
            }
        } else {
            i = 0;

            for(tmp = logMessage.replaceAll("\\{" + i + "\\" + "}", ""); !tmp.equals(result); tmp = tmp.replaceAll("\\{" + i + "\\" + "}", "")) {
                ++i;
                result = tmp;
            }
        }

        return result;
    }

    public static void readLoggerConfigurationFromResourceFromClassClassLoader(String fullResourcePath, Class<?> clazz) throws IOException {
        readLoggerConfigurationFromResourceFromClassLoader(fullResourcePath, clazz.getClassLoader());
    }

    public static void readLoggerConfigurationFromResourceFromClassLoader(String fullResourcePath, ClassLoader classLoader) throws IOException {
        InputStream inputStream = null;

        try {
            inputStream = classLoader.getResourceAsStream(fullResourcePath);
            if(inputStream == null) {
                throw new IOException(buildLogString("[error-plantuml-dependency-common-004] : The logging file \"{0}\" can't be found", fullResourcePath));
            }

            readLoggerConfigurationFromResourceFromInputStream(inputStream);
        } finally {
            FileUtils.closeCloseable(inputStream, fullResourcePath);
        }

    }

    public static void readLoggerConfigurationFromResourceFromFile(File file) throws IOException {
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(file);
            readLoggerConfigurationFromResourceFromInputStream(inputStream);
        } finally {
            FileUtils.closeCloseable(inputStream, file);
        }

    }

    public static void readLoggerConfigurationFromResourceFromInputStream(InputStream inputStream) throws IOException {
        LogManager rootLogManager = LogManager.getLogManager();
        rootLogManager.readConfiguration(inputStream);
    }

    public static void setLevelOfAllHandlers(Level logLevel) {
        LogManager rootLogManager = LogManager.getLogManager();
        Enumeration loggerNames = rootLogManager.getLoggerNames();

        while(loggerNames.hasMoreElements()) {
            String loggerName = (String)loggerNames.nextElement();
            Logger logger = rootLogManager.getLogger(loggerName);
            setLevelOfAllHandlers(logLevel, logger.getHandlers());
        }

    }

    private static void setLevelOfAllHandlers(Level logLevel, Handler[] handlers) {
        Handler[] arr$ = handlers;
        int len$ = handlers.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            Handler handler = arr$[i$];
            handler.setLevel(logLevel);
        }

    }

    public static void setLevelOfAllLoggers(Level logLevel) {
        LogManager rootLogManager = LogManager.getLogManager();
        Enumeration loggerNames = rootLogManager.getLoggerNames();

        while(loggerNames.hasMoreElements()) {
            String loggerName = (String)loggerNames.nextElement();
            Logger logger = rootLogManager.getLogger(loggerName);
            logger.setLevel(logLevel);
        }

    }

    public static void setLevelOfAllLoggersAndHandlers(Level logLevel) {
        LogManager rootLogManager = LogManager.getLogManager();
        Enumeration loggerNames = rootLogManager.getLoggerNames();

        while(loggerNames.hasMoreElements()) {
            String loggerName = (String)loggerNames.nextElement();
            Logger logger = rootLogManager.getLogger(loggerName);
            logger.setLevel(logLevel);
            setLevelOfAllHandlers(logLevel, logger.getHandlers());
        }

    }

    private LogUtils() {
    }
}
