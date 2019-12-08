package com.fengjini;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Democ3p0 {
    public static void main(String[] args) {
        //创建连接池
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        //获取链接对象
        try {
            Connection connection = comboPooledDataSource.getConnection();
            String sql="insert into price(name ,price) value(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"不知道");
            preparedStatement.setDouble(2,400);
           preparedStatement.executeUpdate();
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt(1)+resultSet.getString(2)+resultSet.getDouble(3));
//            }

            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            comboPooledDataSource.close();
        }

    }
}
