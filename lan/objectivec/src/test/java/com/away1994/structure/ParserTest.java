package com.away1994.structure;

import com.away1994.structure.lang.parser.StateMachineParser;
import com.away1994.structure.lang.parser.impl.ObjectiveCLanguageParser;
import com.away1994.structure.lang.symbols.impl.PathBase;
import com.away1994.tsp.constants.TestConstants;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.tsp.constants.TestConstants.TEST_RESOURCES_PATH;

public class ParserTest {

    @Before
    public void clearFile() {
        File file = new File(TEST_RESOURCES_PATH + "out/symbols");
        File[] files = file.listFiles();
        if (files != null) {
            for (File f: files) {
                f.delete();
            }
        }

    }

    @Test
    public void parserTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);
//        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.AFNetworking_PROJECT_PATH));
        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.IOS_HELLO_PROJECT_PATH),
                new ObjectiveCLanguageParser());
        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }
}
