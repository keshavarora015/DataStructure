package org.example.DataStructure.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrderTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<List<Integer>> zigzag = levelOrderTraversal(root);
        for (List<Integer> list : zigzag){
            for (Integer data : list){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> levelOrderTraversal(Node root) {
        int level = 0; //even -> left to right // odd -> right to left
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size>0){
                Node front = queue.peek();
                list.add(front.data);
                if(level%2 == 0){
                    if(front.right != null)
                        queue.add(front.right);
                    if(front.left != null)
                        queue.add(front.left);
                } else {
                    if(front.left != null)
                        queue.add(front.left);
                    if(front.right != null)
                        queue.add(front.right);
                }
                queue.remove();
                size--;
            }
            level++;
            ans.add(list);
        }
        return ans;
    }
}
