package com.practice.DataStructure.Trees;

import java.util.List;

public class Tree {

    public Node createTree(){
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        return root;
    }
    /**
     *         3
     *       /  \
     *      9    20
     *          / \
     *       15    7
     *            /
     *           8
     *
     * */

    public void print(List<Integer> list) {
        for (int data : list){
            System.out.print(data);
        }
    }

    public void print2(List<List<Integer>> list) {
        for(List<Integer> internalList : list ){
            for (int data : internalList ){
                System.out.print(data);
            }
        }
    }
}
