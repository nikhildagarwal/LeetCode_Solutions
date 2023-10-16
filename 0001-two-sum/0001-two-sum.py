class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = [0,0]
        indexes = {}
        i = 0
        for number in nums:
            check = indexes.get(number,-1)
            if check != -1:
                res = [i,indexes[number]]
                return res
            indexes[target-number] = i
            i=i+1
        return res
    