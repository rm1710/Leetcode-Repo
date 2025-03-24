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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode crr = head;
        ListNode prev = null;
        
        while (crr != null) {
            if (crr.val == val) {
                if (prev == null) {
                    head = crr.next;  // Removing the first node
                } else {
                    prev.next = crr.next;  // Removing middle or last node
                }
            } else {
                prev = crr;  // Only update prev if no deletion occurs
            }
            crr = crr.next;
        }
        
        return head;  // Corrected this line
    }
}
