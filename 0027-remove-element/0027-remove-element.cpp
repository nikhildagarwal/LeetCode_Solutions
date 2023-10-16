class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int length = nums.size();
        vector<int> indexList;
        for(int i = 0;i<length;i++){
            if(nums[i] == val){
                indexList.emplace_back(i);
                nums.emplace_back(nums[i]);
            }
        }
        
        for(int i = 0;i<indexList.size();i++){
            indexList[i] -= i;
        }
        
        for(int n: indexList){
            nums.erase(nums.begin() + n);
        }
        
        return nums.size()-indexList.size();
    }
};