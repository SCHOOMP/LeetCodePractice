package Java.LinkedList.Medium;

public class SortedLinkedList {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            current = next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4,
                new ListNode(2,
                        new ListNode(1,
                                new ListNode(3, null)
                        )
                )
        );

        System.out.println("Before sorting:");
        printList(head);

        head = sortList(head);

        System.out.println("After sorting:");
        printList(head);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
