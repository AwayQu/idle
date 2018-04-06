/**
 * Created by away on 23/04/2017.
 */
package com.away1994.common.constants;


import com.away1994.common.utils.date.UnmodifiableDate;

import java.io.File;
import java.util.*;
import java.util.logging.Level;

public final class CommonConstants {
    public static final String BLANK_STRING = "";
    public static final File CURRENT_DIRECTORY = new File(".");
    public static final int HASHCODE_PRIME_NUMBER1 = 1231;
    public static final int HASHCODE_PRIME_NUMBER2 = 1237;
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final Set<Level> LOG_LEVELS_SET;
    public static final int MINUS_ONE_RETURN_CODE = -1;
    public static final Date NOW;

    public static final String LOGGING_PROPERTIES_PATH = "logging.properties";

    private CommonConstants() {
    }

    static {
        LOG_LEVELS_SET = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Level[]{Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE, Level.FINER, Level.FINEST})));
        NOW = new UnmodifiableDate();
    }
}
