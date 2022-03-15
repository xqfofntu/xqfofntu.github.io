package com.xqfofntu.study;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname HashSetTest
 * @Date 2021/4/4
 * @Author xqf
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();

        //没有顺序，不会重复
        hashset.add("a");
        hashset.add("b");
        hashset.add("c");
        hashset.add("d");

        //获取元素，因为set容器没有索引，所有没有get(int index)方法
        for (String str : hashset) {
            System.out.println(str);
        }

        System.out.println("-----------------------------");

        hashset.remove("a");

        for (String str : hashset) {
            System.out.println(str);
        }


    }
}
