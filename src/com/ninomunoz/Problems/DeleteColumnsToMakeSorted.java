package com.ninomunoz.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 944. Delete Columns to Make Sorted
 *
 * We are given an array A of N lowercase letter strings, all of the same length.
 *
 * Now, we may choose any set of deletion indices, and for each string, we delete all the characters in those indices.
 *
 * For example, if we have an array A = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after
 * deletions is ["bef", "vyz"], and the remaining columns of A are ["b","v"], ["e","y"], and ["f","z"].  (Formally, the
 * c-th column is [A[0][c], A[1][c], ..., A[A.length-1][c]].)
 *
 * Suppose we chose a set of deletion indices D such that after deletions, each remaining column in A is in
 * non-decreasing sorted order.
 *
 * Return the minimum possible value of D.length.
 */

public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {
        String[] test = { "cba", "daf", "ghi" };
        String[] test2 = { "a", "b" };
        String[] test3 = { "zyx", "wvu", "tsr" };
        System.out.println(minDeletionSize(test));
        System.out.println(minDeletionSize(test2));
        System.out.println(minDeletionSize(test3));
    }

    /*
        Time Complexity: O(nm)
        Space Complexity: O(n)
     */
//    static int minDeletionSize(String[] A) {
//        boolean[] deleteColumns = new boolean[A[0].length()];
//        char[] chars = A[0].toCharArray();
//
//        for (int i = 1; i < A.length; i++) {
//            char[] ai = A[i].toCharArray();
//            for (int j = 0; j < chars.length; j++) {
//                if (chars[j] > ai[j])
//                    deleteColumns[j] = true;
//                chars[j] = ai[j];
//            }
//        }
//
//        int count = 0;
//        for (boolean b : deleteColumns) {
//            if (b) count++;
//        }
//        return count;
//    }

    /*
        Time Complexity: O(nm)
        Space Complexity: O(1)
     */
    static int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) { // char index
            for (int j = 0; j < A.length - 1; j++) { // string index
                if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


}
