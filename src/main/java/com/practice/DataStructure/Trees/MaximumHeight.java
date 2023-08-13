package com.practice.DataStructure.Trees;

public class MaximumHeight {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(Node root) {
        if(root == null )
            return 0;

        if(root.left == null && root.right == null)
            return 1;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1+ Math.max(leftHeight,rightHeight);
    }
}
