# 7. Reverse Integer

**[easy]**

## Description

Given a 32-bit signed integer, reverse digits of an integer.

**Example 1:**

> Input: 123
Output:  321

**Example 2:**

> Input: -123
Output: -321

**Example 3:**

> Input: 120
Output: 21

**Example 4:**

> Input: 1534236469
Output: 0

**Note:**
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## Solutions

### Java version

```java
class Solution {

    public int reverse(int x) {

        int result = 0;
        while (x != 0) {

            int newResult = result * 10 + x % 10;

            // overflow case
            if ((newResult - x % 10) / 10 != result) {
                return 0;
            }

            result = newResult;
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {

        Solution sln = new Solution();
        int result = sln.reverse(Integer.parseInt(args[0]));
        System.out.println(result);
    }
}
```

**Time Complexity:** $O(\log_{10}n)$

**Space Complexity:** $O(1)$




