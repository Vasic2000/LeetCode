package Easy;

public class ListNode {
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

    public static void printListNode(ListNode list1) {
        System.out.print("[" + list1.val);
        while (list1.next != null) {
            list1 = list1.next;
            System.out.print("," + list1.val);
        }
        System.out.println("]");
    }
}
