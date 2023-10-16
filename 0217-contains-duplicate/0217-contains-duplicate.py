class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        mySet = set()
        l = len(nums)
        for i in range(l):
            if nums[i] in mySet:
                return True
            else:
                mySet.add(nums[i])
        return False