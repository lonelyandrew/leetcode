# 1. Two Sum

**[easy]**

## Description

Given an array of integers, return **indices** of the two numbers such that they add up to a specific target.

You may assume that each input would have ***exactly*** one solution, and you may not use the *same* element twice.

**Example:**

> Given nums = [2, 7, 11, 15], target = 9,
  Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

## Solutions

### Java version

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
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
}
```

**Time Complexity:** $O(n)$
**Space Complexity:** $O(n)$


