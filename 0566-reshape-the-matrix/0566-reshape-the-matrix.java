class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int col = mat[0].length;
        if(r*c < rows*col){
            return mat;
        }
        if(r*c > rows*col){
            return mat;
        }
        List<Integer> data1 = new ArrayList<>();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<col;j++){
                data1.add(mat[i][j]);
            }
        }
        int[][] result = new int[r][c];
        int counter=0;
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                result[i][j] = data1.get(counter);
                counter++;
                
            }
        }
        return result;
    }
}