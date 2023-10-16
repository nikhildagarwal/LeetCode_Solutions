class Solution {
    public int[] findBall(int[][] grid) {
        int numOfBalls = grid[0].length;
        int numOfRows = grid.length;
        int[] ballPos = new int[numOfBalls];
        
        for(int i = 0;i<numOfBalls;i++){
            int pos = i;
            for(int j = 0;j<numOfRows;j++){
                int curr = grid[j][pos];
                if(curr==-1){
                    if(pos==0){
                        pos=-1;
                        j = numOfRows;
                    }else{
                        int next = grid[j][pos-1];
                        if(next==-1){
                            pos--;
                        }else{
                            pos = -1;
                            j = numOfRows;
                        }
                    }
                }else{
                    if(pos==numOfBalls-1){
                        pos=-1;
                        j = numOfRows;
                    }else{
                        int next = grid[j][pos+1];
                        if(next==1){
                            pos++;
                        }else{
                            pos=-1;
                            j = numOfRows;
                        }
                    }
                }
            }
            ballPos[i] = pos;
        }
        return ballPos;
    }
}