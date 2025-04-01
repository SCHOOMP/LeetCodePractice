package Java.LinkedList.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseLinkedListII {
    public ListNode reverseList(ListNode head, int left, int right) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        Collections.reverse(values.subList(left - 1, right));
        ListNode newHead = new ListNode(values.get(0));
        current = newHead;
        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }

        return newHead;
    }


    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method to test the reverseList function
    public static void main(String[] args) {
        ReverseLinkedListII solution = new ReverseLinkedListII();

        int left = 2;
        int right = 4;

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original list:");
        solution.printList(node1);

        ListNode reversedList = solution.reverseList(node1, left, right);

        System.out.println("Reversed list:");
        solution.printList(reversedList);
    }
}
