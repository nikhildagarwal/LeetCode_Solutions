class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int rows = mat.length;
        int columns = mat[0].length;
        int counter = 0;
        for(int i = 0;i<columns;i++){
            counter = 0;
            List<Integer> current = new ArrayList<>();
            while(counter<rows && counter+i<columns){
                current.add(mat[counter][counter+i]);
                counter++;
            }
            Collections.sort(current);
            counter = 0;
            while(counter<rows && counter+i<columns){
                mat[counter][counter+i]=current.get(counter);
                counter++;
            }
        }
        if(rows>1){
            for(int i = 1;i<rows;i++){
                counter = 0;
                List<Integer> current = new ArrayList<>();
                while(counter+i<rows && counter<columns){
                    current.add(mat[counter+i][counter]);
                    counter++;
                }
                Collections.sort(current);
                counter = 0;
                while(counter+i<rows && counter<columns){
                    mat[counter+i][counter]=current.get(counter);
                    counter++;
                }
            }
        }
        
        return mat;
    }
}