class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> res;
        int max = 0;
        for(int candyCount:candies){
            if(candyCount>max){
                max = candyCount;
            }
        }
        for(int candyCount:candies){
            if(candyCount+extraCandies >= max){
                res.emplace_back(true);
            }else{
                res.emplace_back(false);
            }
        }
        return res;
    }
};