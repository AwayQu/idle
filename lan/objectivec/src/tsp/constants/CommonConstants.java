package tsp.constants;

import java.io.File;

public final class CommonConstants {
    public static final String BLANK_STRING = "";
    public static final File CURRENT_DIRECTORY = new File(".");
    public static final int HASHCODE_PRIME_NUMBER1 = 1231;
    public static final int HASHCODE_PRIME_NUMBER2 = 1237;
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final int MINUS_ONE_RETURN_CODE = -1;

    private CommonConstants() {
    }

}
