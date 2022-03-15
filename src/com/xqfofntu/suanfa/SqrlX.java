package com.xqfofntu.suanfa;

/**
 * @Classname SqrlX
 * @Date 2021/5/9
 * @Author xqf
 */

//二分法 找x的开方整数部分
public class SqrlX {

    public static int binarySearch(int x) {
        int index = -1;
        int l = 0;
        int r = x;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(25));
    }
}
