/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode root = new ListNode(0);
        ListNode c = root;
        int sum = 0;

        while (n1 != null || n2 != null) {
            // carriage
            sum /= 10;

            if (n1 != null) {
                sum += n1.val;
                n1 = n1.next;
            }

            if (n2 != null) {
                sum += n2.val;
                n2 = n2.next;
            }

            // carriage
            c.next = new ListNode(sum % 10);
            c = c.next;
        }

        // last carrige
        if (sum / 10 == 1) {
           c.next = new ListNode(1);
        }

        return root.next;
    }
}
