package org.example.DataStructure.Trees;

public class SameTree {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        System.out.println(isSameTree(root,root));
    }
    public static boolean isSameTree(Node p, Node q) {
        if(p == null || q == null)
            return p == q;

        return (p.data == q.data)
                && isSameTree(p.left,q.left)
                && isSameTree(p.right,q.right);
    }
}
