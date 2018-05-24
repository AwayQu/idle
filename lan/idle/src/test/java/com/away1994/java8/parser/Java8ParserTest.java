package com.away1994.java8.parser;

import com.away1994.constants.TestConstants;
import com.away1994.lang.parser.Options;
import com.away1994.lang.parser.Parser;
import com.away1994.lang.parser.impl.java.JavaLanguageParser;
import com.away1994.lang.symbols.impl.PathImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class Java8ParserTest {

    @Before
    public void clearFile() {
        File file = new File(TEST_RESOURCES_PATH + "out/symbols");
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                f.delete();
            }
        }

    }

    @Test
    public void parseObjectiveCModuleTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                Java8ParserTest.class);

        JavaLanguageParser lan = new JavaLanguageParser();
        Options options = new Options();
        options.getIgnoreFiles().add("./idle.log");
        options.getIgnorePaths().add("./src/test/java/com/away1994/resources");
        options.getIgnorePaths().add("./src/main/java/com/away1994/gen/java8");
        options.getIgnorePaths().add("./src/main/java/com/away1994/gen/javascript");
        options.getIgnorePaths().add("./src/main/java/com/away1994/gen/objectivec");
        options.getIgnorePaths().add("./src/main/java/com/away1994/gen/python3");
        options.getIgnorePaths().add("./src/main/java/com/away1994/gen/swift3");
        options.getIgnorePaths().add("./target");

        options.setVerbose(true);

        lan.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.IDLE_OBJECTIVE_C_MODULE_PROJECT_PATH),
                lan);

        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }

    @Test
    public void parseLanModuleTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                Java8ParserTest.class);

        JavaLanguageParser lan = new JavaLanguageParser();
        Options options = new Options();
        options.getIgnoreFiles().add("../idle/idle.log");
        options.getIgnorePaths().add("../out");
        options.getIgnorePaths().add("../idle/src/test/java/resources");
        options.getIgnorePaths().add("../idlerest/target");
        options.getIgnorePaths().add("../idle/target");
        options.getIgnorePaths().add("../idlecommand/target");
        options.getIgnorePaths().add("../idle/src/main/java/com/away1994/gen/");

        options.setVerbose(true);

        lan.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.IDLE_LAN_PROJECT_PATH),
                lan);

        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }
}
