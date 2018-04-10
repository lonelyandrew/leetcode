class Solution {
    public boolean isPalindrome(int x) {

        // exclude negative numbers and 10-times
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int tail = 0;
        int head = x;

        // revert end-half parts
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
