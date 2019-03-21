package com.ninomunoz.Problems;

/**
 * 905. Sort Array By Parity
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all
 * the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 */

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] test = new int[] { 3, 1, 2, 4 };
        int[] res = sortArrayByParity(test);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
//    static int[] sortArrayByParity(int[] A) {
//        int[] sorted = new int[A.length];
//        int left = 0, right = A.length - 1;
//        for (int a : A) {
//            if (a % 2 == 0) { // even
//                sorted[left++] = a;
//            } else { // odd
//                sorted[right--] = a;
//            }
//        }
//        return sorted;
//    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 == 0) left++;
            if (A[right] % 2 == 1) right--;

            if (A[left] % 2 == 1 && A[right] % 2 == 0) {
                int temp = A[left];
                A[left++] = A[right];
                A[right--] = temp;
            }
        }
        return A;
    }
}
