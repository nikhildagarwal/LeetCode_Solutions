class Solution {
    boolean signal;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int bD = grid1.length-1;
        int bR = grid1[0].length-1;
        int ans = 0;
        for(int i =0 ;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(grid2[i][j]==1){
                    signal = true;
                    island(i,j,grid1,grid2,bR,bD);
                    if(signal) ans++;
                }
            }
        }
        return ans;
    }
    
    public void island(int i, int j, int[][] grid1, int[][] grid2, int bR, int bD){
        if(i>=0 && i<=bD && j>=0 && j<=bR){
            if(grid2[i][j]==1){
                if(grid1[i][j]==0){
                    signal = false;
                }
                grid2[i][j] = 0;
                island(i+1,j,grid1,grid2,bR,bD);
                island(i-1,j,grid1,grid2,bR,bD);
                island(i,j+1,grid1,grid2,bR,bD);
                island(i,j-1,grid1,grid2,bR,bD);
            }
        }
    }
}