# 38. Count and Say

**[easy]**

## Description

The count-and-say sequence is the sequence of integers with the first five terms as following:

1. 1
2. 11
3. 21
4. 1211
5. 111221

`1` is read off as `"one 1"` or `11`.
`11` is read off as `"two 1s"` or `21`.
`21` is read off as `"one 2"`, then `"one 1"` or `1211`.

Given an integer *n*, generate the *nth* term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

**Example 1:**

> Input: 1
Output: "1"

**Example 2:**

> Input: 4
Output: "1211"

## Solutions

### Java version

```java
class Solution {
    public String countAndSay(int n) {

        String prev = "1";
        for (int i = 1; i < n; i++)
        {
            prev = nextOne(prev);
        }
        return prev;
    }

    public String nextOne(String previous)
    {
        StringBuilder next = new StringBuilder();
        char CurrentChar = previous.charAt(0);
        int CurrentCount = 0;

        for (int i = 0; i < previous.length(); i++)
        {
            char CharI = previous.charAt(i);
            if (CharI == CurrentChar)
            {
                CurrentCount += 1;
            }
            else
            {
                next.append(CurrentCount);
                next.append(CurrentChar);

                CurrentChar = CharI;
                CurrentCount = 1;
            }
        }

        next.append(CurrentCount);
        next.append(CurrentChar);

        return next.toString();
    }
}
```

