package com.gta.enums;

/**
 * Message枚举类
 * Created by ningning.jiang on 2017年8月14日17:15:40.
 */
public enum MessageEnum {

    SUCCESS(1, "成功"), FAIL(0, "系统错误"),
    MIN_AGE(3, "年龄最小应该大于零"),
    MAX_AGE(4, "年龄最大应该小于120岁");

    //代码
    private int code;
    //消息
    private String msg;

    MessageEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
