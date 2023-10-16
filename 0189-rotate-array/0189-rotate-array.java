class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==1 || k==0){
            
        }else{
            k = k%nums.length;
            List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for(int i = nums.length-k;i<nums.length;i++){
            left.add(nums[i]);
        }
        for(int i = 0;i<nums.length-k;i++){
                        System.out.println(nums[i]);

            right.add(nums[i]);
        }
        for(int i = 0;i<left.size();i++){
            nums[i] = left.get(i);
        }
        int counter = 0;
        for(int i = left.size();i<nums.length;i++){
            nums[i] = right.get(counter);
            counter++;
        }
        }
        
    }
}