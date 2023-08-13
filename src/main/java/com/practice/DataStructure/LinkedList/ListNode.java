package com.practice.DataStructure.LinkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode(){
    }
    ListNode(int data){
        this.val = data;
    }

    public ListNode createLinkedList1(){
        ListNode head = new ListNode(1);
//        ListNode l1 = new ListNode(2);
//        ListNode l2 =new ListNode(3);
//        ListNode l3 =new ListNode(4);

//        head.next = l1;
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = null;

        return head;
    }

    public ListNode createLinkedList2(){
        ListNode head = new ListNode(4);
        ListNode l1 = new ListNode(5);
        ListNode l2 =new ListNode(6);

        head.next = l1;
        l1.next = l2;
        l2.next = null;

        return head;
    }

    public void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        head.printLinkedList(head);
    }

}
