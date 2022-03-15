package 力扣;

import java.util.Arrays;

/**
 * @Author xqf
 */
public class Solution16 {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution16 a = new Solution16();
        int[] dd = {2, 4, 6, 8, 12, 14, 17, 19};
        int target = 20;
        System.out.println(Arrays.toString(a.twoSum(dd, target)));
    }
}
