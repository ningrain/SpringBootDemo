package com.gta.service.Impl;

import com.gta.SpringBootDemoApplicationTests;
import com.gta.model.Girl;
import com.gta.service.GirlService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * GirlServiceImpl 测试类
 * Created by ningning.jiang on 2017/8/15.
 */
public class GirlServiceImplTest extends SpringBootDemoApplicationTests{

    private static final Logger logger = LoggerFactory.getLogger(GirlServiceImplTest.class);

    @Autowired
    private GirlService girlService;

    @Test
    public void testGetGirlById() throws Exception {
        Girl girl = girlService.getGirlById(1);
        logger.info(girl.toString());
    }

}