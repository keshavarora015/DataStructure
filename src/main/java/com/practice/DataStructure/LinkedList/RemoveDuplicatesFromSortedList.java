package com.practice.DataStructure.LinkedList;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        head.printLinkedList(deleteDuplicates(head));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = slow.next;

        while(fast != null){
            if(slow.val == fast.val){
                fast = fast.next;
                continue;
            }
            slow.next = fast;
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
