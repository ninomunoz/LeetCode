package com.ninomunoz.Problems;

/**
 * 852. Peak Index in a Mountain Array
 *
 * Let's call an array A a mountain if the following properties hold:
 *
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that
 * A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 */

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] test1 = new int[] { 0, 1, 0 };
        int[] test2 = new int[] { 0, 2, 1, 0 };
        System.out.println(peakIndexInMountainArray(test1));
        System.out.println(peakIndexInMountainArray(test2));
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
//    static int peakIndexInMountainArray(int[] A) {
//        for (int i = 0; i < A.length - 1; i++) {
//            if (A[i+1] < A[i]) return i;
//        }
//        throw new IllegalArgumentException("A is not a mountain!");
//    }

    /*
        Binary Search
        Time Complexity: O(log n)
        Space Complexity: O(1)
     */
    static int peakIndexInMountainArray(int[] A) {
        int left = 0, right = A.length - 1, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (A[mid] < A[mid + 1])
                left = mid;
            else if (A[mid - 1] > A[mid])
                right = mid;
            else
                return mid;
        }
        throw new IllegalArgumentException("A is not a mountain!");
    }
}
