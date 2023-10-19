def onboard(i, j, r, c) -> bool:
    return 0 <= i < r and 0 <= j < c

class Solution:
    def get_live(self, i, j, r, c, board) -> int:
        states = [(i+1,j), (i-1,j), (i,j+1), (i,j-1), (i+1,j+1), (i-1,j-1), (i+1,j-1),(i-1,j+1)]
        counter = 0
        for si, sj in states:
            if onboard(si, sj, r, c):
                if board[si][sj] == 1:
                    counter += 1
        return counter

    def gameOfLife(self, board: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        to_die = {0}
        to_alive = {0}
        to_die.remove(0)
        to_alive.remove(0)
        r = len(board)
        c = len(board[0])
        store = []
        for i in range(r):
            for j in range(c):
                store.append(self.get_live(i,j,r,c,board))
        mc = 0
        for i in range(r):
            for j in range(c):
                curr_n_live = store[mc]
                mc += 1
                if board[i][j] == 1:
                    if curr_n_live < 2 or curr_n_live > 3:
                        board[i][j] = 0
                else:
                    if curr_n_live == 3:
                        board[i][j] = 1

        