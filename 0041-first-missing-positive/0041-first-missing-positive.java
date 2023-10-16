class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                data.add(nums[i]);
            }
        }
        for(int i = 1;i<Integer.MAX_VALUE;i++){
            if(!data.contains(i)){
                return i;
            }
        }
        return 1;
    }
}