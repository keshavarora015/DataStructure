package org.example.DataStructure.Trees;

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<List<Integer>> list = verticalOrderTraversal(root);
        tree.print2(list);
    }

    private static List<List<Integer>> verticalOrderTraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Triplet> queue = new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        queue.add(new Triplet(root,0,0));
        while (!queue.isEmpty()){
            Triplet front = queue.remove();
            //in map that vertex does not exist
            if(!map.containsKey(front.vertical))
                map.put(front.vertical,new TreeMap<>());
            //in map vertex exist but that level values does not exist
            if(!map.get(front.vertical).containsKey(front.level)) {
                map.get(front.vertical).put(front.level,new PriorityQueue<>());
            }
            map.get(front.vertical).get(front.level).offer(front.root.data);
            if(front.root.left != null)
                queue.add(new Triplet(front.root.left,front.vertical-1, front.level+1));
            if(front.root.right != null)
                queue.add(new Triplet(front.root.right,front.vertical+1, front.level+1));
        }
        for (TreeMap<Integer,PriorityQueue<Integer>> m : map.values()){
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> pq : m.values()){
                while (!pq.isEmpty()){
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
        return ans;
    }

    static class Triplet{
        Node root;
        int vertical;
        int level;

        public Triplet(Node root, int vertical, int level) {
            this.root = root;
            this.vertical = vertical;
            this.level = level;
        }
    }
}
