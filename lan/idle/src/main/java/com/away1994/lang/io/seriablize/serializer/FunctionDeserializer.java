package com.away1994.lang.io.seriablize.serializer;

import com.away1994.lang.symbols.impl.FunctionImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class FunctionDeserializer extends JsonDeserializer<FunctionImpl> {
    @Override
    public FunctionImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        FunctionImpl symbol = new FunctionImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
