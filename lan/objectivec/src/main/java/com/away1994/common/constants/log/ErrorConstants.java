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

    public static final String NULL_POINTER_NAME_ERROR = "[error-idle-004] : The name of symbol \"{0}\" is empty.";

    public static final String OWNER_TYPE_ERROR = "[error-idle-005] : The type of symbol \"{0}\" is wrong.";

    public static final String URL_ENCODE_PATH_ERROR = "[error-idle-006] : URLEncode error with \"{0}\".";

    public static final String READ_TO_FILE_ERROR = "[error-idle-007] : The read file \"{0}\", is fail with exception \"{1}\".";

    public static final String WRITE_JSON_ERROR = "[error-idle-008] : Write json , is fail with exception \"{1}\".";


    private ErrorConstants() {
        super();
    }
}
