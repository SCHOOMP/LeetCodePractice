package Java.LinkedList.Hard;

import java.util.ArrayList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeLinkedList {
    public static ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode> solution = new ArrayList<>();
        for (int i = 0; i < lists.length; i++){
            printList(lists[i]);
            solution.add(lists[i]);
        }
        System.out.println(solution);
        return null;
    }

    public static void main(String[] args) {
        // Sample input: [[1,4,5],[1,3,4],[2,6]]

        // Creating first linked list: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));

        // Creating second linked list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Creating third linked list: 2 -> 6
        ListNode l3 = new ListNode(2, new ListNode(6));

        // Putting all lists into an array
        ListNode[] lists = new ListNode[] { l1, l2, l3 };

        // Create an instance of Solution and call mergeKLists
        MergeLinkedList solution = new MergeLinkedList();
        ListNode mergedHead = MergeLinkedList.mergeKLists(lists);

        // Print the merged linked list
        printList(mergedHead);
    }

    // Helper method to print a linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
