package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.impl.EnumeratorImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class EnumeratorSerializer extends JsonSerializer<EnumeratorImpl> {
    @Override
    public void serialize(EnumeratorImpl enumerator, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        jsonGenerator.writeString(enumerator.identify());
    }
}
