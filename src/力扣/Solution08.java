package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//实现 strStr()

public class Solution08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入原字符串：");
        String haystack = sc.next();
        System.out.print("输入所查字符串：");
        String needle = sc.next();

        if (haystack == null && needle == null) {
            System.out.println(-1);
        }
        int n = haystack.length();
        int m = needle.length();
        boolean flag = true;
        if (m > n) {
            System.out.println(-1);
            ;
        }
        for (int i = 0; i < n - m + 1; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                System.out.println("第一个位置为:" + i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println(-1);
        }
    }
}
