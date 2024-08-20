from typing import Dict, List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        complement_index_map: Dict[int, int] = {}
        for idx, num in enumerate(nums):
            if num in complement_index_map:
                return [complement_index_map[num], idx]
            complement_index_map[target - num] = idx


if __name__ == '__main__':
    solution: Solution = Solution()
    assert solution.twoSum([2, 7, 11, 15], 9) == [0, 1]
    assert solution.twoSum([3, 2, 4], 6) == [1, 2]
    assert solution.twoSum([3, 3], 6) == [0, 1]
    print("Passed.")
