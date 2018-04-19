package com.away1994.structure.utils;

public class IdentifyUtils {


    public static String getSymbolName(String identify) {
        if (identify == null) {
            return null;
        }
        int start = identify.indexOf("(");
        String subId = identify.substring(start);
        int nextIndex = subId.indexOf('$');
        String name = subId.substring(1, nextIndex - 1);
//            String ownerId = subId.substring(nextIndex);

        return name;
    }

}
