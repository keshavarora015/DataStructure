package com.practice.DataStructure.Trees;

public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        System.out.println(maxPathSum(root));
    }

    private static int maxPathSum(Node root) {
        int[] maxPathSum = new int[1];
        calculateMaxPathSum(root,maxPathSum);
        return maxPathSum[0];
    }

    private static int calculateMaxPathSum(Node root, int[] maxPathSum) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return root.data;

        int leftSum = calculateMaxPathSum(root.left,maxPathSum);
        int rightSum = calculateMaxPathSum(root.right,maxPathSum);
        maxPathSum[0] = Math.max(maxPathSum[0],leftSum+rightSum+root.data);
        return Math.max(leftSum,rightSum)+root.data;
    }
}
