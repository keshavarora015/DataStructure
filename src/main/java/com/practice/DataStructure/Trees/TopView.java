package com.practice.DataStructure.Trees;

import java.util.*;

public class TopView {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer>ans = topView(root);
        tree.print(ans);
    }

    private static List<Integer> topView(Node root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeTraversals.Pair> queue = new LinkedList<>();
        Map<Integer,Node> map = new TreeMap<>();
        queue.add(new TreeTraversals.Pair(root,0));
        while (!queue.isEmpty()){
            TreeTraversals.Pair front = queue.remove();
            if(!map.containsKey(front.count)){
                map.put(front.count,front.root);
            }
            if(front.root.left != null){
                queue.add(new TreeTraversals.Pair(front.root.left, front.count-1));
            }
            if(front.root.right != null){
                queue.add(new TreeTraversals.Pair(front.root.right, front.count+1));
            }
        }

        for ( Map.Entry<Integer,Node> m : map.entrySet()){
            ans.add(m.getValue().data);
        }
        return ans;
    }
}

