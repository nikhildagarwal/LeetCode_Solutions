class Solution {
    boolean ans;

    public void dfs(int[][] grid, int i, int j, int bR, int bD,char direction){
        if(i>=0 && j>=0 && i<=bD && j<=bR){
            int street = grid[i][j];
            if(i==bD && j==bR){
                switch(direction){
                    case 'd':
                        if(street==2 || street==5 || street==6){
                            ans = true;
                        }
                    break;
                    case 'r':
                    if(street==1 || street==3 || street==5){
                            ans = true;
                        }
                    break;
                    case 'l':
                    if(street==1 || street==4 || street==6){
                            ans = true;
                        }
                    break;
                    case 'u':
                    if(street==2 || street==3 || street==4){
                            ans = true;
                        }
                    break;
                    case ' ':
                    ans = true;
                    break;
                }
                return;
            }
            if(street!=0){
                grid[i][j]=0;
                switch(street){
                    case 1:
                        if(direction=='l' || direction=='r' || direction==' '){
                            dfs(grid,i,j-1,bR,bD,'l');
                            dfs(grid,i,j+1,bR,bD,'r');
                        }
                    break;
                    case 2:
                    if(direction=='d' || direction=='u'|| direction==' '){
                        dfs(grid,i+1,j,bR,bD,'d');
                        dfs(grid,i-1,j,bR,bD,'u');
                    }
                        
                    break;
                    case 3:
                    if(direction=='r' || direction=='u'|| direction==' '){
                        dfs(grid,i,j-1,bR,bD,'l');
                        dfs(grid,i+1,j,bR,bD,'d');
                    }
                        
                    break;
                    case 4:
                    if(direction=='u' || direction=='l'|| direction==' '){
                        dfs(grid,i+1,j,bR,bD,'d');
                        dfs(grid,i,j+1,bR,bD,'r');
                    }
                        
                    break;
                    case 5:
                    if(direction=='r' || direction=='d'|| direction==' '){
                        dfs(grid,i,j-1,bR,bD,'l');
                        dfs(grid,i-1,j,bR,bD,'u');
                    }
                        
                    break;
                    case 6:
                    if(direction=='d' || direction=='l'|| direction==' '){
                        dfs(grid,i,j+1,bR,bD,'r');
                        dfs(grid,i-1,j,bR,bD,'u');
                    }
                    break;
                }
            }
        }
    }

    public boolean hasValidPath(int[][] grid) {
        int i = 0;
        int j = 0;
        ans = false;
        int bR = grid[0].length-1;
        int bD = grid.length-1;
        dfs(grid,i,j,bR,bD,' ');
        return ans;
    }
}