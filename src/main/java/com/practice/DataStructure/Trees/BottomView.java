package com.practice.DataStructure.Trees;

import java.util.*;

public class BottomView {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer> ans = bottomView(root);
        tree.print(ans);
    }

    private static List<Integer> bottomView(Node root) {
        Queue<TreeTraversals.Pair> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        Map<Integer,Node> map = new TreeMap<>();
        queue.add(new TreeTraversals.Pair(root,0));
        while (!queue.isEmpty()){
            TreeTraversals.Pair front = queue.remove();
            map.put(front.count, front.root);
            if(front.root.left != null)
                queue.add(new TreeTraversals.Pair(front.root.left, front.count-1));
            if(front.root.right != null)
                queue.add(new TreeTraversals.Pair(front.root.right, front.count+1));
        }

        for(Map.Entry<Integer,Node> mp : map.entrySet()){
            ans.add(mp.getValue().data);
        }
        return ans;

    }
}
