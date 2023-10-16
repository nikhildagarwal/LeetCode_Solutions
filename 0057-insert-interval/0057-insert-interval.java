class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] comb = new int[intervals.length+1][2];
        System.arraycopy(intervals,0,comb,0,intervals.length);
        comb[intervals.length] = newInterval;
        Arrays.sort(comb, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merge = new ArrayList<>();
        int currEnd = comb[0][1];
        int start = comb[0][0];
        for(int i = 1;i<comb.length;i++){
            if(comb[i][0]<=currEnd){
                currEnd = Math.max(currEnd,comb[i][1]);
            }else{
                int[] temp = {start,currEnd};
                merge.add(temp);
                start = comb[i][0];
                currEnd = comb[i][1];
            }
        }
        int[] temp = {start,currEnd};
        merge.add(temp);
        int c = 0;
        int[][] ans = new int[merge.size()][2];
        for(int[] hi:merge){
            ans[c] = hi;
            c++;
        }
        return ans;
    }
}