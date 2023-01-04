package Medium;

public class RemoveNthNodeFromList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5)))));
        ListNode list2 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode list3 = new ListNode(1);
        ListNode list4 = new ListNode(1, new ListNode(2));

        printList(list1);
        printList(removeNthFromEnd(list1, 2));

        printList(list2);
        printList(removeNthFromEnd(list2, 3));

        printList(list3);
        printList(removeNthFromEnd(list3, 1));

        printList(list4);
        printList(removeNthFromEnd(list4, 1));

    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        System.out.print("{");
        while (curr.next != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
        System.out.println(curr.val + "}");
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(checkTheCondition(head, n)) {
            head.next = head.next.next;
        }
        else {
            removeNthFromEnd(head.next, n);
        }
        return head;
    }

    private static boolean checkTheCondition(ListNode head, int n) {
        int depth = 1;
        ListNode curr = head;

        while(curr.next != null) {
            depth++;
            curr = curr.next;
        }

        if(depth == n)
            return true;
        else
            return false;
    }
}
