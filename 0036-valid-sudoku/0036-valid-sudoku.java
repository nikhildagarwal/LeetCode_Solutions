class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i<9;i++){
            Set<Character> row = new HashSet<>();
            int rowC = 0;
            int columnC = 0;
            Set<Character> column = new HashSet<>();
            for(int j = 0;j<9;j++){
                char rowT = board[i][j];
                char columnT = board[j][i];
                if(rowT!='.'){
                    rowC++;
                    row.add(rowT);
                }
                if(columnT!='.'){
                    columnC++;
                    column.add(columnT);
                }
            }
            if(columnC!=column.size() || rowC!=row.size()){
                return false;
            }
        }
        int[] x = {0,3,6,0,3,6,0,3,6};
        int[] y = {0,0,0,3,3,3,6,6,6};
        for(int i = 0;i<9;i++){
            int startx = x[i];
            int starty = y[i];
            Set<Character> box = new HashSet<>();
            int boxC = 0;
            for(int j = startx;j<startx+3;j++){
                for(int k = starty;k<starty+3;k++){
                    char temp = board[j][k];
                    if(temp!='.'){
                        boxC++;
                        box.add(temp);
                    }
                }
            }
            if(boxC!=box.size()){
                return false;
            }
        }
        return true;
    }
}