package Easy;

import static Easy.ListNode.printListNode;

public class ReverseListNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        printListNode(l1);
        ListNode l2 = new ListNode(1, new ListNode(7, new ListNode(1, new ListNode(7))));
        printListNode(l2);
        ListNode l3= new ListNode();
        printListNode(l3);
        System.out.println();

        ListNode l11 = reverseList(l1);
        ListNode l12 = reverseList(l2);
        ListNode l13 = reverseList(l3);

        printListNode(l11);
        printListNode(l12);
        printListNode(l13);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
