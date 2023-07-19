package org.example.DataStructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class RightView {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
        List<Integer> ans = new ArrayList<>();
        rightView(root,ans,0);
        tree.print(ans);
    }
    /**
     *         3(0)
     *       /  \
     *      9    20(1)
     *          / \
     *       15    7(2)
     *            /
     *           8(3)
     * */
    private static void rightView(Node root, List<Integer> ans,int level) {

        if(root == null)
            return;

        if(level == ans.size()){
            ans.add(root.data);
        }
        rightView(root.right,ans,level+1);
        rightView(root.left,ans,level+1);
    }
}
