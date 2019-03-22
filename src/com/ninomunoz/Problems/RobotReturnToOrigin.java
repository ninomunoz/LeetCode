package com.ninomunoz.Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 657. Robot Return to Origin
 *
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this
 * robot ends up at (0, 0) after it completes its moves.
 *
 * The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are
 * R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves,
 * return true. Otherwise, return false.
 *
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once, "L"
 * will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 */

public class RobotReturnToOrigin {

//    static Map<Character, Integer> movesMap;
//    static {
//        movesMap = new HashMap<>();
//        movesMap.put('U', 0);
//        movesMap.put('D', 0);
//        movesMap.put('L', 0);
//        movesMap.put('R', 0);
//    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
//    static boolean judgeCircle(String moves) {
//        for (char c : moves.toCharArray()) {
//            movesMap.put(c, movesMap.get(c) + 1);
//        }
//
//        return movesMap.get('U').equals(movesMap.get('D')) && movesMap.get('L').equals(movesMap.get('R'));
//    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static boolean judgeCircle(String moves) {
        int sumX = 0, sumY = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') sumY++;
            if (c == 'D') sumY--;
            if (c == 'L') sumX--;
            if (c == 'R') sumX++;
        }
        return sumX == 0 && sumY == 0;
    }
}
