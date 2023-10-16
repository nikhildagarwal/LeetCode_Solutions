class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int n = nums.size();
        double max = numeric_limits<int>::max() * -1;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += nums[i];
        }
        max = sum>max ? sum:max;
        for(int i =1;i<=n-k;i++){
            sum+=nums[i+k-1];
            sum-=nums[i-1];
            max = sum > max ? sum:max;
        }
        return max / k;
    }

    
};