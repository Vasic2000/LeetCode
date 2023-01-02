package Easy;

public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5)))));
        ListNode list2 = new ListNode(1,
                new ListNode(2, new ListNode(3,
                        new ListNode(4, new ListNode(5, new ListNode(6))))));

        System.out.println(middleNode(list1).val);
        System.out.println(middleNode(list2).val);
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
}
