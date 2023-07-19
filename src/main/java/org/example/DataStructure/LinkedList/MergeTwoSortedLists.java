package org.example.DataStructure.LinkedList;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode().createLinkedList1();
        ListNode head2 = new ListNode().createLinkedList2();
        ListNode newHead = mergeSortedList(head1,head2);
        head1.printLinkedList(newHead);
    }

    private static ListNode mergeSortedList(ListNode head1, ListNode head2) {
        if(head1 == null)
            return head2;

        if(head2 == null)
            return head1;

        ListNode newHead;
        ListNode newTail;

        if(head1.val < head2.val){
            newHead = newTail = head1;
            head1 = head1.next;
        }
        else {
            newHead = newTail = head2;
            head2 = head2.next;
        }

        while( head1!= null && head2 != null){
            if(head1.val < head2.val){
                newTail.next = head1;
                newTail = head1;
                head1 = head1.next;
            } else {
                newTail.next = head2;
                newTail = head2;
                head2 = head2.next;
            }
        }

        while(head1!= null){
            newTail.next = head1;
            newTail = head1;
            head1 = head1.next;
        }

        while (head2 != null){
            newTail.next = head2;
            newTail = head2;
            head2 = head2.next;
        }

        return newHead;
    }
}
