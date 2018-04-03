package com.away1994.structure;

import com.away1994.structure.lang.parser.StateMachineParser;
import com.away1994.structure.lang.symbols.impl.PathBase;
import com.away1994.tsp.constants.TestConstants;
import org.junit.Test;

public class ParserTest {

    @Test
    public void parserTest() throws Exception {

//        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.AFNetworking_PROJECT_PATH));
        StateMachineParser parser = new StateMachineParser(new PathBase(TestConstants.IOS_HELLO_PROJECT_PATH));

        parser.runParseStateMachine();
    }
}
