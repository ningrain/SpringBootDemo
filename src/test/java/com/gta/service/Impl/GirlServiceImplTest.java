package com.gta.service.Impl;

import com.gta.SpringBootDemoApplicationTests;
import com.gta.service.GirlService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * GirlServiceImpl 测试类
 * Created by ningning.jiang on 2017/8/15.
 */
public class GirlServiceImplTest extends SpringBootDemoApplicationTests{

    @Autowired
    private GirlService girlService;

    @Test
    public void getGirlById() throws Exception {
        girlService.getGirlById(1);
    }

}