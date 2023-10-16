class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> data = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                data.add(nums[i]);
            }
        }
        int temp = 0;
        int counter = 0;
        for(int i = 0;i<data.size();i++){
            nums[counter] = data.get(i);
            counter++;
        }
        temp = counter;
        for(int i = temp;i<nums.length;i++){
            nums[i] = 0;
            counter++;
        }

    }
}