import math

class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        counter = {}
        ts = math.floor(len(nums)/3)
        visited = {-1}
        master = []
        visited.remove(-1)
        for num in nums:
            c = counter.get(num,None)
            if c is None:
                counter[num] = 0
            counter[num] += 1
            if counter[num] > ts and num not in visited:
                visited.add(num)
                master.append(num)
        return master