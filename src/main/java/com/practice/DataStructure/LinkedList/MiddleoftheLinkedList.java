package com.practice.DataStructure.LinkedList;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList2();
        ListNode newHead = middleNode(head);
        System.out.println(newHead.val);
    }
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
