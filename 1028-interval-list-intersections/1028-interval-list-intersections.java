class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int fL = firstList.length;
        int sL = secondList.length;
        if(fL==0 || sL==0) return new int[0][0];
        int[][] comb = new int[fL+sL][2];
        System.arraycopy(firstList,0,comb,0,fL);
        System.arraycopy(secondList,0,comb,fL,sL);
        Arrays.sort(comb, (a,b) -> Integer.compare(a[0],b[0]));
        int currEnd = comb[0][1];
        List<int[]> overLap = new ArrayList<>();
        for(int i = 1;i<comb.length;i++){
            int nextstart = comb[i][0];
            int nextend = comb[i][1];
            if(nextstart<=currEnd){
                if(nextend<=currEnd){
                    int[] temp = {nextstart,nextend};
                    overLap.add(temp);
                }else{
                    int[] temp = {nextstart,currEnd};
                    overLap.add(temp);
                    currEnd = nextend;
                }
            }else{
                currEnd = nextend;
            }
        }
        return overLap.toArray(new int[overLap.size()][2]);
    }
}