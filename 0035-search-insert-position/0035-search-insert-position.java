class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }else if(target<nums[0]){
            return 0;
        }else{
            for(int i = 0;i<nums.length-1;i++){
                if(nums[i]<=target && nums[i+1]>=target){
                    return i+1;
                }
            }
            return 0;
        }
    }
}