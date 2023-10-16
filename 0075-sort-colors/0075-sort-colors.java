class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                red++;
            }
            if(nums[i]==1){
                white++;
            }
            if(nums[i]==2){
                blue++;
            }
        }
        int counter = 0;
        for(int i = 0;i<red;i++){
            nums[counter]=0;
            counter++;
        }
        for(int i = 0;i<white;i++){
            nums[counter]=1;
            counter++;
        }
        for(int i = 0;i<blue;i++){
            nums[counter]=2;
            counter++;
        }

    }
}