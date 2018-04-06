/**
 * Created by away on 23/04/2017.
 */
package com.away1994.common.utils.log;


import com.away1994.common.constants.CommonConstants;

import java.util.Date;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class LogFormatter extends SimpleFormatter {
    public LogFormatter() {
    }

    public synchronized String format(LogRecord record) {
        return super.format(record).replaceFirst(CommonConstants.LINE_SEPARATOR, " ");
    }

    public String getHead(Handler h) {
        return "Program launched at " + new Date() + CommonConstants.LINE_SEPARATOR;
    }

    public String getTail(Handler h) {
        return "Program finished at " + new Date() + CommonConstants.LINE_SEPARATOR + CommonConstants.LINE_SEPARATOR;
    }
}