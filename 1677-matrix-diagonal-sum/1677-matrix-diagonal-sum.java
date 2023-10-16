class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int hi = mat.length;
        int bound = mat.length-1;
        for(int i = 0;i<hi;i++){
            sum+=mat[i][i];
            if(bound-i!=i){
                sum+=mat[i][bound-i];
            }
            
        }
        
        return sum;
    }
}