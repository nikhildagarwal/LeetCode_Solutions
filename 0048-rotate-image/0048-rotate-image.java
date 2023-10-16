class Solution {
    public void rotate(int[][] matrix) {
        List<Integer> elements = new ArrayList<>();
        int rows = matrix.length;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<rows;j++){
                elements.add(matrix[i][j]);
            }
        }
        int counter = 0;
        for(int i= rows-1;i>=0;i--){
            for(int j = 0;j<rows;j++){
                matrix[j][i] = elements.get(counter);
                counter++;
            }
        }
    }
}