package com.away1994.objectivec.parser;

import com.away1994.lang.parser.Options;
import com.away1994.lang.parser.Parser;
import com.away1994.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.lang.symbols.impl.PathImpl;
import com.away1994.constants.TestConstants;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class ParserTest {

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
                ParserTest.class);

        ObjectiveCLanguageParser languageParser = new ObjectiveCLanguageParser();
        Options options = new Options();
        options.setVerbose(true);
        languageParser.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.IOS_HELLO_PROJECT_PATH),
                languageParser);


        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }

    @Test
    public void parserRAC() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ObjectiveCLanguageParser languageParser = new ObjectiveCLanguageParser();
        Options options = new Options();
        options.setVerbose(true);
        languageParser.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.ReactiveCocoa_PROJECT_PATH),
                languageParser);
        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }


    @Test
    public void parserAFNTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);
        ObjectiveCLanguageParser languageParser = new ObjectiveCLanguageParser();
        Options options = new Options();
        options.setVerbose(true);
        languageParser.setOptions(options);

        Parser parser = new Parser(new PathImpl(TestConstants.AFNetworking_PROJECT_PATH),
                languageParser);
        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }


}
