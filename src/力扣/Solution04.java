package 力扣;

import java.util.Scanner;

/**
 * @Author xqf
 */
//把数字翻译成字符串，从0-25 翻译成 a-z;

public class Solution04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        int a = 1;
        int b = 1;
        for (int i = 0; i < str.length() - 2; i++) {
            String temp = str.substring(i, i + 2);
            int c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b : a;
            b = a;
            a = c;
        }
        System.out.println(a);
    }
}
