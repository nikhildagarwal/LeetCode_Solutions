class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> data = new ArrayList<>();
        data.add(nums[0]);
        //System.out.println(nums[0]);
        int temp = nums[0];
        for(int i=0;i<nums.length;i++){
            if(temp!=nums[i]){
                data.add(nums[i]);
                temp = nums[i];
            }
        }
        for(int i = 0;i<data.size();i++){
            nums[i] = data.get(i);
        }
        return data.size();
    }
}