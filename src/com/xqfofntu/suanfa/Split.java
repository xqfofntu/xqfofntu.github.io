package com.xqfofntu.suanfa;

/**
 * @Classname Split
 * @Date 2021/5/23
 * @Author xqf
 */

//字符串放入数组
public class Split {

    public static void main(String[] args) {
        String str = "1|2|3|4|5|6|7|8|9|0";
        String[] result = str.split("");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
