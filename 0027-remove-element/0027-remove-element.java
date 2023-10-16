class Solution {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        List<Integer> data = new ArrayList<>();
        for(int i = 0;i<length;i++){
            if(nums[i]!=val){
                //System.out.println(nums[i]);
                data.add(nums[i]);
            }
        }

 
        for(int i = 0;i<data.size();i++){
            nums[i] = data.get(i);
           
        }
        
        return data.size();
    }
}