/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let l = prices.length;
    let curr = 0;
    let max = 0;
    for(let i = 0;i<l-1;i++){
        let profit = prices[i+1] - prices[i];
        curr += profit;
        if(curr < 0 ){
            curr = 0;
        }else{
            if(curr>max){
                max = curr;
            }
        }
    }
    return max;
};