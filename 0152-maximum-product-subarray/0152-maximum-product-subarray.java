class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int runningProductLeft = 1;
        int runningProductRight = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i =0 ;i<n;i++){
            runningProductLeft *=nums[i];
            runningProductRight *=nums[n-1-i];
            maxProd = Math.max(maxProd,runningProductLeft);
            maxProd = Math.max(maxProd,runningProductRight);
            if(runningProductLeft ==0) runningProductLeft = 1;
            if(runningProductRight ==0) runningProductRight = 1;
        }
        return maxProd;
    }
}