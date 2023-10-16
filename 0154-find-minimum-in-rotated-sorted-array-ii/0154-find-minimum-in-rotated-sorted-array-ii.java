class Solution {
    public int findMin(int[] nums) {
        int counter = nums.length-1;
        int min = Integer.MAX_VALUE;
        int endIndex = 0;
        for(int i = 0;i<nums.length /2;i++){
            min = Math.min(Math.min(min,nums[i]),nums[counter]);
            counter--;
            endIndex = i;
            
        }
        if(nums.length>1){
            endIndex++;
        min = Math.min(min,nums[endIndex]);
        return min;
        }else{
            return nums[0];
        }
        
        
    }
}