package com.gta.service.Impl;

import com.gta.enums.MessageEnum;
import com.gta.exception.GirlException;
import com.gta.model.Girl;
import com.gta.service.GirlService;
import org.springframework.stereotype.Service;

/**
 * Desc: GirlService实现类
 * User: jiangningning
 * Date: 2017/8/15
 * Time: 14:57
 */
@Service
public class GirlServiceImpl implements GirlService {
    @Override
    public Girl getGirlById(int id) {
        Girl girl = new Girl(1, "E", 23);
        if (girl.getAge() < 0){
            throw new GirlException(MessageEnum.MIN_AGE);
        } else if (girl.getAge() > 120) {
            throw new GirlException(MessageEnum.MAX_AGE);
        }
        return null;
    }
}
