package com.mmall.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    @Test
    public void test() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("x为" + x);
            System.out.println("y为" + y);
            return Integer.compare(x, y);
        };
        System.out.println(com.compare(1111, 111));
    }
        // x为1111
        // y为111
        // 1
    @Test
    public void testForEach(){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().forEach(a -> {
            System.out.println("a=" + a);
        });
    }



    @Test
    public void testCollection(){
        List<String> list = new ArrayList<>();


    }
}
