package Easy;
//TASK.160

import static Easy.ListNode.printListNode;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {

// Case 1
        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(1);
        list2.next.next.next = list1.next.next;

        printListNode(list1);
        printListNode(list2);
        System.out.print("Пересечение: ");
        printListNode(getIntersectionNode(list1, list2));
        System.out.println();

// Case 2
        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(9);
        list3.next.next = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list4 = new ListNode(3);
        list4.next = list3.next.next;

        printListNode(list3);
        printListNode(list4);
        System.out.print("Пересечение: ");
        printListNode(getIntersectionNode(list3, list4));
        System.out.println();

//Case 3
        ListNode list5 = new ListNode(2, new ListNode(6, new ListNode(4)));
        ListNode list6 = new ListNode(1, new ListNode(5));

        printListNode(list5);
        printListNode(list6);
        System.out.print("Пересечение: ");
        printListNode(getIntersectionNode(list5, list6));
        System.out.println();

//Case 4
        ListNode list7 = new ListNode(2);
        list7.next = new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(4))));
        ListNode list8 = list7.next;

        printListNode(list7);
        printListNode(list8);
        System.out.print("Пересечение: ");
        printListNode(getIntersectionNode(list7, list8));

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listA = headA;
        ListNode listB = headB;

        while(listB != null) {
            while (listA != null) {
                if (listA == listB)
                    return listA;
                listA = listA.next;
            }
            listB = listB.next;
            listA = headA;
        }
        return null;
    }
}
