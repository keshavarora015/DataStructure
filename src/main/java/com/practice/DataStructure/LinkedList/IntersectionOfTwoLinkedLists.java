package com.practice.DataStructure.LinkedList;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        while(lengthA > lengthB){
            lengthA--;
            headA = headA.next;
        }

        while(lengthB > lengthA){
            lengthB--;
            headB = headB.next;
        }

        while(headA != null && headB!= null){
            if(headA == headB)
                return headA;

            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int getLength(ListNode head) {
        int count = 0;
        while(head!= null){
            count++;
            head = head.next;
        }
        return count;
    }
}
