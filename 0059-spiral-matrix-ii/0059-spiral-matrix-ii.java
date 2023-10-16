class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int maxTop = 0;
        int maxLeft = 0;
        int maxRight = n-1;
        int maxBottom = n-1;
        int x =0;
        int y = -1;
        int direction = 0;
        for(int i = 0;i<n*n;i++){
            
            if(direction%4==0){
                y++;
                result[x][y] = i+1;
                
                if(y+1>maxRight){
                    direction++;
                    maxTop++;
                }
                
            }else if(direction%4==1){
                x++;
                result[x][y] = i+1;
                if(x+1>maxBottom){
                    direction++;
                    maxRight--;
                }
                
            }else if(direction%4==2){
                y--;
                result[x][y] = i+1;
                if(y-1<maxLeft){
                    direction++;
                    maxBottom--;
                }
                
            }else{
                x--;
                result[x][y] = i+1;
                if(x-1<maxTop){
                    direction++;
                    maxLeft++;
                }
            }
        }
        return result;
    }
}