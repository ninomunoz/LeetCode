package com.ninomunoz.Problems;

import java.util.Arrays;

/**
 * 561. Array Partition I
 *
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 */

public class ArrayPartitionI {

    public static void main(String[] args) {
        int[] test = new int[] { 1, 4, 3, 2 };
        System.out.println(arrayPairSum(test));
    }

    /*
        Time Complexity: O(n log n)
        Space Complexity: O(1)
     */
//    static int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int sum = 0;
//        for (int i = 0; i < nums.length; i += 2) {
//            sum += nums[i];
//        }
//        return sum;
//    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static int arrayPairSum(int[] nums) {
        int[] counts = new int[20001]; // 20,001, range is [-10000, 10000]
        for (int num : nums) {
            counts[num + 10000]++;
        }
        int sum = 0;
        boolean shouldAdd = true;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                if (shouldAdd) sum += i - 10000;
                shouldAdd = !shouldAdd;
                counts[i]--;
            }
        }
        return sum;
    }
}
