package com.ninomunoz.Problems;

/**
 * 999. Available Captures for Rook
 *
 * On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.
 * These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and
 * lowercase characters represent black pieces.
 *
 * The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south),
 * then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored
 * pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly
 * bishops.
 *
 * Return the number of pawns the rook can capture in one move.
 */

public class AvailableCapturesForRook {

    public static void main(String[] args) {
        char[][] test1 = {
                { '.','.','.','.','.','.','.','.' },
                { '.','.','.','p','.','.','.','.' },
                { '.','.','.','R','.','.','.','p' },
                { '.','.','.','.','.','.','.','.' },
                { '.','.','.','.','.','.','.','.' },
                { '.','.','.','p','.','.','.','.' },
                { '.','.','.','.','.','.','.','.' },
                { '.','.','.','.','.','.','.','.' }
        };

        System.out.println(numRookCaptures(test1));
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
     */
    static int numRookCaptures(char[][] board) {
        // find rook
        int[] rook = findRook(board);
        if (rook == null) return 0;

        int rookRow = rook[0], rookCol = rook[1], numCaptures = 0;

        // check left
        for (int col = rookCol - 1; col >= 0; col--) {
            char piece = board[rookRow][col];
            if (piece == '.') continue;
            if (piece == 'B') break;
            if (piece == 'p') {
                numCaptures++;
                break;
            }
        }

        // check right
        for (int col = rookCol + 1; col < 8; col++) {
            char piece = board[rookRow][col];
            if (piece == '.') continue;
            if (piece == 'B') break;
            if (piece == 'p') {
                numCaptures++;
                break;
            }
        }

        // check up
        for (int row = rookRow - 1; row >= 0; row--) {
            char piece = board[row][rookCol];
            if (piece == '.') continue;
            if (piece == 'B') break;
            if (piece == 'p') {
                numCaptures++;
                break;
            }
        }

        // check down
        for (int row = rookRow + 1; row < 8; row++) {
            char piece = board[row][rookCol];
            if (piece == '.') continue;
            if (piece == 'B') break;
            if (piece == 'p') {
                numCaptures++;
                break;
            }
        }

        return numCaptures;
    }

    static int[] findRook(char[][] board) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (board[row][col] == 'R') {
                    return new int[] { row, col };
                }
            }
        }
        return null;
    }
}
