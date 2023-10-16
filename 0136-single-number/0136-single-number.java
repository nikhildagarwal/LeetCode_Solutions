class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> data = new Stack<>();
        data.push(3000000);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==data.peek()){
                data.pop();
            }else{
                data.push(nums[i]);
            }
        }
        return data.pop();
    }
}