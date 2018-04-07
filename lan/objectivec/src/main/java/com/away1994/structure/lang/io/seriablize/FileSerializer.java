package com.away1994.structure.lang.io.seriablize;

import com.away1994.structure.lang.symbols.impl.FileImpl;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class FileSerializer extends JsonSerializer<FileImpl> {
    @Override
    public void serialize(FileImpl file, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(file.identify());
    }
}
