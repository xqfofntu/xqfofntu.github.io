package 力扣;

import java.util.Arrays;

/**
 * @Author xqf
 */
// 转变数组后最接近目标值的数组和

public class Solution17 {
    public int findBestValue(int[] arr, int target) {
        int sum = 0;
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            int res = (target - sum) / (len - i);
            if (arr[i] > res) {
                double temp = (double) (target - sum) / (len - i);
                if (temp - res > 0.5) {
                    return res + 1;
                } else {
                    return res;
                }
            }
            sum += arr[i];
        }
        return arr[len - 1];
    }

    public static void main(String[] args) {
        Solution17 a = new Solution17();
        int[] dd = {4, 9, 3};
        int m = 10;
        System.out.println(a.findBestValue(dd, m));

    }
}
