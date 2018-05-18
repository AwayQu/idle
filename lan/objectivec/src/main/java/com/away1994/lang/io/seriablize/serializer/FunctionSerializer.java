package com.away1994.lang.io.seriablize.serializer;

import com.away1994.lang.symbols.impl.FunctionImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class FunctionSerializer extends JsonSerializer<FunctionImpl> {
    @Override
    public void serialize(FunctionImpl function, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        jsonGenerator.writeString(function.identify());
    }
}
