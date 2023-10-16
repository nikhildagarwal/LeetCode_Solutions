class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int dist = k+1;
        HashMap<Integer,Integer> prevPos = new HashMap<>();
        for(int i = 0;i<n;i++){
            int curr = nums[i];
            if(prevPos.get(curr)==null){
                prevPos.put(curr,i);
            }else{
                int prevInd = prevPos.get(curr);
                dist = Math.min(dist,Math.abs(prevInd-i));
                prevPos.put(curr,i);
                if(dist<=k) return true;
            }
        }
        return false;
    }
}