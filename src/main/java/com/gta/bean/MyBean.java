package com.gta.bean;

import com.gta.model.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Desc:
 * User: jiangningning
 * Date: 2017/8/16
 * Time: 16:55
 */
@Component
public class MyBean {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MyBean(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Girl getGirlById(int id) {
        final Girl girl = new Girl();
        String sql = "SELECT * FROM girl WHERE id = ?";
        jdbcTemplate.query(sql, new Object[]{id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                girl.setId(rs.getInt("id"));
                girl.setAge(rs.getInt("age"));
                girl.setCupSize(rs.getString(3));
            }
        });
        return girl;
    }

}