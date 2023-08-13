package com.practice.DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class RootTOLeafPath {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer> ans = new ArrayList<>();
        rootToLeafPath(root,ans,8);
        tree.print(ans);
    }
    /**
     *         3
     *       /  \
     *      9    20
     *          / \
     *       15    7
     *            /
     *           8
     * */
    private static boolean rootToLeafPath(Node root, List<Integer> ans, int leaf) {
        if(root == null)
            return false;
        ans.add(root.data);
        if(root.data == leaf){
            return true;
        }
        boolean left = rootToLeafPath(root.left,ans,leaf);
        boolean right = rootToLeafPath(root.right,ans,leaf);

        if(left || right)
            return true;
        ans.remove(ans.size()-1);
        return false;
    }
}
