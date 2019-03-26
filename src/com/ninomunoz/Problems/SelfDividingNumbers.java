package com.ninomunoz.Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 *
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if
 * possible.
 */

public class SelfDividingNumbers {

    public static void main(String[] args) {
        List<Integer> nums = selfDividingNumbers(1, 22);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /*
        Time Complexity: O(nm)
        Space Complexity: O(n)
     */
    static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividingNumber(i)) {
                selfDividingNumbers.add(i);
            }
        }
        return selfDividingNumbers;
    }

    static boolean isSelfDividingNumber(int num) {
        if (num == 0) return false;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0) return false;
            n /= 10;
        }
        return true;
    }

}
