package com.practice.DataStructure.LinkedList;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        head.printLinkedList(oddEvenList(head));
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;

        ListNode oddHead = null;
        ListNode oddTail = null;
        ListNode evenHead = null;
        ListNode evenTail = null;

        int count = 0;
        while(head != null){
            count++;
            if (count %2 == 0) {
                if(evenHead == null){
                    evenHead = evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }
            else {
                if(oddHead == null){
                    oddHead = oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if(evenHead != null){
            oddTail.next = evenHead;
            evenTail.next = null;
        }
        return oddHead;
    }
}
