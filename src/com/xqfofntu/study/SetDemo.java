package com.xqfofntu.study;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname SetDemo
 * @Date 2021/4/4
 * @Author xqf
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        while (true) {
            int num = (int) (Math.random() * 10 + 1);
            set.add(num);

            if (set.size() == 10) {
                break;
            }
        }

        for (int str : set) {
            System.out.println(str);
        }
    }
}
