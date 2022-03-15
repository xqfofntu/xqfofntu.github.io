package Javalearn;

import java.util.Arrays;

public class Shuzu {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = Arrays.copyOf(a, 7);   //数组复制，通常增加数组长度，数值多余为0，布尔多余为false
        for (int i : b) {
            System.out.print(i);
        }


        int[] x = new int[]{2, 5, 8, 4, 7, 3, 5, 2, 9, 0};
        Arrays.sort(x);                              //排序
        for (int i : x) {
            System.out.print(i);
        }

    }
}
