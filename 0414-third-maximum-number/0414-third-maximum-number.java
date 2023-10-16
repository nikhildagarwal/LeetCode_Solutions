class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> unq = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            unq.add(nums[i]);
        }
        List<Integer> data = new ArrayList<>(unq);
        Collections.sort(data);
        int len = data.size();
        if(data.size()>=3){
            return data.get(len-3);
        }else{
            return data.get(len-1);
        }
    }
}