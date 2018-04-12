class Solution {
    public int removeElement(int[] nums, int val) {

        int currentIndex = 0;
        for (int num : nums) {
            if (num != val) {
                nums[currentIndex] = num;
                currentIndex += 1;
            }
        }
        return currentIndex;
    }
}