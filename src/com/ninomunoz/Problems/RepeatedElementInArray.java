package com.ninomunoz.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 961. N-Repeated Element in Size 2N Array
 *
 * In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
 *
 * Return the element repeated N times.
 */

public class RepeatedElementInArray {

    public static void main(String[] args) {
        int ans = repeatedNTimes(new int[] { 1, 2, 3, 3 }); // 3
        System.out.println(ans);
    }

    /*
        O(n)
     */
//    static int repeatedNTimes(int[] A) {
//        int n = A.length / 2;
//        Map<Integer, Integer> counts = new HashMap<>();
//        for (int a : A) {
//            counts.putIfAbsent(a, 0);
//            int newCount = counts.get(a) + 1;
//            if (newCount == n) return a;
//            counts.put(a, counts.get(a) + 1);
//        }
//        throw new IllegalArgumentException("No solution");
//    }

    /*
        O(n) - Optimized
     */
    static int repeatedNTimes(int[] A) {
        int n = A.length / 2;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int a : A) {
            if (nums.contains(a)) return a; // repeated element is the answer
            nums.add(a);
        }
        throw new IllegalArgumentException("No solution");
    }
}
