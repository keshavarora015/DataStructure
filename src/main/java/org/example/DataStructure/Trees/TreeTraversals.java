package org.example.DataStructure.Trees;

import java.util.*;

public class TreeTraversals {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();
//        System.out.println("Pre Order");
//        preOrder(root);
//        System.out.println();
//        System.out.println("In Order");
//        inOrder(root);
//        System.out.println();
//        System.out.println("Post Order");
//        postOrder(root);
//        System.out.println();
//        System.out.println("Level Order");
//        Vector<Integer> ans = levelOrder(root);
//        for (int i : ans){
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println("Level Order in 2D List");
//        List<List<Integer>> list = levelWiseOrder(root);
//        for(List<Integer> l : list){
//            for(int i : l){
//                System.out.print(i);
//            }
//        }

//        List<Integer> iterativePreOrder =  iterativePreOrder(root);
//        for (int data : iterativePreOrder){
//            System.out.print(data);
//        }

//        List<Integer> iterativePreOrder =  iterativeInOrder(root);
//        for (int data : iterativePreOrder){
//            System.out.print(data);
//        }

//        List<Integer> iterativePreOrder =  iterativePostOrder(root);
//        for (int data : iterativePreOrder){
//            System.out.print(data);
//        }

        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();
        getAllOrderInOneTraversal(root,preOrder,inOrder,postOrder);
        print(preOrder);
        System.out.println();
        print(inOrder);
        System.out.println();
        print(postOrder);

    }

    private static void print(List<Integer> list) {
        for (int data : list){
            System.out.print(data);
        }
    }
    private static void preOrder(Node root) {
        if(root==null)
            return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    private static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }

    private static Vector<Integer> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        Vector<Integer> ans = new Vector<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node front = queue.remove();
            ans.add(front.data);
            if (front.left != null)
                queue.add(front.left);
            if (front.right != null)
                queue.add(front.right);
        }
        return ans;
    }

    public static List<List<Integer>> levelWiseOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            while(queue.size() > 0) {
                Node front = queue.remove();
                level.add(front.data);
                if(front.left != null){
                    queue.add(front.left);
                }
                if(front.right != null){
                    queue.add(front.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }

    public static List<Integer> iterativePreOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            ans.add(top.data);
            if(top.right != null){
                stack.push(top.right);
            }
            if (top.left != null){
                stack.push(top.left);
            }
        }
        return ans;
    }

    public static List<Integer> iterativeInOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node currNode = root;
        while (true) {
            if (currNode != null){
                stack.push(currNode);
                currNode = currNode.left;
            }
            else {
                if (stack.isEmpty())
                    break;

                currNode = stack.pop();
                ans.add(currNode.data);
                currNode = currNode.right;
            }
        }
        return ans;
    }

    public static List<Integer> iterativePostOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            Node top = stack1.pop();
            stack2.add(top);
            if (top.left != null) {
                stack1.push(top.left);
            }
            if (top.right != null) {
                stack1.push(top.right);
            }
        }
        while (!stack2.isEmpty()){
            ans.add(stack2.pop().data);
        }
        return ans;
    }

    public static void getAllOrderInOneTraversal(Node root,List<Integer> preOrder,List<Integer> inOrder,List<Integer> postOrder) {
        //if num == 1, insert in pre, num++,insert into stack and its left child
        //if num == 2, insert in in, num++,insert into stack and its right child
        //if num == 3, insert in post, num++,pop out from stack;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root,1));
        while (!stack.isEmpty()){
            Pair top = stack.pop();
            if(top.count == 1){
                preOrder.add(top.root.data);
                top.count++;
                stack.push(top);
                if(top.root.left != null){
                    stack.push(new Pair(top.root.left,1));
                }

            } else if(top.count == 2) {
                inOrder.add(top.root.data);
                top.count++;
                stack.push(top);
                if(top.root.right != null){
                    stack.push(new Pair(top.root.right,1));
                }
            } else if (top.count == 3) {
                postOrder.add(top.root.data);
            }
        }
    }
    public static class Pair{
        Node root;
        int count;
        Pair(Node root,int count){
            this.root = root;
            this.count = count;
        }
    }
}
