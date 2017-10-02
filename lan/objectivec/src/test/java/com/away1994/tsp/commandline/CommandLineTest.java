package com.away1994.tsp.commandline;

import com.away1994.tsp.constants.TestConstants;
import org.junit.Test;

import static com.away1994.tsp.constants.TestConstants.TEST_RESOURCES_PATH;

public class CommandLineTest {

    @Test
    public void commandLineTest() throws Exception {


        IDLE.main(new String[]{"analyze", "-p",
                TestConstants.ReactiveCocoa_PROJECT_PATH,
                "-o",
                TEST_RESOURCES_PATH + "out/plantuml/ReactiveCocoaProjectTest3.puml"});
    }
}
