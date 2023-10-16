class Solution {
    int ans;
    public void island(int[][] grid, int bR, int bD, int i, int j){
        if(i>=0 && i<=bD && j>=0 && j<=bR){
            if(grid[i][j]==1){
                    ans++;
                    grid[i][j] = 0;
                    island(grid,bR,bD,i+1,j);
                    island(grid,bR,bD,i-1,j);
                    island(grid,bR,bD,i,j-1);
                    island(grid,bR,bD,i,j+1);
                
            }
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        
        int bD = grid.length-1;
        int bR = grid[0].length-1;
        int max = 0;
        int prevSetSize = 0;
        for(int i = 0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(grid[i][j]==1){
                    ans = 0;
                    island(grid,bR,bD,i,j);
                    max = Math.max(max,ans);
                }
            }
        }
        return max;
    }
}