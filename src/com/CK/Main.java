package com.CK;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(11);
        TreeNode node6 = new TreeNode(16);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
        TreeNode node9 = new TreeNode(4);
        TreeNode node10 = new TreeNode(8);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node6 = new TreeNode(4);
//        TreeNode node13 = new TreeNode(9);
//        TreeNode node14 = new TreeNode(8);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node9;
        node4.right = node10;
//        node6.left = node13;
//        node6.right = node14;

        Solution solution = new Solution();
        System.out.println(solution.lowestCommonAncestor(root, node3, node10).val);
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        if ((root.val - p.val) * (root.val - q.val) < 0) return root;
        if (((root.val - p.val) * (root.val - q.val) > 0) && (root.val - p.val) > 0)
            return lowestCommonAncestor(root.left, p, q);
        if (((root.val - p.val) * (root.val - q.val) > 0) && (root.val - p.val) < 0)
            return lowestCommonAncestor(root.right, p, q);
        return null;
    }
}