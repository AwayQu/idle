package com.away1994.structure;

import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.aggregator.impl.AggregatorImpl;
import com.away1994.structure.lang.aggregator.impl.SessionImpl;
import com.away1994.structure.lang.parser.Parser;
import com.away1994.structure.lang.parser.impl.ObjectiveCLanguageParser;
import com.away1994.structure.lang.symbols.impl.PathImpl;
import com.away1994.tsp.constants.TestConstants;
import org.junit.Before;
import org.junit.Test;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.tsp.constants.TestConstants.TEST_RESOURCES_PATH;

public class ReadTest {

    @Before
    public void parseFiles() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ReadTest.class);

        Parser parser = new Parser(new PathImpl(TestConstants.IOS_HELLO_PROJECT_PATH),
                new ObjectiveCLanguageParser());
        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }

//    @After
//    public void clearFile() {
//        File file = new File(TEST_RESOURCES_PATH + "out/symbols");
//        File[] files = file.listFiles();
//        if (files != null) {
//            for (File f: files) {
//                f.delete();
//            }
//        }
//
//    }

    @Test
    public void findClassTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ReadTest.class);
        Session session = new SessionImpl(null, TEST_RESOURCES_PATH + "out/symbols");

        AggregatorImpl aggregator = new AggregatorImpl(session);
        aggregator.getClassDependencyInfo("Hello", 0);

    }
}
