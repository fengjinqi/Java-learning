package com.fengjini;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDemo {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        try {
            connection = JDBCUtils.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            String sql = "update price set price=price-? where id=?";
            String sql1 = "update price set price=price+? where id=?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement.setDouble(1, 500);
            preparedStatement.setInt(2, 1);
            preparedStatement1.setDouble(1, 500);
            preparedStatement1.setInt(2, 2);
            preparedStatement.executeUpdate();
            //int i =3/0;
            preparedStatement1.executeUpdate();
            connection.commit();
        } catch (Exception e) {

            try {
                if (connection!=null)
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(preparedStatement,connection);
            JDBCUtils.close(preparedStatement1,null);
        }
    }
}
