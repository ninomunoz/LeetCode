package com.ninomunoz.Problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * 1. Two Sum
     *
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */

    public static void main(String[] args) {
        int[] ans = twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(ans[0] + " " + ans[1]);
    }

    /*
        Brute Force

        Time Complexity: O(n^2)
        Space Complexity: O(1)
     */

//    static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i])
//                    return new int[] { i, j };
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

    /*
        Two-pass Hash Table

        Time Complexity: O(n)
        Space Complexity: O(n)
     */

//    static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i); // Key: num, Value: index
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement) && map.get(complement) != i) {
//                return new int[] { i, map.get(complement) };
//            }
//        }
//
//        throw new IllegalArgumentException("No two sum solution");
//    }

    /*
        One-pass Hash Table

        Time Complexity: O(n)
        Space Complexity: O(n)
     */

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[] { map.get(complement), i };
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
