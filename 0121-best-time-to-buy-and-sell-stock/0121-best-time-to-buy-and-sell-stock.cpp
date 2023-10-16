class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit {0};
        int currProfit {0};
        int l = prices.size();
        for(int i = 0;i<l-1;i++){
            int profit = prices[i+1]-prices[i];
            currProfit += profit;
            if(currProfit < 0){
                currProfit = 0;
            }else{
                if(currProfit > maxProfit){
                    maxProfit = currProfit;
                }
            }
        }
        return maxProfit;
    }
};