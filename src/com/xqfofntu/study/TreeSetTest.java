package com.xqfofntu.study;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Classname TreeSetTest
 * @Date 2021/4/4
 * @Author xqf
 */
public class TreeSetTest {
    public static <Users> void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        for (String str : set) {
            System.out.println(str);
        }

        System.out.println("----------------------------------");


    }
}
