package 力扣;

/**
 * @Author xqf
 */
//只出现一次的数字 异或

public class Solution21 {
//    public int singleNumber(int[] nums) {
//        // 0 和任何数异或都等于该数本身。
//        int ans = 0;
//        // 用 0 和数组中所有数依次进行异或运算得到数组中唯一的数。。
//        for (int num : nums) {
//            ans ^= num;
//        }
//        return ans;
//    }

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        Solution21 a = new Solution21();
        int[] dd = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(a.singleNumber(dd));
    }
}
