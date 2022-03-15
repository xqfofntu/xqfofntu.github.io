package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//pow(x,n)

public class Solution14 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        boolean f = false;
        if (n < 0) {
            n = n * (-1);
            f = true;
        }
        if (n > 1) {
            double y = x;
            for (int i = 1; i < n; i++) {
                x *= y;
            }
        }
        if (f) {
            return 1 / x;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        Solution14 a = new Solution14();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数值：");
        double x = sc.nextInt();
        System.out.println("输入次方：");
        int n = sc.nextInt();
        System.out.println(a.myPow(x, n));
    }
}
