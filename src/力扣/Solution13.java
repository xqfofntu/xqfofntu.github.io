package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//爬楼梯

public class Solution13 {

//    递归
//    public int climbStairs(int n) {
//        if (n == 1) {
//            return 1;
//        } else if (n == 2) {
//            return 2;
//        } else {
//            return climbStairs(n - 1) + climbStairs(n - 2);
//        }
//    }

    //    动态规划
    public int climbStairs(int n) {
        int[] result = new int[n + 3];
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

    public static void main(String[] args) {
        Solution13 a = new Solution13();
        System.out.println("输入总的台阶数：6");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(a.climbStairs(m));
    }
}
