package com.mmall.test;

import org.joda.time.DateTime;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/5/23.
 *
 */
public class BigDecimalTest {

    @Test
    public void test1(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015+100);
        System.out.println(123.3/100);
    }

    @Test
    public void test2(){
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }
    @Test
    public void test3(){
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }


    @Test
    public void test4(){
        String str = "2019-08-08";
        System.out.println("开始时间："+System.currentTimeMillis());
        String str2 = String.valueOf(Integer.parseInt(str)+1);
        System.out.println("结束时间："+System.currentTimeMillis());
        System.out.println(str2);


    }

    @Test
    public void test5(){
        long tomorrowEndTimestamp = new DateTime(0).plusDays(1).plusSeconds(-1).toDate().getTime();
        int a = Long.valueOf(tomorrowEndTimestamp / 1000).intValue();
        System.out.println(tomorrowEndTimestamp+"a:"+a);
    }

    @Test
    public void test6(){
        String str = "2019-09-09";
        String str1 = str.replaceAll("-","");
        int a = Integer.parseInt(str1)+1;
        String s = String.valueOf(a);
        String wangzb = String.valueOf(Integer.parseInt("2019-09-08".replaceAll("-",""))+1);

        String wangzb2 = strToDateLong(wangzb);
        System.out.println(s+"wangzb:"+wangzb+"/t"+"wangzb2:"+wangzb2);

    }

    @Test
    public void test7(){
        Long a = 0L;
        System.out.println(a/1000);
    }

    @Test
    public void test8(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        System.out.println(list.size());

    }

    public static String strToDateLong(String strDate) {
        Date date = new Date();
        try {
            date = new SimpleDateFormat("yyyyMMdd").parse(strDate);//先按照原格式转换为时间
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String str = new SimpleDateFormat("yyyy-MM-dd").format(date);//再将时间转换为对应格式字符串
        return str;
    }


//    private String yyyyMMddToNewType(String str){
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
//        formatter.setLenient(false);
//        Date newDate= formatter.parse(str);
//        formatter = new SimpleDateFormat("yyyy-MM-dd");
//        return formatter.format(newDate);
//
//    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}




