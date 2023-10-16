class Solution {

    public void traverse(char[][] board, int i, int j, int bR, int bD){
        if(i>=0 && j>=0 && i<=bD && j<=bR){
            if(board[i][j]=='O'){
                board[i][j] = 'P';
                traverse(board,i+1,j,bR,bD);
                traverse(board,i-1,j,bR,bD);
                traverse(board,i,j+1,bR,bD);
                traverse(board,i,j-1,bR,bD);
            }
        }
    }

    public void solve(char[][] board) {
        int bR = board[0].length-1;
        int bD = board.length-1;
        for(int i = 0;i<=bD;i++){
            if(board[i][0]=='O'){
                traverse(board,i,0,bR,bD);
            }
            if(board[i][bR]=='O'){
                traverse(board,i,bR,bR,bD);
            }
        }
        for(int j = 0;j<=bR;j++){
            if(board[0][j]=='O'){
                traverse(board,0,j,bR,bD);
            }
            if(board[bD][j]=='O'){
                traverse(board,bD,j,bR,bD);
            }
        }
        for(int i = 0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                if(board[i][j]=='O') board[i][j] = 'X';
                if(board[i][j]=='P') board[i][j] = 'O';
            }
        }
    }
}