package 力扣;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author xqf
 */
//合并两个有序数组

public class Solution20 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int l = m + n - 1;
        while (j >= 0) {
            nums1[l--] = (i >= 0 && nums1[i] >= nums2[j]) ? nums1[l] = nums1[i--] : nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution20 a = new Solution20();
        int[] d1 = {1, 2, 3, 0, 0, 0};
        int[] d2 = {2, 5, 6};
        int m = 0;
        int n = 0;
        for (int i = 0; i < d1.length; i++) {
            if (d1[i] != 0) {
                m++;
            }
        }
        for (int j = 0; j < d2.length; j++) {
            if (d1[j] != 0) {
                n++;
            }
        }
        a.merge(d1, m, d2, n);
        System.out.println(Arrays.toString(d1));
    }
}
