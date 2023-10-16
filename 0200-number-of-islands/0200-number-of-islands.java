class Solution {
    public void islands(char[][] grid, int bD, int bR, int i, int j){
        if(i>=0 && j>=0 && i<=bD && j<=bR){
            if(grid[i][j]=='1'){
                    grid[i][j]='0';
                
                    islands(grid,bD,bR,i+1,j);
                    islands(grid,bD,bR,i-1,j);
                    islands(grid,bD,bR,i,j+1);
                    islands(grid,bD,bR,i,j-1);
                
            }
        }
    }


    public int numIslands(char[][] grid) {
        int bD = grid.length-1;
        int bR = grid[0].length-1;
        int prevSetSize = 0;
        int ans = 0;
        for(int i = 0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    islands(grid,bD,bR,i,j);
                    
                }
            }
        }
        return ans;
    }
}