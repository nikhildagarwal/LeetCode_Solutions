class Node:
    def __init__(self, loc, collisions, prev):
        self.loc = loc
        self.c = collisions
        self.prev = prev

    def __str__(self):
        return str(self.loc) +" : "+ str(self.c)

class Solution:
    def onboard(self,i,j,rows,cols):
        return 0 <= i < rows and 0 <= j < cols

    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        rows = len(obstacleGrid)
        cols = len(obstacleGrid[0])
        gr = rows - 1
        gc = cols - 1
        if obstacleGrid[gr][gc] == 1 or obstacleGrid[0][0] == 1:
            return 0
        start = Node((0,0),1,None)
        holder = {(0,0):start}
        queue = [start]
        collisions = 0
        while queue:
            curr = queue.pop(0)
            i = curr.loc[0]
            j = curr.loc[1]
            if i == gr and j == gc:
                return curr.c
            if self.onboard(i+1,j,rows,cols):
                if obstacleGrid[i+1][j] != 1:
                    tup = (i+1,j)
                    if tup in holder:
                        holder[tup].c += curr.c
                    else:
                        new_node = Node(tup,curr.c,curr)
                        queue.append(new_node)
                        holder[tup] = new_node
            if self.onboard(i,j+1,rows,cols):
                if obstacleGrid[i][j+1] != 1:
                    tup = (i,j+1)
                    if tup in holder:
                        hold[tup].c += curr.c
                    else:
                        new_node = Node(tup,curr.c,curr)
                        queue.append(new_node)
                        holder[tup] = new_node
        return 0