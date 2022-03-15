package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//斐波那契数列

public class Solution05 {
    public static void main(String[] args) {
        System.out.print("输入你要找的第几项：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("结果为：" + n);
            ;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i < n; i++) {
            int c = a + b;
            a = b;
            b = c % (1000000007);
        }
        System.out.println("结果为：" + b);
        ;
    }
}
