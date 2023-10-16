class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        for(int curr: nums){
            occ.put(curr,occ.getOrDefault(curr,0)+1);
        }
        PriorityQueue<Integer> keyHeap = new PriorityQueue<>(occ.keySet());
        
        int n = keyHeap.size();
        if(n==1) return 0;
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0;i<n-1;i++){
            ans = 0;
            int first = keyHeap.poll();
            int end = keyHeap.peek();
            if(Math.abs(first-end)==1){
                ans+=occ.get(end);
                ans+=occ.get(first);
            }
            max = Math.max(max,ans);
        }
        return max;
    }
}