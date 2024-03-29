# 2. Add Two Numbers

**[Medium]**

## Description

You are given two **non-empty** linked lists representing two non-negative integers. The digits are stored in **reverse order** and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

**Example**

> Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

## Solution

### Java version

```java
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
```

**Time Complexity:** $O(n)$

**Space Complexity:** $O(n)$


