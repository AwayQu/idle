package com.away1994.structure.lang.aggregator.impl;

import com.away1994.structure.lang.aggregator.Aggregator;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.io.read.ReaderImpl;
import com.away1994.structure.lang.io.seriablize.views.Views;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.ClassImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AggregatorImpl implements Aggregator {

    private static final transient Logger LOGGER = Logger.getLogger(AggregatorImpl.class.getName());
    private Session session = null;
    private Reader reader = null;
    private ObjectMapper objectMapper = new ObjectMapper();

    public static Session currentSession;

    public AggregatorImpl(Session session) {
        this.session = session;
        this.reader = new ReaderImpl(session);

        this.objectMapper.setAnnotationIntrospector(new JacksonAnnotationIntrospector() {
//            @Override
//            protected TypeResolverBuilder<?> _findTypeResolver(
//                    MapperConfig<?> config, Annotated ann, JavaType baseType) {
//                if (!ann.hasAnnotation(JsonSerialize.class)) {
//                    return super._findTypeResolver(config, ann, baseType);
//                }
//                return null;
//            }

//            @Override
//            public Object findSerializationContentConverter(AnnotatedMember a) {
//                if (!a.hasAnnotation(JsonSerialize.class)) {
//                    return super.findSerializationContentConverter(a);
//                } else {
//                    return null;
//                }
//            }

            @Override
            protected <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> annoClass) {
                if (!annotated.hasAnnotation(JsonSerialize.class)) {
                    return super._findAnnotation(annotated, annoClass);
                } else {
                    return null;
                }
            }

//            @Override
//            public Object findSerializer(Annotated a) {
//                if (!a.hasAnnotation(JsonSerialize.class)) {
//                    return super.findSerializer(a);
//                } else {
//                    return null;
//                }
//            }
        });

    }

    @Override
    public String getClassDependencyInfo(String className, int depth) {
        currentSession = session;
        Collection<ClassImpl> symbols = reader.getSymbols(className, State.CLASS_STATE);

        ArrayList<Symbol> toAwakeSymbols = new ArrayList<>();
        toAwakeSymbols.addAll(symbols);

            while (depth >= 0 && toAwakeSymbols.size() > 0) {
                ArrayList<Symbol> t = new ArrayList<>();
                for (Symbol s : toAwakeSymbols){
                    reader.getSymbol(s);
                    t.addAll(s.allSymbols());
                }
                depth--;
                toAwakeSymbols = t;
            }

        String value = null;
        try {
            value = this.objectMapper.writerWithView(Views.WebViewPublic.class).writeValueAsString(symbols);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        LOGGER.log(Level.INFO, "find symbol" + value);
        return value;
    }
}
