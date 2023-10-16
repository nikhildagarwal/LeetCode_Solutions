class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int currProf = 0;
        for(int i = 0;i<prices.length-1;i++){
            int diff = prices[i+1]-prices[i];
            currProf+=diff;
            if(currProf<0){
                currProf = 0;
            }else{
                maxProf = Math.max(maxProf,currProf);
            }
        }
        return maxProf;
    }
}