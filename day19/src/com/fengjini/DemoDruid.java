package com.fengjini;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DemoDruid {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream resourceAsStream = DemoDruid.class.getClassLoader().getResourceAsStream("druid.properties");
        properties.load(resourceAsStream);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        String sql = "insert into price (name,price)value (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "标准");
        preparedStatement.setDouble(2, 55.2);
        int i = preparedStatement.executeUpdate();

        System.out.println(connection);
    }
}
