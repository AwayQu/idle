package com.away1994.dist.basic.objcclass;

import java.util.ArrayList;

public class ObjcClass {

    public String name;
    public String superClass;
    public ArrayList<String> protocols = new ArrayList<>();


    public ArrayList<String> methods = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }

    public void addProtocol(String protocol) {
        this.protocols.add(protocol);
    }

    public void addMethods(String method) {
        this.methods.add(method);
    }

}
