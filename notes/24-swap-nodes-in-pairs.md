# 24. Swap Nodes in Pairs

**[easy]**

## Description

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given `1->2->3->4`, you should return the list as `2->1->4->3`.

Your algorithm should use only constant space. You may **not** modify the values in the list, only nodes itself can be changed.

## Solutions

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
 
 // recursive version
class Solution {

    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode tempNext = head.next;
        head.next = swapPairs(head.next.next);
        tempNext.next = head;
        return tempNext;
    }
}
```

**Time Complexity:** $O(n)$
**Space Complexity:** $O(1)$

