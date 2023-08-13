package com.practice.DataStructure.LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode().createLinkedList1();
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = getMiddleNode(head);
        //slow is smaller in case of odd
        slow = reverseList(slow);

        ListNode fast = head;

        while(slow!= null){
            if(fast.val != slow.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
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

    private static ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!= null) // odd list me right list ko small rkho;
            slow = slow.next;
        return slow;
    }
}
