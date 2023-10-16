class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex+1;
        int counter = 0;
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1;i<=numRows;i++){
            List<Integer> row = new ArrayList<>();
            if(i==1){
                row.add(1);
            }else{
                int temp = result.get(counter-1).size();
                row.add(1);
                for(int j=0;j<temp-1;j++){
                    row.add(result.get(counter-1).get(j)+result.get(counter-1).get(j+1));
                }
                row.add(1);
            }
            result.add(row);
            counter++;
        }
        return result.get(numRows-1);
    }
}