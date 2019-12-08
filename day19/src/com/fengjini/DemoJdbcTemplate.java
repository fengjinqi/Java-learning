package com.fengjini;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import utils.JDBCUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DemoJdbcTemplate {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
//        String sql="update price set price=price+? where id=?";
//        int update = jdbcTemplate.update(sql, 200, 1);
        /*String sql ="select * from price where id=?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql,1);
        System.out.println(stringObjectMap);*/
        //System.out.println(update);
        String sql1 ="select * from price";
        List<Emp> query = jdbcTemplate.query(sql1, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {

                Emp emp = new Emp();
                int id = resultSet.getInt("id");

                emp.setId(id);
                String name = resultSet.getString("name");

                emp.setName(name);
                double aDouble = resultSet.getDouble("price");
                emp.setPrice(aDouble);

                return emp;
            }
        });
        System.out.println(query);
        List<Emp> query1 = jdbcTemplate.query(sql1, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : query1) {
            System.out.println(emp);
        }
    }
}
