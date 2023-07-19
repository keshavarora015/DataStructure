package org.example.DataStructure.Trees;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(Node root) {
        if(height(root)!= -1 )
            return true;
        else
            return false;
    }

    private static int height(Node root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(leftHeight == -1 || rightHeight == -1)
            return -1;
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return 1+Math.max(leftHeight,rightHeight);
    }
}
