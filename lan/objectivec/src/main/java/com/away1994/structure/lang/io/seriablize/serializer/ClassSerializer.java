package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.impl.ClassImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ClassSerializer extends JsonSerializer<ClassImpl> {
    @Override
    public void serialize(ClassImpl aClass, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        jsonGenerator.writeString(aClass.identify());
    }
}
