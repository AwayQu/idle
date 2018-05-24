package com.away1994.lang.aggregator.impl;

import java.util.ArrayList;

public class FileTree extends SymbolTree {
    public enum Type {
        FILE_TYPE("file"),
        FOLDER_TYPE("folder");

        private String type;

        Type(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class FD {
        String name;
        String identify;
        String parent;
        String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdentify() {
            return identify;
        }

        public void setIdentify(String identify) {
            this.identify = identify;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "FD{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    private ArrayList<FD> fds = new ArrayList<>();

    public FileTree() {
    }

    public ArrayList<FD> getFds() {
        return fds;
    }

    public void setFds(ArrayList<FD> fds) {
        this.fds = fds;
    }

    @Override
    public String toString() {
        return "FileTree{" +
                "fds=" + fds +
                '}';
    }
}
