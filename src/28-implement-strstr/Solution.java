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