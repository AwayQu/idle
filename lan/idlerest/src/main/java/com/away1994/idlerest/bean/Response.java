package com.away1994.idlerest.bean;

public class Response {
    public final static String MSG_SUCCESS = "success";
    public final static String MSG_FAIL = "fail";
    public final static int CODE_SUCCESS = 200;
    public final static int CODE_FAIL = 400;
    private int code;
    private String msg;

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
