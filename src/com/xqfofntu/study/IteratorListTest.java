package com.xqfofntu.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname IteratorTest
 * @Date 2021/4/5
 * @Author xqf
 */
public class IteratorListTest {
    public static void main(String[] args) {
        //实列化容器
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //获取元素
        //获取迭代器对象
        Iterator<String> integer = list.iterator();

        //方法一
        while (integer.hasNext()) {
            String value = integer.next();
            System.out.println(value);
        }

        System.out.println("-------------------------");

        //方法二
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String value = it.next();
            System.out.println(value);
        }


    }
}
