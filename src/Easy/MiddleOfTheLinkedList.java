package Easy;

public class MiddleOfTheLinkedList {

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
        printList(middleNode(list1));

        printList(list2);
        printList(middleNode(list2));

        printList(list3);
        printList(middleNode(list3));

        printList(list4);
        printList(middleNode(list4));

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        int depth = 1;
        ListNode curr = head;

        while(curr.next != null) {
            depth++;
            curr = curr.next;
        }
        int target = depth / 2;

        depth = 1;
        while(target >= depth) {
            depth++;
            head = head.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        System.out.print("{");
        while(curr.next != null) {
            System.out.print(curr.val + ", ");
            curr = curr.next;
        }
        System.out.println(curr.val + "}");
    }
}
