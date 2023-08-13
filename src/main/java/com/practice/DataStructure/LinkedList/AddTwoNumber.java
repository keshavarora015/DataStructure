package com.practice.DataStructure.LinkedList;

public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode head1 = new ListNode().createLinkedList1();
        ListNode head2 = new ListNode().createLinkedList2();
        ListNode newHead = addTwoNumber(head1,head2);
        head1.printLinkedList(newHead);
    }

    private static ListNode addTwoNumber(ListNode head1, ListNode head2) {
        ListNode reverseHead1 = reverse(head1);
        ListNode reverseHead2 = reverse(head2);
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        int carry = 0;
        while (reverseHead1 != null || reverseHead2 != null) {
            int sum = 0 + carry;
            if(reverseHead1 != null){
                sum += reverseHead1.val;
                reverseHead1 = reverseHead1.next;
            }
            if(reverseHead2 != null){
                sum += reverseHead2.val;
                reverseHead2 = reverseHead2.next;
            }
            carry = sum/10;
            sum = sum%10;
            tail.next = new ListNode(sum);
            tail = tail.next;
        }
        if(carry != 0 ){
            tail.next = new ListNode(carry);
        }

        return reverse(newHead.next);
    }

    /**
     *
     * 					      [1]
     * valueN[] =   {4,5} -> 5 4
     * valueM[] = {3,4,5} -> 5 4 3
     * ---------------------------------------------
     * 					     0 9 3 -> reverse -> 3 9 0
     *
     *
     *
     * */

    private static ListNode reverse(ListNode head) {
        ListNode prev;
        ListNode curr = null;
        ListNode next = head;

        while (next != null) {
            prev = curr;
            curr = next;
            next = next.next;
            curr.next = prev;
        }
        return curr;
    }
}
