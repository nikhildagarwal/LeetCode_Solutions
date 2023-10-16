class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            int len = ans.size();
            for(int j =0;j<len;j++){
                List<Integer> temp = new ArrayList<>(ans.get(j));
                temp.add(curr);
                ans.add(temp);
            }
            List<Integer> hi = new ArrayList<>();
            hi.add(curr);
            ans.add(hi);
        }
        ans.add(new ArrayList<Integer>());
        return ans;
    }
}