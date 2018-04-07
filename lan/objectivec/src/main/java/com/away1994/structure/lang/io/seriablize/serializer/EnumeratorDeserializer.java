package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.impl.EnumeratorImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class EnumeratorDeserializer extends JsonDeserializer<EnumeratorImpl> {
    @Override
    public EnumeratorImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();

        EnumeratorImpl symbol = new EnumeratorImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
