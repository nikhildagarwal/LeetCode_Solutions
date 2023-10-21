import math

class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        row = m + n - 2
        term = m - 1
        num = math.factorial(row)
        de = math.factorial(term) * math.factorial(row-term)
        return int(num/de)