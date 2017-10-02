package com.away1994.tsp.feature.plantuml.common.utils;

public enum ComparableResult {
    BEFORE(-1, 1),
    AFTER(1, -1),
    EQUAL(0, 0);

    private int result;
    private int reverseResult;

    public static ComparableResult valueOf(int comparableResult) {
        ComparableResult result = null;
        if(comparableResult == 0) {
            result = EQUAL;
        } else if(comparableResult < 0) {
            result = BEFORE;
        } else if(comparableResult > 0) {
            result = AFTER;
        }

        return result;
    }

    private ComparableResult(int comparableResult, int reverseValue) {
        this.setResult(comparableResult);
        this.setReverseResult(reverseValue);
    }

    public int getResult() {
        return this.result;
    }

    public int getReverseResult() {
        return this.reverseResult;
    }

    private void setResult(int value) {
        this.result = value;
    }

    private void setReverseResult(int value) {
        this.reverseResult = value;
    }

    public String toString() {
        String str = super.toString();
        return str.toLowerCase();
    }
}