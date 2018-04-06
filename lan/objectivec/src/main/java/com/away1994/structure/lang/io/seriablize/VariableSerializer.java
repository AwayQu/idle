package com.away1994.structure.lang.io.seriablize;

import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class VariableSerializer extends JsonSerializer<VariableImpl> {
    @Override
    public void serialize(VariableImpl variable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(variable.identify());
    }
}
