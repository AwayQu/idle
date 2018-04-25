package com.away1994.structure.utils;

public class IdentifyUtils {


    public static String getSymbolName(String identify) {
        if (identify == null) {
            return null;
        }
        int start = identify.indexOf("(");
        /// like NSObject
        if (start == -1) {
            return identify;
        }

        String subId = identify.substring(start);
        int nextIndex = subId.indexOf('$');
        String name = subId.substring(1, nextIndex - 1);
//            String ownerId = subId.substring(nextIndex);

        return name;
    }

}
