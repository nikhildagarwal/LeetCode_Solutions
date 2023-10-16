class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> index;
        vector<int> result = {0,0};
        int l = nums.size();
        for(int i = 0;i<l;i++){
            int check = index[nums[i]];
            if(check != 0){
                if(check == -1){
                    result[0] = 0;
                }else{
                    result[0] = check;
                }
                result[1] = i;
                return result;
            }
            if(i == 0){
                index[target-nums[i]] = -1;
            }else{
                index[target-nums[i]] = i;
            }
        }
        return result;
    }
};