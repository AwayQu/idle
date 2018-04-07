package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class VariableDeserializer extends JsonDeserializer<VariableImpl> {
    @Override
    public VariableImpl deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        VariableImpl symbol = new VariableImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
