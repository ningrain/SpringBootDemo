package com.gta.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc: HttpAspect
 * User: jiangningning
 * Date: 2017/8/14
 * Time: 15:11
 */
@Aspect
@Component
public class HttpAspect {

    private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(* com.gta.controller.HelloController.*(..))")
    public void log(){} //@Pointcut注解的方法，方法体应该为空

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        logger.info("doBefore method execute");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //url
        logger.info("url={}", request.getRequestURL());
        //method
        logger.info("method={}", request.getMethod());
        //ip
        logger.info("ip={}", request.getRemoteAddr());
        //类方法
        logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        //参数
        logger.info("args={}", joinPoint.getArgs());

    }

    @After("log()")
    public void doAfter(){
        logger.info("doAfter method execute");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void afterReturning(Object object){
        logger.info("response={}", object.toString());
    }

}
