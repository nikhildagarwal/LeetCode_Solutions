class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        matrix = [[ 1 for _ in range(n)] for _ in range(m)]
        if m == 1  or n == 1:
            return 1
        for i in range(1,m):
            for j in range(1,n):
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1]
        return matrix[m-1][n-1]
