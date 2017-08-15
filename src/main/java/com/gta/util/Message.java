package com.gta.util;

/**
 * Desc: 公共返回值
 * User: jiangningning
 * Date: 2017/8/14
 * Time: 16:58
 */
public class Message<T> {

    //代码
    private String code;
    //提示信息
    private String msg;
    //数据
    private T obj;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
