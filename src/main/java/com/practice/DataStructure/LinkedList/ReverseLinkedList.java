package com.practice.DataStructure.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        //ListNode newHead  = reverseLinkList(head);
        ListNode newHead = reverseLinkListIterative(head);
        head.printLinkedList(newHead);
    }

//    private static ListNode reverseLinkList(ListNode head) {
//        if(head == null || head.next == null) return head;
//        ListNode temp = head.next;
//        ListNode newHead = reverseLinkList(head.next);
//        temp.next = head;
//        head.next = null;
//        return  newHead;
//    }

    private static ListNode reverseLinkListIterative(ListNode head) {
        ListNode prev;
        ListNode curr = null;
        ListNode next = head;
        while(next != null){
            prev = curr;
            curr = next;
            next = next.next;
            curr.next = prev;
        }
        return curr;
    }
}
/**
 *
 *      1 -> 2-> 3
 *      null<-1 <- 2  3
 *                 p  c  n
 *
 * */