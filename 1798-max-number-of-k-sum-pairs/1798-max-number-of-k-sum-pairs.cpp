class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        map<int,int> occ;
        for(int n:nums){
            occ[n] = occ[n] + 1;
        }
        int pL {0};
        int l = nums.size();
        int ans {0};
        sort(nums.begin(),nums.end());
        while(pL<l && nums[pL]<k){
            int fetched {occ[k-nums[pL]]};
            if(fetched != 0){
                if(k-nums[pL] == nums[pL]){
                    ans += (fetched / 2);
                    occ[nums[pL]] -= ((fetched / 2) * 2);
                }else{
                    int secondFetched = occ[nums[pL]];
                    int min = fetched>secondFetched ? secondFetched : fetched;
                    ans += min;
                    occ[nums[pL]] -= min;
                    occ[k-nums[pL]] -= min;
                }
            }
            pL++;
        }
        return ans;
    }
};