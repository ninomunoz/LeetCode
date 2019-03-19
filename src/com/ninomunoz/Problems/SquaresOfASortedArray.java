package com.ninomunoz.Problems;

import java.util.Arrays;

/**
 * 977. Squares of a Sorted Array
 *
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in
 * sorted non-decreasing order.
 */

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] test = new int[] { -4, -1, 0, 3, 10 };
        int[] squares = sortedSquares(test);
        for (int square : squares) {
            System.out.println(square);
        }
    }

    /*
        Time Complexity: O(n + n log n)
        Space Complexity: O(n)
     */
//    static int[] sortedSquares(int[] A) {
//        int[] squares = new int[A.length];
//
//        for (int i = 0; i < A.length; i++) {
//            squares[i] = A[i] * A[i];
//        }
//
//        Arrays.sort(squares);
//        return squares;
//    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    static int[] sortedSquares(int[] A) {
        int[] squares = new int[A.length];
        int left = 0, right = A.length - 1, index = right;

        while (left <= right) {
            int bigger = Math.abs(A[left]) > Math.abs(A[right]) ? A[left++] : A[right--];
            squares[index--] = bigger * bigger;
        }

        return squares;
    }
}
