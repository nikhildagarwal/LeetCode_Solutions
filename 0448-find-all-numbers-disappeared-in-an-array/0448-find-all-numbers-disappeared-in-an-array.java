class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int i = 1;i<=nums.length;i++){
                data.add(i);
        }
        for(int i = 0;i<nums.length;i++){
            if(data.contains(nums[i])){
                data.remove(nums[i]);
            }
        }
        return new ArrayList<>(data);
    }
}