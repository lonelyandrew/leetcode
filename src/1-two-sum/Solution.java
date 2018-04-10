import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution{

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();

        // loop over the array (a one-pass method)
        for (int i = 0; i < nums.length; i++){

            // if the map contains the key which is the current number
            if (complementMap.containsKey(nums[i])) {

                // return the corresponding value and current index
                return new int[] {complementMap.get(nums[i]), i};
            }
            else {

                // if not, put the complement of the current number in the map
                complementMap.put(target-nums[i], i);
            }
        }

        // if there is no solution, return an empty array
        return new int[] {};
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 12, 11};
        int target = 23;

        Solution sln = new Solution();
        int[] result = sln.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // [2, 3]
    }
}