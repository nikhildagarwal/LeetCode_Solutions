class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])
        matrix = []
        for i in range(m):
            row = []
            for j in range(n):
                if i == 0 and j == 0:
                    row.append(grid[0][0])
                elif i == 0 and j != 0:
                    row.append(grid[0][j] + row[j-1])
                elif i != 0 and j == 0:
                    row.append(grid[i][0] + matrix[i-1][j])
                else:
                    row.append(grid[i][j] + min(matrix[i-1][j],row[j-1]))
            matrix.append(row)
        return matrix[m-1][n-1]
