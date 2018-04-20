package com.away1994.idlerest;

public class PathUtils {
    public static String append(String path, String project) {
        StringBuilder builder = new StringBuilder();
        builder.append(path);
        if (!path.endsWith("/")) {
            builder.append("/");
        }
        builder.append(project);
        return builder.toString();
    }
}
