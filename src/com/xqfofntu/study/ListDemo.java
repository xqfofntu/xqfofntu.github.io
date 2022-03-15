package com.xqfofntu.study;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Test1
 * @Date 2021/4/4
 * @Author xqf
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        while (true) {
            int num = (int) (Math.random() * 10 + 1);

            if (!list.contains(num)) {
                list.add(num);
            }
            if (list.size() == 10) {
                break;
            }
        }

        for (int str : list) {
            System.out.println(str);
        }

    }
}
