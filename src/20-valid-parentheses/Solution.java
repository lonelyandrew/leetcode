class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        // maintain a stack
        char[] stack = new char[s.length() / 2];
        // top index
        int top = 0;

        // loop over the whole string
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