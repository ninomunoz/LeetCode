package com.ninomunoz.Problems;

/**
 * 700. Search in a Binary Search Tree
 *
 * Given the root node of a binary search tree (BST) and a value. You need to find the node in the BST that the node's
 * value equals the given value. Return the subtree rooted with that node. If such node doesn't exist, you should return
 * NULL.
 */

public class SearchInABinarySearchTree {

    public static void main(String[] args) {
        TreeNode tree = buildTree();
        TreeNode test1 = searchBST(tree, 5);
        TreeNode test2 = searchBST(tree, 2);
    }

    /*
        O(log n)
     */
//    static TreeNode searchBST(TreeNode root, int val) {
//        if (root == null) return null;
//        while (root != null) {
//            if (root.val == val)
//                return root;
//            root = root.val < val ? root.right : root.left;
//        }
//        return null;
//    }

    /*
        O(log n) - Recursive
     */
    static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        return (root.val > val) ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    static TreeNode buildTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;}
    }
}
