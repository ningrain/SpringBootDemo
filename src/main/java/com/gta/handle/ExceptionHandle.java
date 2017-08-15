package com.gta.handle;

import com.gta.exception.GirlException;
import com.gta.util.Message;
import com.gta.util.MessageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Desc: 统一异常处理类
 * User: jiangningning
 * Date: 2017/8/15
 * Time: 9:49
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Message handle(Exception e){
        if (e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return MessageUtil.exception(girlException.getMessage());
        }else {
            logger.error("系统错误", e);
            return MessageUtil.exception();
        }
    }

}
