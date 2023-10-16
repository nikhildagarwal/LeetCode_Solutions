class Solution {
    public int countNegatives(int[][] grid) {
        int l = grid.length;
        int h = grid[0].length;
        int counter = l*h;
        for(int i = 0;i<l;i++){
            int temp = 0;
            for(int j =0;j<h;j++){
                if(grid[i][j]<0){
                    j = h;
                    temp--;
                }
                temp++;
            }
            //System.out.println(temp);
            counter-=temp;
        }
        return counter;
    }
}