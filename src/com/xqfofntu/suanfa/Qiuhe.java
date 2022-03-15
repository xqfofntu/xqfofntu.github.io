package com.xqfofntu.suanfa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Qiuhe
 * @Date 2021/5/12
 * @Author xqf
 */

//求数组中两数之和等于target
public class Qiuhe {
    public static int[] qiuhe(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int[] num = qiuhe(nums, 7);
        System.out.println(Arrays.toString(num));
    }
}
