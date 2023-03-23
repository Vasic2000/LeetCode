package Easy;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4))))));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(5))))));
        ListNode list3 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4))))));

        ListNode.printListNode(deleteDuplicates(list1));
        ListNode.printListNode(deleteDuplicates(list2));
        ListNode.printListNode(deleteDuplicates(list3));
    }


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode result = head;

        if (result == null) {
            return head;
        }

        while (result.next != null) {
            if (result.val == result.next.val) {
                result.next = result.next.next;
            } else {
                result = result.next;
            }
        }

//        while((result != null) && (result.next != null)) {
//            if (result.val == result.next.val) {
//                result.next = result.next.next;
//                continue;
//            }
//                result = result.next;
//        }
        return head;
    }
}
