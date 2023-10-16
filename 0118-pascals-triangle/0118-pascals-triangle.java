class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            if(i==0){
                List<Integer> hi = new ArrayList<>();
                hi.add(1);
                tri.add(hi);
            }else{
                List<Integer> newList = new ArrayList<>();
                List<Integer> prevList = new ArrayList<>(tri.get(tri.size()-1));
                newList.add(1);
                for(int j = 0;j<prevList.size()-1;j++){
                    newList.add(prevList.get(j)+prevList.get(j+1));
                }
                newList.add(1);
                tri.add(newList);
            }
        }
        return tri;
    }
}