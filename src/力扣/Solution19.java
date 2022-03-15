package 力扣;

/**
 * @Author xqf
 */
//删除排序数组中的重复项

public class Solution19 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Solution19 a = new Solution19();
        int[] dd = {1, 1, 2, 3, 4, 4, 5};
        System.out.println(a.removeDuplicates(dd));
    }
}
