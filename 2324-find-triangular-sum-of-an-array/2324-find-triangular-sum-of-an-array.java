class Solution {

    public int triangularSum(int[] nums) {
        int length = nums.length;
        if(length==1){
            return nums[0];
        }
        int counter = nums.length-1;
        while(counter>0){
            for(int i =0;i<counter;i++){
                nums[i] = (nums[i]+nums[i+1])%10;
            }
            counter--;
        }
        return nums[0];
    }
}