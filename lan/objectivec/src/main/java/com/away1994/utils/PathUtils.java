package com.away1994.utils;

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

    public static String getFileName(String path) {
        int index = path.lastIndexOf("/");
        if (index > 0 && index < path.length() - 1) {
            return path.substring(index + 1);
        }
        return null;
    }
}
