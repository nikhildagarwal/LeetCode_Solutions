class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int> mySet;
        for(int n : nums){
            if(mySet.count(n) > 0){
                return true;
            }else{
                mySet.insert(n);
            }
        }
        return false;
    }
};