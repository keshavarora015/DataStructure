package com.practice.DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class LeftView {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer> ans = new ArrayList<>();
        leftView(root,ans,0);
        tree.print(ans);
    }
    /**
     *         3(0)
     *       /  \
     *   (1)9    20
     *          / \
     *     (2)15   7
     *            /
     *           8(3)
     * */
    private static void leftView(Node root, List<Integer> ans,int level) {

        if(root == null)
            return;

        if(level == ans.size()){
            ans.add(root.data);
        }
        leftView(root.left,ans,level+1);
        leftView(root.right,ans,level+1);

    }
}
