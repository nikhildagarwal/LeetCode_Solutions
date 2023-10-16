class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int numOfZeros {0};
        int n = nums.size();
        for(int i = 0;i<n-numOfZeros;i++){
            if(nums[i] == 0){
                nums.erase(nums.begin() + i);
                nums.emplace_back(0);
                numOfZeros++;
                i--;
            }
        }
    }
};