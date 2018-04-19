package com.away1994.structure.lang.aggregator.impl;


import java.util.ArrayList;


public class ClassDiagram {
    public enum Relation {
        RELATION_GENERALIZATION("Generalization"),
        RELATION_REALIZATION("Realization"),
        RELATION_ASSOCIATION("Association"),
        RELATION_AGGREGATION("Aggregation"),
        RELATION_COMPOSITION("Composition"),
        RELATION_DEPENDENCY("Dependency");

        private String relation;

        private Relation(final String relation) {
            this.relation = relation;
        }

        public String getRelation() {
            return relation;
        }
    }

    public static class ClassNode {
        public String className;
        public ArrayList<String> attributes = new ArrayList<>();
        public ArrayList<String> methods = new ArrayList<>();
        public String identify;

        public String getClassName() {
            return className;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public ArrayList<String> getAttributes() {
            return attributes;
        }

        public void setAttributes(ArrayList<String> attributes) {
            this.attributes = attributes;
        }

        public ArrayList<String> getMethods() {
            return methods;
        }

        public void setMethods(ArrayList<String> methods) {
            this.methods = methods;
        }

        public String getIdentify() {
            return identify;
        }

        public void setIdentify(String identify) {
            this.identify = identify;
        }
    }

    public static class RelationEdge {
        public String fromIdentify;
        public String fromClassName;
        public String toIdentify;
        public String toClassName;
        public String relation;

        public String getFromIdentify() {
            return fromIdentify;
        }

        public void setFromIdentify(String fromIdentify) {
            this.fromIdentify = fromIdentify;
        }

        public String getFromClassName() {
            return fromClassName;
        }

        public void setFromClassName(String fromClassName) {
            this.fromClassName = fromClassName;
        }

        public String getToIdentify() {
            return toIdentify;
        }

        public void setToIdentify(String toIdentify) {
            this.toIdentify = toIdentify;
        }

        public String getToClassName() {
            return toClassName;
        }

        public void setToClassName(String toClassName) {
            this.toClassName = toClassName;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }
    }

    public ArrayList<ClassNode> classes = new ArrayList<>();
    public ArrayList<RelationEdge> relations = new ArrayList<>();

    public ArrayList<ClassNode> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassNode> classes) {
        this.classes = classes;
    }

    public ArrayList<RelationEdge> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<RelationEdge> relations) {
        this.relations = relations;
    }
}
