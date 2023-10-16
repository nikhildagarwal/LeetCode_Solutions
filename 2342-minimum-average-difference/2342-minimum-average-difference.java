class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sumR = 0;
        long min = Long.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0;i<nums.length;i++){
            sumR+=nums[i];
        }
        long sumL = 0;
        for(int i = 0;i<nums.length;i++){
            int temp = i+1;
            sumL+=nums[i];
            sumR-=nums[i];
            long AvgL = sumL/(temp);
            long AvgR = 0;
            if(temp!=nums.length){
                AvgR = sumR/(nums.length-temp);
            }
            long diff = AvgR-AvgL;
            if(diff<0){
                diff = diff*-1;
            }
            if(diff<min){
                min = diff;
                minIndex = i;
            }


        }
        return minIndex;
    }
}