class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int l = nums.size();
        if(l == 1){
            return nums[0];
        }
        sort(nums.begin(),nums.end());
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[l-1] != nums[l-2]){
            return nums[l-1];
        }
        for(int i = 1;i<l-1;i++){
            if((nums[i] != nums[i-1]) && (nums[i]!=nums[i+1])){
                return nums[i];
            }
        }
        return 0;
    }
};