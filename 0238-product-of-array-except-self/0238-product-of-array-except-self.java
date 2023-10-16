class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] right = new int[n];
        ans[0] = 1;
        right[n-1] = 1;
        for(int i = 1;i<n;i++){
            ans[i] = ans[i-1] * nums[i-1];
            
        }
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
            ans[i+1] = right[i+1]*ans[i+1];
        }
        ans[0] = ans[0] * right[0];
        return ans;
    }
}