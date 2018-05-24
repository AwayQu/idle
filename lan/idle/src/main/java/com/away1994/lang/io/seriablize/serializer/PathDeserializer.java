package com.away1994.lang.io.seriablize.serializer;

import com.away1994.lang.symbols.impl.PathImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class PathDeserializer extends JsonDeserializer<PathImpl> {
    @Override
    public PathImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        PathImpl symbol = new PathImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
