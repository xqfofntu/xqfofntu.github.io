package 力扣;

/**
 * @Author xqf
 */
//最大子序和

public class Solution15 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        int targe = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            targe = sum;
            if (max < targe) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution15 a = new Solution15();
        int[] dd = {-1, 2, 4, -3, 3, -5, 2, -2};
        System.out.println(a.maxSubArray(dd));
    }
}
