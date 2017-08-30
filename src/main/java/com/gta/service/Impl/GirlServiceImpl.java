package com.gta.service.Impl;

import com.gta.dao.IGirlDao;
import com.gta.model.Girl;
import com.gta.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Desc: GirlService实现类
 * User: jiangningning
 * Date: 2017/8/15
 * Time: 14:57
 */
@Service
public class GirlServiceImpl implements GirlService {

    @Autowired
    private IGirlDao girlDao;

    @Override
    public Girl getGirlById(int id) {
        return girlDao.getGirlById(id);
    }

}
