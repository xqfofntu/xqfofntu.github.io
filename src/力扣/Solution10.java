package 力扣;

import java.util.Arrays;

/**
 * @Author xqf
 */
//加1操作

public class Solution10 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution10 a = new Solution10();
        int dd[] = {1, 2, 3};
        a.plusOne(dd);
        System.out.println(Arrays.toString(dd));
    }

}
