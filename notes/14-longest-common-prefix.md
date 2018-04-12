# 14. Longest Common Prefix

**[easy]**

## Description
Write a function to find the longest common prefix string amongst an array of strings.

## Solutions

### Java version

```java
class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (String str : strs) {
            if (str.length() < prefix.length()) {
                prefix = str;
            }
        }

        for (String str : strs) {

            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"leets", "leetcode", "leet", "leeds", "leeeeee"};
        // String[] strs = {"a", "ca"};
        Solution sln = new Solution();
        String result = sln.longestCommonPrefix(strs);
        System.out.println("\"" + result + "\"");
    }
}
```

**Time Complexity:** $O(S)$, where $S$ is the sum of all characters in all strings.

In the worst case all $n$ strings are the same. The algorithm compares the string $S_1$ with the strings $[S_1 \dots S_n]$. There are $S$ character comparisons, where $S$ is the sum of all characters in the input array.

**Space Complexity:** $O(1)$.

