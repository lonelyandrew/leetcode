# 20. Valid Parentheses

**[easy]**

## Description

Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

The brackets must close in the correct order, `"()"` and `"()[]{}"` are all valid but `"(]"` and `"([)]"` are not.

## Solutions

### Java version

```java
class Solution {
    public boolean isValid(String s) {
        
        if (s.length() % 2 != 0) {
            return false;
        }
        
        char[] stack = new char[s.length() / 2];
        int top = 0;
        
        for (char current : s.toCharArray()) {
            
            switch (current) {
                case '{':
                case '[':
                case '(':
                    if (top < s.length() / 2) {
                        stack[top] = current;
                        top += 1;
                    }
                    else {
                        return false;
                    }
                    break;
                case '}':
                    if (top < 1 || stack[--top] != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (top < 1 || stack[--top] != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (top < 1 || stack[--top] != '(') {
                        return false;
                    }
                    break;
            }
        }
        return top == 0;
    }
}
```

**Time Complexity:** $O(n)$

**Space Complexity:** $O(n)$


