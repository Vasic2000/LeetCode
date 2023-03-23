package Yandex;

public class RemoveOdd {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5)))));
        ListNode list2 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode list3 = new ListNode(2);
        ListNode list4 = new ListNode(1, new ListNode(2));

        printList(list1);
        printList(removeOdd(list1));

        printList(list2);
        printList(removeOdd(list2));

        printList(list3);
        printList(removeOdd(list3));

        printList(list4);
        printList(removeOdd(list4));
    }

    private static ListNode removeOdd(ListNode list) {

        ListNode fakeList = new ListNode();
        fakeList.next = list;

        ListNode current = fakeList;

        while (current != null && current.next != null) {
            if (current.next.val % 2 != 0) {
                remove_next(current);
            } else {
                current = current.next;
            }
        }
        return fakeList.next;
    }

    public static ListNode remove_next(ListNode node) {
        node.next = node.next.next;
        return node;
    }


    private static void printList(ListNode head) {
        if(head == null) {
            System.out.println("{}");
        } else {
            ListNode curr = head;
            System.out.print("{");
            while (curr.next != null) {
                System.out.print(curr.val + ", ");
                curr = curr.next;
            }
            System.out.println(curr.val + "}");
        }
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
}
