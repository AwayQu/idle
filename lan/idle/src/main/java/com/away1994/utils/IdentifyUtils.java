package com.away1994.utils;

import com.away1994.lang.parser.Type;

public class IdentifyUtils {

    public static String getType(String identify) {
        return Type.getState(identify).getDescription();
    }

    public static String getShortSymbol(String identify) {

        if (identify == null) {
            return null;
        }

        int end = identify.indexOf("$", 1);
        if (end == -1) {
            return identify;
        }
        String shortName = identify.substring(0, end);

        return shortName;
    }

    public static String getSymbolName(String identify) {
        if (identify == null) {
            return null;
        }
        int start = identify.indexOf("(");
        // TODO: remove
        /// like NSObject
        if (start == -1) {
            return identify;
        }

        String subId = identify.substring(start);
        int nextIndex = subId.indexOf('$');
        String name = null;
        try {
            if (nextIndex == -1) {
                name = subId.substring(1, subId.length() - 1);
            } else {
                name = subId.substring(1, nextIndex - 1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return name;
    }

}
