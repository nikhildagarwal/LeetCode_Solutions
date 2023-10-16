class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<ArrayList<Integer>, ArrayList<Integer>> mapper = new HashMap<>();
        int row = 0;
        for(int[] a:grid){
            ArrayList<Integer> made = makeList(a);
            if(mapper.get(made)==null){
                ArrayList<Integer> rows = new ArrayList<>();
                rows.add(row);
                mapper.put(made,rows);
            }else{
                ArrayList<Integer> rows = mapper.get(made);
                rows.add(row);
            }
            row++;
        }
        int r = grid.length;
        int ans = 0;
        for(int j = 0;j<r;j++){
            ArrayList<Integer> column = new ArrayList<>();
            for(int i = 0;i<r;i++){
                column.add(grid[i][j]);
            }
            ArrayList<Integer> rowsOccs = mapper.get(column);
            if(rowsOccs != null){
                ans += rowsOccs.size();
            }
        }
        return ans;
    }

    public ArrayList<Integer> makeList(int[] a){
        ArrayList<Integer> myList = new ArrayList<>();
        for(int n: a){
            myList.add(n);
        }
        return myList;
    }
}