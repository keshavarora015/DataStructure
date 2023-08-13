package com.practice.DataStructure.LinkedList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        ListNode newHead = removeNthFromEnd(head,4);
        head.printLinkedList(newHead);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null) return null;

        ListNode fast = head;
        ListNode slow = head;

        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        if (fast==null)return head.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
