class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int maxTop = 0;
        int maxLeft = 0;
        int maxRight = matrix[0].length-1;
        int maxBottom = matrix.length-1;
        int x =0;
        int y = -1;
        
        int direction = 0;
        for(int i = 0;i<matrix.length*matrix[0].length;i++){
            
            if(direction%4==0){
                y++;
                result.add(matrix[x][y]);
                
                if(y+1>maxRight){
                    direction++;
                    maxTop++;
                }
                
            }else if(direction%4==1){
                x++;
                result.add(matrix[x][y]);
                
                if(x+1>maxBottom){
                    direction ++;
                    maxRight--;
                }
                
            }else if(direction%4==2){
                
                y--;
                result.add(matrix[x][y]);
                
                if(y-1<maxLeft){
                    direction ++;
                    maxBottom--;
                }
                
            }else{
                x--;
                result.add(matrix[x][y]);
                
                if(x-1<maxTop){
                    direction ++;
                    maxLeft++;
                }
                

            }
        }
        return result;
    }
}