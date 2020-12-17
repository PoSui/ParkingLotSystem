package com.drx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * JDBCUtils工具类代码
 */
public class JDBCUtils {
    private JDBCUtils(){}
    private static Connection con;

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/parking?serverTimezone=Asia/Shanghai&characterEncoding=UTF-8";
            String user = "root";
            String password = "123456";
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException(e + "数据库连接失败");
        }
    }

    /*
     * 定义静态方法,返回数据库的连接对象
     */
    public static Connection getConnection(){
        return con;
    }

    /*
     * 关闭
     */
    public static void close(Connection con,Statement stat,ResultSet rs){
        if(rs!=null){
            try{
                rs.close();
            }catch(SQLException ex){}
        }

        if(stat!=null){
            try{
                stat.close();
            }catch(SQLException ex){}
        }

        if(con!=null){
            try{
                con.close();
            }catch(SQLException ex){}
        }
    }

    public static void close(Connection con,Statement stat){

        if(stat!=null){
            try{
                stat.close();
            }catch(SQLException ex){}
        }

        if(con!=null){
            try{
                con.close();
            }catch(SQLException ex){}
        }
    }
}
