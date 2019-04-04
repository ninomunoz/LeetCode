package com.ninomunoz.Problems;

/**
 * 965. Univalued Binary Tree
 *
 * A binary tree is univalued if every node in the tree has the same value.
 *
 * Return true if and only if the given tree is univalued.
 */

public class UnivaluedBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = buildTree();
        System.out.println(isUnivalTree(tree));
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    static boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }

    static boolean isUnivalTree(TreeNode node, int val) {
        if (node == null) return true;
        if (node.val != val) return false;
        return isUnivalTree(node.left, val) && isUnivalTree(node.right, val);
    }

    static TreeNode buildTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(1);
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
