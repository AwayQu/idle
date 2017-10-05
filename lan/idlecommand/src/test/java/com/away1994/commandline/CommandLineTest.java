package com.away1994.commandline;

import com.away1994.constant.TestConstants;
import io.airlift.airline.ParseArgumentsUnexpectedException;
import org.junit.Test;

public class CommandLineTest {

    @Test
    public void commandLineTest() throws Exception {


        IDLE.main(new String[]{"analyze", "-p",
                TestConstants.AFNetworking_PROJECT_PATH,
                "-o",
                TestConstants.TEST_RESOURCES_PATH + "ReactiveCocoa.puml"});
    }


    @Test(expected = ParseArgumentsUnexpectedException.class)
    public void commandLineTest1() throws Exception {


        IDLE.main(new String[]{"analyze", "-p",
                "-o",
                TestConstants.TEST_RESOURCES_PATH + "ReactiveCocoa.puml"});
    }


    @Test
    public void commandLineTest2() throws Exception {
        IDLE.main(new String[]{"analyze", "-p",
                TestConstants.AFNetworking_PROJECT_PATH});
    }


    @Test
    public void commandLineTest3() throws Exception {
        IDLE.main(new String[]{"analyze", "-p",
                "no-exist"});
    }

}
