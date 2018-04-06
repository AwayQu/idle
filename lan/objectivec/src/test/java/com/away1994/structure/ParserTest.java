package com.away1994.structure;

import com.away1994.structure.lang.parser.StateMachineParser;
import com.away1994.structure.lang.symbols.impl.PathBase;
import com.away1994.tsp.constants.TestConstants;
import org.junit.Test;

import static com.away1994.tsp.constants.TestConstants.TEST_RESOURCES_PATH;

public class ParserTest {

    @Test
    public void parserTest() throws Exception {

//        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.AFNetworking_PROJECT_PATH));
        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.IOS_HELLO_PROJECT_PATH));
        parser.setOutputPath(TEST_RESOURCES_PATH + "out/symbols");
        parser.runParseStateMachine();
    }
}
