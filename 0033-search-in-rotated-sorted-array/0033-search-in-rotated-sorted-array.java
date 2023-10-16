class Solution {
    public int search(int[] nums, int target) {
        Map<Integer,Integer> hi = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            hi.put(nums[i],i);
        }
        return hi.getOrDefault(target,-1);
    }
}