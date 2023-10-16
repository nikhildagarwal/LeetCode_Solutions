class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int prev = 0;
        int s = 0;
        Queue<Integer> stream = new LinkedList<>();
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            if(curr==0){
                s = 1;
                max = Math.max(max,prev+stream.size());
                prev = stream.size();
                stream.clear();
            }else{
                stream.add(curr);
            }
        }
        int c = prev+stream.size();
        if(s==0) c--;
        return c>max ? c:max;
    }
}