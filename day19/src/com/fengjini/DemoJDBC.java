package com.fengjini;

import java.sql.*;

public class DemoJDBC {
    public static void JdbcInster() {
        Statement statement = null;
        Connection connection = null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接数据库
            connection = DriverManager.getConnection("jdbc:mysql://119.27.172.195/studen?useUnicode=true&characterEncoding=UTF-8", "xxx", "xxx");
            //创建sql链接
            statement = connection.createStatement();
            //sql语句
            String sql = "insert into student values(907,'东方不败','女','1996','女人系','仙界')";
            //执行sql
            int i = statement.executeUpdate(sql);
            System.out.println(i);
            if (i > 0) {
                System.out.println("sql添加成功");
            } else {
                System.out.println("sql执行失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args){


        //JdbcInster();
       // JdbcQuery();
        JdbcSqlQuery();

    }
    public static void JdbcSqlQuery() {
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement =null;

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接数据库
            //connection = DriverManager.getConnection();
            connection = JDBCUtils.getConnection();
            //创建sql链接
            statement = connection.createStatement();
            //sql语句
            String sql = "select * from student where name =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"东方不败");
             resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()){
                int anInt = resultSet.getInt(1);
                String name = resultSet.getString("name");
                Date aDouble = resultSet.getDate(4);
                System.out.println(anInt+"---"+name+"---"+aDouble);
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,statement,connection);
        }
    }

    public static void JdbcQuery() {
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement =null;
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //链接数据库
            //connection = DriverManager.getConnection();
            connection = JDBCUtils.getConnection();
            //创建sql链接
             statement = connection.createStatement();
            //sql语句
            String sql = "select * from student";
            //执行sql
             resultSet = statement.executeQuery(sql);
            System.out.println(resultSet);
            while (resultSet.next()){
                int anInt = resultSet.getInt(1);
                String name = resultSet.getString("name");
                Date aDouble = resultSet.getDate(4);
                System.out.println(anInt+"---"+name+"---"+aDouble);
            }

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,statement,connection);
//            if (resultSet != null) {
//                try {
//                    resultSet.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
        }
    }

}
