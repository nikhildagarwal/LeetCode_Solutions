class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;
        int nOfrows = matrix.length;
        int nOfcolumns = matrix[0].length;
        for(int i=0;i<nOfrows-1;i++){
            if(matrix[i][0]<=target && target<matrix[i+1][0]){
                targetRow = i;
                i = nOfrows;
            }
        }
        if(targetRow==-1){
            targetRow = nOfrows-1;
        }
        for(int i = 0;i<nOfcolumns;i++){
            if(matrix[targetRow][i]==target){
                return true;
            }
        }
        return false;
    }
}