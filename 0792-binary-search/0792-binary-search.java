
        class Solution {
    public int search(int[] nums, int target) {
        int pL = 0;
        int pR = nums.length-1;
        if(nums.length==1 && nums[0]==target){
            return 0;
        }
        while(pR!=pL){
            if(target==nums[pR]) return pR;
            if(target==nums[pL]) return pL;
            if(target<nums[pR]) pR--;
            if(target>nums[pL]) pL++;
        }
        if(nums[pR]==target){
            return pR;
        }
        return -1;
    }
}