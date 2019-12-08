package com.fengjinqi.dao;

import com.fengjinqi.utils.JDBCUtils;
import com.fengjinqi.web.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private JdbcTemplate jdbcTemplate =new JdbcTemplate(JDBCUtils.getDataSource());
    public User login(User loginUser){
        try {
            String sql ="select * from user_user where email=?";
            List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername());
            User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername());
            System.out.println(query);
            return  user;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
