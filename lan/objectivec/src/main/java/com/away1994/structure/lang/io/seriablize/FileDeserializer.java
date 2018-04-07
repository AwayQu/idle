package com.away1994.structure.lang.io.seriablize;

import com.away1994.structure.lang.symbols.impl.FileImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class FileDeserializer extends JsonDeserializer<FileImpl> {
    @Override
    public FileImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        FileImpl symbol = new FileImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
