package com.away1994.structure.lang.symbols.impl;

import com.away1994.common.utils.log.LogUtils;
import com.away1994.structure.lang.io.seriablize.SymbolDeserializer;
import com.away1994.structure.lang.io.seriablize.SymbolSerializer;
import com.away1994.structure.lang.parser.State;
import com.away1994.structure.lang.symbols.Symbol;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.away1994.common.constants.CharacterConstants.LEFT_PARENTHESIS_CHAR;
import static com.away1994.common.constants.CharacterConstants.RIGHT_PARENTHESIS_CHAR;
import static com.away1994.common.constants.log.ErrorConstants.NULL_POINTER_NAME_ERROR;
import static com.away1994.common.constants.log.ErrorConstants.NULL_POINTER_OWNER_ERROR;


@JsonIgnoreProperties({"ruleContext", "cachedIdentify"})
public class SymbolImpl implements Symbol {

    private static final transient Logger LOGGER = Logger.getLogger(SymbolImpl.class.getName());

    public String name;

    @JsonSerialize(using = SymbolSerializer.class)
    @JsonDeserialize(using = SymbolDeserializer.class)
    public Symbol owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getOwner() {
        return owner;
    }

    public void setOwner(Symbol owner) {
        this.owner = owner;
    }

    public SymbolImpl() {
    }

    public SymbolImpl(String name, Symbol owner) {
        this.name = name;
        this.owner = owner;
    }

    public SymbolImpl(String cachedIdentify) {
        this.cachedIdentify = cachedIdentify;
    }

    @Override
    public String identify() {
        if (this.getCachedIdentify() != null) {
            return this.getCachedIdentify();
        }
        String absIdentify = this.absIdentify();
        if (this.getOwner() == null) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(NULL_POINTER_OWNER_ERROR, absIdentify));
            return absIdentify;
        } else {
            return absIdentify + this.getOwner().identify();
        }
    }

    @Override
    public String absIdentify() {
        if (this.getName() == null) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString(NULL_POINTER_NAME_ERROR, this));
        }
        return this.state().getDescription() + LEFT_PARENTHESIS_CHAR + this.getName() + RIGHT_PARENTHESIS_CHAR;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public State state() {
        return State.PLACEHOLD_STATE;
    }

    private String cachedIdentify;

    public String getCachedIdentify() {
        return cachedIdentify;
    }

    public void setCachedIdentify(String cachedIdentify) {
        this.cachedIdentify = cachedIdentify;
    }


    private ParserRuleContext ruleContext;

    public void setRuleContext(ParserRuleContext ruleContext) {
        this.ruleContext = ruleContext;
    }

    public ParserRuleContext getRuleContext() {
        return ruleContext;
    }


    public Symbol extractNameAndOwnerCachedIdentify() {
        if (this.getCachedIdentify() == null) {
            return null;
        }
        String des = this.state().getDescription();
        if (this.getCachedIdentify().startsWith(des)) {
            String subId = des.substring(des.length());
            int nextIndex = subId.indexOf('$');
            String name = subId.substring(1, nextIndex - 1);
            String ownerId = subId.substring(nextIndex);

        }
        return null;
    }
}
