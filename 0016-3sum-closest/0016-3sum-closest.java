class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int targetResult = 0;
        Arrays.sort(nums);
        Set<Integer> unique = new HashSet<>();
        for(int i = 0;i<nums.length-2;i++){
            int sum  =0;
            if(!unique.contains(nums[i])){
                unique.add(nums[i]);
                int pL = i+1;
                int pR = nums.length-1;
                while(pL!=pR){
                    sum = nums[i]+nums[pL]+nums[pR];
                    int diff = Math.abs(sum-target);
                    if(diff<minDiff){
                        minDiff = diff;
                        targetResult = sum;
                    }
                    if(sum>target){
                        pR--;
                    }else{
                        pL++;
                    }
                }
            }
        }
        return targetResult;
        
    }
}