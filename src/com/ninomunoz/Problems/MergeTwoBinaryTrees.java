package com.ninomunoz.Problems;

/**
 * 617. Merge Two Binary Trees
 *
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are
 * overlapped while the others are not.
 *
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up
 * as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 */

public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        // build t1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        // build t2
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        printTree(t1);
        System.out.println();
        printTree(t2);
        System.out.println();

        TreeNode ans = mergeTrees(t1, t2);
        printTree(ans);
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }

        if (t2 != null) {
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }

        return t1;
    }

    // In-Order Print
    static void printTree(TreeNode t) {
        if (t == null) return;
        printTree(t.left);
        System.out.print(t.val + " ");
        printTree(t.right);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}