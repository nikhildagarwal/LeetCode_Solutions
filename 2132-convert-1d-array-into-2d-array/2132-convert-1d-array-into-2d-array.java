class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[0][0];
        if(m*n > original.length || m*n < original.length){
            return result;
        }
        int counter = 0;
        result = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                result[i][j] = original[counter];
                counter++;
            }
        }
        return result;
    }
}