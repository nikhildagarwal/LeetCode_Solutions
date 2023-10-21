class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        matrix = []
        if m == 1  or n == 1:
            return 1
        for i in range(m):
            row  = []
            for j in range(n):
                if i == 0 or j == 0:
                    row.append(1)
                else:
                    row.append(matrix[i-1][j] + row[j-1])
            matrix.append(row)
        return matrix[m-1][n-1]
