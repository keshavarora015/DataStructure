package com.practice.DataStructure.LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}
