package org.example.DataStructure.Trees;

public class DiameterOfBinaryTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        System.out.println(diameterOfBinaryTree(root));
    }
    public static int diameterOfBinaryTree(Node root) {
        int[] diameter = new int[1];
        getDiameter(root,diameter);
        return diameter[0];
    }

    private static int getDiameter(Node root, int[] diameter) {
        if(root == null)
            return 0;

        if(root.left == null && root.right == null)
            return 1;

        int leftHeight = getDiameter(root.left,diameter);
        int rightHeight = getDiameter(root.right,diameter);

        diameter[0] = Math.max(diameter[0],leftHeight+rightHeight);

        return 1+Math.max(leftHeight,rightHeight);
    }

}
