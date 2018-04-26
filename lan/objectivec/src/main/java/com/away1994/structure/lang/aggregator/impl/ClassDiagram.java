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

    public enum NodeType {
        Node_TYPE_ENUM("enumerator"),
        NODE_TYPE_CLASS("class"),
        NODE_TYPE_INTERFACE("interface");

        private String type;

        NodeType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class Node {
        /**
         * 节点名称
         */
        public String className;
        /**
         * 属性
         */
        public ArrayList<String> attributes = new ArrayList<>();
        /**
         * 方法 TODO, 增加描述
         */
        public ArrayList<String> methods = new ArrayList<>();
        /**
         * 节点ID
         */
        public String identify;
        /**
         * 节点类型 NodeType.getType()
         */
        public String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

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


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            if (getClassName() != null ? !getClassName().equals(node.getClassName()) : node.getClassName() != null)
                return false;
            if (getAttributes() != null ? !getAttributes().equals(node.getAttributes()) : node.getAttributes() != null)
                return false;
            if (getMethods() != null ? !getMethods().equals(node.getMethods()) : node.getMethods() != null)
                return false;
            if (getIdentify() != null ? !getIdentify().equals(node.getIdentify()) : node.getIdentify() != null)
                return false;
            return getType() != null ? getType().equals(node.getType()) : node.getType() == null;
        }

        @Override
        public int hashCode() {
            int result = getClassName() != null ? getClassName().hashCode() : 0;
            result = 31 * result + (getAttributes() != null ? getAttributes().hashCode() : 0);
            result = 31 * result + (getMethods() != null ? getMethods().hashCode() : 0);
            result = 31 * result + (getIdentify() != null ? getIdentify().hashCode() : 0);
            result = 31 * result + (getType() != null ? getType().hashCode() : 0);
            return result;
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RelationEdge that = (RelationEdge) o;

            if (getFromIdentify() != null ? !getFromIdentify().equals(that.getFromIdentify()) : that.getFromIdentify() != null)
                return false;
            if (getFromClassName() != null ? !getFromClassName().equals(that.getFromClassName()) : that.getFromClassName() != null)
                return false;
            if (getToIdentify() != null ? !getToIdentify().equals(that.getToIdentify()) : that.getToIdentify() != null)
                return false;
            if (getToClassName() != null ? !getToClassName().equals(that.getToClassName()) : that.getToClassName() != null)
                return false;
            return getRelation() != null ? getRelation().equals(that.getRelation()) : that.getRelation() == null;
        }

        @Override
        public int hashCode() {
            int result = getFromIdentify() != null ? getFromIdentify().hashCode() : 0;
            result = 31 * result + (getFromClassName() != null ? getFromClassName().hashCode() : 0);
            result = 31 * result + (getToIdentify() != null ? getToIdentify().hashCode() : 0);
            result = 31 * result + (getToClassName() != null ? getToClassName().hashCode() : 0);
            result = 31 * result + (getRelation() != null ? getRelation().hashCode() : 0);
            return result;
        }
    }

    public ArrayList<Node> classes = new ArrayList<>();
    public ArrayList<RelationEdge> relations = new ArrayList<>();

    public ArrayList<Node> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Node> classes) {
        this.classes = classes;
    }

    public ArrayList<RelationEdge> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<RelationEdge> relations) {
        this.relations = relations;
    }
}
