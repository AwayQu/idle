package com.away1994.structure.lang.aggregator.impl;

import com.away1994.common.constants.log.ErrorConstants;
import com.away1994.common.constants.log.InfoConstants;
import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.aggregator.Aggregator;
import com.away1994.structure.lang.aggregator.Session;
import com.away1994.structure.lang.io.Reader;
import com.away1994.structure.lang.io.read.ReaderImpl;
import com.away1994.structure.lang.parser.Type;
import com.away1994.structure.lang.symbols.Function;
import com.away1994.structure.lang.symbols.Interface;
import com.away1994.structure.lang.symbols.Symbol;
import com.away1994.structure.lang.symbols.impl.*;
import com.away1994.structure.lang.symbols.impl.variable.VariableImpl;
import com.away1994.structure.lang.symbols.variable.Variable;
import com.away1994.structure.utils.IdentifyUtils;
import com.away1994.structure.utils.PathUtils;
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


    /**
     * 1.聚合同一个类 散落在各个文件中的实现 （生产真正的类节点）
     * 2.区分相对引用 和 绝对引用 通过相对引用找到聚合的类 （awake所有的identify）
     * 3.将awake之后的所有节点，转化为node 和 edge
     *
     * @param depth
     * @return
     */
    @Override
    public ClassDiagram getClassDiagram(int depth) {
        /// TODO: Objective-C class info merge
        currentSession = session;

        Collection<ClassImpl> symbols = reader.getSymbols(Type.CLASS_STATE);

        awakeSymbols(depth, symbols);

        Collection<InterfaceImpl> iSymbols = reader.getSymbols(Type.INTERFACE_STATE);

        awakeSymbols(depth, iSymbols);

        Collection<EnumeratorImpl> eSymbols = reader.getSymbols(Type.ENUM_STATE);

        awakeSymbols(depth, eSymbols);

        ArrayList<Symbol> symbols1 = new ArrayList<>();
        symbols1.addAll(symbols);
        symbols1.addAll(iSymbols);
        symbols1.addAll(eSymbols);

        Collection<Symbol> mergedSymbols = mergeSymbols(symbols1);

        ClassDiagram classDiagram = getClassDiagram(mergedSymbols, null);


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
    public ClassDiagram getClassDiagram(ArrayList<String> identifyList, int depth) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        for (String id : identifyList) {
            Symbol s = reader.getSymbol(id);
            if (s != null) {
                symbols.add(s);
            }
        }
        awakeSymbols(depth, symbols);

        ClassDiagram diagram = this.getClassDiagram(symbols, null);

        return diagram;
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
            fd.setName(PathUtils.getFileName(p.getName()));
            fd.setType(FileTree.Type.FOLDER_TYPE.getType());
            if (p.getOwner() != null) {
                fd.setParent(p.getOwner().identify());
            }
            fileTree.getFds().add(fd);
        }


        return fileTree;

    }


    /**
     * awakeSymbols from symbol list
     * TODO: 1. 需要将absolute 引用 转向指向 对应符号
     * 2. identify 需要区分为 相对引用（无文件存储，需要建立文件联系的） 和 绝对引用 （不需要建立联系的）
     *
     * @param depth
     * @param symbols
     * @param <T>
     */
    private <T extends Symbol> void awakeSymbols(int depth, Collection<T> symbols) {
        ArrayList<Symbol> toAwakeSymbols = new ArrayList<>();
        toAwakeSymbols.addAll(symbols);

        while ((depth >= 0 || depth == -1000) && toAwakeSymbols.size() > 0) {
            ArrayList<Symbol> t = new ArrayList<>();
            for (Symbol s : toAwakeSymbols) {
                if (s == null) {
                    continue;
                }
                if (reader.isSymbolExist(s)) {
                    reader.getSymbol(s);
                } else {
                    String name = IdentifyUtils.getSymbolName(s.identify());
                    LOGGER.log(Level.INFO, LogUtils.buildLogString(InfoConstants.READ_RELATIVE_SYMBOL, new String[]{name, s.identify()}));
                    s.setName(name);
                    s.setIdentify(name);
                }
                t.addAll(s.allSymbols());
            }
            depth--;
            toAwakeSymbols = t;
        }
    }

    private Boolean fixNodeData(ClassDiagram classDiagram, HashMap<String, ClassDiagram.Node> map, String symbolName) {
        ClassDiagram.Node node = map.get(symbolName);
        if (node == null) {
            node = new ClassDiagram.Node();
            node.setClassName(symbolName);
            node.setIdentify(symbolName);
        }
        map.put(symbolName, node);
        classDiagram.getClasses().add(node);
        return true;

    }


    private ClassDiagram getClassDiagram(Collection<Symbol> symbols, ClassDiagram cd) {

        ClassDiagram classDiagram = cd != null ? cd : new ClassDiagram();

        //region generate all nodes and edges
        for (Symbol s : symbols) {
            if (s instanceof ClassImpl)
                parseClass(classDiagram, (ClassImpl) s);
            if (s instanceof InterfaceImpl)
                parseInterface(classDiagram, (InterfaceImpl) s);
            if (s instanceof FileImpl) {
                getClassDiagram(s.allSymbols(), classDiagram);
            }
            if (s instanceof EnumeratorImpl) {
                parseEnum(classDiagram, (EnumeratorImpl) s);
            }
        }
        //endregion


        //region check no exist node
        checkNoExistNode(classDiagram);
        //endregion
        return classDiagram;
    }

    /**
     * classDiagram 类图
     * 存在一部分edge 的 v or w 没有对应的node， 补上这部分node
     *
     * @param classDiagram
     */
    private void checkNoExistNode(ClassDiagram classDiagram) {
        HashMap<String, ClassDiagram.Node> map = new HashMap();
        for (ClassDiagram.Node node : classDiagram.getClasses()) {
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
    }

    /**
     * 解析enum
     *
     * @param classDiagram
     * @param enumerator
     */
    private void parseEnum(ClassDiagram classDiagram, EnumeratorImpl enumerator) {
        /// TODO: use cache or create
        ClassDiagram.Node node = new ClassDiagram.Node();
        node.setType(ClassDiagram.NodeType.Node_TYPE_ENUM.getType());
        node.setIdentify(enumerator.identify());
        node.setClassName(enumerator.getName());
        for (Variable variable : enumerator.values) {
            if (variable instanceof VariableImpl) {
                String attribute = ((VariableImpl) variable).getName();
                if (attribute != null)
                    node.getAttributes().add(attribute);
            }
        }

        classDiagram.getClasses().add(node);

    }

    private void parseInterface(ClassDiagram classDiagram, InterfaceImpl interfaces) {
        ClassDiagram.Node node = new ClassDiagram.Node();
        node.setType(ClassDiagram.NodeType.NODE_TYPE_INTERFACE.getType());
        node.setIdentify(interfaces.identify());
        node.setClassName(interfaces.getName());
        for (Variable variable : interfaces.iVariables) {
            if (variable instanceof VariableImpl) {
                String attribute = ((VariableImpl) variable).getName();
                if (attribute != null)
                    node.getAttributes().add(attribute);
            }
        }

        for (Function function : interfaces.iFunctions) {
            if (function instanceof FunctionImpl) {
                String method = ((FunctionImpl) function).getName();
                if (method != null)
                    node.getMethods().add(method);
            }
        }

        classDiagram.getClasses().add(node);


        for (Interface interfaces1 : interfaces.extendInterfaces) {
            if (interfaces1 instanceof InterfaceImpl) {
                ClassDiagram.RelationEdge relationEdge = new ClassDiagram.RelationEdge();
                relationEdge.setFromClassName(((InterfaceImpl) interfaces1).getName());
                relationEdge.setFromIdentify(interfaces1.identify());
                relationEdge.setRelation(ClassDiagram.Relation.RELATION_GENERALIZATION.getRelation());
                relationEdge.setToClassName(interfaces.getName());
                relationEdge.setToIdentify(interfaces.identify());
                classDiagram.getRelations().add(relationEdge);
            }
        }
    }

    private void parseClass(ClassDiagram classDiagram, ClassImpl clazz) {
        ClassDiagram.Node node = new ClassDiagram.Node();

        node.setType(ClassDiagram.NodeType.NODE_TYPE_CLASS.getType());
        node.setIdentify(clazz.identify());
        node.setClassName(clazz.getName());
        for (Variable variable : clazz.iVariables) {
            if (variable instanceof VariableImpl) {
                String attribute = ((VariableImpl) variable).getName();
                if (attribute != null)
                    node.getAttributes().add(attribute);
            }
        }

        for (Function function : clazz.iFunctions) {
            if (function instanceof FunctionImpl) {
                String method = ((FunctionImpl) function).getName();
                if (method != null)
                    node.getMethods().add(method);
            }
        }

        classDiagram.getClasses().add(node);

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

    public Collection<Symbol> mergeSymbols(ArrayList<Symbol> symbols) {
        HashMap<String, Symbol> sMaps = new HashMap<>();

        for (Symbol s: symbols) {
            Symbol n = sMaps.get(s.getName());
            if ( n != null) {
                n.merge(s);
            } else {
                sMaps.put(s.getName(), s);
            }
        }

        return sMaps.values();
    }

}
