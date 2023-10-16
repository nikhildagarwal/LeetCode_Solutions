class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int zeros {0};
        int max {0};
        int indexL = 0;
        int indexR = 0;
        for(int n : nums){
            indexR++;
            if(n==0){
                zeros++;
                if(zeros>k){
                    indexL = cleanup(nums,indexL);
                    zeros--;
                }
            }
            max = indexR-indexL>max ? indexR-indexL:max;
        }
        return max;
    }

    int cleanup(vector<int>& nums, int indexL){
        while(nums[indexL] == 1){
            indexL++;
        }
        indexL++;
        return indexL;
    }
};