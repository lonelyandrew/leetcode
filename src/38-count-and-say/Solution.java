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