package com.xqfofntu.suanfa;

import java.util.Arrays;
import java.util.Random;

/**
 * @Classname Main
 * @Date 2021/5/23
 * @Author xqf
 */
//54张扑克牌，三人发18张牌
class PaperAQuestion3ShowResult {
    public static void showResult(int[] p1, int[] p2, int[] p3) {
        int[] poker = new int[54];
        for (int i = 0; i < 18; i++) {
            poker[i] = p1[i];
            poker[i + 18] = p2[i];
            poker[i + 36] = p3[i];
        }
        Arrays.sort(poker);
        int[] check = new int[54];
        for (int i = 0; i < 54; i++) {
            check[i] = i + 1;
        }
        if (Arrays.equals(poker, check)) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int[] a = new int[54];
        Random rand = new Random();
        int index = 0;
        int num = 0;
        boolean flag = true;
        num = rand.nextInt(54) + 1;
        a[0] = num;
        System.out.println("-----------");
        while (index < 54) {
            num = rand.nextInt(54) + 1;
            System.out.println("===================");
            for (int i = 0; i < index + 1; i++) {
                if (a[i] == num) {
                    flag = false;
                }
            }
            if (flag) {
                a[index] = num;
                index++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


    }


}
