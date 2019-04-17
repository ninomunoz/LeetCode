package com.ninomunoz.Problems;

/**
 * 509. Fibonacci Number
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is
 * the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 *
 * Given N, calculate F(N).
 */

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(2)); // 1
        System.out.println(fib(3)); // 2
        System.out.println(fib(4)); // 3
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static int fib(int N) {
        if (N <= 1) return N;
        int a = 0, b = 1; // F(0) = 0, F(1) = 1

        for (int i = 2; i <= N; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    /*
        Time Complexity: O(2^n)
        Space Complexity: O(n)
     */
//    static int fib(int N) {
//        if (N <= 1) return N;
//        return fib(N - 1) + fib(N - 2);
//    }
}
