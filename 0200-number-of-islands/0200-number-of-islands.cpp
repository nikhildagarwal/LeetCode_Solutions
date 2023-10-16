class Solution {
public:

    int total = 0;

    int numIslands(vector<vector<char>>& grid) {
        int bL = 0;
        int bU = 0;
        int bR = grid[0].size()-1;
        int bD = grid.size()-1;
        for(int i = 0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(grid[i][j] == '1'){
                    total+=1;
                    dive(grid,i,j,bL,bU,bR,bD);
                }
            }
        }
        return total;
    }

    void dive(vector<vector<char>>& grid,int i, int j, int bL, int bU, int bR, int bD){
        if(i<bU || i>bD || j>bR || j<bL){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
        dive(grid,i+1,j,bL,bU,bR,bD);
        dive(grid,i-1,j,bL,bU,bR,bD);
        dive(grid,i,j+1,bL,bU,bR,bD);
        dive(grid,i,j-1,bL,bU,bR,bD);
        }
        
    }
};