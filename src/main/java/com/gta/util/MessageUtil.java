package com.gta.util;

import com.gta.enums.MessageEnum;

/**
 * Desc: Message共用类
 * User: jiangningning
 * Date: 2017/8/14
 * Time: 17:04
 */
public class MessageUtil {

    public static Message success(Object object){
        Message msg = new Message();
        msg.setCode(MessageEnum.SUCCESS.getCode());
        msg.setMsg(MessageEnum.SUCCESS.getMsg());
        msg.setObj(object);
        return msg;
    }

    public static Message exception(){
        Message msg = new Message();
        msg.setCode(MessageEnum.FAIL.getCode());
        msg.setMsg(MessageEnum.FAIL.getMsg());
        msg.setObj(null);
        return msg;
    }

    public static Message exception(String msg){
        Message message = new Message();
        message.setCode(MessageEnum.FAIL.getCode());
        message.setMsg(msg);
        message.setObj(null);
        return message;
    }
}
