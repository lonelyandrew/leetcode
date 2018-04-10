# 9. Palindrome Number

**[easy]**

## Description
Determine whether an integer is a palindrome. Do this without extra space.

## Solutions

### Java version

```java
class Solution {
    public boolean isPalindrome(int x) {

        // exclude negative numbers and 10-times
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int tail = 0;
        int head = x;

        while (tail < head) {

            tail = tail * 10 + head % 10;
            head /= 10;
        }

        // compare two parts
        if (tail == head || tail /10 == head) {
            return true;
        }
        else {
            return false;
        }
    }
}
```

**Time Complexity:** $O(\log_{10}n)$

**Space Complexity:** $O(1)$

