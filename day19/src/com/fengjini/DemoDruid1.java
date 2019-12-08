package com.fengjini;


import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoDruid1 {
    public static void main(String[] args)  {
        Connection connection =null;
        PreparedStatement preparedStatement=null;
        try {
             connection = JDBCUtils.getConnection();
            String sql = "insert into price (name,price)value (?,?)";
             preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "标准1");
            preparedStatement.setDouble(2, 55.2);
            int i = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
         JDBCUtils.close(preparedStatement,connection);
        }
    }
}
