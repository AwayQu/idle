package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.impl.InterfaceImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class InterfaceDeserializer extends JsonDeserializer<InterfaceImpl> {
    @Override
    public InterfaceImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        InterfaceImpl symbol = new InterfaceImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
