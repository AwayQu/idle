package com.away1994.structure.lang.io.seriablize.serializer;

import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.SymbolImpl;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class SymbolDeserializer extends JsonDeserializer<Symbol> {
    @Override
    public Symbol deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        SymbolImpl symbol = new SymbolImpl();
        symbol.setCachedIdentify(value);
        return symbol;
    }
}
