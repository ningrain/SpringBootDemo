package com.gta.bean;

import com.gta.SpringBootDemoApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * MyBean 测试类
 * Created by ningning.jiang on 2017/8/16.
 */
public class MyBeanTest extends SpringBootDemoApplicationTests {

    @Autowired
    private MyBean myBean;

    @Test
    public void getGirlById() throws Exception {

        System.out.println(myBean.getGirlById(2).toString());

    }

}