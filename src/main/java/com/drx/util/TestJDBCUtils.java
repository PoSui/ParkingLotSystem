package com.drx.util;

import java.sql.Connection;

/*
     * 测试JDBCUtils工具类的代码
     */
    public class TestJDBCUtils {
        public static void main(String[] args) throws Exception {
            Connection con = JDBCUtils.getConnection();
//            PreparedStatement pst = con.prepareStatement("查询数据库表的SQL语句");
//            ResultSet rs = pst.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString("表中字段"));
//            }
//            JDBCUtils.close(con, pst, rs);
//       }
        }
    }
