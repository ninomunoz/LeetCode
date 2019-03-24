package com.ninomunoz.Problems;

/**
 * 461. Hamming Distance
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 */

public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    /*
        Complexity: O(1)
     */
    static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
