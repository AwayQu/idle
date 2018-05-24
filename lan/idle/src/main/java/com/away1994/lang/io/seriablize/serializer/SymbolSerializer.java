package com.away1994.lang.io.seriablize.serializer;

import com.away1994.lang.symbols.Symbol;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class SymbolSerializer extends JsonSerializer<Symbol> {
    @Override
    public void serialize(Symbol symbol, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeString(symbol.identify());
    }
}
