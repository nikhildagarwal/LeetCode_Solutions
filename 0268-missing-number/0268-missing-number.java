class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> data = new HashSet<>();
        for(int i = 0;i<n;i++){
            data.add(nums[i]);
        }
        for(int i = 0;i<=n;i++){
            if(!data.contains(i)){
                return i;
            }
        }
        return 0;
        
    }
}