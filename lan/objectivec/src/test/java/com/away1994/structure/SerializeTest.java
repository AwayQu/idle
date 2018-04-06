package com.away1994.structure;

import com.away1994.structure.lang.symbols.impl.ClassImpl;
import com.away1994.structure.lang.symbols.impl.FunctionImpl;
import com.away1994.structure.lang.symbols.impl.InterfaceImpl;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.away1994.common.constants.CommonConstants.LOGGING_PROPERTIES_PATH;
import static com.away1994.common.utils.log.LogUtils.readLoggerConfigurationFromResourceFromClassClassLoader;

public class SerializeTest {

    private static final transient Logger LOGGER = Logger.getLogger(SerializeTest.class.getName());

    @Test
    public void functionSerializerTest() throws Exception {


    }


    @Test
    public void functionDeserializerTest() throws Exception {


    }


    @Test
    public void classSerializerTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("ClassName", null);


        clazz.iInterfaces.add(new InterfaceImpl("InterfaceName", null));

        clazz.superCls.add(new ClassImpl("SuperClassName", null));

        clazz.iVariables.add(new VariableImpl(null, "VariableName"));

        clazz.sVariables.add(new VariableImpl(null, "VariableName1"));

        clazz.iFunctions.add(new FunctionImpl(null, "methodSignature"));

        clazz.sFunctions.add(new FunctionImpl(null, "methodSignature1"));

        String string = new ObjectMapper().writeValueAsString(clazz);

        LOGGER.log(Level.SEVERE, string);
    }


    @Test
    public void classDeserializerTest() throws Exception {

        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("", null);

        clazz.iInterfaces.add(new InterfaceImpl("1111", null));

        Object string = new ObjectMapper().reader(ClassImpl.class).readValue("{\"iInterfaces\": [\"1\"]}");

        System.out.print(string);
    }

    @Test
    public void variableSerializerTest() throws Exception {


    }

    @Test
    public void variableDeserializerTest() throws Exception {


    }

    @Test
    public void interfaceSerializerTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("", null);

        clazz.iInterfaces.add(new InterfaceImpl("1111", null));

        String string = new ObjectMapper().writeValueAsString(clazz);


    }

    @Test
    public void interfaceDeserializerTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("", null);

        clazz.iInterfaces.add(new InterfaceImpl("1111", null));

        Object string = new ObjectMapper().reader(ClassImpl.class).readValue("{\"iInterfaces\": [\"1\"]}");

        System.out.print(string);
    }
}
