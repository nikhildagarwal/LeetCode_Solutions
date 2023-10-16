class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        set<int> mySet;
        for(int n : nums){
            mySet.insert(n);
        }
        int index = 0;
        for(int n :mySet){
            nums[index] = n;
            index++;
        }
        return mySet.size();
    }
};