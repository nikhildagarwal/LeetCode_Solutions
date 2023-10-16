class Solution(object):
    def oddCells(self, m, n, indices):
        """
        :type m: int
        :type n: int
        :type indices: List[List[int]]
        :rtype: int
        """

        odd = 0
        grid = []
        for i in range(m):
            row = []
            for j in range(n):
                row.append(0)
            grid.append(row)
        for ri, ci in indices:
            for i in range(n):
                grid[ri][i] += 1
                if grid[ri][i] %2 == 0:
                    odd -= 1
                else:
                    odd += 1
            for j in range(m):
                grid[j][ci] += 1
                if grid[j][ci] %2 == 0:
                    odd -= 1
                else:
                    odd += 1
        return odd