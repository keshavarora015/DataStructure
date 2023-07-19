package org.example.DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversalofBinaryTreeInAntiClockWiseDirection {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer> list = new ArrayList<>();
        boundaryTraversalAntiClockWise(root,list);
        tree.print(list);
    }

    private static void boundaryTraversalAntiClockWise(Node root, List<Integer> list) {
        //left traversal without leaf nodes
        //leaf nodes (left to right)
        //right traversal in reverse order
        if(!isLeaf(root))
            list.add(root.data);
        leftTraversal(root,list);
        leafNodes(root,list);
        rightTraversalReverse(root,list);
    }

    private static void rightTraversalReverse(Node root, List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        Node curr = root.right;
        while (curr != null){
            if(!isLeaf(curr)) temp.add(curr.data);
            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }
        for (int i= temp.size()-1; i >= 0;i--){
            list.add(temp.get(i));
        }
    }

    private static void leafNodes(Node root, List<Integer> list) {
        //preOrder
        if(root == null)
            return;
        if(isLeaf(root)) {
            list.add(root.data);
            return;
        }
        leafNodes(root.left,list);
        leafNodes(root.right,list);
    }

    private static void leftTraversal(Node root, List<Integer> list) {
        Node curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)) list.add(curr.data);
            if(curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    private static boolean isLeaf(Node curr) {
        if(curr!= null && curr.left == null && curr.right == null)
            return true;
        return false;
    }
}
