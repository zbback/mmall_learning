package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

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
        String str = "20190808";
        System.out.println("开始时间："+System.currentTimeMillis());
        String str2 = String.valueOf(Integer.parseInt(str)+1);
        System.out.println("结束时间："+System.currentTimeMillis());
        System.out.println(str2);


    }
}
