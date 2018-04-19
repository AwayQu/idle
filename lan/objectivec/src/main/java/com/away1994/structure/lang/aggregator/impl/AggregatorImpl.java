package com.away1994.structure.lang.aggregator.impl;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.aggregator.Aggregator;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.io.read.ReaderImpl;
import com.away1994.structure.lang.io.seriablize.views.Views;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.ClassImpl;
import com.away1994.structure.lang.symbols.impl.FunctionImpl;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.away1994.structure.utils.IdentifyUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
            @Override
            protected <A extends Annotation> A _findAnnotation(Annotated annotated, Class<A> annoClass) {
                if (!annotated.hasAnnotation(JsonSerialize.class)) {
                    return super._findAnnotation(annotated, annoClass);
                } else {
                    return null;
                }
            }
        });

    }


    public String getClassDiagram(int depth) {
        /// TODO: Objective-C class info merge
        currentSession = session;

        Collection<ClassImpl> symbols = reader.getSymbols(Type.CLASS_STATE);

        ArrayList<Symbol> toAwakeSymbols = new ArrayList<>();
        toAwakeSymbols.addAll(symbols);

        while ((depth >= 0 || depth == -1000) && toAwakeSymbols.size() > 0) {
            ArrayList<Symbol> t = new ArrayList<>();
            for (Symbol s : toAwakeSymbols) {
                reader.getSymbol(s);
                t.addAll(s.allSymbols());
            }
            depth--;
            toAwakeSymbols = t;
        }

        ClassDiagram classDiagram = new ClassDiagram();

        //region generate all nodes and edges
        for (ClassImpl clazz : symbols) {
            ClassDiagram.ClassNode classNode = new ClassDiagram.ClassNode();

            classNode.setIdentify(clazz.identify());
            classNode.setClassName(clazz.getName());
            for (Variable variable: clazz.iVariables) {
                if (variable instanceof VariableImpl) {
                    String attribute  = ((VariableImpl) variable).getName();
                    if (attribute != null)
                        classNode.getAttributes().add(attribute);
                }
            }

            for (Function function: clazz.iFunctions) {
                if (function instanceof FunctionImpl) {
                    String method = ((FunctionImpl) function).getName();
                    if (method != null)
                        classNode.getMethods().add(method);
                }
            }

            classDiagram.getClasses().add(classNode);

            for (com.away1994.structure.lang.symbols.Class superClazz : clazz.superCls) {
                if (superClazz instanceof ClassImpl) {
                    ClassDiagram.RelationEdge relationEdge = new ClassDiagram.RelationEdge();
                    relationEdge.setFromClassName(clazz.getName());
                    relationEdge.setFromIdentify(clazz.identify());
                    relationEdge.setToClassName(((ClassImpl) superClazz).getName());
                    relationEdge.setToIdentify(superClazz.identify());
                    relationEdge.setRelation(ClassDiagram.Relation.RELATION_REALIZATION.getRelation());
                    classDiagram.getRelations().add(relationEdge);
                }
            }

            // TODO Interface

        }
        //endregion

        //region check no exist node
        HashMap<String, ClassDiagram.ClassNode> map = new HashMap();
        for (ClassDiagram.ClassNode node : classDiagram.getClasses()) {
            map.put(node.getIdentify(), node);
        }

        for (ClassDiagram.RelationEdge relationEdge : classDiagram.relations) {
            if (map.get(relationEdge.getFromIdentify()) == null) {
                String symbolName = IdentifyUtils.getSymbolName(relationEdge.getFromIdentify());
                if (fixNodeData(classDiagram, map, symbolName)) {
                    relationEdge.setFromIdentify(symbolName);
                    relationEdge.setFromClassName(symbolName);
                }
            }

            if (map.get(relationEdge.getToIdentify()) == null) {
                String symbolName = IdentifyUtils.getSymbolName(relationEdge.getToIdentify());
                if (fixNodeData(classDiagram, map, symbolName)) {
                    relationEdge.setToIdentify(symbolName);
                    relationEdge.setToClassName(symbolName);
                }
            }
         }
        //endregion



        String value = null;
        try {
            value = this.objectMapper.writeValueAsString(classDiagram);
        } catch (JsonProcessingException e) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(ErrorConstants.WRITE_JSON_ERROR, e));
            e.printStackTrace();
        }
        return value;

    }

    private Boolean fixNodeData(ClassDiagram classDiagram, HashMap<String, ClassDiagram.ClassNode> map, String symbolName) {
        ClassDiagram.ClassNode node = map.get(symbolName);
        if (node == null) {
            node = new ClassDiagram.ClassNode();
            node.setClassName(symbolName);
            node.setIdentify(symbolName);
        }
        map.put(symbolName, node);
        classDiagram.getClasses().add(node);
        return true;

    }

    @Override
    public String getClassDependencyInfo(String className, int depth) {
        currentSession = session;
        Collection<ClassImpl> symbols = reader.getSymbols(className, Type.CLASS_STATE);

        ArrayList<Symbol> toAwakeSymbols = new ArrayList<>();
        toAwakeSymbols.addAll(symbols);

        while (depth >= 0 && toAwakeSymbols.size() > 0) {
            ArrayList<Symbol> t = new ArrayList<>();
            for (Symbol s : toAwakeSymbols) {
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
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(ErrorConstants.WRITE_JSON_ERROR, e));
            e.printStackTrace();
        }
        return value;
    }
}
