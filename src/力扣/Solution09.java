package 力扣;

/**
 * @Author xqf
 */
//数组移除元素

public class Solution09 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6, 4, 5, 8, 9, 3};
        int val = 3;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println("新数组的长度：" + j);
        ;
    }
}
