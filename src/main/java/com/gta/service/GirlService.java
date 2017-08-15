package com.gta.service;

import com.gta.model.Girl;

/**
 * Desc: GirlService接口
 * User: jiangningning
 * Date: 2017/8/15
 * Time: 14:53
 */
public interface GirlService {

    /**
     * 方法 getGirlById 功能： 根据id查询女孩信息
     * @param id girl id
     * @return com.gta.model.Girl
     * @user ningning.jiang 2017年08月15日 14:55:23
     */
    Girl getGirlById(int id);

}
