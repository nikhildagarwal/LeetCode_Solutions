class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        fin = 0
        curr = 0
        l = len(prices)
        for i in range(l-1):
            profit = prices[i+1] - prices[i]
            curr += profit
            if(curr < 0):
                curr = 0
            else:
                if(curr > fin):
                    fin = curr
        return fin