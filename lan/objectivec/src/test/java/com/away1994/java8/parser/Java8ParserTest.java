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
    public void parserTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                Java8ParserTest.class);

        JavaLanguageParser lan = new JavaLanguageParser();
        Options options = new Options();
        options.getIgnoreFiles().add("../objectivec/idle.log");
        options.getIgnorePaths().add("../out");
        options.getIgnorePaths().add("../objectivec/src/test/java/resources");
        options.getIgnorePaths().add("../idlerest/target");
        options.getIgnorePaths().add("../objectivec/target");
        options.getIgnorePaths().add("../idlecommand/target");

        lan.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.IDLE_LAN_PROJECT_PATH),
                lan);

        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }
}
