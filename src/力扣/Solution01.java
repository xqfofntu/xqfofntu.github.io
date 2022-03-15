package 力扣;

import java.util.Random;

/**
 * @Author xqf
 */
//两数之和

public class Solution01 {
    //    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0;i < nums.length - 1;i++){
//            for(int j = i + 1;j < nums.length;j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{-1 , -1};
//    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        Random rand = new Random();
        int target = rand.nextInt(17);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + (i - 1) + "," + (j - 1) + "]");
                }
            }
        }

    }

}
