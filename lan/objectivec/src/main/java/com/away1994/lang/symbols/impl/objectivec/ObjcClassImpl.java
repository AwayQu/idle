package com.away1994.lang.symbols.impl.objectivec;

import com.away1994.lang.symbols.Symbol;
import com.away1994.lang.symbols.impl.ClassImpl;
import com.fasterxml.jackson.annotation.JsonIgnore;

// TODO: deserial support subclass
public class ObjcClassImpl extends ClassImpl {
    public enum DeclarationType {
        ANONYMOUS_CATEGORY,
        NAMED_CATEGORY,
        INTERFACE,
        IMPLEMENTATION,
        CATEGORY_IMPLEMENTATION;
    }

    /// TODO: add to serial
    @JsonIgnore
    private DeclarationType declarantType;

    @JsonIgnore
    private String categoryName;

    public DeclarationType getDeclarantType() {
        return declarantType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDeclarantType(DeclarationType declarantType) {
        this.declarantType = declarantType;
    }

    public ObjcClassImpl(String name, Symbol owner) {
        super(name, owner);
    }
}
