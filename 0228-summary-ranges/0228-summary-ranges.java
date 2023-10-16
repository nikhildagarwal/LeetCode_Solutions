class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length==0){
            return result;
        }
        int start = 0;
        int next = 1;
        int finalI = nums.length-1;
        
        while(next<nums.length){
            if(nums[next]!=nums[next-1]+1){
                if(nums[start] == nums[next-1]){
                    result.add(Integer.toString(nums[start]));
                }else{
                    result.add(Integer.toString(nums[start])+"->"+Integer.toString(nums[next-1]));
                }
                
                start = next;
            }
            next++;
        }
        if(nums[start] == nums[finalI]){
            result.add(Integer.toString(nums[start]));
        }else{
            result.add(Integer.toString(nums[start])+"->"+Integer.toString(nums[next-1]));
        }
        return result;
    }
}