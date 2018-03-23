package com.gta.dao;

import com.gta.model.Girl;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * IGirlDao
 * IGirlDao by ningning.jiang on 2017/8/15.
 */
public interface IGirlDao {

    /**
     * 方法 getGirlById 功能： 根据id查询女孩信息
     * @param id girl id
     * @return com.gta.model.Girl
     * @user ningning.jiang 2017年08月15日 14:55:23
     */
    @Select("select * from girl where id = #{id}")
    Girl getGirlById(@Param("id") int id);

}
