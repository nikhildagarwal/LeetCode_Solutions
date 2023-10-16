class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int tempSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            tempSum+=nums[i];
            maxSum = Math.max(maxSum,tempSum);
            if(tempSum<0){
                tempSum = 0;
            }
        }
        tempSum = 0;
        for(int i = 0;i<nums.length;i++){
            tempSum+=nums[i];
            minSum = Math.min(minSum,tempSum);
            if(tempSum>0){
                tempSum = 0;
            }
        }
        return Math.max(Math.abs(minSum),Math.abs(maxSum));
        
    }
}