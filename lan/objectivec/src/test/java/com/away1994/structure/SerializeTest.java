package com.away1994.structure;

import com.away1994.structure.lang.io.seriablize.views.Views;
import com.away1994.structure.lang.symbols.impl.ClassImpl;
import com.away1994.structure.lang.symbols.impl.FileImpl;
import com.away1994.structure.lang.symbols.impl.FunctionImpl;
import com.away1994.structure.lang.symbols.impl.InterfaceImpl;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
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

        ClassImpl clazz = new ClassImpl("ClassName", new FileImpl("fileName", null));


        clazz.iInterfaces.add(new InterfaceImpl("InterfaceName", null));

        clazz.superCls.add(new ClassImpl("SuperClassName", null));

        clazz.iVariables.add(new VariableImpl("VariableName", null));

        clazz.sVariables.add(new VariableImpl("VariableName1", null));

        clazz.iFunctions.add(new FunctionImpl("methodSignature", null));

        clazz.sFunctions.add(new FunctionImpl("methodSignature1", null));

        String string = new ObjectMapper().writeValueAsString(clazz);

        LOGGER.log(Level.SEVERE, string);
    }

    @Test
    public void classSerializerFilterTest() throws Exception {
        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("ClassName", new FileImpl("fileName", null));


        clazz.iInterfaces.add(new InterfaceImpl("InterfaceName", null));

        clazz.superCls.add(new ClassImpl("SuperClassName", null));

        clazz.iVariables.add(new VariableImpl("VariableName", null));

        clazz.sVariables.add(new VariableImpl("VariableName1", null));

        clazz.iFunctions.add(new FunctionImpl("methodSignature", null));

        clazz.sFunctions.add(new FunctionImpl("methodSignature1", null));

        String string = new ObjectMapper().writerWithView(Views.WebViewPublic.class).writeValueAsString(clazz);

        String value = new ObjectMapper().disable(MapperFeature.USE_ANNOTATIONS).writerWithView(Views.WebViewPublic.class).writeValueAsString(clazz);


        LOGGER.log(Level.SEVERE, string);
    }


    @Test
    public void classDeserializerTest() throws Exception {

        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        readLoggerConfigurationFromResourceFromClassClassLoader(LOGGING_PROPERTIES_PATH,
                ParserTest.class);

        ClassImpl clazz = new ClassImpl("ClassName", new FileImpl("fileName", null));


        clazz.iInterfaces.add(new InterfaceImpl("InterfaceName", null));

        clazz.superCls.add(new ClassImpl("SuperClassName", null));

        clazz.iVariables.add(new VariableImpl("VariableName", null));

        clazz.sVariables.add(new VariableImpl("VariableName1", null));

        clazz.iFunctions.add(new FunctionImpl("methodSignature", null));

        clazz.sFunctions.add(new FunctionImpl("methodSignature1", null));

        String string = new ObjectMapper().writeValueAsString(clazz);

        Object val = new ObjectMapper().reader(ClassImpl.class).readValue(string);

        String string1 = new ObjectMapper().writeValueAsString(clazz);

        Assert.assertEquals(string, string1);

        LOGGER.log(Level.SEVERE, string);
        LOGGER.log(Level.SEVERE, string1);
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
