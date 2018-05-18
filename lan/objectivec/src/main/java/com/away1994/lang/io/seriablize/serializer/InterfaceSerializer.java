package com.away1994.lang.io.seriablize.serializer;

import com.away1994.lang.symbols.impl.InterfaceImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class InterfaceSerializer extends JsonSerializer<InterfaceImpl> {

    @Override
    public void serialize(InterfaceImpl anInterface, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(anInterface.identify());
    }
}
