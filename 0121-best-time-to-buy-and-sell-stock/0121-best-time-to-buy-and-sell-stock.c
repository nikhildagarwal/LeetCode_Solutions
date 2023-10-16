int maxProfit(int* prices, int pricesSize){
    int max = 0;
    int curr = 0;
    for(int i = 0;i<pricesSize-1;i++){
        int profit = prices[i+1]-prices[i];
        curr += profit;
        if(curr<0){
            curr = 0;
        }else{
            if(curr>max){
                max = curr;
            }
        }
    }
    return max;
}