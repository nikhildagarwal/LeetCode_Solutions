class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        memory_arr = [0] + ([float('inf')] * amount)
        for i in range(1, amount + 1):
            for coin in coins:
                if coin <= i:
                    memory_arr[i] = min(memory_arr[i], memory_arr[i-coin] + 1)
        
        if memory_arr[-1] == float('inf'):
            return -1
        return memory_arr[-1]
