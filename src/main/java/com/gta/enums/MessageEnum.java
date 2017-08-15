package com.gta.enums;

/**
 * Message枚举类
 * Created by ningning.jiang on 2017年8月14日17:15:40.
 */
public enum MessageEnum {

    SUCCESS("1", "成功"), FAIL("0", "失败");

    //代码
    private String code;
    //消息
    private String msg;

    MessageEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
