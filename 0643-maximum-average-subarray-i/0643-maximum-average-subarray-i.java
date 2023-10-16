class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double K = k;
        double M = -10000;
        double total = 0;
        for(int i = 0;i<nums.length-k+1;i++){
            if(i==0){
                for(int j = 0;j<k;j++){
                    total+=nums[j];
                }
                M = Math.max(M,total/K);
            }else{
                
                total-=nums[i-1];
                total+=nums[i+k-1];
                
                M = Math.max(M,total/K);
            }
        }
        return M;
    }
}