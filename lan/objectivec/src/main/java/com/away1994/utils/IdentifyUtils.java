package com.away1994.utils;

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
        String name = null;
        try {
            name = subId.substring(1, nextIndex - 1);
        } catch (Exception e) {
           System.out.println(e);
        }
//            String ownerId = subId.substring(nextIndex);

        return name;
    }

}
