package com.airsaid.warmjacket.bean;

import java.io.Serializable;

/**
 * Created by zhouyou on 2016/04/10 11:19
 */
public class BaseBean<T> implements Serializable {

    private String msg;
    private T result;
    private String retCode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
}
