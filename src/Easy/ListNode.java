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

    public static void printListNode(ListNode list){
        if(list == null) {
            System.out.println("{null}");
        } else {
            System.out.print("{" + list.val);
            while (list.next != null) {
                System.out.print(", " + list.next.val);
                list = list.next;
            }
            System.out.println("}");
        }
    }
}
