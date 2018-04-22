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
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
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


    @Override
    public ClassDiagram getClassDiagram(int depth) {
        /// TODO: Objective-C class info merge
        currentSession = session;

        Collection<ClassImpl> symbols = reader.getSymbols(Type.CLASS_STATE);


        awakeSymbols(depth, symbols);

        Collection<InterfaceImpl> iSymbols = reader.getSymbols(Type.INTERFACE_STATE);

        awakeSymbols(depth, iSymbols);


        ClassDiagram classDiagram = new ClassDiagram();

        //region generate all nodes and edges
        for (ClassImpl clazz : symbols) {
            ClassDiagram.ClassNode classNode = new ClassDiagram.ClassNode();

            classNode.setIdentify(clazz.identify());
            classNode.setClassName(clazz.getName());
            for (Variable variable : clazz.iVariables) {
                if (variable instanceof VariableImpl) {
                    String attribute = ((VariableImpl) variable).getName();
                    if (attribute != null)
                        classNode.getAttributes().add(attribute);
                }
            }

            for (Function function : clazz.iFunctions) {
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

            for (Interface interfaces : clazz.iInterfaces) {
                if (interfaces instanceof InterfaceImpl) {
                    ClassDiagram.RelationEdge relationEdge = new ClassDiagram.RelationEdge();
                    relationEdge.setFromClassName(clazz.getName());
                    relationEdge.setFromIdentify(clazz.identify());
                    relationEdge.setRelation(ClassDiagram.Relation.RELATION_GENERALIZATION.getRelation());
                    relationEdge.setToClassName(((InterfaceImpl) interfaces).getName());
                    relationEdge.setToIdentify(interfaces.identify());
                    classDiagram.getRelations().add(relationEdge);
                }
            }


        }
        //endregion

        for (InterfaceImpl interfaces : iSymbols) {
            ClassDiagram.ClassNode classNode = new ClassDiagram.ClassNode();

            classNode.setIdentify(interfaces.identify());
            classNode.setClassName(interfaces.getName());
            for (Variable variable : interfaces.iVariables) {
                if (variable instanceof VariableImpl) {
                    String attribute = ((VariableImpl) variable).getName();
                    if (attribute != null)
                        classNode.getAttributes().add(attribute);
                }
            }

            for (Function function : interfaces.iFunctions) {
                if (function instanceof FunctionImpl) {
                    String method = ((FunctionImpl) function).getName();
                    if (method != null)
                        classNode.getMethods().add(method);
                }
            }

            classDiagram.getClasses().add(classNode);


            for (Interface interfaces1 : interfaces.extendInterfaces) {
                if (interfaces1 instanceof InterfaceImpl) {
                    ClassDiagram.RelationEdge relationEdge = new ClassDiagram.RelationEdge();
                    relationEdge.setFromClassName(((InterfaceImpl) interfaces1).getName());
                    relationEdge.setFromIdentify(interfaces1.identify());
                    relationEdge.setRelation(ClassDiagram.Relation.RELATION_GENERALIZATION.getRelation());
                    relationEdge.setToClassName(((InterfaceImpl) interfaces).getName());
                    relationEdge.setToIdentify(interfaces.identify());
                    classDiagram.getRelations().add(relationEdge);
                }
            }
        }

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
        return classDiagram;

    }

    @Override
    public FileTree getFileTree() {
        int depth = 1;
        Collection<FileImpl> symbols = reader.getSymbols(Type.FILE_STATE);

        awakeSymbols(depth, symbols);

        Collection<PathImpl> iSymbols = reader.getSymbols(Type.PATH_STATE);

        awakeSymbols(depth, iSymbols);

        FileTree fileTree = new FileTree();
        for (FileImpl f : symbols) {
            FileTree.FD fd = new FileTree.FD();
            fd.setIdentify(f.identify());
            fd.setName(f.getName());
            fd.setType(FileTree.Type.FILE_TYPE.getType());
            if (f.getOwner() != null) {
                fd.setParent(f.getOwner().identify());
            }
            fileTree.getFds().add(fd);
        }

        for (PathImpl p : iSymbols) {
            FileTree.FD fd = new FileTree.FD();
            fd.setIdentify(p.identify());
            fd.setName(com.away1994.structure.lang.PathUtils.getFileName(p.getName()));
            fd.setType(FileTree.Type.FOLDER_TYPE.getType());
            if (p.getOwner() != null) {
                fd.setParent(p.getOwner().identify());
            }
            fileTree.getFds().add(fd);
        }


        return fileTree;

    }

    private <T extends Symbol> void awakeSymbols(int depth, Collection<T> symbols) {
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
