package com.ninomunoz.Problems;

/**
 * 832. Flipping an Image
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0]
 * horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1]
 * results in [1, 0, 0].
 *
 */

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] test = new int[][] {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        int[][] test2 = new int[][] {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 }
        };

        int[][] ans1 = flipAndInvertImage(test);
        int[][] ans2 = flipAndInvertImage(test2);

        printArray(ans1);
        printArray(ans2);
    }

    /*
        Time Complexity: O(nm)
        Space Complexity: O(1)
     */
    static int[][] flipAndInvertImage(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            int left = 0, right = A[0].length - 1;
            while (left <= right) {
                if (left != right) {
                    int leftCopy = A[row][left];
                    A[row][left++] = invert(A[row][right]);
                    A[row][right--] = invert(leftCopy);
                } else { // at the middle, just invert
                    A[row][left] = invert(A[row][left]);
                    break;
                }
            }
        }
        return A;
    }

    static int invert(int n) {
        return n == 0 ? 1 : 0;
    }

    static void printArray(int[][] A) {
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                System.out.print(A[row][col] + " ");
            }
            System.out.println();
        }
    }

}
