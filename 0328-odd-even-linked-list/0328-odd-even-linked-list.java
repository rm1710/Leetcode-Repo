/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.Stack;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        Stack<ListNode> evenStack = new Stack<>();
        ListNode odd = new ListNode(0);
        ListNode tail = odd;

        ListNode curr = head;
        int index = 1;

        // First traversal: separate odd and stack even
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = null; // Disconnect to avoid cycles

            if (index % 2 == 0) {
                evenStack.push(curr); // Push even-indexed nodes
            } else {
                tail.next = curr;
                tail = tail.next;
            }

            curr = nextNode;
            index++;
        }

        // To preserve order, use a second stack to reverse evenStack
        Stack<ListNode> tempStack = new Stack<>();
        while (!evenStack.isEmpty()) {
            tempStack.push(evenStack.pop());
        }

        // Attach even nodes in correct order
        while (!tempStack.isEmpty()) {
            tail.next = tempStack.pop();
            tail = tail.next;
        }

        return odd.next;
    }
}
