class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        n = len(nums)
        c = 0
        for i in range(n):
            for j in range(n):
                if i < j and nums[i] == nums[j]:
                    c += 1
        return c