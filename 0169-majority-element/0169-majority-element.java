class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        int len = nums.length;
        for(int i =0;i<len;i++){
            occ.put(nums[i],occ.getOrDefault(nums[i],0)+1);
            if(occ.get(nums[i])>len/2){
                return nums[i];
            }
        }
        return 0;
    }
}