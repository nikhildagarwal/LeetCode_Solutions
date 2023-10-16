class Solution {
    public int[][] merge(int[][] intervals) {
        int iL = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int currEnd = intervals[0][1];
        List<int[]> merge = new ArrayList<>();
        int size = 1;
        for(int i = 1;i<iL;i++){
            int nextstart = intervals[i][0];
            int nextend = intervals[i][1];
            if(nextstart<=currEnd){
                currEnd = Math.max(currEnd,nextend);
            }else{
                int[] newInt= {start,currEnd};
                size++;
                start = nextstart;
                currEnd = nextend;
                merge.add(newInt);
            }
        }
        int[] newInt ={start,currEnd};
        merge.add(newInt);
        int[][] ans = new int[size][2];
        for(int i = 0;i<size;i++){
            ans[i] = merge.get(i);
        }
        return ans;
    }
}