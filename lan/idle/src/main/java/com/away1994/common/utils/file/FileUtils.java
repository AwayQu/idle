/**
 * Created by away on 23/04/2017.
 */
package com.away1994.common.utils.file;

import com.away1994.common.utils.log.LogUtils;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class FileUtils {
    private static final transient Logger LOGGER = Logger.getLogger(FileUtils.class.getName());

    public static void closeCloseable(Closeable closeable) {
        if(closeable != null) {
            try {
                closeable.close();
            } catch (IOException var2) {
                LOGGER.log(Level.SEVERE, "[error-plantuml-dependency-common-001] : An error has occurred while closing a stream", var2);
            }
        }

    }

    public static void closeCloseable(Closeable closeable, File closeableFile) {
        closeCloseable(closeable, closeableFile.toString());
    }

    public static void closeCloseable(Closeable closeable, String closeableName) {
        if(closeable != null) {
            try {
                closeable.close();
            } catch (IOException var3) {
                LOGGER.log(Level.SEVERE, LogUtils.buildLogString("[error-plantuml-dependency-common-000] : An error has occurred while closing file ({0})", closeableName), var3);
            }
        }

    }

    public static String readFileIntoString(File file) {
        return readFileIntoString((File)file, (String)null);
    }

    public static String readFileIntoString(File file, String charsetName) {
        assert file != null : "file is null";

        LOGGER.log(Level.INFO, LogUtils.buildLogString("[info-plantuml-dependency-common-000] : Reading file content {0}...", new Object[]{file}));
        FileInputStream fi = null;
        String result = null;

        try {
            fi = new FileInputStream(file);
            result = readStreamIntoString(fi, charsetName);
        } catch (IOException var8) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString("[error-plantuml-dependency-common-005] : An error has occurred while reading file ({0})", file), var8);
        } finally {
            closeCloseable(fi, (File)file);
        }

        return result;
    }

    public static String readFileIntoString(String pathName) {
        return readFileIntoString((String)pathName, (String)null);
    }

    public static String readFileIntoString(String pathName, String charsetName) {
        assert pathName != null : "pathName is null";

        return readFileIntoString(new File(pathName), charsetName);
    }

    public static StringBuffer readFileIntoStringBuffer(File file) {
        return readFileIntoStringBuffer((File)file, (String)null);
    }

    public static StringBuffer readFileIntoStringBuffer(File file, String charsetName) {
        assert file != null : "file is null";

        LOGGER.log(Level.INFO, LogUtils.buildLogString("[info-plantuml-dependency-common-000] : Reading file content {0}...", new Object[]{file}));
        FileInputStream fi = null;
        StringBuffer result = null;

        try {
            fi = new FileInputStream(file);
            result = readStreamIntoStringBuffer(fi, charsetName);
        } catch (IOException var8) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString("[error-plantuml-dependency-common-005] : An error has occurred while reading file ({0})", file), var8);
        } finally {
            closeCloseable(fi, (File)file);
        }

        return result;
    }

    public static StringBuffer readFileIntoStringBuffer(String pathName) {
        return readFileIntoStringBuffer((String)pathName, (String)null);
    }

    public static StringBuffer readFileIntoStringBuffer(String pathName, String charsetName) {
        assert pathName != null : "pathName is null";

        return readFileIntoStringBuffer(new File(pathName), charsetName);
    }

    public static String readStreamIntoString(InputStream stream) throws IOException {
        return readStreamIntoString(stream, (String)null);
    }

    public static String readStreamIntoString(InputStream stream, String charsetName) throws IOException {
        return readStreamIntoStringBuffer(stream, charsetName).toString();
    }

    public static StringBuffer readStreamIntoStringBuffer(InputStream stream) throws IOException {
        return readStreamIntoStringBuffer(stream, (String)null);
    }

    public static StringBuffer readStreamIntoStringBuffer(InputStream stream, String charsetName) throws IOException {
        assert stream != null : "stream is null";

        Reader streamReader = null;
        if(charsetName == null) {
            streamReader = new InputStreamReader(stream);
        } else {
            streamReader = new InputStreamReader(stream, charsetName);
        }

        StringWriter out = new StringWriter();

        int b;
        while((b = streamReader.read()) != -1) {
            out.write(b);
        }

        return out.getBuffer();
    }

    public static boolean writeIntoFile(String str, File file) {
        return writeIntoFile(str, file, false);
    }

    public static boolean writeIntoFile(String str, File file, boolean append) {
        assert str != null : "str is null";

        assert file != null : "file is null";

        LOGGER.log(Level.INFO, LogUtils.buildLogString("[info-plantuml-dependency-common-002] : Writing content into file {0}...", file));
        boolean error = true;
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, append);
            writer.write(str, 0, str.length());
            error = false;
        } catch (IOException var9) {
            LOGGER.log(Level.SEVERE, LogUtils.buildLogString("[error-plantuml-dependency-common-007] : An error has occurred while writing file ({0})", file), var9);
        } finally {
            closeCloseable(writer, (File)file);
        }

        return error;
    }

    public static boolean writeIntoFile(String str, String path) {
        return writeIntoFile(str, path, false);
    }

    public static boolean writeIntoFile(String str, String pathName, boolean append) {
        assert pathName != null : "pathName is null";

        return writeIntoFile(str, new File(pathName), append);
    }

    private FileUtils() {
    }
}
