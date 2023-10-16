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

        int targetColumn = -1;
        for(int i=0;i<nOfcolumns-1;i++){
            if(matrix[0][i]<=target && target<matrix[0][i+1]){
                targetColumn = i;
                i = nOfcolumns;
            }
        }
        if(targetColumn==-1){
            targetColumn = nOfcolumns-1;
        }
        //System.out.println("tR: "+targetRow);
        //System.out.println("tC: "+targetColumn);
        for(int i = 0;i<targetRow+1;i++){
            for(int j = 0;j<targetColumn+1;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}