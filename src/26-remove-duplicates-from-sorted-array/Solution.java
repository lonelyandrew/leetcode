class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int pt = 1;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                val = nums[i];
                nums[pt++] = nums[i];
            }
        }

        return pt;
    }
}