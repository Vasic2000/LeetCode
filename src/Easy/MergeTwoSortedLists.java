package Easy;

class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(6)))));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5))));

        ListNode.printListNode(list1);
        ListNode.printListNode(list2);

        ListNode result = mergeTwoLists(list1, list2);

        ListNode.printListNode(result);
    }

    public static ListNode mergeTwoLists(ListNode a, ListNode b) {
//        Corner case
        if(a == null)
            return b;
        if(b == null)
            return a;


//        Head
        ListNode result = new ListNode();

        if(a.val <= b.val) {
            result.val = a.val;
            a = a.next;
        } else {
            result.val = b.val;
            b = b.next;
        }

        ListNode current = result;

//      Main algorithm
        while((a != null) && (b != null)) {
            if(a.val <= b.val) {
                current.next = new ListNode(a.val);
                a = a.next;
            } else {
                current.next = new ListNode(b.val);
                b = b.next;
            }
            current = current.next;
        }

//        tail
        while(a!=null) {
            current.next = new ListNode(a.val);
            a = a.next;
            current = current.next;
        }
        while(b!=null) {
            current.next = new ListNode(b.val);
            b = b.next;
            current = current.next;
        }

        return result;
    }
}
