package com.ninomunoz.Problems;

/**
 * 709. To Lower Case
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */

public class ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello")); // "hello
        System.out.println(toLowerCase("here")); // "here"
        System.out.println(toLowerCase("LOVELY")); // "lovely"
    }

    static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
