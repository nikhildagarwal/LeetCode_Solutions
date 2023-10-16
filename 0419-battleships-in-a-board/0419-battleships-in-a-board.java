class Solution {

    public int countBattleships(char[][] board) {
        Set<List<Integer>> visited = new HashSet<>();
        int bR = board[0].length-1;
        int bD = board.length-1;
        int ans = 0;
        for(int i =0;i<=bD;i++){
            for(int j = 0;j<=bR;j++){
                List<Integer> newPoint = new ArrayList<>();
                newPoint.add(i);
                newPoint.add(j);
                if(board[i][j]=='X' && !visited.contains(newPoint)){
                    visited.add(newPoint);
                    ans++;
                    int rowd = i;
                    int rowu = i;
                    int coll = j;
                    int colr = j;
                    while(rowd<=bD){
                        if(board[rowd][j]=='X'){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(rowd);
                            temp.add(j);
                            visited.add(temp);
                            rowd++;
                        }else{
                            break;
                        }
                    }
                    while(rowu>=0){
                        if(board[rowu][j]=='X'){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(rowu);
                            temp.add(j);
                            visited.add(temp);
                            rowu--;
                        }else{
                            break;
                        }
                    }
                    while(coll>=0){
                        if(board[i][coll]=='X'){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            temp.add(coll);
                            visited.add(temp);
                            coll--;
                        }else{
                            break;
                        }
                    }
                    while(colr<=bR){
                        if(board[i][colr]=='X'){
                            List<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            temp.add(colr);
                            visited.add(temp);
                            colr++;
                        }else{
                            break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}