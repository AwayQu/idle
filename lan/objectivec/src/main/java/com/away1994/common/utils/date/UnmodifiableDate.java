/**
 * Created by away on 23/04/2017.
 */
package com.away1994.common.utils.date;


import com.away1994.common.utils.log.LogUtils;

import java.util.Date;

public class UnmodifiableDate extends Date {
    private static final long serialVersionUID = -1580684205510917528L;

    public UnmodifiableDate() {
    }

    public UnmodifiableDate(Date date) {
        super(date.getTime());
    }

    public UnmodifiableDate(long date) {
        super(date);
    }

    // TODO : Deprecate modify
    public void setDate(int date) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setHours(int hours) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setMinutes(int minutes) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setMonth(int month) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setSeconds(int seconds) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setTime(long time) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }

    public void setYear(int year) {
        throw new IllegalArgumentException(LogUtils.buildLogString("[error-plantuml-dependency-common-002] : The date instance {0} is immutable, can't update it", this));
    }
}
