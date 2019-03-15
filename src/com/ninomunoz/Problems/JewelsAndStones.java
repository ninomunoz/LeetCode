package com.ninomunoz.Problems;

import java.util.HashSet;
import java.util.Set;

/**
 *  771. Jewels and Stones
 *
 *  You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 *  Each character in S is a type of stone you have. You want to know how many of the stones you have are also jewels.
 *
 *  The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so
 *  "a" is conisdered a different type of stone from "A".
 */

public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(numJewelsInStones("z", "ZZ")); // 0
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */

    static int numJewelsInStones(String j, String s) {
        Set<Character> jewels = new HashSet<>();
        for (char c : j.toCharArray()) {
            jewels.add(c);
        }

        int count = 0;

        for (char c : s.toCharArray()) {
            if (jewels.contains(c))
                count++;
        }

        return count;
    }
}
