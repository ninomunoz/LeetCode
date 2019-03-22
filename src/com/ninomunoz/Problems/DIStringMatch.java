package com.ninomunoz.Problems;

/**
 * 942. DI String Match
 *
 * Given a string S that only contains "I" (increase) or "D" (decrease), let N = S.length.
 *
 * Return any permutation A of [0, 1, ..., N] such that for all i = 0, ..., N-1:
 *
 * If S[i] == "I", then A[i] < A[i+1]
 * If S[i] == "D", then A[i] > A[i+1]
 */

public class DIStringMatch {

    public static void main(String[] args) {
        int[] test1 = diStringMatch("IDID");
        printArray(test1);
        int[] test2 = diStringMatch("III");
        printArray(test2);
        int[] test3 = diStringMatch("DDI");
        printArray(test3);
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    static int[] diStringMatch(String S) {
        int N = S.length();
        int[] res = new int[N + 1];
        int min = 0, max = N;

        for (int i = 0; i < N; i++) {
            res[i] = S.charAt(i) == 'D' ? max-- : min++;
        }
        res[N] = S.charAt(N - 1) == 'D' ? res[N-1] - 1 : res[N-1] + 1;
        return res;
    }

    static void printArray(int[] a) {
        for (int n : a) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
