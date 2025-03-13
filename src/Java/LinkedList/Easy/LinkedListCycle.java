package Java.LinkedList.Easy;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        ListNode currenter = head;

        while (currenter != null && currenter.next != null) {
            current = current.next;
            currenter = currenter.next.next;

            if (current == currenter) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle solution = new LinkedListCycle();

        ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = head.next;

        boolean answer = solution.hasCycle(head);
        System.out.println(answer);
    }
}
