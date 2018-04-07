package com.away1994.structure.lang.io.seriablize;

import com.away1994.structure.lang.aggregator.impl.AggregatorImpl;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Symbol;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class AwakeSymbolDeserializer extends JsonDeserializer<Symbol> {
    @Override
    public Symbol deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();


        return new ObjectMapper().reader(State.getState(value).getClazz()).readValue(new File(AggregatorImpl.currentSession.symbolsPath() + "/" + value + ".json"));
    }
}
