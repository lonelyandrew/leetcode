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