package com.ninomunoz.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 804. Unique Morse Code Words
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as
 * follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *   A    B      C      D     E   F      G     H      I    J      K     L      M    N    O     P      Q      R     S
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
 *
 *  T   U     V      W     X      Y      Z
 * "-","..-","...-",".--","-..-","-.--","--.."]
 *
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
 * We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 */

public class UniqueMorseCodeWords {

    final static Map<Character, String> morseMap = new HashMap<Character, String>() {
        {
            put('a', ".-");
            put('b', "-...");
            put('c', "-.-.");
            put('d', "-..");
            put('e', ".");
            put('f', "..-.");
            put('g', "--.");
            put('h', "....");
            put('i', "..");
            put('j', ".---");
            put('k', "-.-");
            put('l', ".-..");
            put('m', "--");
            put('n', "-.");
            put('o', "---");
            put('p', ".--.");
            put('q', "--.-");
            put('r', ".-.");
            put('s', "...");
            put('t', "-");
            put('u', "..-");
            put('v', "...-");
            put('w', ".--");
            put('x', "-..-");
            put('y', "-.--");
            put('z', "--..");
        }
    };

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[] { "rwjje","aittjje","auyyn","lqtktn","lmjwn" }));
    }

    /*
        O(nm)
     */
    private static int uniqueMorseRepresentations(String[] words) {
        Set<String> transformations = new HashSet<>();
        StringBuilder transformation = new StringBuilder();

        for (String word : words) {

            for (char c : word.toCharArray()) {
                transformation.append(morseMap.get(c));
            }
            transformations.add(transformation.toString());
            transformation.setLength(0);
        }
        return transformations.size();
    }
}
