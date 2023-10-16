class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        int runningRight[n];
        int runningLeft[n];
        int pR {n-1};
        for(int i = 0;i<n;i++){
            if(i==0){
                runningRight[0] = 1;
            }else{
                runningRight[i] = runningRight[i-1] * nums[i-1];
            }
            if(pR == n-1){
                runningLeft[pR] = 1;
            }else{
                runningLeft[pR] = runningLeft[pR+1] * nums[pR+1];
            }
            pR--;
        }
        for(int i = 0;i<n;i++){
            nums[i] = runningRight[i] * runningLeft[i];
        }
        return nums;
    }
};