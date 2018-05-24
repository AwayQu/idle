package com.away1994.objectivec.parser;

import com.away1994.constants.TestConstants;
import com.away1994.lang.aggregator.Session;
import com.away1994.lang.aggregator.impl.AggregatorImpl;
import com.away1994.lang.aggregator.impl.ClassDiagram;
import com.away1994.lang.aggregator.impl.FileTree;
import com.away1994.lang.aggregator.impl.SessionImpl;
import com.away1994.lang.parser.Parser;
import com.away1994.lang.parser.impl.objectivec.ObjectiveCLanguageParser;
import com.away1994.lang.symbols.impl.PathImpl;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;
import static com.away1994.constants.TestConstants.TEST_OUT_SYMBOL_PATH;
import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class ReadTest {
    private static final transient Logger LOGGER = Logger.getLogger(ReadTest.class.getName());

    @Before
    public void parseFiles() throws Exception {
            File file = new File(TEST_OUT_SYMBOL_PATH);
            if (!file.exists()) {
                file.mkdirs();
            }
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
    public void findAllClassTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ReadTest.class);

        Session session = new SessionImpl(null, TEST_RESOURCES_PATH + "out/symbols");

        AggregatorImpl aggregator = new AggregatorImpl(session);
        ClassDiagram classDiagram = aggregator.getClassDiagram(1);

        LOGGER.log(Level.SEVERE, "" + classDiagram);
    }


    @Test
    public void readFileTree() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ReadTest.class);

        Session session = new SessionImpl(null, TEST_RESOURCES_PATH + "out/symbols");

        AggregatorImpl aggregator = new AggregatorImpl(session);
        FileTree fileTree = aggregator.getFileTree();

        LOGGER.log(Level.SEVERE, "" + fileTree);
    }

}
