package com.drx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datework {
        public static Date getDate(){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String e = "2019-01-20 12:25:55";
            Date end = null;
            try {
                end = format.parse(e);
                System.out.println(end);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
            return end;
        }

        public static void main(String[] args) throws ParseException {

// TODO Auto-generated method stub

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//Date指定格式：yyyy-MM-dd HH:mm:ss:SSS

            Date date = new Date();//创建一个date对象bai保存当前时间

            String dateStr = simpleDateFormat.format(date);//format()方法du将Date转换成指定格式的String

            System.out.println(dateStr);//2018-08-24 15:37:47:033

            String string = "2018-8-24 12:50:20:545";

            Date date2 = simpleDateFormat.parse(dateStr);//调用parse()方法时zhi 注意 传入的格式必须dao符合simpleDateFormat对象的格式，即"yyyy-MM-dd HH:mm:ss:SSS" 否则会报错！！

            System.out.println(date2);//Fri Aug 24 12:50:20 CST 2018

            datework.getDate();

    }



}
