package com.gta.exception;

import com.gta.enums.MessageEnum;

/**
 * Desc: GirlException异常处理类
 * User: jiangningning
 * Date: 2017/8/15
 * Time: 9:07
 */
public class GirlException extends RuntimeException {

    private int code;

    public GirlException(MessageEnum messageEnum){
        super(messageEnum.getMsg());
        this.code = messageEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
