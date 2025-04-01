package Java.LinkedList.Easy;

import java.util.ArrayList;
import java.util.List;

// Definition for singly-linked list.
class ListNode {
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

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        ListNode reversedHead = null;
        for (int i = 0; i < values.size(); i++) {
            ListNode newNode = new ListNode(values.get(i));
            newNode.next = reversedHead;
            reversedHead = newNode;
        }

        return reversedHead;
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
        ReverseLinkedList solution = new ReverseLinkedList();

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println("Original list:");
        solution.printList(node1);

        ListNode reversedList = solution.reverseList(node1);

        System.out.println("Reversed list:");
        solution.printList(reversedList);
    }
}
