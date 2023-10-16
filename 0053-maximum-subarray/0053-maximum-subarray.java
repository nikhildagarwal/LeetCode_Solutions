class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int runningSum = 0;
        for(int i = 0;i<nums.length;i++){
            runningSum+=nums[i];
            maxSum = Math.max(runningSum,maxSum);
            if(runningSum<0){
                runningSum = 0;
            }
        }
        return maxSum;
    }
}