# 28. Implement strStr()

**[easy]**

## Description
Implement `strStr()`.

Return the index of the first occurrence of needle in haystack, or **-1** if needle is not part of haystack.

**Example 1:**

> Input: haystack = "hello", needle = "ll"
Output: 2

**Example 2:**

> Input: haystack = "aaaaa", needle = "bba"
Output: -1

## Solutions

### Java version

```java
class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        boolean match;
        int needleLength = needle.length();
        int range = haystack.length() - needleLength + 1;

        for (int i = 0; i < range; i++) {
            match = true;

            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return i;
            }
        }
        return -1;
    }
}
```



