import numpy as np

class Solution(object):

    def __init__(self, w):
        """
        :type w: List[int]
        """
        self.sum = sum(w)
        self.na = np.array(list(range(0,len(w))))
        self.weights = []
        for num in w:
            self.weights.append(float(num)/float(self.sum))
        self.weights = np.array(self.weights)
        

    def pickIndex(self):
        """
        :rtype: int
        """
        return np.random.choice(self.na, p = self.weights, replace=True)
        


# Your Solution object will be instantiated and called as such:
# obj = Solution(w)
# param_1 = obj.pickIndex()