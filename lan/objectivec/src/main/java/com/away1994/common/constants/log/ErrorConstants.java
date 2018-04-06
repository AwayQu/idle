package com.away1994.common.constants.log;

/**
 * Created by away on 23/04/2017.
 */
public final class ErrorConstants {


    /**
     * The duplicated identify error message.
     */
    public static final String DUPLICATED_IDENTIFY_ERROR = "[error-idle-000] : The duplicated identify \"{0}\", is already used.";

    public static final String WRITE_TO_FILE_ERROR = "[error-idle-001] : The write file \"{0}\", is fail with exception \"{1}\".";

    public static final String UNKNOWN_FILE_TYPE_ERROR = "[error-idle-002] : The unknown type file \"{0}\".";

    public static final String NULL_POINTER_OWNER_ERROR = "[error-idle-003] : The owner of symbol \"{0}\" is empty.";

    private ErrorConstants() {
        super();
    }
}
