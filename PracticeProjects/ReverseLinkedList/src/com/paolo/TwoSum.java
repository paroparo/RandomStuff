package com.paolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] testArray = new int[]{1, 4, 6, 8, 10};
        int[] result = TwoSum.twoSum(testArray, 11);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}
