package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//回文数

public class Solution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 0 || x % 10 == 0) {
            System.out.println(false);
        }
        int res = 0;
        int ys = x;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res == ys) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
