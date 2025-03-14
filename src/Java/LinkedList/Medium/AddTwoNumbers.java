package Java.LinkedList.Medium;

public class AddTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(" " + node.val);
            node = node.next;
        }
        System.out.println();
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;  // Calculate the carry for next iteration
            int digit = sum % 10;  // The current digit to be added

            ListNode newNode = new ListNode(digit);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return head;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        ListNode l1 = solution.new ListNode(2);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(3);

        ListNode l2 = solution.new ListNode(5);
        l2.next = solution.new ListNode(6);
        l2.next.next = solution.new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result);  // Prints the result linked list
    }
}
