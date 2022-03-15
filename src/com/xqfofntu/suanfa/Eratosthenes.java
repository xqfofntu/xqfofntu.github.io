package com.xqfofntu.suanfa;

/**
 * @Classname Eratosthenes
 * @Date 2021/5/9
 * @Author xqf
 */


//素数  埃筛法
public class Eratosthenes {

    public static int eratosthenes(int n) {
        boolean[] isPrime = new boolean[n];  //false表示素数
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(eratosthenes(100));
    }
}
